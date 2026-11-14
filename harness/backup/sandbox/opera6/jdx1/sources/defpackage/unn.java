package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class unn implements tnn {
    public final en8 a;
    public final hyl b;
    public final pw7 c;
    public final oj9 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public unn(en8 en8Var, hyl hylVar, pw7 pw7Var, String str, int i) throws s1g {
        this.a = en8Var;
        this.b = hylVar;
        this.c = pw7Var;
        int i2 = pw7Var.b;
        int i3 = pw7Var.c;
        int i4 = (pw7Var.e * i2) / 8;
        int i5 = pw7Var.d;
        if (i5 != i4) {
            throw s1g.d("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = i3 * i4;
        int i7 = i6 << 3;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        nj9 nj9Var = new nj9();
        nj9Var.l = dzd.p("audio/wav");
        nj9Var.m = dzd.p(str);
        nj9Var.h = i7;
        nj9Var.i = i7;
        nj9Var.n = iMax;
        nj9Var.E = i2;
        nj9Var.F = i3;
        nj9Var.G = i;
        this.d = new oj9(nj9Var);
    }

    @Override // defpackage.tnn
    public final boolean a(lp6 lp6Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iC = this.b.c(lp6Var, (int) Math.min(i2 - i, j2), true);
            if (iC == -1) {
                j2 = 0;
            } else {
                this.g += iC;
                j2 -= iC;
            }
        }
        pw7 pw7Var = this.c;
        int i3 = pw7Var.d;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = pw7Var.c;
            String str = tym.a;
            long jW = j3 + tym.W(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(jW, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.tnn
    public final void b(int i, long j) {
        wnn wnnVar = new wnn(this.c, 1, i, j);
        this.a.h(wnnVar);
        oj9 oj9Var = this.d;
        hyl hylVar = this.b;
        hylVar.g(oj9Var);
        hylVar.e(wnnVar.e);
    }

    @Override // defpackage.tnn
    public final void c(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
