package app.template.extension.extension

import android.app.Application
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import android.util.Base64
import android.util.Log
import java.lang.reflect.Field
import java.util.Map

/**
 * Swaps the re-signed APK's certificate back to the original one at the
 * `PackageInfo.CREATOR` parcel layer, so every signature read inside the app
 * (PackageManager API, direct Parcel unpacking, SDK integrity helpers) sees the
 * ORIGINAL vendor certificate instead of the Morphe signing key.
 *
 * Kotlin port of rushiranpise/morphe-patches `SignatureHookApp.java`
 * (GPL-3.0), ported from jkennethcarino/adobo, originally based on
 * https://github.com/L-JINBIN/ApkSignatureKillerEx.
 *
 * v1.2.2 hardening - the startup crash root cause:
 * `PackageInfo.CREATOR` is `public static final`, and ART - exactly like the
 * desktop JDK - refuses `Field.set()` on final fields. The v1.2.0/v1.2.1 hook
 * did a bare `field.set(null, creator)` and re-threw any failure from the
 * static initializer as a RuntimeException, which surfaces as an
 * `ExceptionInInitializerError` the moment the framework instantiates the
 * re-parented `OperaApplication` - i.e. an immediate crash on open, before
 * the first pixel. Two changes fix that:
 *
 *  1. Nothing may escape the initializer: every failure (including Errors,
 *     which `catch (Exception)` misses) is caught and logged; a spoof that
 *     cannot be installed leaves a *working* app that simply sees the Morphe
 *     certificate.
 *  2. The FINAL bit is cleared through the hidden `Field#accessFlags` field
 *     (the Android equivalent of the JDK `modifiers` hack, per the
 *     ApkSignatureKillerEx lineage), with hidden-API exemptions requested
 *     BEFORE the swap and a `sun.misc.Unsafe` static write as the fallback -
 *     so the spoof actually installs on modern Android instead of silently
 *     degrading.
 *
 * The static initializer carries two placeholder constants that the patch
 * replaces at patch time:
 *  - `<package-name>` -> the app's real package name
 *  - `<signature>`    -> Base64 DER of the ORIGINAL signing certificate
 *
 * Written to compile without any kotlin-stdlib dependency (no lambdas, no
 * Kotlin collections, no `==` on reference types, no string concatenation
 * with non-String operands, assertions disabled via -Xno-*-assertions) so the
 * extension dex only references android framework + JDK classes.
 */
class SignatureHookApp : Application() {

    companion object {
        init {
            val packageName = "<package-name>"
            val signature = "<signature>"
            killPackageManager(packageName, signature)
        }

        private fun killPackageManager(packageName: String, signature: String) {
            // This runs from a static initializer (the re-parented Application
            // subclasses trigger it before any app code). A throwable escaping
            // here is an ExceptionInInitializerError that kills the app at
            // startup. Therefore: catch Throwable, log, continue - never throw.
            try {
                val fakeSignature = Signature(Base64.decode(signature, Base64.DEFAULT))

                val creator: Parcelable.Creator<PackageInfo> =
                    getPackageInfoCreator(packageName, fakeSignature)

                if (!installCreator(creator)) {
                    Log.w(
                        "VogelkopSpoof",
                        "PackageInfo.CREATOR could not be replaced on this Android build; " +
                            "running without the signature spoof",
                    )
                }

                clearPackageInfoCache()
                clearParcelCreators()
            } catch (t: Throwable) {
                Log.w("VogelkopSpoof", "Signature spoof failed; running without it", t)
            }
        }

        /**
         * Installs the CREATOR proxy, preferring the techniques that work on
         * modern Android:
         *
         *  A. reflection, after clearing the FINAL bit via the hidden
         *     `Field#accessFlags` field (hidden-API, so exemptions are
         *     requested first),
         *  B. `sun.misc.Unsafe` writes the static field directly (no final
         *     check is involved in an Unsafe write),
         *  C. a plain set - some ART builds allow final writes outright.
         *
         * Returns true only when the proxy is actually installed.
         */
        private fun installCreator(creator: Parcelable.Creator<PackageInfo>): Boolean {
            // Best-effort hidden-API exemptions FIRST, so the routes below can
            // reach greylisted members (Field#accessFlags, sun.misc.Unsafe) on
            // Android 9+. Silently skipped when the platform blocks it.
            tryExemptHiddenApi()

            if (installCreatorViaReflection(creator)) {
                return true
            }
            if (installCreatorViaUnsafe(creator)) {
                return true
            }
            return try {
                findField(PackageInfo::class.java, "CREATOR").set(null, creator)
                true
            } catch (t: Throwable) {
                Log.w("VogelkopSpoof", "All CREATOR swap routes failed", t)
                false
            }
        }

        private fun installCreatorViaReflection(creator: Parcelable.Creator<PackageInfo>): Boolean {
            return try {
                val field = findField(PackageInfo::class.java, "CREATOR")
                clearFinalBit(field)
                field.set(null, creator)
                true
            } catch (t: Throwable) {
                Log.i("VogelkopSpoof", "CREATOR swap: reflection route unavailable", t)
                false
            }
        }

        private fun installCreatorViaUnsafe(creator: Parcelable.Creator<PackageInfo>): Boolean {
            return try {
                val unsafeClass = Class.forName("sun.misc.Unsafe")
                val unsafe = findField(unsafeClass, "theUnsafe").get(null)
                if (unsafe == null) {
                    return false
                }
                val field = findField(PackageInfo::class.java, "CREATOR")
                val base = unsafeClass
                    .getMethod("staticFieldBase", Field::class.java)
                    .invoke(unsafe, field)
                val offset = unsafeClass
                    .getMethod("staticFieldOffset", Field::class.java)
                    .invoke(unsafe, field)
                unsafeClass
                    .getMethod("putObject", Any::class.java, java.lang.Long.TYPE, Any::class.java)
                    .invoke(unsafe, base, offset, creator)
                true
            } catch (t: Throwable) {
                Log.i("VogelkopSpoof", "CREATOR swap: sun.misc.Unsafe route unavailable", t)
                false
            }
        }

        /**
         * Android's Field implementation caches its flags in the hidden
         * `accessFlags` field (the desktop JDK equivalent is `modifiers`);
         * clearing the FINAL bit there is what lets `Field.set()` through.
         * Best effort - when the field is unreachable, the Unsafe/plain-set
         * routes still apply.
         */
        private fun clearFinalBit(field: Field) {
            try {
                val accessFlags = findField(Field::class.java, "accessFlags")
                // -17 == ~Modifier.FINAL (~0x0010), i.e. all flags but FINAL
                accessFlags.setInt(field, accessFlags.getInt(field) and -17)
            } catch (t: Throwable) {
                // leave the FINAL bit set
            }
        }

        /**
         * Best-effort replacement for HiddenApiBypass.addHiddenApiExemptions:
         * reaches dalvik.system.VMRuntime.setHiddenApiExemptions through the
         * meta-reflection hole (reflecting on Class.getDeclaredMethod itself).
         * Wrapped in catch-all - every failure just means the belt-and-braces
         * cache clearing below stays disabled; the CREATOR swap is unaffected.
         */
        private fun tryExemptHiddenApi() {
            try {
                val classArrayClass: Class<*> = arrayOf<Class<*>>().javaClass
                val getDeclaredMethod = Class::class.java.getDeclaredMethod(
                    "getDeclaredMethod",
                    String::class.java,
                    classArrayClass,
                )
                getDeclaredMethod.isAccessible = true
                val runtimeClass = Class.forName("dalvik.system.VMRuntime")
                val getRuntimeAny = getDeclaredMethod.invoke(
                    runtimeClass,
                    "getRuntime",
                    arrayOf<Class<*>>(),
                )
                if (getRuntimeAny == null) {
                    return
                }
                val getRuntime = getRuntimeAny as java.lang.reflect.Method
                val runtime = getRuntime.invoke(null)
                if (runtime != null) {
                    val stringArrayClass: Class<*> = arrayOf<String>().javaClass
                    val setExemptionsAny = getDeclaredMethod.invoke(
                        runtime.javaClass,
                        "setHiddenApiExemptions",
                        arrayOf<Class<*>>(stringArrayClass),
                    )
                    if (setExemptionsAny != null) {
                        val setExemptions = setExemptionsAny as java.lang.reflect.Method
                        setExemptions.isAccessible = true
                        setExemptions.invoke(runtime, arrayOf("L"))
                    }
                }
            } catch (e: Throwable) {
                // ignore - platform blocked meta-reflection
            }
        }

        private fun findField(clazz: Class<*>, fieldName: String): Field {
            var current: Class<*>? = clazz
            while (current != null && !current.equals(Object::class.java)) {
                try {
                    val field = current.getDeclaredField(fieldName)
                    field.setAccessible(true)
                    return field
                } catch (e: NoSuchFieldException) {
                    current = current.superclass
                }
            }
            throw NoSuchFieldException(fieldName)
        }

        private fun getPackageInfoCreator(
            packageName: String,
            fakeSignature: Signature,
        ): Parcelable.Creator<PackageInfo> {
            val originalCreator: Parcelable.Creator<PackageInfo> = PackageInfo.CREATOR
            return object : Parcelable.Creator<PackageInfo> {
                override fun createFromParcel(source: Parcel): PackageInfo {
                    val created: PackageInfo? = originalCreator.createFromParcel(source)
                    val packageInfo: PackageInfo = created ?: PackageInfo()

                    val pkg = packageInfo.packageName
                    if (pkg != null && pkg.equals(packageName)) {
                        val signatures = packageInfo.signatures
                        if (signatures != null && signatures.size > 0) {
                            signatures[0] = fakeSignature
                        }

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                            val signingInfo = packageInfo.signingInfo
                            if (signingInfo != null) {
                                val signaturesArray = signingInfo.getApkContentsSigners()
                                if (signaturesArray != null && signaturesArray.size > 0) {
                                    signaturesArray[0] = fakeSignature
                                }

                                val historyArray = signingInfo.getSigningCertificateHistory()
                                if (historyArray != null && historyArray.size > 0) {
                                    var i = 0
                                    while (i < historyArray.size) {
                                        historyArray[i] = fakeSignature
                                        i++
                                    }
                                }
                            }
                        }
                    }

                    return packageInfo
                }

                override fun newArray(size: Int): Array<PackageInfo?> {
                    return arrayOfNulls<PackageInfo>(size)
                }
            }
        }

        private fun clearPackageInfoCache() {
            try {
                val packageCacheField = findField(PackageManager::class.java, "sPackageInfoCache")
                val cache = packageCacheField.get(null)
                if (cache != null) {
                    cache.javaClass.getMethod("clear").invoke(cache)
                }
            } catch (e: Exception) {
                // ignore
            }
        }

        private fun clearParcelCreators() {
            try {
                val mCreatorsAny = findField(Parcel::class.java, "mCreators").get(null)
                if (mCreatorsAny != null) {
                    val mCreators = mCreatorsAny as Map<*, *>
                    mCreators.clear()
                }
            } catch (e: Exception) {
                // ignore
            }

            try {
                val sPairedAny = findField(Parcel::class.java, "sPairedCreators").get(null)
                if (sPairedAny != null) {
                    val sPairedCreators = sPairedAny as Map<*, *>
                    sPairedCreators.clear()
                }
            } catch (e: Exception) {
                // ignore
            }
        }
    }
}
