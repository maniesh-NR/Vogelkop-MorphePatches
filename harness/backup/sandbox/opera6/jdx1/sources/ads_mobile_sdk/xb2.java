package ads_mobile_sdk;

import defpackage.fjp;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xb2 implements rko {
    public final n13 a;
    public final ae2 b;
    public final sc2 c;
    public final defpackage.r83 d;
    public final av2 e;
    public final Optional f;
    public final fjp g;
    public final ah3 h;
    public final AtomicBoolean i = new AtomicBoolean(false);

    public xb2(n13 n13Var, ae2 ae2Var, sc2 sc2Var, defpackage.r83 r83Var, av2 av2Var, Optional optional, fjp fjpVar, ah3 ah3Var) {
        this.a = n13Var;
        this.b = ae2Var;
        this.c = sc2Var;
        this.d = r83Var;
        this.e = av2Var;
        this.f = optional;
        this.g = fjpVar;
        this.h = ah3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.vb2
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.vb2 r0 = (ads_mobile_sdk.vb2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.vb2 r0 = new ads_mobile_sdk.vb2
            nt5 r5 = (nt5) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ads_mobile_sdk.xb2 r4 = r0.a
            defpackage.ybh.y(r5)
            goto L5f
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L32:
            defpackage.ybh.y(r5)
            fjp r5 = r4.g
            boolean r5 = r5.mo6a()
            if (r5 == 0) goto L7e
            ads_mobile_sdk.n13 r5 = r4.a
            boolean r2 = r5.c
            if (r2 == 0) goto L7e
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.i
            boolean r2 = r2.get()
            if (r2 != 0) goto L7e
            ads_mobile_sdk.fe2 r5 = r5.d
            if (r5 == 0) goto L7e
            r0.a = r4
            r0.d = r3
            ads_mobile_sdk.ae2 r2 = r4.b
            r2.getClass()
            java.lang.Object r5 = ads_mobile_sdk.ae2.a(r2, r5, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            rap r5 = (defpackage.rap) r5
            boolean r0 = r5 instanceof ads_mobile_sdk.av0
            if (r0 == 0) goto L7e
            ads_mobile_sdk.ah3 r4 = r4.h
            r0 = r5
            ads_mobile_sdk.av0 r0 = (ads_mobile_sdk.av0) r0
            java.lang.Throwable r0 = r0.b()
            if (r0 != 0) goto L79
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
        L79:
            java.lang.String r5 = "Cache status reset failure on ad destroyed"
            r4.a(r5, r0)
        L7e:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xb2.a(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(mt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.wb2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.wb2 r0 = (ads_mobile_sdk.wb2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.wb2 r0 = new ads_mobile_sdk.wb2
            nt5 r7 = (nt5) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.xb2 r6 = r0.a
            defpackage.ybh.y(r7)
            goto L60
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L32:
            defpackage.ybh.y(r7)
            fjp r7 = r6.g
            boolean r7 = r7.mo6a()
            if (r7 == 0) goto La2
            ads_mobile_sdk.n13 r7 = r6.a
            boolean r2 = r7.c
            if (r2 == 0) goto La2
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.i
            r5 = 0
            boolean r2 = r2.compareAndSet(r5, r4)
            if (r2 == 0) goto La2
            ads_mobile_sdk.fe2 r7 = r7.d
            if (r7 == 0) goto La2
            r0.a = r6
            r0.d = r4
            ads_mobile_sdk.ae2 r2 = r6.b
            r2.getClass()
            java.lang.Object r7 = ads_mobile_sdk.ae2.b(r2, r7, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            rap r7 = (defpackage.rap) r7
            boolean r0 = r7 instanceof ads_mobile_sdk.av0
            if (r0 == 0) goto L80
            ads_mobile_sdk.ah3 r6 = r6.h
            r0 = r7
            ads_mobile_sdk.av0 r0 = (ads_mobile_sdk.av0) r0
            java.lang.Throwable r0 = r0.b()
            if (r0 != 0) goto L7a
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
        L7a:
            java.lang.String r7 = "Cache eviction failure on impression"
            r6.a(r7, r0)
            goto La2
        L80:
            r83 r7 = r6.d
            boolean r0 = r7 instanceof defpackage.hp
            if (r0 == 0) goto L89
            r3 = r7
            hp r3 = (defpackage.hp) r3
        L89:
            if (r3 == 0) goto La2
            ads_mobile_sdk.sc2 r7 = r6.c
            ads_mobile_sdk.av2 r0 = r6.e
            java.util.Optional r6 = r6.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = defpackage.xf8.N(r6, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r7.a(r3, r0, r6)
        La2:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xb2.q(mt5):java.lang.Object");
    }
}
