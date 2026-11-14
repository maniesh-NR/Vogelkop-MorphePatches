package defpackage;

/* loaded from: classes.dex */
public final class s5a extends f1o {
    @Override // defpackage.z27
    public final void a(z27 z27Var) {
        e37 e37Var = this.h;
        if (!e37Var.c || e37Var.j) {
            return;
        }
        e37Var.d((int) ((((e37) e37Var.l.get(0)).g * ((r5a) this.b).p0) + 0.5f));
    }

    @Override // defpackage.f1o
    public final void d() {
        uo5 uo5Var = this.b;
        r5a r5aVar = (r5a) uo5Var;
        int i = r5aVar.q0;
        int i2 = r5aVar.r0;
        int i3 = r5aVar.t0;
        e37 e37Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                e37Var.l.add(uo5Var.S.d.h);
                this.b.S.d.h.k.add(e37Var);
                e37Var.f = i;
            } else if (i2 != -1) {
                e37Var.l.add(uo5Var.S.d.i);
                this.b.S.d.i.k.add(e37Var);
                e37Var.f = -i2;
            } else {
                e37Var.b = true;
                e37Var.l.add(uo5Var.S.d.i);
                this.b.S.d.i.k.add(e37Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            e37Var.l.add(uo5Var.S.e.h);
            this.b.S.e.h.k.add(e37Var);
            e37Var.f = i;
        } else if (i2 != -1) {
            e37Var.l.add(uo5Var.S.e.i);
            this.b.S.e.i.k.add(e37Var);
            e37Var.f = -i2;
        } else {
            e37Var.b = true;
            e37Var.l.add(uo5Var.S.e.i);
            this.b.S.e.i.k.add(e37Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void m(e37 e37Var) {
        e37 e37Var2 = this.h;
        e37Var2.k.add(e37Var);
        e37Var.l.add(e37Var2);
    }
}
