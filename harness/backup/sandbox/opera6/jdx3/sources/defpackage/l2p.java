package defpackage;

/* loaded from: classes.dex */
public final class l2p implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m2p b;

    public /* synthetic */ l2p(m2p m2pVar, byte b) {
        this.a = b;
        this.b = m2pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m2p m2pVar = this.b;
        switch (b) {
            case 0:
                f2p f2pVar = m2pVar.a;
                if (!f2pVar.a) {
                    f2pVar.destroy();
                    break;
                }
                break;
            default:
                m2pVar.a.d();
                break;
        }
    }
}
