package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class q53 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i7d b;

    public /* synthetic */ q53(i7d i7dVar, byte b) {
        this.a = b;
        this.b = i7dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i7d i7dVar = this.b;
        switch (b) {
            case 0:
                i7dVar.g0();
                break;
            case 1:
                i7dVar.r0();
                break;
            default:
                i7dVar.p0();
                break;
        }
    }
}
