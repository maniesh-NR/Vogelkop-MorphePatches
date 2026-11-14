package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mv7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv7 b;

    public /* synthetic */ mv7(rv7 rv7Var, byte b) {
        this.a = b;
        this.b = rv7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rv7 rv7Var = this.b;
        switch (b) {
            case 0:
                rv7Var.r = true;
                rv7Var.d();
                break;
            default:
                if (((Boolean) rv7Var.l.invoke()).booleanValue()) {
                    rv7Var.n.m(true);
                    break;
                }
                break;
        }
    }
}
