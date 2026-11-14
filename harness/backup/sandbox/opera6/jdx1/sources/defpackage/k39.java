package defpackage;

/* loaded from: classes.dex */
public final class k39 extends b8e implements e3c {
    public p97 o;
    public float p;

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!yo5.d(j) || this.o == p97.a) {
            iJ = yo5.j(j);
            iH = yo5.h(j);
        } else {
            int iRound = Math.round(yo5.h(j) * this.p);
            int iJ2 = yo5.j(j);
            iJ = yo5.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!yo5.c(j) || this.o == p97.b) {
            int i2 = yo5.i(j);
            int iG2 = yo5.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(yo5.g(j) * this.p);
            int i3 = yo5.i(j);
            iG = yo5.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        ifg ifgVarN = pfdVar.N(ap5.a(iJ, iH, iG, i));
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 5));
    }
}
