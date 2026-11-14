package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class fi8 implements fjc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qi8 b;

    public /* synthetic */ fi8(qi8 qi8Var, byte b) {
        this.a = b;
        this.b = qi8Var;
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        qi8 qi8Var = this.b;
        eig eigVar = (eig) obj;
        switch (b) {
            case 2:
                eigVar.N(qi8Var.R);
                break;
            default:
                eigVar.o(qi8Var.T);
                break;
        }
    }
}
