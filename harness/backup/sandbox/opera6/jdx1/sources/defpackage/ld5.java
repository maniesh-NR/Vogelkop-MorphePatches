package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ld5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xd5 b;

    public /* synthetic */ ld5(xd5 xd5Var, byte b) {
        this.a = b;
        this.b = xd5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xd5 xd5Var = this.b;
        switch (b) {
            case 0:
                xd5Var.invalidateMenu();
                break;
            default:
                xd5.q(xd5Var);
                break;
        }
    }
}
