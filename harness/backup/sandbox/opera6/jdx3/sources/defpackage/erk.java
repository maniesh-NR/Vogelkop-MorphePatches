package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class erk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrk b;

    public /* synthetic */ erk(mrk mrkVar, byte b) {
        this.a = b;
        this.b = mrkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mrk mrkVar = this.b;
        switch (b) {
            case 0:
                if (mrkVar.c()) {
                    c1f c1fVar = mrkVar.P;
                    if (c1fVar != null) {
                        ((jqk) c1fVar.f).a();
                    }
                    mrkVar.i(String.valueOf(mrkVar.H.a.getText()));
                }
                mrkVar.V = false;
                break;
            default:
                if (mrkVar.d()) {
                    mrkVar.G.n.m(true);
                    break;
                }
                break;
        }
    }
}
