package defpackage;

/* loaded from: classes.dex */
public final class pnm extends b8e implements e3c {
    public float o;
    public float p;

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        int iC = pfdVar.c(i);
        int iM = !Float.isNaN(this.p) ? o1dVar.M(this.p) : 0;
        return iC < iM ? iM : iC;
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        int iE = pfdVar.E(i);
        int iM = !Float.isNaN(this.o) ? o1dVar.M(this.o) : 0;
        return iE < iM ? iM : iE;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.o) || yo5.j(j) != 0) {
            iJ = yo5.j(j);
        } else {
            int iM = vfdVar.M(this.o);
            iJ = yo5.h(j);
            if (iM < 0) {
                iM = 0;
            }
            if (iM <= iJ) {
                iJ = iM;
            }
        }
        int iH = yo5.h(j);
        if (Float.isNaN(this.p) || yo5.i(j) != 0) {
            i = yo5.i(j);
        } else {
            int iM2 = vfdVar.M(this.p);
            i = yo5.g(j);
            int i2 = iM2 >= 0 ? iM2 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        ifg ifgVarN = pfdVar.N(ap5.a(iJ, iH, i, yo5.g(j)));
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 18));
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        int iJ = pfdVar.J(i);
        int iM = !Float.isNaN(this.o) ? o1dVar.M(this.o) : 0;
        return iJ < iM ? iM : iJ;
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        int iZ = pfdVar.z(i);
        int iM = !Float.isNaN(this.p) ? o1dVar.M(this.p) : 0;
        return iZ < iM ? iM : iZ;
    }
}
