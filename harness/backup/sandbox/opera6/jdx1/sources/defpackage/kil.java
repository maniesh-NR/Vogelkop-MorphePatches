package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kil extends b8e implements hi5, e3c {
    public final ikl o;
    public sam p;
    public ukj q;

    public kil(ikl iklVar) {
        this.o = iklVar;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    @Override // defpackage.b8e
    public final void L0() throws pxb {
        ikl iklVarV = xgh.v(this.o, ui6.e0(this).z);
        mh9 mh9Var = (mh9) z4o.N(this, mi5.k);
        T0(iklVarV, mh9Var);
        d2c d2cVar = ui6.e0(this).z;
        n27 n27Var = ui6.e0(this).y;
        sam samVar = this.p;
        if (samVar == null) {
            throw o18.k("Font resolution state is not set.");
        }
        this.q = new ukj(d2cVar, n27Var, mh9Var, iklVarV, samVar.getValue());
    }

    @Override // defpackage.b8e
    public final void M0() {
        this.p = null;
        this.q = null;
    }

    public final void T0(ikl iklVar, mh9 mh9Var) {
        rwj rwjVar = iklVar.a;
        lh9 lh9Var = rwjVar.f;
        ki9 ki9Var = rwjVar.c;
        if (ki9Var == null) {
            ki9Var = ki9.e;
        }
        gi9 gi9Var = rwjVar.d;
        int i = gi9Var != null ? gi9Var.a : 0;
        hi9 hi9Var = rwjVar.e;
        this.p = mh9Var.b(lh9Var, ki9Var, i, hi9Var != null ? hi9Var.a : 65535);
        nb6.F(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) throws pxb {
        ukj ukjVar = this.q;
        if (ukjVar == null) {
            throw o18.k("Min size state is not set.");
        }
        t0g t0gVar = (t0g) ukjVar.g;
        sam samVar = this.p;
        if (samVar == null) {
            throw o18.k("Font resolution state is not set.");
        }
        Object value = samVar.getValue();
        if (!Intrinsics.a(value, ukjVar.f)) {
            ukjVar.f = value;
            t0gVar.setValue(Boolean.TRUE);
        }
        if (((Boolean) t0gVar.getValue()).booleanValue()) {
            ukjVar.a = wgl.a((ikl) ukjVar.e, (n27) ukjVar.c, (mh9) ukjVar.d);
            t0gVar.setValue(Boolean.FALSE);
        }
        long j2 = ukjVar.a;
        ifg ifgVarN = pfdVar.N(ap5.e(j, ap5.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 16));
    }

    @Override // defpackage.f17, defpackage.omg
    public final void d() {
        ukj ukjVar = this.q;
        if (ukjVar != null) {
            ukj.a(ukjVar, (d2c) null, ui6.e0(this).y, (ikl) null, 29);
        }
        nb6.F(this);
    }

    @Override // defpackage.f17
    public final void z() {
        ukj ukjVar = this.q;
        if (ukjVar != null) {
            ukj.a(ukjVar, ui6.e0(this).z, (n27) null, (ikl) null, 30);
        }
        nb6.F(this);
    }
}
