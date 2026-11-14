package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bz9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cz9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ bz9(cz9 cz9Var, int i, byte b) {
        this.a = b;
        this.b = cz9Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        cz9 cz9Var = this.b;
        switch (b) {
            case 0:
                cod codVar = ((ez9) ((g77) cz9Var.f).c).d;
                if (codVar != null) {
                    codVar.j(i);
                    break;
                }
                break;
            default:
                cod codVar2 = ((ez9) ((g77) cz9Var.f).c).d;
                if (codVar2 != null) {
                    codVar2.k(i);
                    break;
                }
                break;
        }
    }
}
