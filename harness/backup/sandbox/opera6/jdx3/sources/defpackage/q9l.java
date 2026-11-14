package defpackage;

/* loaded from: classes.dex */
public final class q9l implements j6l {
    public final /* synthetic */ r9l a;

    public q9l(r9l r9lVar) {
        this.a = r9lVar;
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i, boolean z) {
        if (((d7l) b2lVar).l == lqm.l) {
            p6l p6lVarT = b2lVar.T();
            gal galVar = this.a.t;
            if (p6lVarT != galVar.e) {
                galVar.g(b2lVar.T());
            }
        }
    }

    @Override // defpackage.j6l
    public final void z() {
        r9l r9lVar = this.a;
        r9lVar.t.g(p6l.a);
        r9lVar.j();
    }
}
