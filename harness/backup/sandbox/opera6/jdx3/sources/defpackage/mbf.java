package defpackage;

/* loaded from: classes.dex */
public final class mbf extends lim implements y43 {
    public final k6l a;
    public final z43 b;
    public final pde c;
    public final pde d;
    public final pde e;
    public final pde f;
    public tk0 g;
    public boolean h;

    public mbf(k6l k6lVar, z43 z43Var) {
        this.a = k6lVar;
        this.b = z43Var;
        tk0 tk0Var = this.g;
        this.c = new pde(tk0Var == null ? this.h ? tk0.d : tk0.e : tk0Var);
        this.d = new pde(null);
        this.e = new pde(null);
        this.f = new pde(Boolean.FALSE);
        b2l b2lVar = k6lVar.o;
        this.h = b2lVar != null ? ((d7l) b2lVar).n0() : false;
    }

    @Override // defpackage.y43
    public final void O(x43 x43Var) {
        tk0 tk0Var = this.g;
        if (tk0Var == null) {
            tk0Var = this.h ? tk0.d : tk0.e;
        }
        xf8.F0(this.c, tk0Var);
    }

    public final void R(b2l b2lVar) {
        boolean zN0 = ((d7l) b2lVar).n0();
        this.h = zN0;
        tk0 tk0Var = this.g;
        if (tk0Var == null) {
            tk0Var = zN0 ? tk0.d : tk0.e;
        }
        xf8.F0(this.c, tk0Var);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        aib.B(this.a.w, ndcVar, new qz(this, (byte) 15), new vme((byte) 19));
        z43 z43Var = this.b;
        if (z43Var != null) {
            ((i7f) z43Var.h).b(this);
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        z43 z43Var = this.b;
        if (z43Var != null) {
            ((i7f) z43Var.h).c(this);
        }
    }
}
