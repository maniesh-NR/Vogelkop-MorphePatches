package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jrk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qt6 b;

    public /* synthetic */ jrk(qt6 qt6Var, byte b) {
        this.a = b;
        this.b = qt6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qt6 qt6Var = this.b;
        switch (b) {
            case 0:
                qt6Var.m();
                break;
            default:
                qt6Var.m();
                break;
        }
    }
}
