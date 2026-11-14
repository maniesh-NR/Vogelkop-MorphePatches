package defpackage;

/* loaded from: classes.dex */
public abstract class a8o extends th5 {
    public final l73 k;

    public a8o(l73 l73Var) {
        this.k = l73Var;
    }

    public abstract void A(gql gqlVar);

    public void B() {
        y(null, this.k);
    }

    @Override // defpackage.l73
    public final gql h() {
        return this.k.h();
    }

    @Override // defpackage.l73
    public final qjd i() {
        return this.k.i();
    }

    @Override // defpackage.l73
    public final boolean j() {
        return this.k.j();
    }

    @Override // defpackage.l73
    public final void m(pl6 pl6Var) {
        this.j = pl6Var;
        this.i = tym.p(null);
        B();
    }

    @Override // defpackage.l73
    public void t(qjd qjdVar) {
        this.k.t(qjdVar);
    }

    @Override // defpackage.th5
    public final jrd u(Object obj, jrd jrdVar) {
        return z(jrdVar);
    }

    @Override // defpackage.th5
    public final long v(Object obj, long j) {
        return j;
    }

    @Override // defpackage.th5
    public final int w(Object obj, int i) {
        return i;
    }

    @Override // defpackage.th5
    public final void x(Object obj, l73 l73Var, gql gqlVar) {
        A(gqlVar);
    }

    public jrd z(jrd jrdVar) {
        return jrdVar;
    }
}
