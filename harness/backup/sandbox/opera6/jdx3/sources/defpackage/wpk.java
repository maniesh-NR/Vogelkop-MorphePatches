package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wpk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hqk b;

    public /* synthetic */ wpk(hqk hqkVar, byte b) {
        this.a = b;
        this.b = hqkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hqk hqkVar = this.b;
        switch (b) {
            case 0:
                hqkVar.I(null, 9, xpk.i);
                break;
            default:
                hqkVar.H(null, true);
                break;
        }
    }
}
