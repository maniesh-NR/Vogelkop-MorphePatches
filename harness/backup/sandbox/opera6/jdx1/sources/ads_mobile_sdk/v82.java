package ads_mobile_sdk;

import android.content.Context;
import defpackage.bro;
import defpackage.m7p;
import defpackage.xp9;
import java.util.Optional;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class v82 extends st0 {
    public final Optional Q;
    public rp3 R;

    public v82(Context context, nx5 nx5Var, CoroutineContext coroutineContext, nx5 nx5Var2, qr0 qr0Var, ah3 ah3Var, String str, Optional optional, av2 av2Var, a2 a2Var, g0 g0Var, z2 z2Var, m7p m7pVar, ax0 ax0Var, bro broVar) {
        super(context, nx5Var, coroutineContext, nx5Var2, qr0Var, ah3Var, str, av2Var, a2Var, g0Var, z2Var, m7pVar, ax0Var, broVar);
        this.Q = optional;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (defpackage.na2.Z(r6.c, new defpackage.u6k(27, r3, r6), r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.v82 r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.r82
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.r82 r0 = (ads_mobile_sdk.r82) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.r82 r0 = new ads_mobile_sdk.r82
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r7)
            goto L60
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            ads_mobile_sdk.v82 r6 = r0.a
            defpackage.ybh.y(r7)
            goto L44
        L37:
            defpackage.ybh.y(r7)
            r0.a = r6
            r0.d = r5
            java.lang.Object r7 = ads_mobile_sdk.st0.b(r6, r0)
            if (r7 == r1) goto L5f
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            r0.a = r3
            r0.d = r4
            kotlin.coroutines.CoroutineContext r7 = r6.c
            u6k r2 = new u6k
            r4 = 27
            r2.<init>(r4, r3, r6)
            java.lang.Object r6 = defpackage.na2.Z(r7, r2, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.v82.a(ads_mobile_sdk.v82, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (super.a(r7, (mt5) r0) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.v82 r6, defpackage.xp9 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.t82
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.t82 r0 = (ads_mobile_sdk.t82) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.t82 r0 = new ads_mobile_sdk.t82
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r8)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L31:
            xp9 r7 = r0.b
            ads_mobile_sdk.v82 r6 = r0.a
            defpackage.ybh.y(r8)
            goto L51
        L39:
            defpackage.ybh.y(r8)
            r0.a = r6
            r0.b = r7
            r0.e = r4
            kotlin.coroutines.CoroutineContext r8 = r6.c
            u6k r2 = new u6k
            r4 = 27
            r2.<init>(r4, r5, r6)
            java.lang.Object r8 = defpackage.na2.Z(r8, r2, r0)
            if (r8 == r1) goto L5d
        L51:
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = super.a(r7, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.v82.a(ads_mobile_sdk.v82, xp9, nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.st0, ads_mobile_sdk.mt0, defpackage.o5p
    public final Object a(xp9 xp9Var, mt5 mt5Var) {
        return a(this, xp9Var, (nt5) mt5Var);
    }

    @Override // ads_mobile_sdk.mt0
    public final Object c(kuk kukVar) {
        return a(this, (nt5) kukVar);
    }
}
