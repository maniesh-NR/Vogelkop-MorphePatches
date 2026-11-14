package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class k4m implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ala b;

    public /* synthetic */ k4m(ala alaVar, byte b) {
        this.a = b;
        this.b = alaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ala alaVar = this.b;
        switch (b) {
            case 0:
                alaVar.p(true);
                break;
            default:
                ((y0f) alaVar.e).c(rs0.f);
                r4m r4mVar = (r4m) alaVar.g;
                r4mVar.getClass();
                r4mVar.c0(new o4m(r4mVar, (byte) 1));
                break;
        }
    }
}
