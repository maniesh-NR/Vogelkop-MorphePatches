package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class oc3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pc3 b;

    public /* synthetic */ oc3(pc3 pc3Var, byte b) {
        this.a = b;
        this.b = pc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pc3 pc3Var = this.b;
        switch (b) {
            case 0:
                t8.Q(t8.a, pc3Var.c, pc3Var.b);
                break;
            default:
                t8.a.unregisterReceiver(pc3Var.c);
                break;
        }
    }
}
