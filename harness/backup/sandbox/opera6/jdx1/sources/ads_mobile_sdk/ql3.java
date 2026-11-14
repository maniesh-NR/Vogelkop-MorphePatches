package ads_mobile_sdk;

import defpackage.ato;

/* loaded from: classes.dex */
public final class ql3 implements ato {
    public final vz a;
    public final ah3 b;

    public ql3(vz vzVar, ah3 ah3Var) {
        this.a = vzVar;
        this.b = ah3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r6, java.util.Map r7, mt5 r8) {
        /*
            r5 = this;
            boolean r6 = r8 instanceof ads_mobile_sdk.pl3
            if (r6 == 0) goto L13
            r6 = r8
            ads_mobile_sdk.pl3 r6 = (ads_mobile_sdk.pl3) r6
            int r0 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.d = r0
            goto L18
        L13:
            ads_mobile_sdk.pl3 r6 = new ads_mobile_sdk.pl3
            r6.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r6.b
            px5 r0 = px5.a
            int r1 = r6.d
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            ads_mobile_sdk.ql3 r5 = r6.a
            defpackage.ybh.y(r8)     // Catch: ads_mobile_sdk.bj1 -> L6d
            goto L6a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L31:
            defpackage.ybh.y(r8)
            java.lang.String r8 = "allowlist"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L53
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Allowlist is missing from an updateAllowlist GMSG: "
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6 = 6
            ads_mobile_sdk.xh3.a(r5, r3, r6)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L53:
            k63 r7 = n63.b     // Catch: java.lang.IllegalArgumentException -> L7b
            byte[] r7 = r7.a(r8)     // Catch: java.lang.IllegalArgumentException -> L7b
            ads_mobile_sdk.vz r8 = r5.a     // Catch: ads_mobile_sdk.bj1 -> L6d
            ads_mobile_sdk.qx r7 = ads_mobile_sdk.qx.a(r7)     // Catch: ads_mobile_sdk.bj1 -> L6d
            r6.a = r5     // Catch: ads_mobile_sdk.bj1 -> L6d
            r6.d = r4     // Catch: ads_mobile_sdk.bj1 -> L6d
            java.lang.Object r5 = r8.b(r7, r6)     // Catch: ads_mobile_sdk.bj1 -> L6d
            if (r5 != r0) goto L6a
            return r0
        L6a:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L6d:
            r6 = move-exception
            ads_mobile_sdk.xh3.a(r3, r6, r4, r2)
            ads_mobile_sdk.ah3 r5 = r5.b
            java.lang.String r7 = "Allowlist proto deserialization failed."
            r5.a(r7, r6)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L7b:
            r6 = move-exception
            ads_mobile_sdk.xh3.a(r3, r6, r4, r2)
            ads_mobile_sdk.ah3 r5 = r5.b
            java.lang.String r7 = "Allowlist gmsg param is not a valid encoded string."
            r5.a(r7, r6)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ql3.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    @Override // defpackage.ato
    public final int b() {
        return 12;
    }
}
