package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class us2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bt2 b;

    public /* synthetic */ us2(bt2 bt2Var, byte b) {
        this.a = b;
        this.b = bt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bt2 bt2Var = this.b;
        switch (b) {
            case 0:
                xs2 xs2Var = bt2Var.f;
                us2 us2Var = new us2(bt2Var, (byte) 1);
                if (!xs2Var.d) {
                    us2Var.run();
                    break;
                } else {
                    xs2Var.g = us2Var;
                    break;
                }
            default:
                if (bt2Var.h != null) {
                    bt2Var.b.removeAllViews();
                    bt2Var.h = null;
                    nak nakVar = bt2Var.c;
                    Boolean bool = Boolean.FALSE;
                    nakVar.getClass();
                    nakVar.k((Object) null, bool);
                    break;
                }
                break;
        }
    }
}
