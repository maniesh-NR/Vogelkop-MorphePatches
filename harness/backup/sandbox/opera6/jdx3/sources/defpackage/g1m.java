package defpackage;

/* loaded from: classes.dex */
public final class g1m {
    public final zth a;
    public final cb7 b;
    public final ejj c;
    public final d0m d;

    public g1m(zth zthVar, cb7 cb7Var, ejj ejjVar, d0m d0mVar) {
        this.a = zthVar;
        this.b = cb7Var;
        this.c = ejjVar;
        this.d = d0mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.yzl r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.c1m
            if (r0 == 0) goto L13
            r0 = r7
            c1m r0 = (defpackage.c1m) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            c1m r0 = new c1m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r7)
            t0i r7 = (t0i) r7
            java.lang.Object r5 = r7.a
            goto L44
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r7)
            n2h r7 = new n2h
            r2 = 5
            r7.<init>(r5, r6, r3, r2)
            r0.v = r4
            java.lang.Object r5 = upj.A(r7, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.Throwable r6 = t0i.d(r5)
            if (r6 == 0) goto L8e
            r7 = r6
        L4b:
            if (r7 == 0) goto L56
            boolean r0 = r7 instanceof java.net.UnknownHostException
            if (r0 != 0) goto L8e
            java.lang.Throwable r7 = r7.getCause()
            goto L4b
        L56:
            r7 = r6
        L57:
            if (r7 == 0) goto L62
            boolean r0 = r7 instanceof java.net.SocketException
            if (r0 != 0) goto L8e
            java.lang.Throwable r7 = r7.getCause()
            goto L57
        L62:
            r7 = r6
        L63:
            if (r7 == 0) goto L76
            java.lang.String r0 = r7.getMessage()
            java.lang.String r1 = "Network error"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r0 != 0) goto L8e
            java.lang.Throwable r7 = r7.getCause()
            goto L63
        L76:
            gzc r7 = hzc.c
            r7.getClass()
            eaj r0 = defpackage.eaj.e
            etb r1 = r7.a
            eaj r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L8e
            java.lang.String r1 = "Failed to fetch nonce"
            java.lang.String r2 = ""
            r7.b(r0, r2, r1, r6)
        L8e:
            java.math.BigInteger r6 = defpackage.pe3.a
            boolean r7 = r5 instanceof q0i
            if (r7 == 0) goto L95
            return r6
        L95:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1m.a(yzl, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.yzl r8, boolean r9, nt5 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.d1m
            if (r0 == 0) goto L13
            r0 = r10
            d1m r0 = (defpackage.d1m) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            d1m r0 = new d1m
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3c
            if (r2 == r6) goto L38
            if (r2 == r5) goto L30
            if (r2 == r4) goto L38
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L30:
            boolean r9 = r0.u
            yzl r8 = r0.t
            ybh.y(r10)
            goto L65
        L38:
            ybh.y(r10)
            return r10
        L3c:
            ybh.y(r10)
            if (r9 == 0) goto L4e
            r0.t = r3
            r0.u = r9
            r0.x = r6
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 == r1) goto L75
            return r7
        L4e:
            zzl r10 = new zzl
            wv r2 = r8.b
            nle r6 = r8.a
            r10.<init>(r2, r6)
            r0.t = r8
            r0.u = r9
            r0.x = r5
            d0m r2 = r7.d
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 == r1) goto L75
        L65:
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            if (r10 != 0) goto L77
            r0.t = r3
            r0.u = r9
            r0.x = r4
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            return r7
        L77:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1m.b(yzl, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(1:(3:15|64|65)(2:16|17))(2:18|19))(3:20|54|(2:56|(1:58)(1:63))(1:59)))(7:21|69|22|32|33|40|(5:42|(3:44|(2:52|(2:54|(0)(0)))|63)(1:47)|48|(3:50|(0)|63)|(1:61)(1:66))(1:71)))(1:24))(3:25|(1:27)|63)|28|67|29|(5:31|32|33|40|(0)(0))|63) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        r10 = r6;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0189, code lost:
    
        if (r3 == r5) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133 A[PHI: r10
      0x0133: PHI (r10v7 boolean) = (r10v14 boolean), (r10v13 boolean) binds: [B:51:0x0131, B:45:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(avb r28, defpackage.xzl r29, int r30, nt5 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g1m.c(avb, xzl, int, nt5):java.lang.Object");
    }
}
