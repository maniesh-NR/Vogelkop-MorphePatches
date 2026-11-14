package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xw6 extends hx6 implements Comparable {
    public final byte e;
    public final boolean f;
    public final String g;
    public final bx6 h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xw6(int r8, defpackage.eyl r9, int r10, defpackage.bx6 r11, int r12, boolean r13, defpackage.ww6 r14, int r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw6.<init>(int, eyl, int, bx6, int, boolean, ww6, int):void");
    }

    @Override // defpackage.hx6
    public final int a() {
        return this.e;
    }

    @Override // defpackage.hx6
    public final boolean b(hx6 hx6Var) {
        int i;
        String str;
        xw6 xw6Var = (xw6) hx6Var;
        oj9 oj9Var = xw6Var.d;
        this.h.getClass();
        oj9 oj9Var2 = this.d;
        int i2 = oj9Var2.F;
        if (i2 == -1 || i2 != oj9Var.F) {
            return false;
        }
        return (this.n || ((str = oj9Var2.n) != null && TextUtils.equals(str, oj9Var.n))) && (i = oj9Var2.G) != -1 && i == oj9Var.G && this.w == xw6Var.w && this.x == xw6Var.x;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xw6 xw6Var) {
        esf esfVar;
        esf esfVarD;
        boolean z = this.i;
        boolean z2 = this.f;
        if (z2 && z) {
            esfVarD = jx6.l;
            esfVar = esfVarD;
        } else {
            esf esfVar2 = jx6.l;
            esfVar = esfVar2;
            esfVarD = esfVar2.d();
        }
        boolean z3 = xw6Var.i;
        int i = xw6Var.u;
        xc5 xc5VarC = xc5.a.c(z, z3);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(xw6Var.k);
        ije ijeVar = ije.c;
        xc5 xc5VarB = xc5VarC.b(numValueOf, numValueOf2, ijeVar).a(this.j, xw6Var.j).a(this.l, xw6Var.l).b(Integer.valueOf(this.m), Integer.valueOf(xw6Var.m), ijeVar).c(this.r, xw6Var.r).c(this.o, xw6Var.o).b(Integer.valueOf(this.p), Integer.valueOf(xw6Var.p), ijeVar).a(this.q, xw6Var.q).c(z2, xw6Var.f).b(Integer.valueOf(this.v), Integer.valueOf(xw6Var.v), ijeVar);
        boolean z4 = this.h.F;
        int i2 = this.u;
        if (z4) {
            xc5VarB = xc5VarB.b(Integer.valueOf(i2), Integer.valueOf(i), esfVar.d());
        }
        xc5 xc5VarB2 = xc5VarB.c(this.w, xw6Var.w).c(this.x, xw6Var.x).c(this.y, xw6Var.y).b(Integer.valueOf(this.s), Integer.valueOf(xw6Var.s), esfVarD).b(Integer.valueOf(this.t), Integer.valueOf(xw6Var.t), esfVarD);
        if (Objects.equals(this.g, xw6Var.g)) {
            xc5VarB2 = xc5VarB2.b(Integer.valueOf(i2), Integer.valueOf(i), esfVarD);
        }
        return xc5VarB2.e();
    }
}
