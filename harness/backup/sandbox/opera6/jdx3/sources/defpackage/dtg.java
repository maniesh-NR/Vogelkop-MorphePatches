package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class dtg {
    public static final AtomicReference a = new AtomicReference();
    public static boolean b;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ctg a(android.content.Context r12) {
        /*
            java.lang.String r0 = "utm_medium"
            java.lang.String r1 = "utm_campaign"
            java.lang.String r2 = "fake.org/?"
            boolean r3 = c(r12)
            java.lang.String r4 = ""
            r5 = 0
            if (r3 == 0) goto L50
            java.lang.String r3 = "content://com.opera.preinstall.PreinstallProvider/referrer"
            android.net.Uri r7 = android.net.Uri.parse(r3)
            android.content.ContentResolver r6 = r12.getContentResolver()
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)
            if (r12 == 0) goto L47
            boolean r3 = r12.moveToFirst()
            if (r3 == 0) goto L47
            java.lang.String r3 = "Referrer"
            int r3 = r12.getColumnIndex(r3)
            r6 = -1
            if (r3 == r6) goto L37
            java.lang.String r3 = r12.getString(r3)
            goto L38
        L37:
            r3 = r5
        L38:
            java.lang.String r7 = "Flavor"
            int r7 = r12.getColumnIndex(r7)
            if (r7 == r6) goto L45
            java.lang.String r6 = r12.getString(r7)
            goto L49
        L45:
            r6 = r5
            goto L49
        L47:
            r3 = r5
            r6 = r3
        L49:
            if (r12 == 0) goto L4e
            r12.close()
        L4e:
            if (r3 != 0) goto L52
        L50:
            r12 = r5
            goto L5c
        L52:
            r40 r12 = new r40
            java.lang.String[] r7 = defpackage.aik.a
            if (r6 != 0) goto L59
            r6 = r4
        L59:
            r12.<init>(r3, r6)
        L5c:
            if (r12 == 0) goto Lb1
            java.lang.String r12 = r12.b
            java.lang.String r12 = b(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Lb1
            r3.<init>(r2)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            r3.append(r12)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            java.lang.String r2 = r3.toString()     // Catch: java.lang.UnsupportedOperationException -> Lb1
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            java.lang.String r3 = "utm_source"
            java.lang.String r3 = r2.getQueryParameter(r3)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            if (r3 == 0) goto Lb1
            boolean r4 = r3.equals(r4)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            if (r4 != 0) goto Lb1
            android.net.Uri$Builder r4 = r2.buildUpon()     // Catch: java.lang.UnsupportedOperationException -> Lb1
            java.lang.String r6 = r2.getQueryParameter(r1)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            r7 = 1
            if (r6 != 0) goto L93
            r4.appendQueryParameter(r1, r3)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            r6 = r3
            r1 = r7
            goto L94
        L93:
            r1 = 0
        L94:
            java.lang.String r2 = r2.getQueryParameter(r0)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            if (r2 != 0) goto La0
            java.lang.String r2 = "oem"
            r4.appendQueryParameter(r0, r2)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            goto La1
        La0:
            r7 = r1
        La1:
            if (r7 == 0) goto Lab
            android.net.Uri r12 = r4.build()     // Catch: java.lang.UnsupportedOperationException -> Lb1
            java.lang.String r12 = r12.getQuery()     // Catch: java.lang.UnsupportedOperationException -> Lb1
        Lab:
            ctg r0 = new ctg     // Catch: java.lang.UnsupportedOperationException -> Lb1
            r0.<init>(r3, r6, r2, r12)     // Catch: java.lang.UnsupportedOperationException -> Lb1
            return r0
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtg.a(android.content.Context):ctg");
    }

    public static String b(String str) {
        return ("oem_BLU_us".equals(str) || "operator_dtac".equals(str)) ? sko.l("utm_source=", str, "&utm_campaign=", str, "&utm_medium=oem") : a26.B(str);
    }

    public static boolean c(Context context) {
        PackageInfo packageInfoU = r9n.u(context, "com.opera.preinstall", 134217728L);
        if (packageInfoU == null || packageInfoU.signingInfo.hasMultipleSigners()) {
            return false;
        }
        for (Signature signature : packageInfoU.signingInfo.getSigningCertificateHistory()) {
            if (context.getPackageManager().hasSigningCertificate(context.getPackageName(), signature.toByteArray(), 0)) {
                return true;
            }
        }
        return false;
    }
}
