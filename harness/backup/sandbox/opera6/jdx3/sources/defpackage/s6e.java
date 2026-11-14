package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class s6e {
    public static final nx1 d = new nx1(3);
    public final int a;
    public final vq8 b;
    public final String c;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[PHI: r1
      0x0111: PHI (r1v2 vq8) = (r1v1 vq8), (r1v7 vq8), (r1v7 vq8), (r1v7 vq8) binds: [B:29:0x0110, B:14:0x005f, B:35:0x0111, B:16:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s6e(android.content.Context r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6e.<init>(android.content.Context):void");
    }

    public static String a(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("utm_campaign"));
        g(string);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("utm_source=");
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("utm_source"));
        g(string2);
        if (TextUtils.isEmpty(string2)) {
            string2 = "mock";
        }
        p3p.v(sb, string2, "&utm_campaign=", string);
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("utm_medium"));
        g(string3);
        String str = TextUtils.isEmpty(string3) ? "mock" : string3;
        sb.append("&utm_medium=");
        sb.append(str);
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("utm_term"));
        g(string4);
        if (!TextUtils.isEmpty(string4)) {
            sb.append("&utm_term=");
            sb.append(string4);
        }
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("utm_content"));
        g(string5);
        if (!TextUtils.isEmpty(string5)) {
            sb.append("&utm_content=");
            sb.append(string5);
        }
        return sb.toString();
    }

    public static s6e b(Context context) {
        return (s6e) d.d(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(int r6, android.content.Context r7) throws java.security.NoSuchAlgorithmException, java.security.cert.CertificateEncodingException {
        /*
            java.lang.String r0 = defpackage.j7c.h(r6)
            r1 = 64
            r3 = 0
            r4 = 1
            r5 = 0
            android.content.pm.PackageInfo r7 = r9n.u(r7, r0, r1)     // Catch: java.security.cert.CertificateException -> L38
            if (r7 == 0) goto L38
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: java.security.cert.CertificateException -> L38
            if (r7 == 0) goto L19
            int r0 = r7.length     // Catch: java.security.cert.CertificateException -> L38
            if (r0 != r4) goto L19
            r7 = r7[r3]     // Catch: java.security.cert.CertificateException -> L38
            goto L1a
        L19:
            r7 = r5
        L1a:
            if (r7 == 0) goto L38
            java.lang.String r0 = "X509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.security.cert.CertificateException -> L38
            if (r0 == 0) goto L38
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L38
            byte[] r7 = r7.toByteArray()     // Catch: java.security.cert.CertificateException -> L38
            r1.<init>(r7)     // Catch: java.security.cert.CertificateException -> L38
            java.security.cert.Certificate r7 = r0.generateCertificate(r1)     // Catch: java.security.cert.CertificateException -> L38
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch: java.security.cert.CertificateException -> L38
            byte[] r7 = r7.getEncoded()     // Catch: java.security.cert.CertificateException -> L38
            goto L39
        L38:
            r7 = r5
        L39:
            if (r7 != 0) goto L3c
            return r3
        L3c:
            if (r6 == r4) goto L45
            r0 = 2
            if (r6 != r0) goto L44
            java.lang.String r6 = "5d6afbf87f652af04647ada0df634cf22370900b164b09d50bd23aa2cb5285b8"
            goto L47
        L44:
            throw r5
        L45:
            java.lang.String r6 = "57acbc525f1b2ebd19196cd6f014397cc910fd18841e0ae850febc3e1e593ff2"
        L47:
            java.lang.String r0 = "%0"
            java.lang.String r1 = "SHA256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L77
            if (r1 == 0) goto L77
            byte[] r7 = r1.digest(r7)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch: java.security.NoSuchAlgorithmException -> L77
            r1.<init>(r4, r7)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L77
            r3.<init>(r0)     // Catch: java.security.NoSuchAlgorithmException -> L77
            int r7 = r7.length     // Catch: java.security.NoSuchAlgorithmException -> L77
            int r7 = r7 << r4
            r3.append(r7)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.String r7 = "x"
            r3.append(r7)     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.String r7 = r3.toString()     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.Object[] r0 = new java.lang.Object[]{r1}     // Catch: java.security.NoSuchAlgorithmException -> L77
            java.lang.String r5 = java.lang.String.format(r2, r7, r0)     // Catch: java.security.NoSuchAlgorithmException -> L77
        L77:
            boolean r6 = r6.equals(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6e.d(int, android.content.Context):boolean");
    }

    public static String e(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex < 0 ? "" : cursor.getString(columnIndex);
    }

    public static void f(String str) {
        if (str == null || str.length() > 3 || !str.matches("^[0-9]*$")) {
            hai.d();
        }
    }

    public static void g(String str) {
        if (str == null || str.length() > 200 || !str.matches("^[a-zA-Z0-9._-]*$")) {
            hai.d();
        }
    }

    public final boolean c() {
        return this.b != null;
    }
}
