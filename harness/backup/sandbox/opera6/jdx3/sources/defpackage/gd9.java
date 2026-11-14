package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gd9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jd9 b;

    public /* synthetic */ gd9(jd9 jd9Var, byte b) {
        this.a = b;
        this.b = jd9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jd9 jd9Var = this.b;
        switch (b) {
            case 0:
                if (jd9Var.i0()) {
                    jd9Var.y0();
                    jd9Var.z0();
                    break;
                }
                break;
            default:
                jd9Var.n = true;
                jd9Var.z0();
                break;
        }
    }
}
