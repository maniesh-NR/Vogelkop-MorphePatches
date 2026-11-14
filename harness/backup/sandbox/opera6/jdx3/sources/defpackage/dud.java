package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class dud implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ igi b;
    public final /* synthetic */ kze c;

    public /* synthetic */ dud(igi igiVar, kze kzeVar, byte b) {
        this.a = b;
        this.b = igiVar;
        this.c = kzeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kze kzeVar = this.c;
        igi igiVar = this.b;
        switch (b) {
            case 0:
                k6l k6lVar = (k6l) igiVar.b;
                igiVar.g = k6lVar.a(new q6l(new y0a(igiVar, (byte) 22), (byte) 0));
                igiVar.B0(k6lVar.o);
                if (((kze) igiVar.f) != null) {
                    kzeVar.k((t77) igiVar.e);
                    break;
                }
                break;
            default:
                ((k6l) igiVar.b).H((f6l) igiVar.g);
                if (((kze) igiVar.f) != null) {
                    kzeVar.p((t77) igiVar.e);
                    break;
                }
                break;
        }
    }
}
