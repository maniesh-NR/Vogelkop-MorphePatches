package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f1o implements z27 {
    public int a;
    public uo5 b;
    public ubi c;
    public int d;
    public final h97 e = new h97(this);
    public int f = 0;
    public boolean g = false;
    public final e37 h = new e37(this);
    public final e37 i = new e37(this);
    public int j = 1;

    public f1o(uo5 uo5Var) {
        this.b = uo5Var;
    }

    public static void b(e37 e37Var, e37 e37Var2, int i) {
        e37Var.l.add(e37Var2);
        e37Var.f = i;
        e37Var2.k.add(e37Var);
    }

    public static e37 h(eo5 eo5Var) {
        eo5 eo5Var2 = eo5Var.f;
        if (eo5Var2 == null) {
            return null;
        }
        uo5 uo5Var = eo5Var2.d;
        int iA = vep.A(eo5Var2.e);
        if (iA == 1) {
            return uo5Var.d.h;
        }
        if (iA == 2) {
            return uo5Var.e.h;
        }
        if (iA == 3) {
            return uo5Var.d.i;
        }
        if (iA == 4) {
            return uo5Var.e.i;
        }
        if (iA != 5) {
            return null;
        }
        return uo5Var.e.k;
    }

    public static e37 i(eo5 eo5Var, int i) {
        eo5 eo5Var2 = eo5Var.f;
        if (eo5Var2 == null) {
            return null;
        }
        uo5 uo5Var = eo5Var2.d;
        f1o f1oVar = i == 0 ? uo5Var.d : uo5Var.e;
        int iA = vep.A(eo5Var2.e);
        if (iA == 1 || iA == 2) {
            return f1oVar.h;
        }
        if (iA == 3 || iA == 4) {
            return f1oVar.i;
        }
        return null;
    }

    public final void c(e37 e37Var, e37 e37Var2, int i, h97 h97Var) {
        e37Var.l.add(e37Var2);
        e37Var.l.add(this.e);
        e37Var.h = i;
        e37Var.i = h97Var;
        e37Var2.k.add(e37Var);
        h97Var.k.add(e37Var);
    }

    public void d() {
        uo5 uo5Var;
        vo5 vo5Var;
        int i;
        vo5 vo5Var2;
        vo5 vo5Var3;
        int i2;
        uo5 uo5Var2 = this.b;
        boolean z = uo5Var2.a;
        h97 h97Var = this.e;
        if (z) {
            h97Var.d(uo5Var2.n());
        }
        boolean z2 = h97Var.j;
        ArrayList arrayList = h97Var.k;
        ArrayList arrayList2 = h97Var.l;
        e37 e37Var = this.i;
        e37 e37Var2 = this.h;
        if (!z2) {
            uo5 uo5Var3 = this.b;
            int i3 = uo5Var3.o0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (vo5Var3 = uo5Var3.S) != null && ((i2 = vo5Var3.o0[0]) == 1 || i2 == 4)) {
                    int iN = (vo5Var3.n() - this.b.H.e()) - this.b.J.e();
                    b(e37Var2, vo5Var3.d.h, this.b.H.e());
                    b(e37Var, vo5Var3.d.i, -this.b.J.e());
                    h97Var.d(iN);
                    return;
                }
                if (i3 == 1) {
                    h97Var.d(uo5Var3.n());
                }
            }
        } else if (this.d == 4 && (vo5Var = (uo5Var = this.b).S) != null && ((i = vo5Var.o0[0]) == 1 || i == 4)) {
            b(e37Var2, vo5Var.d.h, uo5Var.H.e());
            b(e37Var, vo5Var.d.i, -this.b.J.e());
            return;
        }
        if (h97Var.j) {
            uo5 uo5Var4 = this.b;
            if (uo5Var4.a) {
                eo5[] eo5VarArr = uo5Var4.P;
                eo5 eo5Var = eo5VarArr[0];
                if (eo5Var.f == null) {
                    eo5 eo5Var2 = eo5VarArr[1];
                    if (eo5Var2.f != null) {
                        e37 e37VarH = h(eo5Var2);
                        if (e37VarH != null) {
                            b(e37Var, e37VarH, -this.b.P[1].e());
                            b(e37Var2, e37Var, -h97Var.g);
                            return;
                        }
                        return;
                    }
                    if ((uo5Var4 instanceof gaa) || uo5Var4.S == null || uo5Var4.i(7).f != null) {
                        return;
                    }
                    uo5 uo5Var5 = this.b;
                    b(e37Var2, uo5Var5.S.d.h, uo5Var5.o());
                    b(e37Var, e37Var2, h97Var.g);
                    return;
                }
                if (eo5VarArr[1].f == null) {
                    e37 e37VarH2 = h(eo5Var);
                    if (e37VarH2 != null) {
                        b(e37Var2, e37VarH2, this.b.P[0].e());
                        b(e37Var, e37Var2, h97Var.g);
                        return;
                    }
                    return;
                }
                boolean zU = uo5Var4.u();
                uo5 uo5Var6 = this.b;
                if (zU) {
                    e37Var2.f = uo5Var6.P[0].e();
                    e37Var.f = -this.b.P[1].e();
                    return;
                }
                e37 e37VarH3 = h(uo5Var6.P[0]);
                if (e37VarH3 != null) {
                    b(e37Var2, e37VarH3, this.b.P[0].e());
                }
                e37 e37VarH4 = h(this.b.P[1]);
                if (e37VarH4 != null) {
                    b(e37Var, e37VarH4, -this.b.P[1].e());
                }
                e37Var2.b = true;
                e37Var.b = true;
                return;
            }
        }
        if (this.d == 3) {
            uo5 uo5Var7 = this.b;
            int i4 = uo5Var7.q;
            if (i4 == 2) {
                vo5 vo5Var4 = uo5Var7.S;
                if (vo5Var4 != null) {
                    h97 h97Var2 = vo5Var4.e.e;
                    arrayList2.add(h97Var2);
                    h97Var2.k.add(h97Var);
                    h97Var.b = true;
                    arrayList.add(e37Var2);
                    arrayList.add(e37Var);
                }
            } else if (i4 == 3) {
                if (uo5Var7.r == 3) {
                    e37Var2.a = this;
                    e37Var.a = this;
                    k2n k2nVar = uo5Var7.e;
                    k2nVar.h.a = this;
                    k2nVar.i.a = this;
                    h97Var.a = this;
                    if (uo5Var7.v()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(h97Var);
                        k2n k2nVar2 = this.b.e;
                        k2nVar2.e.a = this;
                        arrayList2.add(k2nVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(h97Var);
                        this.b.e.i.k.add(h97Var);
                    } else {
                        boolean zU2 = this.b.u();
                        uo5 uo5Var8 = this.b;
                        if (zU2) {
                            uo5Var8.e.e.l.add(h97Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            uo5Var8.e.e.l.add(h97Var);
                        }
                    }
                } else {
                    h97 h97Var3 = uo5Var7.e.e;
                    arrayList2.add(h97Var3);
                    h97Var3.k.add(h97Var);
                    this.b.e.h.k.add(h97Var);
                    this.b.e.i.k.add(h97Var);
                    h97Var.b = true;
                    arrayList.add(e37Var2);
                    arrayList.add(e37Var);
                    e37Var2.l.add(h97Var);
                    e37Var.l.add(h97Var);
                }
            }
        }
        uo5 uo5Var9 = this.b;
        eo5[] eo5VarArr2 = uo5Var9.P;
        eo5 eo5Var3 = eo5VarArr2[0];
        if (eo5Var3.f == null) {
            eo5 eo5Var4 = eo5VarArr2[1];
            if (eo5Var4.f != null) {
                e37 e37VarH5 = h(eo5Var4);
                if (e37VarH5 != null) {
                    b(e37Var, e37VarH5, -this.b.P[1].e());
                    c(e37Var2, e37Var, -1, h97Var);
                    return;
                }
                return;
            }
            if ((uo5Var9 instanceof gaa) || (vo5Var2 = uo5Var9.S) == null) {
                return;
            }
            b(e37Var2, vo5Var2.d.h, uo5Var9.o());
            c(e37Var, e37Var2, 1, h97Var);
            return;
        }
        if (eo5VarArr2[1].f == null) {
            e37 e37VarH6 = h(eo5Var3);
            if (e37VarH6 != null) {
                b(e37Var2, e37VarH6, this.b.P[0].e());
                c(e37Var, e37Var2, 1, h97Var);
                return;
            }
            return;
        }
        boolean zU3 = uo5Var9.u();
        uo5 uo5Var10 = this.b;
        if (zU3) {
            e37Var2.f = uo5Var10.P[0].e();
            e37Var.f = -this.b.P[1].e();
            return;
        }
        e37 e37VarH7 = h(uo5Var10.P[0]);
        e37 e37VarH8 = h(this.b.P[1]);
        if (e37VarH7 != null) {
            e37VarH7.b(this);
        }
        if (e37VarH8 != null) {
            e37VarH8.b(this);
        }
        this.j = 4;
    }

    public void e() {
        uo5 uo5Var = this.b;
        int i = ((r5a) uo5Var).t0;
        e37 e37Var = this.h;
        if (i == 1) {
            uo5Var.X = e37Var.g;
        } else {
            uo5Var.Y = e37Var.g;
        }
    }

    public void f() {
        this.h.c();
    }

    public final int g(int i, int i2) {
        uo5 uo5Var = this.b;
        if (i2 == 0) {
            int i3 = uo5Var.u;
            int iMax = Math.max(uo5Var.t, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = uo5Var.x;
            int iMax2 = Math.max(uo5Var.w, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public boolean k() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.eo5 r12, defpackage.eo5 r13, int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1o.l(eo5, eo5, int):void");
    }
}
