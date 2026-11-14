package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ am7 b;
    public final /* synthetic */ bm7 c;

    public /* synthetic */ yl7(am7 am7Var, bm7 bm7Var, byte b) {
        this.a = b;
        this.b = am7Var;
        this.c = bm7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bm7 bm7Var = this.c;
        am7 am7Var = this.b;
        switch (b) {
            case 0:
                bm7Var.L(am7Var.a, am7Var.b);
                break;
            default:
                bm7Var.k(am7Var.a, am7Var.b);
                break;
        }
    }
}
