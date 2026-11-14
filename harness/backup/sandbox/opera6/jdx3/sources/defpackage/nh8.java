package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nh8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rh8 b;

    public /* synthetic */ nh8(rh8 rh8Var, byte b) {
        this.a = b;
        this.b = rh8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rh8 rh8Var = this.b;
        switch (b) {
            case 0:
                rh8Var.b();
                break;
            case 1:
                rh8Var.b();
                break;
            default:
                rh8Var.k.invoke();
                break;
        }
    }
}
