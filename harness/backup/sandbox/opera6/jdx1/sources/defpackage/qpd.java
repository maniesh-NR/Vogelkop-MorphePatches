package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qpd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aqd b;
    public final /* synthetic */ xkg c;

    public /* synthetic */ qpd(aqd aqdVar, xkg xkgVar, byte b) {
        this.a = b;
        this.b = aqdVar;
        this.c = xkgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xkg xkgVar = this.c;
        aqd aqdVar = this.b;
        switch (b) {
            case 0:
                aqdVar.j.T(aqdVar.R(xkgVar));
                break;
            default:
                aqdVar.j.T(aqdVar.R(xkgVar));
                aqdVar.h.Q(xkgVar.P().a(17) ? xkgVar.getCurrentTimeline() : gql.a);
                break;
        }
    }
}
