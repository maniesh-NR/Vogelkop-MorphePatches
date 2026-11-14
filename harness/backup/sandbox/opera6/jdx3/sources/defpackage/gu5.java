package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gu5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ku5 b;

    public /* synthetic */ gu5(ku5 ku5Var, byte b) {
        this.a = b;
        this.b = ku5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ku5 ku5Var = this.b;
        switch (b) {
            case 0:
                if (ku5Var.f != null && !ku5Var.e() && ku5Var.f.isEmpty()) {
                    ku5Var.c();
                    break;
                }
                break;
            case 1:
            case 2:
                ku5Var.b();
                break;
            default:
                if (ku5Var.f != null && !ku5Var.e() && ku5Var.f.isEmpty()) {
                    ku5Var.c();
                }
                ku5Var.g();
                break;
        }
    }
}
