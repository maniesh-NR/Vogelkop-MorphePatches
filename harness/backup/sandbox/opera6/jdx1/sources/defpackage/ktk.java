package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ktk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ntk b;

    public /* synthetic */ ktk(ntk ntkVar, byte b) {
        this.a = b;
        this.b = ntkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ntk ntkVar = this.b;
        switch (b) {
            case 0:
                ((g7a) x7d.l()).execute(new ktk(ntkVar, (byte) 1));
                break;
            default:
                if (!ntkVar.n) {
                    ntkVar.e();
                    break;
                }
                break;
        }
    }
}
