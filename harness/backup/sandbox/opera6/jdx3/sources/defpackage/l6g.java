package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class l6g implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m6g b;

    public /* synthetic */ l6g(m6g m6gVar, byte b) {
        this.a = b;
        this.b = m6gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m6g m6gVar = this.b;
        switch (b) {
            case 0:
                m6gVar.g();
                break;
            case 1:
                m6gVar.g();
                break;
            default:
                m6gVar.g();
                break;
        }
    }
}
