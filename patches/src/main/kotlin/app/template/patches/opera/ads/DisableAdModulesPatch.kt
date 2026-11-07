package app.template.patches.opera.ads

import app.morphe.patcher.patch.PatchException
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.opera.OPERA_BETA_COMPATIBILITY
import app.template.patches.opera.OPERA_COMPATIBILITY
import app.template.patches.opera.shared.replaceStringConstants

/**
 * Opera ships a mediation layer that reflectively loads third-party ad network
 * modules (found by their implementation class names in the dex):
 *
 *   com.opera.android.ads.liftoff.LiftoffAdsModuleImpl    (Liftoff / Vungle)
 *   com.opera.android.ads.mintegral.MintegralAdsModuleImpl (Mintegral)
 *   com.opera.android.ads.pangle.PangleAdsModuleImpl      (Pangle / ByteDance)
 *
 * Pangle is even delivered as a dedicated Play split (`split_pangle_ads.apk`),
 * which proves the module loader already tolerates a missing module class:
 * when the split is not installed the reflective lookup fails gracefully.
 *
 * The patch rewrites those three class-name constants to a non-existent class,
 * so no third-party ad SDK module is ever instantiated. Opera's own ad delivery
 * (start-page promo cards) is handled by separate patches; see the README.
 */
@Suppress("unused")
val operaDisableAdModulesPatch = bytecodePatch(
    name = "Disable ad modules",
    description = "Prevents Opera from loading its bundled third-party ad network " +
        "modules (Liftoff/Vungle, Mintegral, Pangle/ByteDance) by breaking the " +
        "reflective class lookup used by the ad mediation layer.",
    default = true,
) {
    compatibleWith(OPERA_COMPATIBILITY, OPERA_BETA_COMPATIBILITY)

    execute {
        val deadModule = "com.opera.android.ads.disabled.DisabledByMorphe"
        val adModuleClasses = mapOf(
            "com.opera.android.ads.liftoff.LiftoffAdsModuleImpl" to deadModule,
            "com.opera.android.ads.mintegral.MintegralAdsModuleImpl" to deadModule,
            "com.opera.android.ads.pangle.PangleAdsModuleImpl" to deadModule,
        )

        var patched = 0
        classDefForEach { classDef ->
            val mutableClass = mutableClassDefByOrNull(classDef.type) ?: return@classDefForEach
            for (method in mutableClass.methods) {
                patched += method.replaceStringConstants(adModuleClasses)
            }
        }

        if (patched < adModuleClasses.size) {
            throw PatchException(
                "Expected at least ${adModuleClasses.size} ad module class references, " +
                    "found $patched. Is this an unsupported Opera version?",
            )
        }

        println("Opera ad modules: neutralized $patched module reference(s).")
    }
}
