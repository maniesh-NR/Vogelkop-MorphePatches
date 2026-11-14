package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ix6 extends hx6 {
    public final boolean e;
    public final bx6 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final byte t;
    public final boolean u;
    public final boolean v;
    public final byte w;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ix6(int r7, defpackage.eyl r8, int r9, defpackage.bx6 r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix6.<init>(int, eyl, int, bx6, int, java.lang.String, int, boolean):void");
    }

    public static int c(ix6 ix6Var, ix6 ix6Var2) {
        xc5 xc5VarC = xc5.a.c(ix6Var.h, ix6Var2.h);
        Integer numValueOf = Integer.valueOf(ix6Var.m);
        Integer numValueOf2 = Integer.valueOf(ix6Var2.m);
        ije ijeVar = ije.c;
        xc5 xc5VarB = xc5VarC.b(numValueOf, numValueOf2, ijeVar).a(ix6Var.n, ix6Var2.n).a(ix6Var.o, ix6Var2.o).b(Integer.valueOf(ix6Var.p), Integer.valueOf(ix6Var2.p), ijeVar).c(ix6Var.q, ix6Var2.q).a(ix6Var.r, ix6Var2.r).c(ix6Var.i, ix6Var2.i).c(ix6Var.e, ix6Var2.e).c(ix6Var.g, ix6Var2.g).b(Integer.valueOf(ix6Var.l), Integer.valueOf(ix6Var2.l), ijeVar);
        boolean z = ix6Var.u;
        xc5 xc5VarC2 = xc5VarB.c(z, ix6Var2.u);
        boolean z2 = ix6Var.v;
        xc5 xc5VarC3 = xc5VarC2.c(z2, ix6Var2.v);
        if (z && z2) {
            xc5VarC3 = xc5VarC3.a(ix6Var.w, ix6Var2.w);
        }
        return xc5VarC3.e();
    }

    @Override // defpackage.hx6
    public final int a() {
        return this.t;
    }

    @Override // defpackage.hx6
    public final boolean b(hx6 hx6Var) {
        ix6 ix6Var = (ix6) hx6Var;
        if (!this.s && !Objects.equals(this.d.n, ix6Var.d.n)) {
            return false;
        }
        this.f.getClass();
        return this.u == ix6Var.u && this.v == ix6Var.v;
    }
}
