package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class faa extends f1o {
    @Override // defpackage.z27
    public final void a(z27 z27Var) {
        u33 u33Var = (u33) this.b;
        int i = u33Var.r0;
        e37 e37Var = this.h;
        ArrayList arrayList = e37Var.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((e37) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            e37Var.d(i3 + u33Var.t0);
        } else {
            e37Var.d(i2 + u33Var.t0);
        }
    }

    @Override // defpackage.f1o
    public final void d() {
        uo5 uo5Var = this.b;
        if (uo5Var instanceof u33) {
            e37 e37Var = this.h;
            e37Var.b = true;
            ArrayList arrayList = e37Var.l;
            u33 u33Var = (u33) uo5Var;
            int i = u33Var.r0;
            boolean z = u33Var.s0;
            int i2 = 0;
            if (i == 0) {
                e37Var.e = 4;
                while (i2 < u33Var.q0) {
                    uo5 uo5Var2 = u33Var.p0[i2];
                    if (z || uo5Var2.f0 != 8) {
                        e37 e37Var2 = uo5Var2.d.h;
                        e37Var2.k.add(e37Var);
                        arrayList.add(e37Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                e37Var.e = 5;
                while (i2 < u33Var.q0) {
                    uo5 uo5Var3 = u33Var.p0[i2];
                    if (z || uo5Var3.f0 != 8) {
                        e37 e37Var3 = uo5Var3.d.i;
                        e37Var3.k.add(e37Var);
                        arrayList.add(e37Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                e37Var.e = 6;
                while (i2 < u33Var.q0) {
                    uo5 uo5Var4 = u33Var.p0[i2];
                    if (z || uo5Var4.f0 != 8) {
                        e37 e37Var4 = uo5Var4.e.h;
                        e37Var4.k.add(e37Var);
                        arrayList.add(e37Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i == 3) {
                e37Var.e = 7;
                while (i2 < u33Var.q0) {
                    uo5 uo5Var5 = u33Var.p0[i2];
                    if (z || uo5Var5.f0 != 8) {
                        e37 e37Var5 = uo5Var5.e.i;
                        e37Var5.k.add(e37Var);
                        arrayList.add(e37Var5);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            }
        }
    }

    @Override // defpackage.f1o
    public final void e() {
        uo5 uo5Var = this.b;
        if (uo5Var instanceof u33) {
            int i = ((u33) uo5Var).r0;
            e37 e37Var = this.h;
            if (i == 0 || i == 1) {
                uo5Var.X = e37Var.g;
            } else {
                uo5Var.Y = e37Var.g;
            }
        }
    }

    @Override // defpackage.f1o
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.f1o
    public final boolean k() {
        return false;
    }

    public final void m(e37 e37Var) {
        e37 e37Var2 = this.h;
        e37Var2.k.add(e37Var);
        e37Var.l.add(e37Var2);
    }
}
