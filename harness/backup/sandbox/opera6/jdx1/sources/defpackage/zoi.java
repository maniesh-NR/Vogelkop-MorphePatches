package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zoi extends i17 implements hi5, j7f {
    public w51 A;
    public v51 B;
    public boolean C;
    public kpi q;
    public fsf r;
    public boolean s;
    public h89 t;
    public lde u;
    public xs3 v;
    public boolean w;
    public v51 x;
    public jpi y;
    public f17 z;

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    public final void J() throws pxb {
        w51 w51Var = (w51) z4o.N(this, bvf.a);
        if (Intrinsics.a(w51Var, this.A)) {
            return;
        }
        this.A = w51Var;
        this.B = null;
        f17 f17Var = this.z;
        if (f17Var != null) {
            U0(f17Var);
        }
        this.z = null;
        W0();
        jpi jpiVar = this.y;
        if (jpiVar != null) {
            kpi kpiVar = this.q;
            fsf fsfVar = this.r;
            v51 v51Var = this.w ? this.B : this.x;
            jpiVar.o1(v51Var, this.v, this.t, this.u, fsfVar, kpiVar, this.s, this.C);
        }
    }

    @Override // defpackage.b8e
    public final void L0() throws pxb {
        this.C = X0();
        W0();
        if (this.y == null) {
            kpi kpiVar = this.q;
            v51 v51Var = this.w ? this.B : this.x;
            jpi jpiVar = new jpi(v51Var, this.v, this.t, this.u, this.r, kpiVar, this.s, this.C);
            T0(jpiVar);
            this.y = jpiVar;
        }
    }

    @Override // defpackage.b8e
    public final void M0() throws pxb {
        f17 f17Var = this.z;
        if (f17Var != null) {
            U0(f17Var);
        }
    }

    public final void W0() throws pxb {
        f17 f17Var = this.z;
        if (f17Var != null) {
            if (((b8e) f17Var).a.n) {
                return;
            }
            T0(f17Var);
            return;
        }
        if (this.w) {
            x7d.y(this, new j3i(this, (byte) 10));
        }
        v51 v51Var = this.w ? this.B : this.x;
        if (v51Var != null) {
            i17 i17Var = v51Var.i;
            if (i17Var.a.n) {
                return;
            }
            T0(i17Var);
            this.z = i17Var;
        }
    }

    public final boolean X0() {
        d2c d2cVar = d2c.a;
        if (this.n) {
            d2cVar = ui6.e0(this).z;
        }
        return d2cVar != d2c.b || this.r == fsf.a;
    }

    public final void Y0(v51 v51Var, xs3 xs3Var, h89 h89Var, lde ldeVar, fsf fsfVar, kpi kpiVar, boolean z, boolean z2) throws pxb {
        boolean z3;
        this.q = kpiVar;
        this.r = fsfVar;
        boolean z4 = true;
        if (this.w != z) {
            this.w = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (Intrinsics.a(this.x, v51Var)) {
            z4 = false;
        } else {
            this.x = v51Var;
        }
        if (z3 || (z4 && !z)) {
            f17 f17Var = this.z;
            if (f17Var != null) {
                U0(f17Var);
            }
            this.z = null;
            W0();
        }
        this.s = z2;
        this.t = h89Var;
        this.u = ldeVar;
        this.v = xs3Var;
        boolean zX0 = X0();
        this.C = zX0;
        jpi jpiVar = this.y;
        if (jpiVar != null) {
            jpiVar.o1(this.w ? this.B : this.x, xs3Var, h89Var, ldeVar, fsfVar, kpiVar, z2, zX0);
        }
    }

    @Override // defpackage.f17
    public final void z() throws pxb {
        boolean zX0 = X0();
        if (this.C != zX0) {
            this.C = zX0;
            kpi kpiVar = this.q;
            fsf fsfVar = this.r;
            boolean z = this.w;
            v51 v51Var = z ? this.B : this.x;
            Y0(v51Var, this.v, this.t, this.u, fsfVar, kpiVar, z, this.s);
        }
    }
}
