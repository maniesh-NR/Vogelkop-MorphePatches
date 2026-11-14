package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hs6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ js6 b;

    public /* synthetic */ hs6(js6 js6Var, byte b) {
        this.a = b;
        this.b = js6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        js6 js6Var = this.b;
        switch (b) {
            case 0:
                ((xoc) js6Var.g).a(tg0.e);
                break;
            default:
                ((xoc) js6Var.g).a(tg0.b);
                break;
        }
    }
}
