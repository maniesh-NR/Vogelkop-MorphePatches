package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class opk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ js6 b;

    public /* synthetic */ opk(js6 js6Var, byte b) {
        this.a = b;
        this.b = js6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        js6 js6Var = this.b;
        switch (b) {
            case 0:
                cpk cpkVar = (cpk) js6Var.c;
                cpkVar.b.run(new zzh(js6Var, (byte) 16));
                break;
            case 1:
                if (!js6Var.b) {
                    js6Var.b = true;
                    vml.c((opk) js6Var.j);
                    break;
                }
                break;
            default:
                js6Var.a();
                break;
        }
    }
}
