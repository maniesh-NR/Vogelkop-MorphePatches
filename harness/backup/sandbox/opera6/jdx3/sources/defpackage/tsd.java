package defpackage;

/* loaded from: classes.dex */
public class tsd extends pde implements f7f {
    public final h42 l;

    public tsd(Object obj) {
        super(obj);
        h42 h42Var = new h42();
        this.l = h42Var;
        h42Var.r(obj);
    }

    public final void d0(Object obj) {
        super.r(obj);
    }

    public void l() {
        this.l.k(this);
    }

    public void m() {
        this.l.p(this);
    }

    @Override // defpackage.pde
    public final void n(Object obj) {
        throw null;
    }

    public final void r(Object obj) {
        this.l.r(obj);
        if (h()) {
            return;
        }
        super.r(obj);
    }

    public void s(ekc ekcVar, f7f f7fVar) {
        this.l.s(ekcVar, f7fVar);
    }
}
