package defpackage;

/* loaded from: classes.dex */
public final class c0i implements as6, hpf {
    public final ltl a;
    public final xb b;
    public final slk c;
    public final b0i d;
    public final ode e = new ode(Boolean.FALSE);
    public ig f;

    public c0i(ltl ltlVar, xb xbVar, slk slkVar, b0i b0iVar) {
        this.a = ltlVar;
        this.b = xbVar;
        this.c = slkVar;
        this.d = b0iVar;
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        Boolean bool = Boolean.TRUE;
        ode odeVar = this.e;
        if (bool.equals(odeVar.g())) {
            return;
        }
        odeVar.r(bool);
        this.a.getLifecycle().a(this);
        pjg pjgVar = new pjg(this, (byte) 21);
        ig igVar = new ig();
        igVar.b = pjgVar;
        this.f = igVar;
        this.c.b(igVar);
    }

    public final void a() {
        ((dpf) this.b.e.g()).a(this);
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        this.d.J(1);
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
        this.d.J(1);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        this.a.getLifecycle().b(this);
        ig igVar = this.f;
        if (igVar != null) {
            igVar.b = null;
        }
        this.e.r(Boolean.FALSE);
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        this.d.q();
    }
}
