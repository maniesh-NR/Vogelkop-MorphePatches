package defpackage;

/* loaded from: classes.dex */
public final class yhb extends vhb {
    public uhb p;
    public boolean q;

    @Override // defpackage.vhb, defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        return this.p == uhb.a ? pfdVar.E(i) : pfdVar.J(i);
    }

    @Override // defpackage.vhb
    public final long T0(pfd pfdVar, long j) {
        int iE = this.p == uhb.a ? pfdVar.E(yo5.g(j)) : pfdVar.J(yo5.g(j));
        if (iE < 0) {
            iE = 0;
        }
        if (iE < 0) {
            c8b.a("width must be >= 0");
        }
        return ap5.h(iE, iE, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.vhb
    public final boolean U0() {
        return this.q;
    }

    @Override // defpackage.vhb, defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        return this.p == uhb.a ? pfdVar.E(i) : pfdVar.J(i);
    }
}
