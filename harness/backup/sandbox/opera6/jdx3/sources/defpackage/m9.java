package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class m9 implements w73 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ndc b;

    public /* synthetic */ m9(ndc ndcVar, byte b) {
        this.a = b;
        this.b = ndcVar;
    }

    public final void b(Object obj, float f, boolean z) {
        byte b = this.a;
        ndc ndcVar = this.b;
        switch (b) {
            case 0:
                p9 p9Var = (p9) ndcVar;
                if (z) {
                    t9 t9VarI0 = p9Var.I0();
                    int i = (int) f;
                    ode odeVar = t9VarI0.e;
                    r9 r9Var = (r9) odeVar.g();
                    odeVar.r(r9Var != null ? new r9(t9VarI0.g(i), r9Var.b, r9Var.c) : null);
                    break;
                }
                break;
            default:
                ywf ywfVar = (ywf) ndcVar;
                if (z && !ywfVar.g) {
                    int i2 = (int) f;
                    ywfVar.d(oup.n0(i2));
                    ywfVar.k(i2);
                    ywfVar.j(i2);
                    break;
                }
                break;
        }
    }
}
