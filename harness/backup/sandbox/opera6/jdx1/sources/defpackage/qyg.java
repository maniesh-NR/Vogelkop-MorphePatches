package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qyg extends s72 {
    public pvj[] f;
    public pvj[] g;
    public int h;
    public pad i;

    @Override // defpackage.s72
    public final pvj d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            pvj[] pvjVarArr = this.f;
            pvj pvjVar = pvjVarArr[i2];
            if (!zArr[pvjVar.b]) {
                pad padVar = this.i;
                padVar.b = pvjVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((pvj) padVar.b).h[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                } else {
                    pvj pvjVar2 = pvjVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = pvjVar2.h[i3];
                            float f3 = ((pvj) padVar.b).h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.s72
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.s72
    public final void i(jfc jfcVar, s72 s72Var, boolean z) {
        pvj pvjVar = s72Var.a;
        if (pvjVar == null) {
            return;
        }
        float[] fArr = pvjVar.h;
        j72 j72Var = s72Var.d;
        int iD = j72Var.d();
        for (int i = 0; i < iD; i++) {
            pvj pvjVarE = j72Var.e(i);
            float f = j72Var.f(i);
            pad padVar = this.i;
            padVar.b = pvjVarE;
            if (pvjVarE.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((pvj) padVar.b).h;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((pvj) padVar.b).h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((qyg) padVar.c).k((pvj) padVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((pvj) padVar.b).h[i3] = f4;
                    } else {
                        ((pvj) padVar.b).h[i3] = 0.0f;
                    }
                }
                j(pvjVarE);
            }
            this.b = (s72Var.b * f) + this.b;
        }
        k(pvjVar);
    }

    public final void j(pvj pvjVar) {
        int i;
        pvj[] pvjVarArr;
        int i2 = this.h + 1;
        pvj[] pvjVarArr2 = this.f;
        if (i2 > pvjVarArr2.length) {
            pvj[] pvjVarArr3 = (pvj[]) Arrays.copyOf(pvjVarArr2, pvjVarArr2.length << 1);
            this.f = pvjVarArr3;
            this.g = (pvj[]) Arrays.copyOf(pvjVarArr3, pvjVarArr3.length << 1);
        }
        pvj[] pvjVarArr4 = this.f;
        int i3 = this.h;
        pvjVarArr4[i3] = pvjVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && pvjVarArr4[i3].b > pvjVar.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                pvjVarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                pvjVarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(pvjVarArr, 0, i, new au9((byte) 12));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        pvjVar.a = true;
        pvjVar.a(this);
    }

    public final void k(pvj pvjVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == pvjVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        pvjVar.a = false;
                        return;
                    } else {
                        pvj[] pvjVarArr = this.f;
                        int i3 = i + 1;
                        pvjVarArr[i] = pvjVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.s72
    public final String toString() {
        pad padVar = this.i;
        String strN = am2.n(new StringBuilder(" goal -> ("), this.b, ") : ");
        for (int i = 0; i < this.h; i++) {
            padVar.b = this.f[i];
            strN = strN + padVar + " ";
        }
        return strN;
    }
}
