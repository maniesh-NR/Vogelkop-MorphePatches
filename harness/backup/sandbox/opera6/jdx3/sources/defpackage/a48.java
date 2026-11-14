package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class a48 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d48 b;

    public /* synthetic */ a48(d48 d48Var, byte b) {
        this.a = b;
        this.b = d48Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d48 d48Var = this.b;
        switch (b) {
            case 0:
                d48Var.b();
                break;
            case 1:
                d48Var.h.invoke(new pn7(d48.l));
                break;
            default:
                d48Var.i.invoke();
                break;
        }
    }
}
