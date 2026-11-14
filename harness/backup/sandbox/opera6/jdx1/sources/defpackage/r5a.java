package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r5a extends uo5 {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public eo5 s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public r5a() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // defpackage.uo5
    public final void L(jfc jfcVar, boolean z) {
        if (this.S == null) {
            return;
        }
        eo5 eo5Var = this.s0;
        jfcVar.getClass();
        int iN = jfc.n(eo5Var);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i) {
        this.s0.l(i);
        this.u0 = true;
    }

    public final void N(int i) {
        eo5 eo5Var;
        if (this.t0 != i) {
            this.t0 = i;
            ArrayList arrayList = this.Q;
            arrayList.clear();
            if (this.t0 == 1) {
                eo5Var = this.H;
                this.s0 = eo5Var;
            } else {
                eo5Var = this.I;
                this.s0 = eo5Var;
            }
            arrayList.add(eo5Var);
            eo5[] eo5VarArr = this.P;
            int length = eo5VarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                eo5VarArr[i2] = this.s0;
            }
        }
    }

    @Override // defpackage.uo5
    public final void b(jfc jfcVar, boolean z) {
        vo5 vo5Var = this.S;
        if (vo5Var != null) {
            Object objI = vo5Var.i(2);
            Object objI2 = vo5Var.i(4);
            vo5 vo5Var2 = this.S;
            boolean z2 = vo5Var2 != null && vo5Var2.o0[0] == 2;
            if (this.t0 == 0) {
                objI = vo5Var.i(3);
                objI2 = vo5Var.i(5);
                vo5 vo5Var3 = this.S;
                z2 = vo5Var3 != null && vo5Var3.o0[1] == 2;
            }
            if (this.u0) {
                eo5 eo5Var = this.s0;
                if (eo5Var.c) {
                    pvj pvjVarK = jfcVar.k(eo5Var);
                    jfcVar.d(pvjVarK, this.s0.d());
                    if (this.q0 != -1) {
                        if (z2) {
                            jfcVar.f(jfcVar.k(objI2), pvjVarK, 0, 5);
                        }
                    } else if (this.r0 != -1 && z2) {
                        pvj pvjVarK2 = jfcVar.k(objI2);
                        jfcVar.f(pvjVarK, jfcVar.k(objI), 0, 5);
                        jfcVar.f(pvjVarK2, pvjVarK, 0, 5);
                    }
                    this.u0 = false;
                    return;
                }
            }
            if (this.q0 != -1) {
                pvj pvjVarK3 = jfcVar.k(this.s0);
                jfcVar.e(pvjVarK3, jfcVar.k(objI), this.q0, 8);
                if (z2) {
                    jfcVar.f(jfcVar.k(objI2), pvjVarK3, 0, 5);
                    return;
                }
                return;
            }
            if (this.r0 != -1) {
                pvj pvjVarK4 = jfcVar.k(this.s0);
                pvj pvjVarK5 = jfcVar.k(objI2);
                jfcVar.e(pvjVarK4, pvjVarK5, -this.r0, 8);
                if (z2) {
                    jfcVar.f(pvjVarK4, jfcVar.k(objI), 0, 5);
                    jfcVar.f(pvjVarK5, pvjVarK4, 0, 5);
                    return;
                }
                return;
            }
            if (this.p0 != -1.0f) {
                pvj pvjVarK6 = jfcVar.k(this.s0);
                pvj pvjVarK7 = jfcVar.k(objI2);
                float f = this.p0;
                s72 s72VarL = jfcVar.l();
                s72VarL.d.g(pvjVarK6, -1.0f);
                s72VarL.d.g(pvjVarK7, f);
                jfcVar.c(s72VarL);
            }
        }
    }

    @Override // defpackage.uo5
    public final boolean c() {
        return true;
    }

    @Override // defpackage.uo5
    public final eo5 i(int i) {
        int iA = vep.A(i);
        if (iA != 1) {
            if (iA != 2) {
                if (iA != 3) {
                    if (iA != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
    }

    @Override // defpackage.uo5
    public final boolean x() {
        return this.u0;
    }

    @Override // defpackage.uo5
    public final boolean y() {
        return this.u0;
    }
}
