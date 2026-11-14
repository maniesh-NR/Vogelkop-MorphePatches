package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class li4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bl9 b;

    public /* synthetic */ li4(bl9 bl9Var, byte b) {
        this.a = b;
        this.b = bl9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bl9 bl9Var = this.b;
        switch (b) {
            case 0:
                bl9Var.d();
                break;
            case 1:
                if (bl9Var != null) {
                    bl9Var.d();
                    break;
                }
                break;
            case 2:
                if (bl9Var != null) {
                    bl9Var.d();
                    break;
                }
                break;
            case 3:
                bl9Var.d();
                break;
            default:
                bl9Var.d();
                break;
        }
    }
}
