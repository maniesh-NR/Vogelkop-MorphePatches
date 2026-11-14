package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ux7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vx7 b;

    public /* synthetic */ ux7(vx7 vx7Var) {
        this.b = vx7Var;
    }

    public /* synthetic */ ux7(vx7 vx7Var, Throwable th) {
        this.b = vx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                vx7Var.a.S();
                break;
            default:
                vx7Var.a.R();
                break;
        }
    }
}
