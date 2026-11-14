package defpackage;

/* loaded from: classes.dex */
public final class e99 {
    public int a;
    public eo5 d;
    public eo5 e;
    public eo5 f;
    public eo5 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ g99 r;
    public uo5 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public e99(g99 g99Var, int i, eo5 eo5Var, eo5 eo5Var2, eo5 eo5Var3, eo5 eo5Var4, int i2) {
        this.r = g99Var;
        this.a = i;
        this.d = eo5Var;
        this.e = eo5Var2;
        this.f = eo5Var3;
        this.g = eo5Var4;
        this.h = g99Var.v0;
        this.i = g99Var.r0;
        this.j = g99Var.w0;
        this.k = g99Var.s0;
        this.q = i2;
    }

    public final void a(uo5 uo5Var) {
        int i = this.a;
        int i2 = this.q;
        g99 g99Var = this.r;
        if (i == 0) {
            int iP = g99Var.P(uo5Var, i2);
            if (uo5Var.o0[0] == 3) {
                this.p++;
                iP = 0;
            }
            this.l = iP + (uo5Var.f0 != 8 ? g99Var.O0 : 0) + this.l;
            int iO = g99Var.O(uo5Var, this.q);
            if (this.b == null || this.c < iO) {
                this.b = uo5Var;
                this.c = iO;
                this.m = iO;
            }
        } else {
            int iP2 = g99Var.P(uo5Var, i2);
            int iO2 = g99Var.O(uo5Var, this.q);
            if (uo5Var.o0[1] == 3) {
                this.p++;
                iO2 = 0;
            }
            this.m = iO2 + (uo5Var.f0 != 8 ? g99Var.P0 : 0) + this.m;
            if (this.b == null || this.c < iP2) {
                this.b = uo5Var;
                this.c = iP2;
                this.l = iP2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x010a A[PHI: r5 r9
      0x010a: PHI (r5v22 int) = (r5v21 int), (r5v24 int) binds: [B:89:0x0108, B:82:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r9v20 float) = (r9v19 float), (r9v24 float) binds: [B:89:0x0108, B:82:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e99.b(int, boolean, boolean):void");
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.P0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.O0 : i2;
    }

    public final void e(int i) {
        g99 g99Var;
        int i2;
        int i3 = this.p;
        if (i3 != 0) {
            int i4 = this.o;
            int i5 = i / i3;
            int i6 = 0;
            while (true) {
                g99Var = this.r;
                if (i6 >= i4 || (i2 = this.n + i6) >= g99Var.a1) {
                    break;
                }
                uo5 uo5Var = g99Var.Z0[i2];
                if (this.a == 0) {
                    if (uo5Var != null) {
                        int[] iArr = uo5Var.o0;
                        if (iArr[0] == 3 && uo5Var.q == 0) {
                            g99Var.Q(1, i5, iArr[1], uo5Var.k(), uo5Var);
                        }
                    }
                } else if (uo5Var != null) {
                    int[] iArr2 = uo5Var.o0;
                    if (iArr2[1] == 3 && uo5Var.r == 0) {
                        int i7 = i5;
                        g99Var.Q(iArr2[0], uo5Var.n(), 1, i7, uo5Var);
                        i5 = i7;
                    }
                }
                i6++;
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i8 = this.o;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = this.n + i9;
                if (i10 >= g99Var.a1) {
                    return;
                }
                uo5 uo5Var2 = g99Var.Z0[i10];
                if (this.a == 0) {
                    int iN = uo5Var2.n();
                    int i11 = g99Var.O0;
                    if (uo5Var2.f0 == 8) {
                        i11 = 0;
                    }
                    this.l = iN + i11 + this.l;
                    int iO = g99Var.O(uo5Var2, this.q);
                    if (this.b == null || this.c < iO) {
                        this.b = uo5Var2;
                        this.c = iO;
                        this.m = iO;
                    }
                } else {
                    int iP = g99Var.P(uo5Var2, this.q);
                    int iO2 = g99Var.O(uo5Var2, this.q);
                    int i12 = g99Var.P0;
                    if (uo5Var2.f0 == 8) {
                        i12 = 0;
                    }
                    this.m = iO2 + i12 + this.m;
                    if (this.b == null || this.c < iP) {
                        this.b = uo5Var2;
                        this.c = iP;
                        this.l = iP;
                    }
                }
            }
        }
    }

    public final void f(int i, eo5 eo5Var, eo5 eo5Var2, eo5 eo5Var3, eo5 eo5Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = eo5Var;
        this.e = eo5Var2;
        this.f = eo5Var3;
        this.g = eo5Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
