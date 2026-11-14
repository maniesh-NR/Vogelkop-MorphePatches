package defpackage;

/* loaded from: classes.dex */
public final class nxb extends n1 {
    public final hzc c;

    /* JADX WARN: Illegal instructions before constructor call */
    public nxb() {
        tbc tbcVar = tbc.b;
        gzc gzcVar = hzc.c;
        super(tbcVar, (byte) 14);
        this.c = gzcVar;
    }

    public final void Z(tbc tbcVar, String str) {
        eaj eajVar;
        int iOrdinal = tbcVar.ordinal();
        if (iOrdinal == 0) {
            eajVar = eaj.b;
        } else if (iOrdinal == 1) {
            eajVar = eaj.c;
        } else if (iOrdinal == 2) {
            eajVar = eaj.d;
        } else if (iOrdinal == 3) {
            eajVar = eaj.e;
        } else {
            if (iOrdinal != 4) {
                h9o.p();
                return;
            }
            eajVar = eaj.f;
        }
        hzc hzcVar = this.c;
        if (hzcVar.a.a.compareTo(eajVar) <= 0) {
            hzcVar.b(eajVar, "Koin", str, null);
        }
    }
}
