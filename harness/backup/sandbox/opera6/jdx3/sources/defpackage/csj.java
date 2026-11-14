package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class csj implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fsj b;

    public /* synthetic */ csj(fsj fsjVar, byte b) {
        this.a = b;
        this.b = fsjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fsj fsjVar = this.b;
        switch (b) {
            case 0:
                fsjVar.b();
                break;
            default:
                fsjVar.b();
                break;
        }
    }
}
