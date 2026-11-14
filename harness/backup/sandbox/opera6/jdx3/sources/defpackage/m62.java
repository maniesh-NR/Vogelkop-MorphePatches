package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class m62 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s62 b;

    public /* synthetic */ m62(s62 s62Var, byte b) {
        this.a = b;
        this.b = s62Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s62 s62Var = this.b;
        switch (b) {
            case 0:
                s62Var.t.r(Boolean.TRUE);
                break;
            default:
                s62Var.a();
                break;
        }
    }
}
