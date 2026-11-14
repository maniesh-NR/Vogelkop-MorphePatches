package defpackage;

/* loaded from: classes.dex */
public final class kji extends nji {
    public final /* synthetic */ hh4 a;
    public final /* synthetic */ b2l b;
    public final /* synthetic */ c23 c;

    public kji(hh4 hh4Var, b2l b2lVar, c23 c23Var) {
        this.a = hh4Var;
        this.b = b2lVar;
        this.c = c23Var;
    }

    @Override // defpackage.nji
    public final void a() {
        hh4 hh4Var = this.a;
        if (hh4Var != null) {
            hh4Var.cancel();
        }
        ((d7l) this.b).H(this.c);
    }
}
