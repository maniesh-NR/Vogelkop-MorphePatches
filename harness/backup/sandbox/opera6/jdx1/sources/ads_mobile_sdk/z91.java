package ads_mobile_sdk;

import android.content.Context;
import defpackage.dvj;
import defpackage.rf4;
import defpackage.sgb;
import defpackage.ulp;
import defpackage.xp9;
import defpackage.zbf;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class z91 extends mt0 {
    public final d91 E;
    public final zbf F;
    public final g0 G;
    public final cy0 H;
    public int I;

    public z91(d91 d91Var, cy0 cy0Var, zbf zbfVar, g0 g0Var, Context context, nx5 nx5Var, CoroutineContext coroutineContext, nx5 nx5Var2, qr0 qr0Var, ah3 ah3Var, String str, ax0 ax0Var, e7 e7Var) {
        super(context, nx5Var, coroutineContext, nx5Var2, qr0Var, ah3Var, str, ax0Var, e7Var, Optional.empty());
        this.E = d91Var;
        this.F = zbfVar;
        this.G = g0Var;
        this.H = cy0Var;
        this.I = -1;
        this.q = cy0Var;
        this.u = true;
    }

    @Override // ads_mobile_sdk.mt0, defpackage.o5p
    public final Object a(xp9 xp9Var, mt5 mt5Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, mt5Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new t91(this, null, (byte) 1), 3);
        return Unit.a;
    }

    @Override // ads_mobile_sdk.mt0
    public final void a(int i) {
        this.I = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.mt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.u91
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.u91 r0 = (ads_mobile_sdk.u91) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.u91 r0 = new ads_mobile_sdk.u91
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.z91 r5 = r0.a
            defpackage.ybh.y(r6)
            goto L40
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            r0.a = r5
            r0.d = r4
            ads_mobile_sdk.cy0 r6 = r5.H
            r6.o = r3
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r1) goto L40
            return r1
        L40:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.n
            boolean r6 = r6.get()
            if (r6 == 0) goto L77
            dvj r6 = ads_mobile_sdk.ax0.f
            dze r6 = dze.b
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            kotlin.coroutines.CoroutineContext r6 = kotlin.coroutines.e.a(r6, r0)
            tmj r0 = ads_mobile_sdk.rh3.b
            kotlin.coroutines.CoroutineContext r6 = r6.minusKey(r0)
            psp r0 = psp.b
            kotlin.coroutines.CoroutineContext r6 = r6.minusKey(r0)
            ulp r0 = defpackage.ulp.h
            kotlin.coroutines.CoroutineContext r6 = r6.minusKey(r0)
            a64 r6 = defpackage.sgb.b(r6)
            ads_mobile_sdk.t91 r0 = new ads_mobile_sdk.t91
            r1 = 0
            r0.<init>(r5, r3, r1)
            r5 = 3
            defpackage.na2.B(r6, r3, r3, r0, r5)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L77:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z91.b(nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.mt0
    public final Object e(rf4 rf4Var) {
        dvj dvjVar = ax0.f;
        defpackage.na2.B(sgb.b(kotlin.coroutines.e.a(dze.b, rf4Var.getContext()).minusKey(rh3.b).minusKey(psp.b).minusKey(ulp.h)), null, null, new t91(this, null, (byte) 2), 3);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.x91
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.x91 r0 = (ads_mobile_sdk.x91) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.x91 r0 = new ads_mobile_sdk.x91
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L80
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L31:
            m5a r7 = r0.b
            ads_mobile_sdk.z91 r2 = r0.a
            defpackage.ybh.y(r8)
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r6
            goto L53
        L3d:
            defpackage.ybh.y(r8)
            m5a r8 = new m5a
            r8.<init>()
            r0.a = r7
            r0.b = r8
            r0.e = r5
            ads_mobile_sdk.d91 r2 = r7.E
            java.lang.Object r2 = r2.t(r0)
            if (r2 == r1) goto L7f
        L53:
            java.lang.String r8 = r8.g(r2)
            ads_mobile_sdk.cy0 r7 = r7.H
            r0.a = r3
            r0.b = r3
            r0.e = r4
            r7.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "window.inspectorInfo("
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = ");"
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 == r1) goto L7d
            kotlin.Unit r7 = kotlin.Unit.a
        L7d:
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z91.f(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.y91
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.y91 r0 = (ads_mobile_sdk.y91) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.y91 r0 = new ads_mobile_sdk.y91
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ads_mobile_sdk.z91 r4 = r0.a
            defpackage.ybh.y(r5)
            goto L3e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            ads_mobile_sdk.g0 r5 = r4.G
            android.app.Activity r5 = r5.b()
            if (r5 != 0) goto L48
            android.content.Context r5 = r4.a
        L48:
            boolean r4 = r4.a(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z91.g(nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.mt0
    public final cy0 j() {
        return this.H;
    }

    @Override // ads_mobile_sdk.mt0
    public final int k() {
        return this.I;
    }
}
