package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class e12 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f12 b;

    public /* synthetic */ e12(f12 f12Var, byte b) {
        this.a = b;
        this.b = f12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f12 f12Var = this.b;
        switch (b) {
            case 0:
                f12Var.h();
                break;
            default:
                f12Var.d();
                break;
        }
    }
}
