package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ps8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ts8 b;

    public /* synthetic */ ps8(ts8 ts8Var, byte b) {
        this.a = b;
        this.b = ts8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ts8 ts8Var = this.b;
        switch (b) {
            case 0:
                ts8Var.t = true;
                ts8Var.A();
                break;
            default:
                ts8Var.A();
                break;
        }
    }
}
