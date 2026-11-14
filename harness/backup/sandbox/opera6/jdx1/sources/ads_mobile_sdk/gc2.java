package ads_mobile_sdk;

import defpackage.aop;
import defpackage.fjp;
import defpackage.r7p;
import defpackage.xzh;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class gc2 implements r7p, aop {
    public final sc2 a;
    public final ae2 b;
    public final defpackage.r83 c;
    public final av2 d;
    public final int e;
    public final ah3 f;
    public final fjp g;
    public fe2 h;

    public gc2(sc2 sc2Var, ae2 ae2Var, defpackage.r83 r83Var, av2 av2Var, int i, ah3 ah3Var, fjp fjpVar) {
        this.a = sc2Var;
        this.b = ae2Var;
        this.c = r83Var;
        this.d = av2Var;
        this.e = i;
        this.f = ah3Var;
        this.g = fjpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.r7p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.av0 r4, defpackage.xzh r5, mt5 r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof ads_mobile_sdk.fc2
            if (r4 == 0) goto L13
            r4 = r6
            ads_mobile_sdk.fc2 r4 = (ads_mobile_sdk.fc2) r4
            int r5 = r4.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.d = r5
            goto L1a
        L13:
            ads_mobile_sdk.fc2 r4 = new ads_mobile_sdk.fc2
            nt5 r6 = (nt5) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r5 = r4.b
            px5 r6 = px5.a
            int r0 = r4.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            ads_mobile_sdk.gc2 r3 = r4.a
            defpackage.ybh.y(r5)
            goto L49
        L2c:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r3)
            return r1
        L32:
            defpackage.ybh.y(r5)
            ads_mobile_sdk.fe2 r5 = r3.h
            if (r5 == 0) goto L68
            r4.a = r3
            r4.d = r2
            ads_mobile_sdk.ae2 r0 = r3.b
            r0.getClass()
            java.lang.Object r5 = ads_mobile_sdk.ae2.b(r0, r5, r4)
            if (r5 != r6) goto L49
            return r6
        L49:
            rap r5 = (defpackage.rap) r5
            boolean r4 = r5 instanceof ads_mobile_sdk.av0
            if (r4 == 0) goto L68
            ads_mobile_sdk.ah3 r4 = r3.f
            r6 = r5
            ads_mobile_sdk.av0 r6 = (ads_mobile_sdk.av0) r6
            java.lang.Throwable r6 = r6.b()
            if (r6 != 0) goto L63
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
        L63:
            java.lang.String r5 = "Failed to evict cached ad upon load/render failure"
            r4.a(r5, r6)
        L68:
            r83 r4 = r3.c
            boolean r5 = r4 instanceof defpackage.hp
            if (r5 == 0) goto L71
            r1 = r4
            hp r1 = (defpackage.hp) r1
        L71:
            if (r1 == 0) goto L7c
            ads_mobile_sdk.sc2 r4 = r3.a
            ads_mobile_sdk.av2 r5 = r3.d
            int r3 = r3.e
            r4.a(r1, r5, r3)
        L7c:
            kotlin.Unit r3 = kotlin.Unit.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gc2.a(ads_mobile_sdk.av0, xzh, mt5):java.lang.Object");
    }

    @Override // defpackage.r7p
    public final Object a(n13 n13Var, a2 a2Var, xzh xzhVar, mt5 mt5Var) {
        if (n13Var.c && this.g.mo6a()) {
            return Unit.a;
        }
        defpackage.r83 r83Var = this.c;
        defpackage.hp hpVar = r83Var instanceof defpackage.hp ? (defpackage.hp) r83Var : null;
        if (hpVar != null) {
            this.a.a(hpVar, this.d, this.e);
        }
        return Unit.a;
    }

    @Override // defpackage.aop
    public final Object a(n13 n13Var, mt5 mt5Var) {
        if (n13Var.c) {
            this.h = n13Var.d;
        }
        return Unit.a;
    }
}
