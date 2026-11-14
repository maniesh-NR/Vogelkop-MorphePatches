package ads_mobile_sdk;

import defpackage.ato;

/* loaded from: classes.dex */
public final class dt implements ato {
    public final k8 a;
    public final z2 b;
    public final dl c;
    public final gn0 d;
    public final a2 e;

    public dt(k8 k8Var, z2 z2Var, dl dlVar, gn0 gn0Var, a2 a2Var) {
        this.a = k8Var;
        this.b = z2Var;
        this.c = dlVar;
        this.d = gn0Var;
        this.e = a2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r11.c(r10, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r11, java.util.Map r12, mt5 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.ct
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.ct r0 = (ads_mobile_sdk.ct) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.ct r0 = new ads_mobile_sdk.ct
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 0
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r4) goto L30
            defpackage.ybh.y(r13)     // Catch: java.lang.Exception -> Lc0
            goto Lc4
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r7
        L36:
            ads_mobile_sdk.cy0 r10 = r0.b
            ads_mobile_sdk.dt r11 = r0.a
            defpackage.ybh.y(r13)
            goto La9
        L3e:
            java.lang.String r10 = r0.c
            ads_mobile_sdk.cy0 r11 = r0.b
            ads_mobile_sdk.dt r12 = r0.a
            defpackage.ybh.y(r13)
            r13 = r10
            r10 = r12
            goto L8c
        L4a:
            defpackage.ybh.y(r13)
            java.lang.String r13 = "u"
            java.lang.Object r13 = r12.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L6c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "URL is missing from a click GMSG: "
            r10.<init>(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r11 = 6
            ads_mobile_sdk.xh3.a(r10, r7, r11)
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L6c:
            java.lang.String r2 = "sc"
            java.lang.Object r12 = r12.get(r2)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r2 = "1"
            boolean r12 = kotlin.text.c.m(r12, r2, r3)
            if (r12 == 0) goto L8c
            r0.a = r10
            r0.b = r11
            r0.c = r13
            r0.f = r5
            ads_mobile_sdk.z2 r12 = r10.b
            java.lang.Object r12 = r12.n(r0)
            if (r12 == r1) goto Lbf
        L8c:
            ads_mobile_sdk.gn0 r12 = r10.d
            android.net.Uri r13 = android.net.Uri.parse(r13)
            ads_mobile_sdk.ym0 r2 = ads_mobile_sdk.ym0.b
            ads_mobile_sdk.a2 r8 = r10.e
            android.os.Bundle r8 = r8.q
            r0.a = r10
            r0.b = r11
            r0.c = r7
            r0.f = r6
            java.lang.Comparable r13 = r12.a(r13, r2, r8, r0)
            if (r13 == r1) goto Lbf
            r9 = r11
            r11 = r10
            r10 = r9
        La9:
            android.net.Uri r13 = (android.net.Uri) r13
            ads_mobile_sdk.k8 r12 = r11.a     // Catch: java.lang.Exception -> Lc0
            android.net.Uri r10 = r12.a(r13, r10)     // Catch: java.lang.Exception -> Lc0
            ads_mobile_sdk.dl r11 = r11.c     // Catch: java.lang.Exception -> Lc0
            r0.a = r7     // Catch: java.lang.Exception -> Lc0
            r0.b = r7     // Catch: java.lang.Exception -> Lc0
            r0.f = r4     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r10 = r11.c(r10, r0)     // Catch: java.lang.Exception -> Lc0
            if (r10 != r1) goto Lc4
        Lbf:
            return r1
        Lc0:
            r10 = move-exception
            ads_mobile_sdk.xh3.a(r7, r10, r5, r3)
        Lc4:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dt.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    @Override // defpackage.ato
    public final int b() {
        return 5;
    }
}
