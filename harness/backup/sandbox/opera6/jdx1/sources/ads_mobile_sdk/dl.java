package ads_mobile_sdk;

import defpackage.skp;

/* loaded from: classes.dex */
public final class dl {
    public final uv2 a;
    public final gp3 b;
    public final vz c;
    public final skp d;
    public final qr0 e;
    public final ah3 f;

    public dl(uv2 uv2Var, gp3 gp3Var, vz vzVar, skp skpVar, qr0 qr0Var, ah3 ah3Var) {
        this.a = uv2Var;
        this.b = gp3Var;
        this.c = vzVar;
        this.d = skpVar;
        this.e = qr0Var;
        this.f = ah3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[Catch: all -> 0x00b9, TryCatch #2 {all -> 0x00b9, blocks: (B:30:0x008b, B:32:0x0092, B:34:0x0099, B:36:0x009d, B:38:0x00a1, B:39:0x00a2, B:40:0x00a7, B:41:0x00a8, B:42:0x00af, B:43:0x00b0, B:44:0x00b7, B:45:0x00b8), top: B:55:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:30:0x008b, B:32:0x0092, B:34:0x0099, B:36:0x009d, B:38:0x00a1, B:39:0x00a2, B:40:0x00a7, B:41:0x00a8, B:42:0x00af, B:43:0x00b0, B:44:0x00b7, B:45:0x00b8), top: B:55:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r11, nt5 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ads_mobile_sdk.zk
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.zk r0 = (ads_mobile_sdk.zk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.zk r0 = new ads_mobile_sdk.zk
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            ads_mobile_sdk.rg3 r10 = r0.b
            ads_mobile_sdk.rg3 r11 = r0.a
            defpackage.ybh.y(r12)     // Catch: java.lang.Throwable -> L85
            goto L74
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r4
        L32:
            defpackage.ybh.y(r12)
            java.util.WeakHashMap r12 = ads_mobile_sdk.hh3.a
            l08 r12 = l08.a
            ads_mobile_sdk.fw0 r2 = ads_mobile_sdk.fw0.CUI_NAME_REGISTER_ATTRIBUTION_SOURCE
            ads_mobile_sdk.rg3 r12 = ads_mobile_sdk.hh3.a(r2, r12, r3)
            dvj r2 = ads_mobile_sdk.ax0.f     // Catch: java.lang.Throwable -> L87
            ads_mobile_sdk.qr0 r5 = r10.e     // Catch: java.lang.Throwable -> L87
            r5.getClass()     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = "gads:source_registration_timeout_in_millis"
            on7 r7 = pn7.b     // Catch: java.lang.Throwable -> L87
            un7 r7 = un7.f     // Catch: java.lang.Throwable -> L87
            long r7 = defpackage.cs5.x0(r3, r7)     // Catch: java.lang.Throwable -> L87
            pn7 r9 = new pn7     // Catch: java.lang.Throwable -> L87
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L87
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a$18     // Catch: java.lang.Throwable -> L87
            java.lang.Object r5 = r5.a(r6, r9, r7)     // Catch: java.lang.Throwable -> L87
            pn7 r5 = (pn7) r5     // Catch: java.lang.Throwable -> L87
            long r5 = r5.a     // Catch: java.lang.Throwable -> L87
            k50 r7 = new k50     // Catch: java.lang.Throwable -> L87
            r7.<init>(r10, r11, r4)     // Catch: java.lang.Throwable -> L87
            r0.a = r12     // Catch: java.lang.Throwable -> L87
            r0.b = r12     // Catch: java.lang.Throwable -> L87
            r0.e = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r10 = r2.m(r5, r7, r0)     // Catch: java.lang.Throwable -> L87
            if (r10 != r1) goto L71
            return r1
        L71:
            r11 = r12
            r12 = r10
            r10 = r11
        L74:
            rap r12 = (defpackage.rap) r12     // Catch: java.lang.Throwable -> L85
            boolean r0 = r12 instanceof ads_mobile_sdk.av0     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L81
            r0 = r12
            ads_mobile_sdk.av0 r0 = (ads_mobile_sdk.av0) r0     // Catch: java.lang.Throwable -> L85
            r1 = 0
            ads_mobile_sdk.xh3.a(r0, r1)     // Catch: java.lang.Throwable -> L85
        L81:
            defpackage.vtp.v(r10, r4)
            return r12
        L85:
            r12 = move-exception
            goto L8b
        L87:
            r10 = move-exception
            r11 = r12
            r12 = r10
            r10 = r11
        L8b:
            r11.b(r12)     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = r12 instanceof iyo     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto Lb8
            r11.a(r12)     // Catch: java.lang.Throwable -> Lb9
            boolean r11 = r12 instanceof kql     // Catch: java.lang.Throwable -> Lb9
            if (r11 != 0) goto Lb0
            boolean r11 = r12 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Lb9
            if (r11 != 0) goto La8
            boolean r11 = r12 instanceof ads_mobile_sdk.mv0     // Catch: java.lang.Throwable -> Lb9
            if (r11 == 0) goto La2
            throw r12     // Catch: java.lang.Throwable -> Lb9
        La2:
            ads_mobile_sdk.tu0 r11 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> Lb9
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb9
            throw r11     // Catch: java.lang.Throwable -> Lb9
        La8:
            ads_mobile_sdk.ou0 r11 = new ads_mobile_sdk.ou0     // Catch: java.lang.Throwable -> Lb9
            java.util.concurrent.CancellationException r12 = (java.util.concurrent.CancellationException) r12     // Catch: java.lang.Throwable -> Lb9
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb9
            throw r11     // Catch: java.lang.Throwable -> Lb9
        Lb0:
            ads_mobile_sdk.uw0 r11 = new ads_mobile_sdk.uw0     // Catch: java.lang.Throwable -> Lb9
            kql r12 = (kql) r12     // Catch: java.lang.Throwable -> Lb9
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lb9
            throw r11     // Catch: java.lang.Throwable -> Lb9
        Lb8:
            throw r12     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r12 = move-exception
            defpackage.vtp.v(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dl.a(android.net.Uri, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable b(android.net.Uri r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.bl
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.bl r0 = (ads_mobile_sdk.bl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.bl r0 = new ads_mobile_sdk.bl
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            android.net.Uri r7 = r0.a
            defpackage.ybh.y(r8)
            goto L55
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L30:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.qr0 r8 = r6.e
            r8.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r4 = ads_mobile_sdk.fo.a
            java.lang.String r5 = "gads:attribution_reporting:enabled"
            java.lang.Object r8 = r8.a(r5, r2, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L62
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            rap r8 = (defpackage.rap) r8
            boolean r6 = r8 instanceof ads_mobile_sdk.hv0
            if (r6 == 0) goto L62
            ads_mobile_sdk.hv0 r8 = (ads_mobile_sdk.hv0) r8
            java.lang.Object r6 = r8.b
            android.net.Uri r6 = (android.net.Uri) r6
            return r6
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dl.b(android.net.Uri, nt5):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.cl
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.cl r0 = (ads_mobile_sdk.cl) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.cl r0 = new ads_mobile_sdk.cl
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            android.net.Uri r7 = r0.b
            ads_mobile_sdk.dl r6 = r0.a
            defpackage.ybh.y(r8)
            goto L59
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L32:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.qr0 r8 = r6.e
            r8.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r4 = ads_mobile_sdk.fo.a
            java.lang.String r5 = "gads:attribution_reporting:enabled"
            java.lang.Object r8 = r8.a(r5, r2, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L93
            r0.a = r6
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            rap r8 = (defpackage.rap) r8
            boolean r0 = r8 instanceof ads_mobile_sdk.hv0
            if (r0 == 0) goto L7c
            ads_mobile_sdk.uv2 r6 = r6.a
            ads_mobile_sdk.hv0 r8 = (ads_mobile_sdk.hv0) r8
            java.lang.Object r7 = r8.b
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r7 = r7.toString()
            java.net.URL r8 = new java.net.URL
            r8.<init>(r7)
            java.lang.String r7 = r8.toString()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            ads_mobile_sdk.uv2.a(r6, r7)
            goto La9
        L7c:
            ads_mobile_sdk.uv2 r6 = r6.a
            java.lang.String r7 = r7.toString()
            java.net.URL r8 = new java.net.URL
            r8.<init>(r7)
            java.lang.String r7 = r8.toString()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            ads_mobile_sdk.uv2.a(r6, r7)
            goto La9
        L93:
            java.lang.String r7 = r7.toString()
            java.net.URL r8 = new java.net.URL
            r8.<init>(r7)
            java.lang.String r7 = r8.toString()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            ads_mobile_sdk.uv2 r6 = r6.a
            ads_mobile_sdk.uv2.a(r6, r7)
        La9:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dl.c(android.net.Uri, nt5):java.lang.Object");
    }
}
