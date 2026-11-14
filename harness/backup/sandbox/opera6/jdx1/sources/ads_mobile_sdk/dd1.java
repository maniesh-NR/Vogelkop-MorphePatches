package ads_mobile_sdk;

import defpackage.glp;

/* loaded from: classes.dex */
public final class dd1 extends defpackage.zf3 {
    public final int e;
    public final o32 f;
    public final qr0 g;

    public dd1(String str, int i, kh3 kh3Var, glp glpVar, o32 o32Var, qr0 qr0Var) {
        super(str, i, kh3Var, glpVar);
        this.e = i;
        this.f = o32Var;
        this.g = qr0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.dd1 r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.bd1
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.bd1 r0 = (ads_mobile_sdk.bd1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.bd1 r0 = new ads_mobile_sdk.bd1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r10)     // Catch: kql -> L99
            goto L96
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r3
        L31:
            ads_mobile_sdk.dd1 r9 = r0.a
            defpackage.ybh.y(r10)
            goto L65
        L37:
            defpackage.ybh.y(r10)
            r0.a = r9
            r0.d = r5
            ads_mobile_sdk.rg3 r10 = ads_mobile_sdk.hh3.a()
            java.lang.Object r2 = r9.c
            ads_mobile_sdk.kh3 r2 = (ads_mobile_sdk.kh3) r2
            r10.a = r2
            ads_mobile_sdk.ih1 r10 = r2.b
            java.lang.Object r2 = r9.b
            java.lang.String r2 = (java.lang.String) r2
            r10.a = r2
            int r2 = r9.a
            r10.c = r2
            java.lang.Object r10 = r9.d
            glp r10 = (defpackage.glp) r10
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto L61
            kotlin.Unit r10 = (kotlin.Unit) r10
            goto L63
        L61:
            kotlin.Unit r10 = kotlin.Unit.a
        L63:
            if (r10 == r1) goto L95
        L65:
            ads_mobile_sdk.qr0 r10 = r9.g     // Catch: kql -> L99
            r10.getClass()     // Catch: kql -> L99
            java.lang.String r2 = "gads:load_timeout:milliseconds"
            on7 r6 = pn7.b     // Catch: kql -> L99
            un7 r6 = un7.f     // Catch: kql -> L99
            r7 = 5
            long r6 = defpackage.cs5.x0(r7, r6)     // Catch: kql -> L99
            pn7 r8 = new pn7     // Catch: kql -> L99
            r8.<init>(r6)     // Catch: kql -> L99
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a$18     // Catch: kql -> L99
            java.lang.Object r10 = r10.a(r2, r8, r6)     // Catch: kql -> L99
            pn7 r10 = (pn7) r10     // Catch: kql -> L99
            long r6 = r10.a     // Catch: kql -> L99
            zhl r10 = new zhl     // Catch: kql -> L99
            r2 = 13
            r10.<init>(r2, r3, r9)     // Catch: kql -> L99
            r0.a = r3     // Catch: kql -> L99
            r0.d = r4     // Catch: kql -> L99
            java.lang.Object r10 = uyg.v(r6, r10, r0)     // Catch: kql -> L99
            if (r10 != r1) goto L96
        L95:
            return r1
        L96:
            rap r10 = (defpackage.rap) r10     // Catch: kql -> L99
            return r10
        L99:
            r9 = move-exception
            ads_mobile_sdk.iv0 r10 = new ads_mobile_sdk.iv0
            r10.<init>(r9, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dd1.a(ads_mobile_sdk.dd1, nt5):java.lang.Object");
    }
}
