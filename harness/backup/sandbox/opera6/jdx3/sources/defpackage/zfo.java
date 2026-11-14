package defpackage;

/* loaded from: classes.dex */
public final class zfo {
    public final String a;
    public final pna b;
    public final qe6 c;

    public zfo(String str, pna pnaVar, qe6 qe6Var) {
        this.a = str;
        this.b = pnaVar;
        this.c = qe6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, nt5 r13, java.lang.String r14) {
        /*
            r10 = this;
            boolean r2 = r13 instanceof defpackage.wfo
            if (r2 == 0) goto L14
            r2 = r13
            wfo r2 = (defpackage.wfo) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r2.v = r3
        L12:
            r8 = r2
            goto L1a
        L14:
            wfo r2 = new wfo
            r2.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r8.t
            px5 r9 = px5.a
            int r2 = r8.v
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L30
            if (r2 != r6) goto L2a
            ybh.y(r0)
            goto L6b
        L2a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r0)
            return r7
        L30:
            ybh.y(r0)
            o02 r0 = new o02
            r5 = 6
            r1 = r10
            r2 = r11
            r4 = r14
            r0.<init>(r1, r2, r4, r5)
            java.lang.Class<t0i> r2 = t0i.class
            s15 r3 = uqh.a(r2)
            java.lang.Class<cne> r4 = defpackage.cne.class
            cam r4 = uqh.d(r4)     // Catch: java.lang.Throwable -> L55
            ztb r5 = kotlin.reflect.KTypeProjection.c     // Catch: java.lang.Throwable -> L55
            r5.getClass()     // Catch: java.lang.Throwable -> L55
            kotlin.reflect.KTypeProjection r4 = ztb.a(r4)     // Catch: java.lang.Throwable -> L55
            cam r7 = uqh.e(r2, r4)     // Catch: java.lang.Throwable -> L55
        L55:
            x9m r2 = new x9m
            r2.<init>(r3, r7)
            r8.v = r6
            java.lang.String r7 = ""
            qe6 r3 = r10.c
            pna r4 = r10.b
            r5 = r0
            r6 = r2
            java.lang.Object r0 = r3.U(r4, r5, r6, r7, r8)
            if (r0 != r9) goto L6b
            return r9
        L6b:
            t0i r0 = (t0i) r0
            java.lang.Object r0 = r0.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfo.a(long, nt5, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, java.lang.String r9, nt5 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.xfo
            if (r0 == 0) goto L14
            r0 = r10
            xfo r0 = (defpackage.xfo) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xfo r0 = new xfo
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.t
            px5 r0 = px5.a
            int r1 = r6.v
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            ybh.y(r10)
            goto L6a
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L30:
            ybh.y(r10)
            r10 = r3
            tmi r3 = new tmi
            r1 = 21
            r3.<init>(r7, r8, r9, r1)
            java.lang.Class<t0i> r8 = t0i.class
            s15 r9 = uqh.a(r8)
            java.lang.Class<hne> r1 = defpackage.hne.class
            cam r1 = uqh.d(r1)     // Catch: java.lang.Throwable -> L55
            ztb r4 = kotlin.reflect.KTypeProjection.c     // Catch: java.lang.Throwable -> L55
            r4.getClass()     // Catch: java.lang.Throwable -> L55
            kotlin.reflect.KTypeProjection r1 = ztb.a(r1)     // Catch: java.lang.Throwable -> L55
            cam r8 = uqh.e(r8, r1)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
            r8 = r10
        L56:
            x9m r4 = new x9m
            r4.<init>(r9, r8)
            r6.v = r2
            java.lang.String r5 = ""
            qe6 r1 = r7.c
            pna r2 = r7.b
            java.lang.Object r10 = r1.U(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L6a
            return r0
        L6a:
            t0i r10 = (t0i) r10
            java.lang.Object r7 = r10.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfo.b(java.lang.String, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final long r14, final java.lang.String r16, final long r17, final long r19, nt5 r21) {
        /*
            r13 = this;
            r0 = r21
            boolean r2 = r0 instanceof defpackage.yfo
            if (r2 == 0) goto L16
            r2 = r0
            yfo r2 = (defpackage.yfo) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.v = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            yfo r2 = new yfo
            r2.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.t
            px5 r10 = px5.a
            int r2 = r9.v
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L32
            if (r2 != r11) goto L2c
            ybh.y(r0)
            goto L78
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r0)
            return r12
        L32:
            ybh.y(r0)
            vfo r0 = new vfo
            r1 = r13
            r2 = r14
            r4 = r16
            r5 = r17
            r7 = r19
            r0.<init>()
            java.lang.Class<t0i> r2 = t0i.class
            s15 r3 = uqh.a(r2)
            java.lang.Class<kne> r4 = defpackage.kne.class
            cam r4 = uqh.d(r4)     // Catch: java.lang.Throwable -> L5b
            ztb r5 = kotlin.reflect.KTypeProjection.c     // Catch: java.lang.Throwable -> L5b
            r5.getClass()     // Catch: java.lang.Throwable -> L5b
            kotlin.reflect.KTypeProjection r4 = ztb.a(r4)     // Catch: java.lang.Throwable -> L5b
            cam r12 = uqh.e(r2, r4)     // Catch: java.lang.Throwable -> L5b
        L5b:
            x9m r2 = new x9m
            r2.<init>(r3, r12)
            r9.v = r11
            java.lang.String r3 = ""
            qe6 r4 = r13.c
            pna r1 = r13.b
            r15 = r0
            r14 = r1
            r16 = r2
            r17 = r3
            r13 = r4
            r18 = r9
            java.lang.Object r0 = r13.U(r14, r15, r16, r17, r18)
            if (r0 != r10) goto L78
            return r10
        L78:
            t0i r0 = (t0i) r0
            java.lang.Object r0 = r0.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfo.c(long, java.lang.String, long, long, nt5):java.lang.Object");
    }
}
