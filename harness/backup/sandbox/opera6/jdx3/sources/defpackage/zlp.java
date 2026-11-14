package defpackage;

/* loaded from: classes.dex */
public abstract class zlp {
    public static volatile boolean a;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(android.content.Context r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.qlp
            if (r0 == 0) goto L13
            r0 = r6
            qlp r0 = (defpackage.qlp) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qlp r0 = new qlp
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            com.android.installreferrer.api.InstallReferrerClient r5 = r0.t
            ybh.y(r6)     // Catch: java.lang.Throwable -> L88
            goto L7d
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L30:
            ybh.y(r6)
            com.android.installreferrer.api.InstallReferrerClient$Builder r5 = com.android.installreferrer.api.InstallReferrerClient.newBuilder(r5)
            com.android.installreferrer.api.InstallReferrerClient r5 = r5.build()
            r0.t = r5     // Catch: java.lang.Throwable -> L88
            r0.v = r4     // Catch: java.lang.Throwable -> L88
            nh4 r6 = new nh4     // Catch: java.lang.Throwable -> L88
            mt5 r0 = hib.b(r0)     // Catch: java.lang.Throwable -> L88
            r6.<init>(r4, r0)     // Catch: java.lang.Throwable -> L88
            r6.s()     // Catch: java.lang.Throwable -> L88
            p0i r0 = t0i.b     // Catch: java.lang.Throwable -> L5a
            d7h r0 = new d7h     // Catch: java.lang.Throwable -> L5a
            r2 = 16
            r0.<init>(r6, r5, r2)     // Catch: java.lang.Throwable -> L5a
            r5.startConnection(r0)     // Catch: java.lang.Throwable -> L5a
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L5a
            goto L63
        L5a:
            r0 = move-exception
            p0i r2 = t0i.b     // Catch: java.lang.Throwable -> L88
            q0i r2 = new q0i     // Catch: java.lang.Throwable -> L88
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L88
            r0 = r2
        L63:
            java.lang.Throwable r0 = t0i.d(r0)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L74
            java.lang.Object r0 = r6.r()     // Catch: java.lang.Throwable -> L88
            boolean r0 = r0 instanceof c0f     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L74
            r6.resumeWith(r3)     // Catch: java.lang.Throwable -> L88
        L74:
            java.lang.Object r6 = r6.q()     // Catch: java.lang.Throwable -> L88
            px5 r0 = px5.a     // Catch: java.lang.Throwable -> L88
            if (r6 != r1) goto L7d
            return r1
        L7d:
            com.android.installreferrer.api.ReferrerDetails r6 = (com.android.installreferrer.api.ReferrerDetails) r6     // Catch: java.lang.Throwable -> L88
            p0i r0 = t0i.b     // Catch: java.lang.Throwable -> L85
            r5.endConnection()     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            p0i r5 = t0i.b
        L87:
            return r6
        L88:
            r6 = move-exception
            p0i r0 = t0i.b     // Catch: java.lang.Throwable -> L8f
            r5.endConnection()     // Catch: java.lang.Throwable -> L8f
            goto L91
        L8f:
            p0i r5 = t0i.b
        L91:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlp.a(android.content.Context, nt5):java.lang.Object");
    }
}
