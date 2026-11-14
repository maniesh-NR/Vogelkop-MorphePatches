package ads_mobile_sdk;

import defpackage.yko;

/* loaded from: classes.dex */
public final class a02 {
    public final ux2 a;
    public final oo3 b;
    public final yko c;
    public cy0 d;

    public a02(ux2 ux2Var, oo3 oo3Var, yko ykoVar) {
        this.a = ux2Var;
        this.b = oo3Var;
        this.c = ykoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0194 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #5 {all -> 0x0195, blocks: (B:91:0x0167, B:93:0x016e, B:95:0x0175, B:97:0x0179, B:99:0x017d, B:100:0x017e, B:101:0x0183, B:102:0x0184, B:103:0x018b, B:104:0x018c, B:105:0x0193, B:106:0x0194), top: B:122:0x0167 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9 A[Catch: all -> 0x0110, TryCatch #1 {all -> 0x0110, blocks: (B:49:0x00e2, B:51:0x00e9, B:53:0x00f0, B:55:0x00f4, B:57:0x00f8, B:58:0x00f9, B:59:0x00fe, B:60:0x00ff, B:61:0x0106, B:62:0x0107, B:63:0x010e, B:64:0x010f), top: B:115:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #1 {all -> 0x0110, blocks: (B:49:0x00e2, B:51:0x00e9, B:53:0x00f0, B:55:0x00f4, B:57:0x00f8, B:58:0x00f9, B:59:0x00fe, B:60:0x00ff, B:61:0x0106, B:62:0x0107, B:63:0x010e, B:64:0x010f), top: B:115:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e A[Catch: all -> 0x0195, TryCatch #5 {all -> 0x0195, blocks: (B:91:0x0167, B:93:0x016e, B:95:0x0175, B:97:0x0179, B:99:0x017d, B:100:0x017e, B:101:0x0183, B:102:0x0184, B:103:0x018b, B:104:0x018c, B:105:0x0193, B:106:0x0194), top: B:122:0x0167 }] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v25, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r6v10, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.a02 r16, nt5 r17) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a02.a(ads_mobile_sdk.a02, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.a02 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.zz1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.zz1 r0 = (ads_mobile_sdk.zz1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.zz1 r0 = new ads_mobile_sdk.zz1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.a02 r5 = r0.a
            defpackage.ybh.y(r6)
            goto L42
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            ads_mobile_sdk.cy0 r6 = r5.d
            if (r6 == 0) goto L42
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            r5.d = r3
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a02.b(ads_mobile_sdk.a02, nt5):java.lang.Object");
    }
}
