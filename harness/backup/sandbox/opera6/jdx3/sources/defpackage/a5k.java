package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class a5k implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b5k b;

    public /* synthetic */ a5k(b5k b5kVar, byte b) {
        this.a = b;
        this.b = b5kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b5k b5kVar = this.b;
        switch (b) {
            case 0:
                b5kVar.b();
                break;
            default:
                b5kVar.c();
                break;
        }
    }
}
