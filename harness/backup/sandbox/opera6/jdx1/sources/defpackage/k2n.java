package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k2n extends f1o {
    public e37 k;
    public ta3 l;

    @Override // defpackage.z27
    public final void a(z27 z27Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (vep.A(this.j) == 3) {
            uo5 uo5Var = this.b;
            l(uo5Var.I, uo5Var.K, 1);
            return;
        }
        h97 h97Var = this.e;
        if (h97Var.c && !h97Var.j && this.d == 3) {
            uo5 uo5Var2 = this.b;
            int i2 = uo5Var2.r;
            if (i2 == 2) {
                vo5 vo5Var = uo5Var2.S;
                if (vo5Var != null) {
                    if (vo5Var.e.e.j) {
                        h97Var.d((int) ((r5.g * uo5Var2.y) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                h97 h97Var2 = uo5Var2.d.e;
                if (h97Var2.j) {
                    int i3 = uo5Var2.W;
                    if (i3 == -1) {
                        f = h97Var2.g;
                        f2 = uo5Var2.V;
                    } else if (i3 == 0) {
                        f3 = h97Var2.g * uo5Var2.V;
                        i = (int) (f3 + 0.5f);
                        h97Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        h97Var.d(i);
                    } else {
                        f = h97Var2.g;
                        f2 = uo5Var2.V;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    h97Var.d(i);
                }
            }
        }
        e37 e37Var = this.h;
        boolean z = e37Var.c;
        ArrayList arrayList = e37Var.l;
        if (z) {
            e37 e37Var2 = this.i;
            boolean z2 = e37Var2.c;
            ArrayList arrayList2 = e37Var2.l;
            if (z2) {
                if (e37Var.j && e37Var2.j && h97Var.j) {
                    return;
                }
                if (!h97Var.j && this.d == 3) {
                    uo5 uo5Var3 = this.b;
                    if (uo5Var3.q == 0 && !uo5Var3.v()) {
                        e37 e37Var3 = (e37) arrayList.get(0);
                        e37 e37Var4 = (e37) arrayList2.get(0);
                        int i4 = e37Var3.g + e37Var.f;
                        int i5 = e37Var4.g + e37Var2.f;
                        e37Var.d(i4);
                        e37Var2.d(i5);
                        h97Var.d(i5 - i4);
                        return;
                    }
                }
                if (!h97Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e37 e37Var5 = (e37) arrayList.get(0);
                    int i6 = (((e37) arrayList2.get(0)).g + e37Var2.f) - (e37Var5.g + e37Var.f);
                    int i7 = h97Var.m;
                    if (i6 < i7) {
                        h97Var.d(i6);
                    } else {
                        h97Var.d(i7);
                    }
                }
                if (!h97Var.j || arrayList.size() <= 0 || arrayList2.size() <= 0) {
                    return;
                }
                e37 e37Var6 = (e37) arrayList.get(0);
                e37 e37Var7 = (e37) arrayList2.get(0);
                int i8 = e37Var6.g;
                int i9 = e37Var.f + i8;
                int i10 = e37Var7.g;
                int i11 = e37Var2.f + i10;
                float f4 = this.b.d0;
                if (e37Var6 == e37Var7) {
                    f4 = 0.5f;
                } else {
                    i8 = i9;
                    i10 = i11;
                }
                e37Var.d((int) ((((i10 - i8) - h97Var.g) * f4) + i8 + 0.5f));
                e37Var2.d(e37Var.g + h97Var.g);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0225  */
    @Override // defpackage.f1o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2n.d():void");
    }

    @Override // defpackage.f1o
    public final void e() {
        e37 e37Var = this.h;
        if (e37Var.j) {
            this.b.Y = e37Var.g;
        }
    }

    @Override // defpackage.f1o
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.f1o
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void m() {
        this.g = false;
        e37 e37Var = this.h;
        e37Var.c();
        e37Var.j = false;
        e37 e37Var2 = this.i;
        e37Var2.c();
        e37Var2.j = false;
        e37 e37Var3 = this.k;
        e37Var3.c();
        e37Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
