package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class uyd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wyd b;

    public /* synthetic */ uyd(wyd wydVar, byte b) {
        this.a = b;
        this.b = wydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wyd wydVar = this.b;
        switch (b) {
            case 0:
                wydVar.c.f(new tyd(wydVar, (byte) 0));
                break;
            default:
                wydVar.cancel();
                break;
        }
    }
}
