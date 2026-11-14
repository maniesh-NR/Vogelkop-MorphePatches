package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class dl6 implements fjc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ r4n b;

    public /* synthetic */ dl6(d11 d11Var, r4n r4nVar) {
        this.b = r4nVar;
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        r4n r4nVar = this.b;
        switch (b) {
            case 0:
                dkd dkdVar = (dkd) ((e11) obj);
                ro9 ro9Var = dkdVar.p;
                if (ro9Var != null) {
                    oj9 oj9Var = (oj9) ro9Var.c;
                    if (oj9Var.v == -1) {
                        nj9 nj9VarA = oj9Var.a();
                        nj9VarA.t = r4nVar.a;
                        nj9VarA.u = r4nVar.b;
                        dkdVar.p = new ro9((Object) new oj9(nj9VarA), ro9Var.b, ro9Var.d, (byte) 18);
                    }
                }
                int i = r4nVar.a;
                break;
            default:
                ((eig) obj).a(r4nVar);
                break;
        }
    }
}
