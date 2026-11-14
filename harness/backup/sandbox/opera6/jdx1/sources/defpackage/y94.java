package defpackage;

/* loaded from: classes.dex */
public final class y94 implements trm {
    public final z94 a;
    public final ctm b;
    public final tb5 c;
    public zrm d;

    public y94(z94 z94Var, ctm ctmVar, tb5 tb5Var) {
        this.a = z94Var;
        this.b = ctmVar;
        this.c = tb5Var;
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.d = zrmVar;
        if (zrmVar != null) {
            tb5 tb5Var = this.c;
            z94 z94Var = this.a;
            tb5Var.b(z94Var);
            tb5Var.a(z94Var, this.b.e);
            z94Var.a(zrmVar, false);
        }
    }

    @Override // defpackage.trm
    public final void reset() {
        z94 z94Var = this.a;
        synchronized (z94Var.b) {
            cd5 cd5Var = z94Var.d;
            if (cd5Var != null) {
                z94Var.d = null;
                cd5Var.B0(new gc4("The camera control has became inactive."));
            }
            cd5 cd5Var2 = z94Var.e;
            if (cd5Var2 != null) {
                z94Var.e = null;
                cd5Var2.B0(new gc4("The camera control has became inactive."));
            }
        }
        this.c.b(this.a);
    }
}
