package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qu3 implements vwh, dkj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqh b;

    public /* synthetic */ qu3(pqh pqhVar, byte b) {
        this.a = b;
        this.b = pqhVar;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        pqh pqhVar = this.b;
        switch (b) {
            case 1:
                pqhVar.a = pkj.a;
                break;
            default:
                pqhVar.a = pkj.b;
                break;
        }
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        ((d7l) ((b2l) this.b.a)).f.e(o93Var);
    }
}
