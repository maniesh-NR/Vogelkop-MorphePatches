package defpackage;

/* loaded from: classes.dex */
public final class u33 extends gaa {
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            uo5 uo5Var = this.p0[i4];
            if ((this.s0 || uo5Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !uo5Var.x()) || (((i3 = this.r0) == 2 || i3 == 3) && !uo5Var.y()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.q0; i5++) {
            uo5 uo5Var2 = this.p0[i5];
            if (this.s0 || uo5Var2.c()) {
                if (!z2) {
                    int i6 = this.r0;
                    if (i6 == 0) {
                        iMax = uo5Var2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = uo5Var2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = uo5Var2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = uo5Var2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.r0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, uo5Var2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, uo5Var2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, uo5Var2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, uo5Var2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.t0;
        int i9 = this.r0;
        if (i9 == 0 || i9 == 1) {
            E(i8, i8);
        } else {
            F(i8, i8);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.uo5
    public final void b(jfc jfcVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        eo5[] eo5VarArr = this.P;
        eo5 eo5Var = this.H;
        eo5VarArr[0] = eo5Var;
        int i3 = 2;
        eo5 eo5Var2 = this.I;
        eo5VarArr[2] = eo5Var2;
        eo5 eo5Var3 = this.J;
        eo5VarArr[1] = eo5Var3;
        eo5 eo5Var4 = this.K;
        eo5VarArr[3] = eo5Var4;
        for (eo5 eo5Var5 : eo5VarArr) {
            eo5Var5.i = jfcVar.k(eo5Var5);
        }
        int i4 = this.r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        eo5 eo5Var6 = eo5VarArr[i4];
        if (!this.u0) {
            O();
        }
        if (this.u0) {
            this.u0 = false;
            int i5 = this.r0;
            if (i5 == 0 || i5 == 1) {
                jfcVar.d(eo5Var.i, this.X);
                jfcVar.d(eo5Var3.i, this.X);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    jfcVar.d(eo5Var2.i, this.Y);
                    jfcVar.d(eo5Var4.i, this.Y);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.q0; i6++) {
            uo5 uo5Var = this.p0[i6];
            if ((this.s0 || uo5Var.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && uo5Var.o0[0] == 3 && uo5Var.H.f != null && uo5Var.J.f != null) || ((i2 == 2 || i2 == 3) && uo5Var.o0[1] == 3 && uo5Var.I.f != null && uo5Var.K.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = eo5Var.g() || eo5Var3.g();
        boolean z4 = eo5Var2.g() || eo5Var4.g();
        int i7 = !(!z2 && (((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.q0) {
            uo5 uo5Var2 = this.p0[i8];
            if (this.s0 || uo5Var2.c()) {
                pvj pvjVarK = jfcVar.k(uo5Var2.P[this.r0]);
                eo5[] eo5VarArr2 = uo5Var2.P;
                int i9 = this.r0;
                eo5 eo5Var7 = eo5VarArr2[i9];
                eo5Var7.i = pvjVarK;
                eo5 eo5Var8 = eo5Var7.f;
                int i10 = (eo5Var8 == null || eo5Var8.d != this) ? 0 : eo5Var7.g;
                if (i9 == 0 || i9 == i3) {
                    pvj pvjVar = eo5Var6.i;
                    int i11 = this.t0 - i10;
                    s72 s72VarL = jfcVar.l();
                    pvj pvjVarM = jfcVar.m();
                    pvjVarM.d = 0;
                    s72VarL.c(pvjVar, pvjVarK, pvjVarM, i11);
                    jfcVar.c(s72VarL);
                } else {
                    pvj pvjVar2 = eo5Var6.i;
                    int i12 = this.t0 + i10;
                    s72 s72VarL2 = jfcVar.l();
                    pvj pvjVarM2 = jfcVar.m();
                    pvjVarM2.d = 0;
                    s72VarL2.b(pvjVar2, pvjVarK, pvjVarM2, i12);
                    jfcVar.c(s72VarL2);
                }
                jfcVar.e(eo5Var6.i, pvjVarK, this.t0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.r0;
        if (i13 == 0) {
            jfcVar.e(eo5Var3.i, eo5Var.i, 0, 8);
            jfcVar.e(eo5Var.i, this.S.J.i, 0, 4);
            jfcVar.e(eo5Var.i, this.S.H.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            jfcVar.e(eo5Var.i, eo5Var3.i, 0, 8);
            jfcVar.e(eo5Var.i, this.S.H.i, 0, 4);
            jfcVar.e(eo5Var.i, this.S.J.i, 0, 0);
        } else if (i13 == 2) {
            jfcVar.e(eo5Var4.i, eo5Var2.i, 0, 8);
            jfcVar.e(eo5Var2.i, this.S.K.i, 0, 4);
            jfcVar.e(eo5Var2.i, this.S.I.i, 0, 0);
        } else if (i13 == 3) {
            jfcVar.e(eo5Var2.i, eo5Var4.i, 0, 8);
            jfcVar.e(eo5Var2.i, this.S.I.i, 0, 4);
            jfcVar.e(eo5Var2.i, this.S.K.i, 0, 0);
        }
    }

    @Override // defpackage.uo5
    public final boolean c() {
        return true;
    }

    @Override // defpackage.uo5
    public final String toString() {
        String strL = z1m.l(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            uo5 uo5Var = this.p0[i];
            if (i > 0) {
                strL = strL.concat(", ");
            }
            strL = strL + uo5Var.g0;
        }
        return strL.concat("}");
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
