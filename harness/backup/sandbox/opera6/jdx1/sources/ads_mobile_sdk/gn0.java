package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class gn0 {
    public final bn0 a;
    public final nx5 b;
    public final qr0 c;

    public gn0(bn0 bn0Var, nx5 nx5Var, qr0 qr0Var) {
        this.a = bn0Var;
        this.b = nx5Var;
        this.c = qr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable a(android.net.Uri r12, ads_mobile_sdk.ym0 r13, android.os.Bundle r14, nt5 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.fn0
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.fn0 r0 = (ads_mobile_sdk.fn0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.fn0 r0 = new ads_mobile_sdk.fn0
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L33
            android.net.Uri$Builder r11 = r0.d
            android.os.Bundle r14 = r0.c
            ads_mobile_sdk.ym0 r13 = r0.b
            ads_mobile_sdk.gn0 r12 = r0.a
            defpackage.ybh.y(r15)
            r6 = r12
        L30:
            r7 = r13
            r8 = r14
            goto L7f
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r4
        L39:
            defpackage.ybh.y(r15)
            ads_mobile_sdk.qr0 r15 = r11.c
            r15.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            ads_mobile_sdk.fo r5 = ads_mobile_sdk.fo.a
            java.lang.String r6 = "gads:firebase_analytics_integration:enabled"
            java.lang.Object r2 = r15.a(r6, r2, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L54
            return r12
        L54:
            android.net.Uri$Builder r12 = r12.buildUpon()
            android.net.Uri r2 = r12.build()
            java.lang.String r2 = r2.toString()
            java.lang.String r15 = r15.O()
            r5 = 0
            boolean r15 = kotlin.text.StringsKt.E(r2, r15, r5)
            if (r15 == 0) goto Lc2
            r0.a = r11
            r0.b = r13
            r0.c = r14
            r0.d = r12
            r0.g = r3
            java.lang.Object r15 = r11.a(r12, r0)
            if (r15 != r1) goto L7c
            return r1
        L7c:
            r6 = r11
            r11 = r12
            goto L30
        L7f:
            ads_mobile_sdk.bn0 r12 = r6.a
            java.lang.String r13 = "generateEventId"
            java.lang.Object r12 = r12.a(r13)
            if (r12 == 0) goto L8f
            java.lang.String r12 = r12.toString()
            r9 = r12
            goto L90
        L8f:
            r9 = r4
        L90:
            if (r9 == 0) goto Lbd
            nx5 r12 = r6.b
            bhj r5 = new bhj
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            kotlin.coroutines.h r13 = kotlin.coroutines.h.a
            fsg r14 = new fsg
            r15 = 3
            r14.<init>(r5, r4, r15)
            r15 = 2
            defpackage.na2.B(r12, r13, r4, r14, r15)
            android.net.Uri r11 = r11.build()
            java.lang.String r11 = r11.toString()
            ads_mobile_sdk.qr0 r12 = r6.c
            java.lang.String r12 = r12.O()
            java.lang.String r11 = kotlin.text.c.o(r11, r12, r9)
            android.net.Uri r11 = android.net.Uri.parse(r11)
            return r11
        Lbd:
            android.net.Uri r11 = r11.build()
            return r11
        Lc2:
            android.net.Uri r11 = r12.build()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gn0.a(android.net.Uri, ads_mobile_sdk.ym0, android.os.Bundle, nt5):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri.Builder r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.dn0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.dn0 r0 = (ads_mobile_sdk.dn0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.dn0 r0 = new ads_mobile_sdk.dn0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L30
            android.net.Uri r5 = r0.d
            android.net.Uri$Builder r6 = r0.c
            android.net.Uri$Builder r1 = r0.b
            ads_mobile_sdk.gn0 r0 = r0.a
            defpackage.ybh.y(r7)
            goto L58
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L36:
            defpackage.ybh.y(r7)
            android.net.Uri r7 = r6.build()
            r0.a = r5
            r0.b = r6
            r0.c = r6
            r0.d = r7
            r0.g = r4
            ads_mobile_sdk.bn0 r2 = r5.a
            r2.getClass()
            java.lang.Object r0 = ads_mobile_sdk.bn0.a(r2, r0)
            if (r0 != r1) goto L53
            return r1
        L53:
            r1 = r0
            r0 = r5
            r5 = r7
            r7 = r1
            r1 = r6
        L58:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L67
            java.lang.String r2 = "gmp_app_id"
            java.lang.String r4 = r5.getQueryParameter(r2)
            if (r4 != 0) goto L67
            r6.appendQueryParameter(r2, r7)
        L67:
            ads_mobile_sdk.bn0 r7 = r0.a
            java.lang.String r0 = "getAppInstanceId"
            java.lang.Object r7 = r7.a(r0)
            if (r7 == 0) goto L75
            java.lang.String r3 = r7.toString()
        L75:
            if (r3 == 0) goto L82
            java.lang.String r7 = "fbs_aiid"
            java.lang.String r5 = r5.getQueryParameter(r7)
            if (r5 != 0) goto L82
            r6.appendQueryParameter(r7, r3)
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gn0.a(android.net.Uri$Builder, nt5):java.lang.Object");
    }
}
