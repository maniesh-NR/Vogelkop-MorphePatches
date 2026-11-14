package defpackage;

/* loaded from: classes.dex */
public final class q7o {
    public final j4c a;
    public final t1 b;
    public final jg8 c;
    public final crb d = phj.o(rpb.d, new q0n((byte) 24));

    public q7o(j4c j4cVar, t1 t1Var, jg8 jg8Var) {
        this.a = j4cVar;
        this.b = t1Var;
        this.c = jg8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.o7o
            if (r0 == 0) goto L13
            r0 = r7
            o7o r0 = (defpackage.o7o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            o7o r0 = new o7o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            ybh.y(r7)
            goto L43
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r4
        L2e:
            ybh.y(r7)
            udj r7 = new udj
            r2 = 11
            r7.<init>(r5, r6, r4, r2)
            r0.v = r3
            jg8 r5 = r5.c
            java.lang.Object r7 = na2.Z(r5, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            hra r7 = (defpackage.hra) r7
            if (r7 == 0) goto L54
            fvh r5 = new fvh
            r5.<init>()
            r5.a = r7
            kvh r6 = new kvh
            r6.<init>(r5)
            return r6
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7o.a(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, q7o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.p7o
            if (r0 == 0) goto L13
            r0 = r10
            p7o r0 = (defpackage.p7o) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            p7o r0 = new p7o
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            pzh r8 = r0.t
            ybh.y(r10)     // Catch: java.io.IOException -> L93 java.lang.IllegalArgumentException -> L97 java.lang.Throwable -> L9d
            goto L8f
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r6
        L36:
            ybh.y(r10)
            t0i r10 = (t0i) r10
            java.lang.Object r9 = r10.a
            goto L68
        L3e:
            ybh.y(r10)
            goto L4d
        L42:
            ybh.y(r10)
            r0.w = r5
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 == r1) goto L8d
        L4d:
            kvh r10 = (kvh) r10
            if (r10 != 0) goto L54
            l08 r8 = l08.a
            return r8
        L54:
            j4c r9 = r8.a
            java.lang.Object r9 = r9.get()
            t9f r9 = (t9f) r9
            okhttp3.internal.connection.RealCall r9 = r9.c(r10)
            r0.w = r4
            java.lang.Object r9 = vtp.p(r9, r0)
            if (r9 == r1) goto L8d
        L68:
            java.lang.Throwable r10 = t0i.d(r9)
            if (r10 != 0) goto La9
            pzh r9 = (pzh) r9
            boolean r10 = r9.q     // Catch: java.lang.Throwable -> L9f
            if (r10 != 0) goto L7a
            l08 r8 = l08.a     // Catch: java.lang.Throwable -> L9f
            r9.close()
            return r8
        L7a:
            jg8 r10 = r8.c     // Catch: java.io.IOException -> L92 java.lang.IllegalArgumentException -> L96 java.lang.Throwable -> L9f
            udj r2 = new udj     // Catch: java.io.IOException -> L92 java.lang.IllegalArgumentException -> L96 java.lang.Throwable -> L9f
            r4 = 12
            r2.<init>(r8, r9, r6, r4)     // Catch: java.io.IOException -> L92 java.lang.IllegalArgumentException -> L96 java.lang.Throwable -> L9f
            r0.t = r9     // Catch: java.io.IOException -> L92 java.lang.IllegalArgumentException -> L96 java.lang.Throwable -> L9f
            r0.w = r3     // Catch: java.io.IOException -> L92 java.lang.IllegalArgumentException -> L96 java.lang.Throwable -> L9f
            java.lang.Object r10 = na2.Z(r10, r2, r0)     // Catch: java.io.IOException -> L92 java.lang.IllegalArgumentException -> L96 java.lang.Throwable -> L9f
            if (r10 != r1) goto L8e
        L8d:
            return r1
        L8e:
            r8 = r9
        L8f:
            java.util.List r10 = (java.util.List) r10     // Catch: java.io.IOException -> L93 java.lang.IllegalArgumentException -> L97 java.lang.Throwable -> L9d
            goto L99
        L92:
            r8 = r9
        L93:
            l08 r10 = l08.a     // Catch: java.lang.Throwable -> L9d
            goto L99
        L96:
            r8 = r9
        L97:
            l08 r10 = l08.a     // Catch: java.lang.Throwable -> L9d
        L99:
            vtp.v(r8, r6)
            return r10
        L9d:
            r9 = move-exception
            goto La3
        L9f:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        La3:
            throw r9     // Catch: java.lang.Throwable -> La4
        La4:
            r10 = move-exception
            vtp.v(r8, r9)
            throw r10
        La9:
            l08 r8 = l08.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7o.b(java.lang.String, nt5):java.lang.Object");
    }
}
