package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hyc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iyc b;

    public /* synthetic */ hyc(iyc iycVar, byte b) {
        this.a = b;
        this.b = iycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iyc iycVar = this.b;
        switch (b) {
            case 0:
                iycVar.a();
                break;
            default:
                iycVar.b();
                break;
        }
    }
}
