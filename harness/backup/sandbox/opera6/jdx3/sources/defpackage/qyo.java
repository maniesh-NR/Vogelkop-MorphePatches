package defpackage;

/* loaded from: classes.dex */
public final class qyo extends ejo {
    public final /* synthetic */ bzo b;

    public qyo(bzo bzoVar) {
        this.b = bzoVar;
    }

    public final void h(pqo pqoVar, g94 g94Var) {
        Object lioVar;
        bzo bzoVar = this.b;
        mhk mhkVar = bzoVar.i;
        mhkVar.b(pqoVar.a);
        int iA = mhkVar.a(pqoVar);
        bm bmVar = bm.d;
        if (iA >= 1) {
            if (mhkVar.a(pqoVar) <= g1p.b) {
                new e1p(bzoVar.a, mhkVar, null).h(pqoVar, g94.Io);
            }
            vho vhoVarC = mhkVar.c(pqoVar);
            lioVar = vhoVarC != null ? new mio(vhoVarC) : new lio(new zno(bmVar));
        } else {
            e1p e1pVar = (e1p) this.a;
            if (e1pVar != null) {
                e1pVar.h(pqoVar, g94Var);
                return;
            }
            lioVar = new lio(new zno(bmVar));
        }
        ((roj) g94Var).l(lioVar);
    }
}
