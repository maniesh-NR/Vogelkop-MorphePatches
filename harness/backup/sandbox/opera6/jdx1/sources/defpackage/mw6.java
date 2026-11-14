package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mw6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ buk b;

    public /* synthetic */ mw6(buk bukVar, byte b) {
        this.a = b;
        this.b = bukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        buk bukVar = this.b;
        switch (b) {
            case 0:
                bukVar.c();
                break;
            default:
                bukVar.h.cancel(true);
                break;
        }
    }
}
