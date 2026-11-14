package defpackage;

/* loaded from: classes.dex */
public final class x10 extends mq implements tz {
    public sz p;
    public boolean q;
    public boolean r;

    @Override // defpackage.tz
    public final boolean a(yz yzVar) {
        return false;
    }

    @Override // defpackage.tz
    public final boolean b(yz yzVar) {
        n();
        sz szVar = this.p;
        boolean zB = szVar != null ? szVar.b(yzVar) : false;
        if (!zB) {
            o();
        }
        return zB;
    }

    @Override // defpackage.tz
    public final boolean c(yz yzVar) {
        return false;
    }

    @Override // defpackage.mq
    public final tz h(dl dlVar) {
        return new sz(new tz[]{this, new jq(this, dlVar)});
    }

    @Override // defpackage.mq
    public final boolean m(yz yzVar) {
        return ((w10) yzVar).v() ? this.q : super.m(yzVar);
    }

    public final void n() {
        w10 w10Var = (w10) this.d;
        if (!w10Var.v() || this.r) {
            return;
        }
        this.r = true;
        this.g.l(w10Var);
    }

    public final void o() {
        w10 w10Var = (w10) this.d;
        if (!w10Var.v() || this.q) {
            return;
        }
        this.q = true;
        this.g.A(w10Var);
    }
}
