package defpackage;

/* loaded from: classes.dex */
public final class tro extends woo implements idf {
    public final idf f;
    public boolean g;

    public tro(vm vmVar, idf idfVar) {
        super(vmVar);
        this.f = idfVar;
    }

    @Override // defpackage.idf
    public final void a(a36 a36Var) {
        if (b() || this.g) {
            return;
        }
        this.g = true;
        this.f.a(a36Var);
    }
}
