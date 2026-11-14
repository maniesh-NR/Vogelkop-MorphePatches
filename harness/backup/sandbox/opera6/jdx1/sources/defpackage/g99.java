package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g99 extends gaa {
    public cb3 A0;
    public n5h B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public uo5[] W0;
    public uo5[] X0;
    public int[] Y0;
    public uo5[] Z0;
    public int a1;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;

    @Override // defpackage.gaa
    public final void N() {
        for (int i = 0; i < this.q0; i++) {
            uo5 uo5Var = this.p0[i];
            if (uo5Var != null) {
                uo5Var.E = true;
            }
        }
    }

    public final int O(uo5 uo5Var, int i) {
        uo5 uo5Var2;
        if (uo5Var != null) {
            int[] iArr = uo5Var.o0;
            if (iArr[1] == 3) {
                int i2 = uo5Var.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (uo5Var.y * i);
                        if (i3 != uo5Var.k()) {
                            uo5Var.g = true;
                            Q(iArr[0], uo5Var.n(), 1, i3, uo5Var);
                        }
                        return i3;
                    }
                    uo5Var2 = uo5Var;
                    if (i2 == 1) {
                        return uo5Var2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((uo5Var2.n() * uo5Var2.V) + 0.5f);
                    }
                }
            } else {
                uo5Var2 = uo5Var;
            }
            return uo5Var2.k();
        }
        return 0;
    }

    public final int P(uo5 uo5Var, int i) {
        uo5 uo5Var2;
        if (uo5Var != null) {
            int[] iArr = uo5Var.o0;
            if (iArr[0] == 3) {
                int i2 = uo5Var.q;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (uo5Var.v * i);
                        if (i3 != uo5Var.n()) {
                            uo5Var.g = true;
                            Q(1, i3, iArr[1], uo5Var.k(), uo5Var);
                        }
                        return i3;
                    }
                    uo5Var2 = uo5Var;
                    if (i2 == 1) {
                        return uo5Var2.n();
                    }
                    if (i2 == 3) {
                        return (int) ((uo5Var2.k() * uo5Var2.V) + 0.5f);
                    }
                }
            } else {
                uo5Var2 = uo5Var;
            }
            return uo5Var2.n();
        }
        return 0;
    }

    public final void Q(int i, int i2, int i3, int i4, uo5 uo5Var) {
        n5h n5hVar;
        vo5 vo5Var;
        cb3 cb3Var = this.A0;
        while (true) {
            n5hVar = this.B0;
            if (n5hVar != null || (vo5Var = this.S) == null) {
                break;
            } else {
                this.B0 = vo5Var.t0;
            }
        }
        cb3Var.a = i;
        cb3Var.b = i3;
        cb3Var.c = i2;
        cb3Var.d = i4;
        n5hVar.d(uo5Var, cb3Var);
        uo5Var.J(cb3Var.e);
        uo5Var.G(cb3Var.f);
        uo5Var.D = cb3Var.h;
        uo5Var.D(cb3Var.g);
    }

    @Override // defpackage.uo5
    public final void b(jfc jfcVar, boolean z) {
        uo5 uo5Var;
        float f;
        int i;
        ArrayList arrayList = this.V0;
        super.b(jfcVar, z);
        vo5 vo5Var = this.S;
        boolean z2 = vo5Var != null && vo5Var.u0;
        int i2 = this.S0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((e99) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((e99) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i5 = 0; i5 < this.a1; i5++) {
                    this.Z0[i5].A();
                }
                int[] iArr = this.Y0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.I0;
                uo5 uo5Var2 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.I0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    uo5 uo5Var3 = this.X0[i];
                    if (uo5Var3 != null) {
                        eo5 eo5Var = uo5Var3.H;
                        if (uo5Var3.f0 != 8) {
                            if (i8 == 0) {
                                uo5Var3.f(eo5Var, this.H, this.v0);
                                uo5Var3.h0 = this.C0;
                                uo5Var3.c0 = f;
                            }
                            if (i8 == i6 - 1) {
                                uo5Var3.f(uo5Var3.J, this.J, this.w0);
                            }
                            if (i8 > 0 && uo5Var2 != null) {
                                eo5 eo5Var2 = uo5Var2.J;
                                uo5Var3.f(eo5Var, eo5Var2, this.O0);
                                uo5Var2.f(eo5Var2, eo5Var, 0);
                            }
                            uo5Var2 = uo5Var3;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    uo5 uo5Var4 = this.W0[i9];
                    if (uo5Var4 != null) {
                        eo5 eo5Var3 = uo5Var4.I;
                        if (uo5Var4.f0 != 8) {
                            if (i9 == 0) {
                                uo5Var4.f(eo5Var3, this.I, this.r0);
                                uo5Var4.i0 = this.D0;
                                uo5Var4.d0 = this.J0;
                            }
                            if (i9 == i7 - 1) {
                                uo5Var4.f(uo5Var4.K, this.K, this.s0);
                            }
                            if (i9 > 0 && uo5Var2 != null) {
                                eo5 eo5Var4 = uo5Var2.K;
                                uo5Var4.f(eo5Var3, eo5Var4, this.P0);
                                uo5Var2.f(eo5Var4, eo5Var3, 0);
                            }
                            uo5Var2 = uo5Var4;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.U0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        uo5[] uo5VarArr = this.Z0;
                        if (i12 < uo5VarArr.length && (uo5Var = uo5VarArr[i12]) != null && uo5Var.f0 != 8) {
                            uo5 uo5Var5 = this.X0[i10];
                            uo5 uo5Var6 = this.W0[i11];
                            if (uo5Var != uo5Var5) {
                                uo5Var.f(uo5Var.H, uo5Var5.H, 0);
                                uo5Var.f(uo5Var.J, uo5Var5.J, 0);
                            }
                            if (uo5Var != uo5Var6) {
                                uo5Var.f(uo5Var.I, uo5Var6.I, 0);
                                uo5Var.f(uo5Var.K, uo5Var6.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((e99) arrayList.get(0)).b(0, z2, true);
        }
        this.x0 = false;
    }
}
