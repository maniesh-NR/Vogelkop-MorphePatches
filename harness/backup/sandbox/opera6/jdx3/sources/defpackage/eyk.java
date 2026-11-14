package defpackage;

/* loaded from: classes.dex */
public final class eyk implements as6 {
    public final /* synthetic */ gyk a;
    public final /* synthetic */ nj2 b;
    public final /* synthetic */ j25 c;

    public eyk(gyk gykVar, nj2 nj2Var, j25 j25Var) {
        this.a = gykVar;
        this.b = nj2Var;
        this.c = j25Var;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        gyk gykVar = this.a;
        gykVar.d.a(this.b);
        gykVar.c.F(this.c);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        gyk gykVar = this.a;
        gykVar.d.h(this.b);
        gykVar.c.H(this.c);
    }
}
