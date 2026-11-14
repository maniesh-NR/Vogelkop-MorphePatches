package defpackage;

import ads_mobile_sdk.lw0;

/* loaded from: classes.dex */
public interface wdp {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: all -> 0x00a8, TryCatch #2 {all -> 0x00a8, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0088, B:36:0x008c, B:38:0x0090, B:39:0x0091, B:40:0x0096, B:41:0x0097, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7), top: B:55:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #2 {all -> 0x00a8, blocks: (B:30:0x007a, B:32:0x0081, B:34:0x0088, B:36:0x008c, B:38:0x0090, B:39:0x0091, B:40:0x0096, B:41:0x0097, B:42:0x009e, B:43:0x009f, B:44:0x00a6, B:45:0x00a7), top: B:55:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object p(defpackage.wdp r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.o63
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.o63 r0 = (ads_mobile_sdk.o63) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.o63 r0 = new ads_mobile_sdk.o63
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            ads_mobile_sdk.rg3 r8 = r0.b
            ads_mobile_sdk.rg3 r0 = r0.a
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L74
            goto L63
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r4
        L32:
            defpackage.ybh.y(r9)
            java.util.WeakHashMap r9 = ads_mobile_sdk.hh3.a
            l08 r9 = l08.a
            ads_mobile_sdk.fw0 r2 = ads_mobile_sdk.fw0.CUI_NAME_SIGNAL
            ads_mobile_sdk.rg3 r9 = ads_mobile_sdk.hh3.a(r2, r9, r3)
            ads_mobile_sdk.rg3 r2 = ads_mobile_sdk.hh3.a()     // Catch: java.lang.Throwable -> L76
            ads_mobile_sdk.ub2 r2 = r2.e()     // Catch: java.lang.Throwable -> L76
            ads_mobile_sdk.e63 r5 = new ads_mobile_sdk.e63     // Catch: java.lang.Throwable -> L76
            ads_mobile_sdk.lw0 r6 = r8.mo15a()     // Catch: java.lang.Throwable -> L76
            r7 = 6
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L76
            r2.t = r5     // Catch: java.lang.Throwable -> L76
            r0.a = r9     // Catch: java.lang.Throwable -> L76
            r0.b = r9     // Catch: java.lang.Throwable -> L76
            r0.e = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r8.d(r0)     // Catch: java.lang.Throwable -> L76
            if (r8 != r1) goto L60
            return r1
        L60:
            r0 = r9
            r9 = r8
            r8 = r0
        L63:
            rap r9 = (defpackage.rap) r9     // Catch: java.lang.Throwable -> L74
            boolean r1 = r9 instanceof ads_mobile_sdk.av0     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L70
            r1 = r9
            ads_mobile_sdk.av0 r1 = (ads_mobile_sdk.av0) r1     // Catch: java.lang.Throwable -> L74
            r2 = 0
            ads_mobile_sdk.xh3.a(r1, r2)     // Catch: java.lang.Throwable -> L74
        L70:
            defpackage.vtp.v(r8, r4)
            return r9
        L74:
            r9 = move-exception
            goto L7a
        L76:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
        L7a:
            r0.b(r9)     // Catch: java.lang.Throwable -> La8
            boolean r1 = r9 instanceof iyo     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto La7
            r0.a(r9)     // Catch: java.lang.Throwable -> La8
            boolean r0 = r9 instanceof kql     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L9f
            boolean r0 = r9 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L97
            boolean r0 = r9 instanceof ads_mobile_sdk.mv0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L91
            throw r9     // Catch: java.lang.Throwable -> La8
        L91:
            ads_mobile_sdk.tu0 r0 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> La8
            r0.<init>(r9)     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        L97:
            ads_mobile_sdk.ou0 r0 = new ads_mobile_sdk.ou0     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.CancellationException r9 = (java.util.concurrent.CancellationException) r9     // Catch: java.lang.Throwable -> La8
            r0.<init>(r9)     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        L9f:
            ads_mobile_sdk.uw0 r0 = new ads_mobile_sdk.uw0     // Catch: java.lang.Throwable -> La8
            kql r9 = (kql) r9     // Catch: java.lang.Throwable -> La8
            r0.<init>(r9)     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        La7:
            throw r9     // Catch: java.lang.Throwable -> La8
        La8:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            defpackage.vtp.v(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdp.p(wdp, nt5):java.lang.Object");
    }

    /* renamed from: a */
    lw0 mo15a();

    default Object c(mt5 mt5Var) {
        return p(this, (nt5) mt5Var);
    }

    Object d(mt5 mt5Var);
}
