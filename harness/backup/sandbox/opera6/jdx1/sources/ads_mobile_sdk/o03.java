package ads_mobile_sdk;

import defpackage.kap;
import defpackage.mip;

/* loaded from: classes.dex */
public final class o03 {
    public final nx5 a;
    public final kap b;
    public final mip c;
    public final pfe d = new pfe();
    public h07 e;

    public o03(nx5 nx5Var, kap kapVar, mip mipVar) {
        this.a = nx5Var;
        this.b = kapVar;
        this.c = mipVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.o03 r11, java.lang.String r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.m03
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.m03 r0 = (ads_mobile_sdk.m03) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.m03 r0 = new ads_mobile_sdk.m03
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r8 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            pfe r11 = r0.c
            ads_mobile_sdk.i03 r12 = r0.b
            ads_mobile_sdk.o03 r0 = r0.a
            defpackage.ybh.y(r13)     // Catch: java.lang.Exception -> L84
            goto L74
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            r11 = 0
            return r11
        L38:
            ads_mobile_sdk.o03 r11 = r0.a
            defpackage.ybh.y(r13)     // Catch: java.lang.Exception -> L84
            goto L5e
        L3e:
            defpackage.ybh.y(r13)
            kap r13 = r11.b     // Catch: java.lang.Exception -> L84
            java.lang.Object r13 = r13.get()     // Catch: java.lang.Exception -> L84
            qd6 r13 = (defpackage.qd6) r13     // Catch: java.lang.Exception -> L84
            c71 r5 = new c71     // Catch: java.lang.Exception -> L84
            r9 = 17
            r10 = 0
            r6 = r11
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L84
            r0.a = r6     // Catch: java.lang.Exception -> L84
            r0.f = r4     // Catch: java.lang.Exception -> L84
            java.lang.Object r13 = r13.a(r5, r0)     // Catch: java.lang.Exception -> L84
            if (r13 == r1) goto L71
            r11 = r6
        L5e:
            r12 = r13
            ads_mobile_sdk.i03 r12 = (ads_mobile_sdk.i03) r12     // Catch: java.lang.Exception -> L84
            pfe r13 = r11.d     // Catch: java.lang.Exception -> L84
            r0.a = r11     // Catch: java.lang.Exception -> L84
            r0.b = r12     // Catch: java.lang.Exception -> L84
            r0.c = r13     // Catch: java.lang.Exception -> L84
            r0.f = r3     // Catch: java.lang.Exception -> L84
            java.lang.Object r0 = r13.i(r0)     // Catch: java.lang.Exception -> L84
            if (r0 != r1) goto L72
        L71:
            return r1
        L72:
            r0 = r11
            r11 = r13
        L74:
            cd5 r12 = defpackage.sfe.d(r12)     // Catch: java.lang.Throwable -> L7e
            r0.e = r12     // Catch: java.lang.Throwable -> L7e
            r11.l(r8)     // Catch: java.lang.Exception -> L84
            goto L94
        L7e:
            r0 = move-exception
            r12 = r0
            r11.l(r8)     // Catch: java.lang.Exception -> L84
            throw r12     // Catch: java.lang.Exception -> L84
        L84:
            r0 = move-exception
            r11 = r0
            ads_mobile_sdk.rg3 r12 = ads_mobile_sdk.hh3.a()
            ads_mobile_sdk.ub2 r13 = r12.e()
            r0 = 0
            r13.m = r0
            r12.a(r11)
        L94:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o03.a(ads_mobile_sdk.o03, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.o03 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.k03
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.k03 r0 = (ads_mobile_sdk.k03) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.k03 r0 = new ads_mobile_sdk.k03
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r8)
            return r8
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L31:
            pfe r7 = r0.b
            ads_mobile_sdk.o03 r2 = r0.a
            defpackage.ybh.y(r8)
            r8 = r7
            r7 = r2
            goto L4c
        L3b:
            defpackage.ybh.y(r8)
            pfe r8 = r7.d
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L6f
        L4c:
            h07 r2 = r7.e     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L60
            nx5 r2 = r7.a     // Catch: java.lang.Throwable -> L71
            zhl r4 = new zhl     // Catch: java.lang.Throwable -> L71
            r6 = 20
            r4.<init>(r6, r5, r7)     // Catch: java.lang.Throwable -> L71
            r6 = 3
            i07 r2 = defpackage.na2.g(r2, r5, r5, r4, r6)     // Catch: java.lang.Throwable -> L71
            r7.e = r2     // Catch: java.lang.Throwable -> L71
        L60:
            r8.l(r5)
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r2.X(r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            return r7
        L71:
            r7 = move-exception
            r8.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o03.a(ads_mobile_sdk.o03, nt5):java.lang.Object");
    }
}
