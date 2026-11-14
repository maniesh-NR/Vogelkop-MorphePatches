package defpackage;

/* loaded from: classes.dex */
public final class k18 extends tim {
    public final /* synthetic */ byte b = 0;
    public final Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k18(l18 l18Var, tu tuVar, l18 l18Var2) {
        super(l18Var);
        this.c = tuVar;
        this.d = l18Var2;
    }

    public k18(xzg xzgVar, p0h p0hVar, cbf cbfVar) {
        super(xzgVar);
        this.c = p0hVar;
        this.d = cbfVar;
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((qwk) ((tu) obj).b).D(((l18) this.d).h);
                break;
            default:
                super.onFinished(hjmVar);
                p0h p0hVar = (p0h) obj;
                p0hVar.a.H(p0hVar);
                hj.a.c(p0hVar);
                p0hVar.b.H(p0hVar);
                cbf cbfVar = (cbf) this.d;
                if (cbfVar != null) {
                    cbfVar.run();
                    this.d = null;
                    break;
                }
                break;
        }
    }
}
