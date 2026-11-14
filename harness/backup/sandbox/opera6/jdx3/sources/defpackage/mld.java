package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mld implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nld b;

    public /* synthetic */ mld(nld nldVar, byte b) {
        this.a = b;
        this.b = nldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nld nldVar = this.b;
        switch (b) {
            case 0:
                nldVar.a();
                break;
            default:
                nldVar.b();
                break;
        }
    }
}
