package defpackage;

/* loaded from: classes.dex */
public final class rhb extends vhb {
    public uhb p;
    public boolean q;

    @Override // defpackage.vhb, defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        return this.p == uhb.a ? pfdVar.z(i) : pfdVar.c(i);
    }

    @Override // defpackage.vhb
    public final long T0(pfd pfdVar, long j) {
        int iZ = this.p == uhb.a ? pfdVar.z(yo5.h(j)) : pfdVar.c(yo5.h(j));
        if (iZ < 0) {
            iZ = 0;
        }
        if (iZ < 0) {
            c8b.a("height must be >= 0");
        }
        return ap5.h(0, Integer.MAX_VALUE, iZ, iZ);
    }

    @Override // defpackage.vhb
    public final boolean U0() {
        return this.q;
    }

    @Override // defpackage.vhb, defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        return this.p == uhb.a ? pfdVar.z(i) : pfdVar.c(i);
    }
}
