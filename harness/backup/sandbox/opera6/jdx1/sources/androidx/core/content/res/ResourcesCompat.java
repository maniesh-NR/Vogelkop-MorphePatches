package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import defpackage.dbh;
import defpackage.ham;
import defpackage.kzh;
import defpackage.lzh;
import defpackage.z5i;
import defpackage.zh9;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class ResourcesCompat {
    public static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap<lzh, SparseArray<kzh>> sColorStateCaches = new WeakHashMap<>(0);
    private static final Object sColorStateCacheLock = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r5 == r9.hashCode()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList a(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) throws android.content.res.Resources.NotFoundException {
        /*
            lzh r0 = new lzh
            r0.<init>(r7, r9)
            java.lang.Object r1 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r1)
            java.util.WeakHashMap<lzh, android.util.SparseArray<kzh>> r2 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> La0
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> La0
            r3 = 0
            if (r2 == 0) goto L41
            int r4 = r2.size()     // Catch: java.lang.Throwable -> La0
            if (r4 <= 0) goto L41
            java.lang.Object r4 = r2.get(r8)     // Catch: java.lang.Throwable -> La0
            kzh r4 = (defpackage.kzh) r4     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L41
            android.content.res.Configuration r5 = r4.b     // Catch: java.lang.Throwable -> La0
            android.content.res.Configuration r6 = r7.getConfiguration()     // Catch: java.lang.Throwable -> La0
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto L3e
            int r5 = r4.c     // Catch: java.lang.Throwable -> La0
            if (r9 != 0) goto L34
            if (r5 == 0) goto L3a
            goto L3e
        L34:
            int r6 = r9.hashCode()     // Catch: java.lang.Throwable -> La0
            if (r5 != r6) goto L3e
        L3a:
            android.content.res.ColorStateList r2 = r4.a     // Catch: java.lang.Throwable -> La0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            goto L43
        L3e:
            r2.remove(r8)     // Catch: java.lang.Throwable -> La0
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            r2 = r3
        L43:
            if (r2 == 0) goto L46
            return r2
        L46:
            java.lang.ThreadLocal r1 = androidx.core.content.res.ResourcesCompat.a
            java.lang.Object r2 = r1.get()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            if (r2 != 0) goto L58
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.set(r2)
        L58:
            r1 = 1
            r7.getValue(r8, r2, r1)
            int r1 = r2.type
            r2 = 28
            if (r1 < r2) goto L66
            r2 = 31
            if (r1 <= r2) goto L6e
        L66:
            android.content.res.XmlResourceParser r1 = r7.getXml(r8)
            android.content.res.ColorStateList r3 = defpackage.ya5.a(r7, r1, r9)     // Catch: java.lang.Exception -> L6e
        L6e:
            if (r3 == 0) goto L99
            java.lang.Object r1 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r1)
            java.util.WeakHashMap<lzh, android.util.SparseArray<kzh>> r7 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r7.get(r0)     // Catch: java.lang.Throwable -> L97
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L85
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L97
            r2.<init>()     // Catch: java.lang.Throwable -> L97
            r7.put(r0, r2)     // Catch: java.lang.Throwable -> L97
        L85:
            kzh r7 = new kzh     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources r0 = r0.a     // Catch: java.lang.Throwable -> L97
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L97
            r7.<init>(r3, r0, r9)     // Catch: java.lang.Throwable -> L97
            r2.append(r8, r7)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            return r3
        L95:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            throw r7
        L97:
            r7 = move-exception
            goto L95
        L99:
            android.content.res.ColorStateList r7 = r7.getColorStateList(r8, r9)
            return r7
        L9e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            throw r7
        La0:
            r7 = move-exception
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static Typeface b(int i, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, dbh dbhVar, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceB = null;
        if (string.startsWith("res/")) {
            Typeface typeface = (Typeface) ham.b.get(ham.d(resources, i, string, typedValue.assetCookie, i2));
            if (typeface != null) {
                if (dbhVar != null) {
                    new Handler(Looper.getMainLooper()).post(new q2g(dbhVar, typeface, (byte) 26));
                }
                typefaceB = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        zh9 zh9VarG0 = z5i.g0(resources.getXml(i), resources);
                        if (zh9VarG0 != null) {
                            typefaceB = ham.b(context, zh9VarG0, resources, i, string, typedValue.assetCookie, i2, dbhVar, z);
                        } else if (dbhVar != null) {
                            dbhVar.k(-3);
                        }
                    } else {
                        Typeface typefaceC = ham.c(resources, i, string, typedValue.assetCookie, i2);
                        if (dbhVar != null) {
                            if (typefaceC != null) {
                                new Handler(Looper.getMainLooper()).post(new q2g(dbhVar, typefaceC, (byte) 26));
                            } else {
                                dbhVar.k(-3);
                            }
                        }
                        typefaceB = typefaceC;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (dbhVar != null) {
                        dbhVar.k(-3);
                    }
                }
            }
        } else if (dbhVar != null) {
            dbhVar.k(-3);
        }
        if (typefaceB != null || dbhVar != null || z2) {
            return typefaceB;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
