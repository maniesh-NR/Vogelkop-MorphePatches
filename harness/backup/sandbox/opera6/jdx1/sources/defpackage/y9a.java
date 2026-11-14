package defpackage;

/* loaded from: classes.dex */
public final class y9a extends b8e implements hi5, e3c, j7f {
    public ikl o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public ikl u;
    public sam v;

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        U0(o1dVar);
        int i2 = this.s;
        int i3 = this.t;
        if (i2 == i3) {
            return i3;
        }
        int iC = pfdVar.c(i);
        int i4 = this.s;
        int i5 = this.t;
        if (iC < i4) {
            iC = i4;
        }
        return iC > i5 ? i5 : iC;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    public final void J() {
        if (this.v != null) {
            x7d.y(this, new x9a(this, (byte) 1));
        }
        this.r = true;
        nb6.F(this);
    }

    @Override // defpackage.b8e
    public final void L0() {
        mh9 mh9Var = (mh9) z4o.N(this, mi5.k);
        this.u = xgh.v(this.o, ui6.e0(this).z);
        lh9 lh9Var = V0().a.f;
        ki9 ki9Var = V0().a.c;
        if (ki9Var == null) {
            ki9Var = ki9.e;
        }
        gi9 gi9Var = V0().a.d;
        int i = gi9Var != null ? gi9Var.a : 0;
        hi9 hi9Var = V0().a.e;
        this.v = mh9Var.b(lh9Var, ki9Var, i, hi9Var != null ? hi9Var.a : 65535);
        x7d.y(this, new x9a(this, (byte) 0));
        this.r = true;
    }

    @Override // defpackage.b8e
    public final void M0() {
        this.u = null;
        this.v = null;
        this.r = false;
    }

    public final void T0(vfd vfdVar, ikl iklVar, mh9 mh9Var) {
        ljl ljlVar = wgl.b(iklVar, vfdVar, mh9Var, 3, true).d;
        float fH = ljlVar.h(0);
        float fH2 = ljlVar.h(1);
        float fH3 = ljlVar.h(2);
        this.s = sfe.G(fH, fH2, fH3, this.p ? 1 : 0, 1);
        this.t = sfe.G(fH, fH2, fH3, this.q, Integer.MAX_VALUE);
    }

    public final void U0(o1d o1dVar) {
        if (this.r) {
            T0(o1dVar, V0(), (mh9) z4o.N(this, mi5.k));
            this.r = false;
        }
        int i = this.s;
        this.s = i >= 0 ? i : 0;
        int i2 = this.t;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.t = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final ikl V0() throws pxb {
        ikl iklVar = this.u;
        if (iklVar != null) {
            return iklVar;
        }
        throw o18.k("Resolved style is not set.");
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        if (this.r) {
            T0(vfdVar, V0(), (mh9) z4o.N(this, mi5.k));
            this.r = false;
        }
        int i = this.s;
        int iC = i != -1 ? djh.c(i, yo5.i(j), yo5.g(j)) : yo5.i(j);
        int i2 = this.t;
        ifg ifgVarN = pfdVar.N(yo5.a(0, 0, iC, i2 != -1 ? djh.c(i2, yo5.i(j), yo5.g(j)) : yo5.g(j), 3, j));
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 6));
    }

    @Override // defpackage.f17, defpackage.omg
    public final void d() {
        this.r = true;
        nb6.F(this);
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        U0(o1dVar);
        int i2 = this.s;
        if (i2 == this.t) {
            return i2;
        }
        int iZ = pfdVar.z(i);
        int i3 = this.s;
        int i4 = this.t;
        if (iZ < i3) {
            iZ = i3;
        }
        return iZ > i4 ? i4 : iZ;
    }

    @Override // defpackage.f17
    public final void z() {
        this.u = xgh.v(this.o, ui6.e0(this).z);
        this.r = true;
        nb6.F(this);
    }
}
