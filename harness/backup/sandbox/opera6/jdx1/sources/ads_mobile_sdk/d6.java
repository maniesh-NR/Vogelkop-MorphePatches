package ads_mobile_sdk;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class d6 {
    public final File a;
    public volatile boolean b;

    public d6(Context context) {
        this.a = new File(context.getCacheDir(), "gma_ad_responses");
    }

    public static String a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(Charsets.UTF_8));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length << 1);
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            return sb.toString();
        } catch (Exception e) {
            xh3.a("Failed to calculate checksum", e, 4);
            return null;
        }
    }

    public final List a() {
        List listB;
        if (!this.b) {
            this.b = this.a.exists();
            if (!this.b) {
                return l08.a;
            }
        }
        File[] fileArrListFiles = this.a.listFiles();
        return (fileArrListFiles == null || (listB = e82.B(fileArrListFiles)) == null) ? l08.a : listB;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:3:0x000b, B:5:0x000f, B:7:0x001b, B:25:0x0070, B:27:0x0074, B:8:0x0025, B:10:0x002b, B:11:0x0035, B:13:0x003b, B:15:0x0045, B:17:0x004b, B:19:0x0055, B:20:0x005f, B:23:0x0066), top: B:56:0x000b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rap a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            ads_mobile_sdk.fw0 r0 = ads_mobile_sdk.fw0.CUI_NAME_PERSISTENT_CACHE_FILE_READ
            java.util.WeakHashMap r1 = ads_mobile_sdk.hh3.a
            l08 r1 = l08.a
            r2 = 1
            ads_mobile_sdk.rg3 r0 = ads_mobile_sdk.hh3.a(r0, r1, r2)
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> L7f
            if (r1 != 0) goto L25
            java.io.File r1 = r3.a     // Catch: java.lang.Throwable -> L7f
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L7f
            r3.b = r1     // Catch: java.lang.Throwable -> L7f
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> L7f
            if (r1 != 0) goto L25
            ads_mobile_sdk.ev0 r3 = new ads_mobile_sdk.ev0     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "Cache directory not found"
            ads_mobile_sdk.ae1 r5 = ads_mobile_sdk.ae1.a     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7f
            goto L70
        L25:
            java.io.File r3 = r3.b(r4)     // Catch: java.lang.Throwable -> L7f
            if (r3 != 0) goto L35
            ads_mobile_sdk.ev0 r3 = new ads_mobile_sdk.ev0     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "Invalid filename"
            ads_mobile_sdk.ae1 r5 = ads_mobile_sdk.ae1.a     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7f
            goto L70
        L35:
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L45
            ads_mobile_sdk.ev0 r3 = new ads_mobile_sdk.ev0     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "File not found"
            ads_mobile_sdk.ae1 r5 = ads_mobile_sdk.ae1.a     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7f
            goto L70
        L45:
            java.lang.String r3 = x29.c(r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            if (r5 == 0) goto L5f
            java.lang.String r4 = a(r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            if (r4 != 0) goto L5f
            ads_mobile_sdk.ev0 r3 = new ads_mobile_sdk.ev0     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            java.lang.String r4 = "Checksum mismatch for file"
            ads_mobile_sdk.ae1 r5 = ads_mobile_sdk.ae1.a     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            goto L70
        L5f:
            ads_mobile_sdk.hv0 r4 = new ads_mobile_sdk.hv0     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            r4.<init>(r3)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L7f
            goto L6f
        L65:
            r3 = move-exception
            ads_mobile_sdk.bv0 r4 = new ads_mobile_sdk.bv0     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "Failed to read file"
            r1 = 2
            r2 = 0
            r4.<init>(r3, r2, r5, r1)     // Catch: java.lang.Throwable -> L7f
        L6f:
            r3 = r4
        L70:
            boolean r4 = r3 instanceof ads_mobile_sdk.av0     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L7b
            r4 = r3
            ads_mobile_sdk.av0 r4 = (ads_mobile_sdk.av0) r4     // Catch: java.lang.Throwable -> L7f
            r5 = 0
            ads_mobile_sdk.xh3.a(r4, r5)     // Catch: java.lang.Throwable -> L7f
        L7b:
            r0.close()
            return r3
        L7f:
            r3 = move-exception
            r0.b(r3)     // Catch: java.lang.Throwable -> Lae
            boolean r4 = r3 instanceof iyo     // Catch: java.lang.Throwable -> Lae
            if (r4 != 0) goto Lad
            r0.a(r3)     // Catch: java.lang.Throwable -> Lae
            boolean r4 = r3 instanceof kql     // Catch: java.lang.Throwable -> Lae
            if (r4 != 0) goto La5
            boolean r4 = r3 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Lae
            if (r4 != 0) goto L9d
            boolean r4 = r3 instanceof ads_mobile_sdk.mv0     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L97
            throw r3     // Catch: java.lang.Throwable -> Lae
        L97:
            ads_mobile_sdk.tu0 r4 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> Lae
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lae
            throw r4     // Catch: java.lang.Throwable -> Lae
        L9d:
            ads_mobile_sdk.ou0 r4 = new ads_mobile_sdk.ou0     // Catch: java.lang.Throwable -> Lae
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3     // Catch: java.lang.Throwable -> Lae
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lae
            throw r4     // Catch: java.lang.Throwable -> Lae
        La5:
            ads_mobile_sdk.uw0 r4 = new ads_mobile_sdk.uw0     // Catch: java.lang.Throwable -> Lae
            kql r3 = (kql) r3     // Catch: java.lang.Throwable -> Lae
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lae
            throw r4     // Catch: java.lang.Throwable -> Lae
        Lad:
            throw r3     // Catch: java.lang.Throwable -> Lae
        Lae:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r4 = move-exception
            defpackage.vtp.v(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d6.a(java.lang.String, java.lang.String):rap");
    }

    public final File b(String str) {
        File file = this.a;
        File file2 = new File(file, str);
        try {
            if (kotlin.text.c.q(file2.getCanonicalPath(), file.getCanonicalPath(), false)) {
                return file2;
            }
            xh3.a("Path traversal detected: " + str, null, 6);
            return null;
        } catch (IOException e) {
            xh3.a("Failed to resolve canonical path for " + str, e, 4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x00cf, TryCatch #5 {all -> 0x00cf, blocks: (B:3:0x000b, B:5:0x000f, B:14:0x0040, B:16:0x0044, B:42:0x00c0, B:44:0x00c4, B:17:0x0048, B:19:0x0050, B:20:0x0058, B:23:0x0071, B:24:0x0077, B:26:0x007d, B:28:0x0083, B:30:0x0091, B:32:0x009a, B:33:0x00a5, B:38:0x00af, B:39:0x00b2, B:41:0x00b4, B:6:0x0017, B:8:0x001b, B:10:0x0027, B:12:0x002f, B:13:0x0037), top: B:77:0x000b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rap b(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d6.b(java.lang.String, java.lang.String):rap");
    }
}
