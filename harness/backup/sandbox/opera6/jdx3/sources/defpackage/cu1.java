package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cu1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ du1 b;

    public /* synthetic */ cu1(du1 du1Var, byte b) {
        this.a = b;
        this.b = du1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        du1 du1Var = this.b;
        switch (b) {
            case 0:
                du1Var.a.p("startup#fps");
                break;
            default:
                du1Var.a.p("startup#core");
                break;
        }
    }
}
