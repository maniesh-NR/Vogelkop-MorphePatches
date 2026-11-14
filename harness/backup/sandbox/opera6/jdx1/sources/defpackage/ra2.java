package defpackage;

/* loaded from: classes.dex */
public final class ra2 extends b8e implements e3c {
    public float o;

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : pfdVar.c(i);
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : pfdVar.E(i);
    }

    public final long T0(long j, boolean z) {
        int iRound;
        int iG = yo5.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.o)) <= 0) {
            return 0L;
        }
        if (!z || w7d.H(iRound, iG, j)) {
            return (iRound << 32) | (iG & 4294967295L);
        }
        return 0L;
    }

    public final long U0(long j, boolean z) {
        int iRound;
        int iH = yo5.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.o)) <= 0) {
            return 0L;
        }
        if (!z || w7d.H(iH, iRound, j)) {
            return (iH << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }

    public final long V0(long j, boolean z) {
        int i = yo5.i(j);
        int iRound = Math.round(i * this.o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || w7d.H(iRound, i, j)) {
            return (iRound << 32) | (i & 4294967295L);
        }
        return 0L;
    }

    public final long W0(long j, boolean z) {
        int iJ = yo5.j(j);
        int iRound = Math.round(iJ / this.o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || w7d.H(iJ, iRound, j)) {
            return (iJ << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        long jU0 = U0(j, true);
        if (gcb.a(jU0, 0L)) {
            jU0 = T0(j, true);
            if (gcb.a(jU0, 0L)) {
                jU0 = W0(j, true);
                if (gcb.a(jU0, 0L)) {
                    jU0 = V0(j, true);
                    if (gcb.a(jU0, 0L)) {
                        jU0 = U0(j, false);
                        if (gcb.a(jU0, 0L)) {
                            jU0 = T0(j, false);
                            if (gcb.a(jU0, 0L)) {
                                jU0 = W0(j, false);
                                if (gcb.a(jU0, 0L)) {
                                    jU0 = V0(j, false);
                                    if (gcb.a(jU0, 0L)) {
                                        jU0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!gcb.a(jU0, 0L)) {
            int i = (int) (jU0 >> 32);
            int i2 = (int) (jU0 & 4294967295L);
            if (!((i >= 0) & (i2 >= 0))) {
                c8b.a("width and height must be >= 0");
            }
            j = ap5.h(i, i, i2, i2);
        }
        ifg ifgVarN = pfdVar.N(j);
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 2));
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : pfdVar.J(i);
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : pfdVar.z(i);
    }
}
