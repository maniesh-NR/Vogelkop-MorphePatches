package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class aji implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ iji b;

    public /* synthetic */ aji(iji ijiVar) {
        this.b = ijiVar;
    }

    public /* synthetic */ aji(iji ijiVar, wjh wjhVar) {
        this.b = ijiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iji ijiVar = this.b;
        switch (b) {
            case 0:
                ijiVar.e(false);
                break;
            default:
                ijiVar.u();
                break;
        }
    }
}
