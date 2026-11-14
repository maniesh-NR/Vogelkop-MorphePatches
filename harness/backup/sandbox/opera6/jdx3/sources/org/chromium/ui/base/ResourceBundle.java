package org.chromium.ui.base;

/* loaded from: classes.dex */
public final class ResourceBundle {
    public static String[] a;

    public static String a(int i, String str) {
        return str.concat(i != 1 ? i != 2 ? i != 3 ? "" : "_NEUTER" : "_MASCULINE" : "_FEMININE");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getLocalePakResourcePath(java.lang.String r3, int r4, boolean r5, boolean r6) throws java.io.IOException {
        /*
            java.lang.String[] r0 = org.chromium.ui.base.ResourceBundle.a
            if (r0 == 0) goto Lcc
            int r0 = java.util.Arrays.binarySearch(r0, r3)
            if (r0 < 0) goto Lcc
            if (r5 == 0) goto L6e
            java.lang.String r5 = "en-US"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L17
            java.lang.String r5 = "assets/fallback-locales/"
            goto L70
        L17:
            r5 = 45
            int r5 = r3.indexOf(r5)
            r0 = 0
            if (r5 >= 0) goto L22
            r5 = r3
            goto L26
        L22:
            java.lang.String r5 = r3.substring(r0, r5)
        L26:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 3325: goto L4d;
                case 3355: goto L43;
                case 3856: goto L39;
                case 101385: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L55
        L2f:
            java.lang.String r0 = "fil"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L55
            r0 = 3
            goto L56
        L39:
            java.lang.String r0 = "yi"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L55
            r0 = 2
            goto L56
        L43:
            java.lang.String r0 = "id"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L55
            r0 = 1
            goto L56
        L4d:
            java.lang.String r1 = "he"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L56
        L55:
            r0 = r2
        L56:
            switch(r0) {
                case 0: goto L63;
                case 1: goto L60;
                case 2: goto L5d;
                case 3: goto L5a;
                default: goto L59;
            }
        L59:
            goto L65
        L5a:
            java.lang.String r5 = "tl"
            goto L65
        L5d:
            java.lang.String r5 = "ji"
            goto L65
        L60:
            java.lang.String r5 = "in"
            goto L65
        L63:
            java.lang.String r5 = "iw"
        L65:
            java.lang.String r0 = "assets/locales#lang_"
            java.lang.String r1 = "/"
            java.lang.String r5 = defpackage.sko.k(r0, r5, r1)
            goto L70
        L6e:
            java.lang.String r5 = "assets/stored-locales/"
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = a(r4, r0)
            java.lang.String r1 = ".pak"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r2 = "op/"
            java.lang.String r5 = p3p.w(r5, r2, r3, r1)
            android.content.Context r2 = t8.a
            android.content.res.AssetManager r2 = r2.getAssets()
            android.content.res.AssetFileDescriptor r5 = r2.openNonAssetFd(r5)     // Catch: java.io.IOException -> L9c
            if (r5 == 0) goto L9b
            r5.close()     // Catch: java.io.IOException -> L9c
        L9b:
            return r0
        L9c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "assets/locales/"
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = a(r4, r5)
            java.lang.String r4 = r4.concat(r1)
            java.lang.String r5 = "assets/locales/op/"
            java.lang.String r3 = defpackage.sko.k(r5, r3, r1)
            android.content.Context r5 = t8.a
            android.content.res.AssetManager r5 = r5.getAssets()
            android.content.res.AssetFileDescriptor r3 = r5.openNonAssetFd(r3)     // Catch: java.io.IOException -> Lc8
            if (r3 == 0) goto Lc7
            r3.close()     // Catch: java.io.IOException -> Lc8
        Lc7:
            return r4
        Lc8:
            if (r6 == 0) goto Lcc
            java.util.Locale r3 = java.util.Locale.US
        Lcc:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.ui.base.ResourceBundle.getLocalePakResourcePath(java.lang.String, int, boolean, boolean):java.lang.String");
    }
}
