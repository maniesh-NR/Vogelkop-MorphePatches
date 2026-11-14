package ads_mobile_sdk;

import defpackage.ato;

/* loaded from: classes.dex */
public final class ox1 implements ato {
    public final z2 a;

    public ox1(z2 z2Var) {
        this.a = z2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r5.e(r6) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r6, java.util.Map r7, mt5 r8) {
        /*
            r5 = this;
            boolean r6 = r8 instanceof ads_mobile_sdk.nx1
            if (r6 == 0) goto L13
            r6 = r8
            ads_mobile_sdk.nx1 r6 = (ads_mobile_sdk.nx1) r6
            int r0 = r6.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.e = r0
            goto L18
        L13:
            ads_mobile_sdk.nx1 r6 = new ads_mobile_sdk.nx1
            r6.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r6.c
            px5 r0 = px5.a
            int r1 = r6.e
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ybh.y(r8)
            goto L69
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r2
        L31:
            java.util.Map r7 = r6.b
            ads_mobile_sdk.ox1 r5 = r6.a
            defpackage.ybh.y(r8)
            goto L4a
        L39:
            defpackage.ybh.y(r8)
            r6.a = r5
            r6.b = r7
            r6.e = r4
            ads_mobile_sdk.z2 r8 = r5.a
            java.lang.Object r8 = r8.n(r6)
            if (r8 == r0) goto L68
        L4a:
            java.lang.String r8 = "sccg"
            java.lang.Object r7 = r7.get(r8)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L6c
            int r7 = r7.length()
            if (r7 == 0) goto L6c
            ads_mobile_sdk.z2 r5 = r5.a
            r6.a = r2
            r6.b = r2
            r6.e = r3
            kotlin.Unit r5 = r5.e(r6)
            if (r5 != r0) goto L69
        L68:
            return r0
        L69:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L6c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ox1.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    @Override // defpackage.ato
    public final int b() {
        return 36;
    }
}
