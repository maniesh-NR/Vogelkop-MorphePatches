package ads_mobile_sdk;

import defpackage.aop;
import defpackage.tso;

/* loaded from: classes.dex */
public final class n12 implements aop {
    public final qr0 a;
    public final tso b;

    public n12(qr0 qr0Var, tso tsoVar) {
        this.a = qr0Var;
        this.b = tsoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r8.d(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.aop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.r83 r9, mt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.m12
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.m12 r0 = (ads_mobile_sdk.m12) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.m12 r0 = new ads_mobile_sdk.m12
            nt5 r10 = (nt5) r10
            r0.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.ybh.y(r10)
            goto L74
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L33:
            ads_mobile_sdk.n12 r8 = r0.a
            defpackage.ybh.y(r10)
            goto L61
        L39:
            defpackage.ybh.y(r10)
            ads_mobile_sdk.qr0 r10 = r8.a
            r10.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a
            java.lang.String r7 = "gads:preload_native_singleton:enabled"
            java.lang.Object r10 = r10.a(r7, r2, r6)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L77
            boolean r9 = r9 instanceof defpackage.uie
            if (r9 == 0) goto L77
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = defpackage.mfh.y(r0)
            if (r9 == r1) goto L73
        L61:
            tso r8 = r8.b
            java.lang.Object r8 = r8.get()
            ads_mobile_sdk.k93 r8 = (ads_mobile_sdk.k93) r8
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L77:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.n12.a(r83, mt5):java.lang.Object");
    }
}
