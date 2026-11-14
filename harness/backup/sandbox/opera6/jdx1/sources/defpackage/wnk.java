package defpackage;

/* loaded from: classes.dex */
public final class wnk implements hyl {
    public final hyl a;
    public final tnk b;
    public vnk g;
    public oj9 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = tym.b;
    public final g1g c = new g1g();

    public wnk(hyl hylVar, tnk tnkVar) {
        this.a = hylVar;
        this.b = tnkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hyl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r5, int r7, int r8, int r9, defpackage.gyl r10) {
        /*
            r4 = this;
            vnk r0 = r4.g
            if (r0 != 0) goto La
            hyl r4 = r4.a
            r4.a(r5, r7, r8, r9, r10)
            return
        La:
            r1 = 0
            if (r10 != 0) goto Lf
            r10 = 1
            goto L10
        Lf:
            r10 = r1
        L10:
            java.lang.String r0 = "DRM on subtitles is not supported"
            defpackage.z4o.v(r0, r10)
            int r10 = r4.e
            int r10 = r10 - r9
            int r10 = r10 - r8
            r2 = r5
            vnk r5 = r4.g     // Catch: java.lang.RuntimeException -> L2e
            byte[] r6 = r4.f     // Catch: java.lang.RuntimeException -> L2e
            unk r9 = defpackage.unk.c     // Catch: java.lang.RuntimeException -> L2e
            r0 = r7
            r7 = r10
            oo4 r10 = new oo4     // Catch: java.lang.RuntimeException -> L2b
            r10.<init>(r4, r2, r0)     // Catch: java.lang.RuntimeException -> L2b
            r5.j(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L2b
            goto L3a
        L2b:
            r0 = move-exception
        L2c:
            r5 = r0
            goto L31
        L2e:
            r0 = move-exception
            r7 = r10
            goto L2c
        L31:
            boolean r6 = r4.i
            if (r6 == 0) goto L47
            java.lang.String r6 = "Parsing subtitles failed, ignoring sample."
            defpackage.w7d.L(r6, r5)
        L3a:
            int r10 = r7 + r8
            r4.d = r10
            int r5 = r4.e
            if (r10 != r5) goto L46
            r4.d = r1
            r4.e = r1
        L46:
            return
        L47:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnk.a(long, int, int, int, gyl):void");
    }

    @Override // defpackage.hyl
    public final void b(g1g g1gVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(g1gVar, i, i2);
            return;
        }
        h(i);
        g1gVar.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.hyl
    public final int d(oc6 oc6Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.d(oc6Var, i, z);
        }
        h(i);
        int i2 = oc6Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        qp2.c();
        return 0;
    }

    @Override // defpackage.hyl
    public final void g(oj9 oj9Var) {
        oj9Var.n.getClass();
        String str = oj9Var.n;
        z4o.w(dzd.i(str) == 3);
        boolean zEquals = oj9Var.equals(this.h);
        tnk tnkVar = this.b;
        if (!zEquals) {
            this.h = oj9Var;
            this.g = tnkVar.b(oj9Var) ? tnkVar.k(oj9Var) : null;
        }
        vnk vnkVar = this.g;
        hyl hylVar = this.a;
        if (vnkVar == null) {
            hylVar.g(oj9Var);
            return;
        }
        nj9 nj9VarA = oj9Var.a();
        nj9VarA.m = dzd.p("application/x-media3-cues");
        nj9VarA.j = str;
        nj9VarA.r = Long.MAX_VALUE;
        nj9VarA.K = tnkVar.l(oj9Var);
        z1m.q(nj9VarA, hylVar);
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 << 1, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
