package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wvn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ewn b;

    public /* synthetic */ wvn(ewn ewnVar, byte b) {
        this.a = b;
        this.b = ewnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ewn ewnVar = this.b;
        switch (b) {
            case 0:
                ewnVar.c = null;
                ewnVar.g();
                break;
            default:
                ewnVar.g();
                break;
        }
    }
}
