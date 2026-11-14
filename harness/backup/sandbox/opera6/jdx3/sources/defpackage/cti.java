package defpackage;

/* loaded from: classes.dex */
public abstract class cti {
    public static final hv5 a = new hv5();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(zg r7, defpackage.eri r8, defpackage.bti r9, defpackage.p6l r10) {
        /*
            java.lang.Object r0 = r7.d
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r7.a
            java.lang.Object r2 = r7.b
            sre r2 = (defpackage.sre) r2
            if (r0 == 0) goto L37
            java.lang.String r3 = r8.getUrl()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri r4 = android.net.Uri.parse(r0)
            java.lang.String r5 = r3.getScheme()
            java.lang.String r6 = r4.getScheme()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L28
            r3 = 0
            goto L35
        L28:
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r4.toString()
            r5 = 1
            boolean r3 = J.N.M3e4Lx_w(r3, r4, r5)
        L35:
            if (r3 != 0) goto L41
        L37:
            java.lang.String r0 = r2.a()
            q6e r3 = defpackage.eti.a
            java.lang.String r0 = r8.a(r1, r10, r0)
        L41:
            java.lang.String r8 = r9.m(r0)
            boolean r10 = r9.B()
            if (r10 == 0) goto L82
            com.opera.android.browser.UrlMangler$Builder r10 = new com.opera.android.browser.UrlMangler$Builder
            java.lang.String r0 = "search"
            r10.<init>(r0, r8)
            java.lang.Object r7 = r7.c
            zg r7 = (zg) r7
            java.lang.Object r7 = r7.b
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r9.F(r7)
            java.lang.String r8 = "search_template"
            java.util.HashMap r9 = r10.c
            r9.put(r8, r7)
            int r7 = vep.A(r1)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "search_origin"
            r9.put(r8, r7)
            java.lang.String r7 = r2.a()
            r10.displayString(r7)
            java.lang.String r7 = r10.build()
            return r7
        L82:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cti.a(zg, eri, bti, p6l):java.lang.String");
    }
}
