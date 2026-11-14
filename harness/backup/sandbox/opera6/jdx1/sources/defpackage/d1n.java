package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d1n implements a1n {
    public final ide a;
    public final jde b;
    public final short c;
    public final n57 d;
    public int[] e = z0n.a;
    public float[] f;
    public if1 g;
    public if1 h;
    public if1 i;
    public if1 j;
    public float[] k;
    public float[] l;
    public zy9 m;

    /* JADX WARN: Multi-variable type inference failed */
    public d1n(ide ideVar, jde jdeVar, int i, n57 n57Var) {
        this.a = ideVar;
        this.b = jdeVar;
        this.c = i;
        this.d = n57Var;
        float[] fArr = z0n.b;
        this.f = fArr;
        this.k = fArr;
        this.l = fArr;
        this.m = z0n.c;
    }

    public final int a(int i) {
        int i2;
        ide ideVar = this.a;
        int i3 = ideVar.b;
        if (i3 <= 0) {
            zwg.u("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = ideVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        vq7 vq7Var;
        float f;
        ide ideVar = this.a;
        if (i >= ideVar.b - 1) {
            f = i2;
        } else {
            int iC = ideVar.c(i);
            int iC2 = ideVar.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                c1n c1nVar = (c1n) this.b.e(iC);
                if (c1nVar == null || (vq7Var = c1nVar.b) == null) {
                    vq7Var = this.d;
                }
                float f2 = i3;
                float fC = vq7Var.c((i2 - iC) / f2);
                return z ? fC : ((f2 * fC) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void e(if1 if1Var, if1 if1Var2, if1 if1Var3) {
        float[] fArr;
        boolean z = this.m != z0n.c;
        if1 if1Var4 = this.g;
        jde jdeVar = this.b;
        ide ideVar = this.a;
        if (if1Var4 == null) {
            this.g = if1Var.c();
            this.h = if1Var3.c();
            int i = ideVar.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = ideVar.c(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = ideVar.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.m != z0n.c && Intrinsics.a(this.i, if1Var) && Intrinsics.a(this.j, if1Var2)) {
                return;
            }
            this.i = if1Var;
            this.j = if1Var2;
            int iB = if1Var.b() + (if1Var.b() % 2);
            this.k = new float[iB];
            this.l = new float[iB];
            int i5 = ideVar.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = ideVar.c(i6);
                c1n c1nVar = (c1n) jdeVar.e(iC);
                if (iC == 0 && c1nVar == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = if1Var.a(i7);
                    }
                } else if (iC == this.c && c1nVar == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = if1Var2.a(i8);
                    }
                } else {
                    if1 if1Var5 = c1nVar.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = if1Var5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.m = new zy9(this.e, this.f, fArr3);
        }
    }

    @Override // defpackage.a1n
    public final int g() {
        return 0;
    }

    @Override // defpackage.a1n
    public final int o() {
        return this.c;
    }

    @Override // defpackage.y0n
    public final if1 t(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        long j2 = j / 1000000;
        int[] iArr = z0n.a;
        long j3 = this.c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return if1Var3;
        }
        e(if1Var, if1Var2, if1Var3);
        if1 if1Var4 = this.h;
        int i = 0;
        if (this.m != z0n.c) {
            int i2 = (int) j4;
            float fD = d(a(i2), i2, false);
            float[] fArr = this.l;
            ax1[][] ax1VarArr = (ax1[][]) this.m.a;
            float f = ax1VarArr[0][0].a;
            float f2 = ax1VarArr[ax1VarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (ax1[] ax1VarArr2 : ax1VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    ax1 ax1Var = ax1VarArr2[i4];
                    if (f2 <= ax1Var.b) {
                        if (ax1Var.p) {
                            fArr[i3] = ax1Var.q;
                            fArr[i3 + 1] = ax1Var.r;
                        } else {
                            ax1Var.c(f2);
                            fArr[i3] = ax1Var.a();
                            fArr[i3 + 1] = ax1Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                if1Var4.e(fArr[i], i);
                i++;
            }
        } else {
            if1 if1VarW = w((j4 - 1) * 1000000, if1Var, if1Var2, if1Var3);
            if1 if1VarW2 = w(j4 * 1000000, if1Var, if1Var2, if1Var3);
            int iB = if1VarW.b();
            while (i < iB) {
                if1Var4.e((if1VarW.a(i) - if1VarW2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return if1Var4;
    }

    @Override // defpackage.y0n
    public final if1 w(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        if1 if1Var4;
        if1 if1Var5;
        ax1[][] ax1VarArr;
        if1 if1Var6 = if1Var;
        long j2 = j / 1000000;
        int[] iArr = z0n.a;
        short s = this.c;
        long j3 = s;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i = (int) j3;
        jde jdeVar = this.b;
        c1n c1nVar = (c1n) jdeVar.e(i);
        if (c1nVar != null) {
            return c1nVar.a;
        }
        if (i >= s) {
            return if1Var2;
        }
        if (i <= 0) {
            return if1Var6;
        }
        e(if1Var6, if1Var2, if1Var3);
        if1 if1Var7 = this.g;
        int i2 = 0;
        if (this.m == z0n.c) {
            int iA = a(i);
            float fD = d(iA, i, true);
            ide ideVar = this.a;
            c1n c1nVar2 = (c1n) jdeVar.e(ideVar.c(iA));
            if (c1nVar2 != null && (if1Var5 = c1nVar2.a) != null) {
                if1Var6 = if1Var5;
            }
            c1n c1nVar3 = (c1n) jdeVar.e(ideVar.c(iA + 1));
            if (c1nVar3 == null || (if1Var4 = c1nVar3.a) == null) {
                if1Var4 = if1Var2;
            }
            int iB = if1Var7.b();
            for (int i3 = 0; i3 < iB; i3++) {
                if1Var7.e((if1Var4.a(i3) * fD) + ((1.0f - fD) * if1Var6.a(i3)), i3);
            }
            return if1Var7;
        }
        float fD2 = d(a(i), i, false);
        float[] fArr = this.k;
        ax1[][] ax1VarArr2 = (ax1[][]) this.m.a;
        int length = ax1VarArr2.length - 1;
        float f = ax1VarArr2[0][0].a;
        float f2 = ax1VarArr2[length][0].b;
        int length2 = fArr.length;
        if (fD2 >= f && fD2 <= f2) {
            int length3 = ax1VarArr2.length;
            int i4 = 0;
            boolean z = false;
            while (i4 < length3) {
                int i5 = i2;
                int i6 = i5;
                while (i5 < length2 - 1) {
                    ax1 ax1Var = ax1VarArr2[i4][i6];
                    if (fD2 <= ax1Var.b) {
                        if (ax1Var.p) {
                            float f3 = ax1Var.a;
                            float f4 = ax1Var.k;
                            float f5 = ax1Var.c;
                            fArr[i5] = v0g.g(ax1Var.e, f5, (fD2 - f3) * f4, f5);
                            float f6 = ax1Var.d;
                            fArr[i5 + 1] = v0g.g(ax1Var.f, f6, (fD2 - f3) * f4, f6);
                        } else {
                            ax1Var.c(fD2);
                            fArr[i5] = (ax1Var.n * ax1Var.h) + ax1Var.q;
                            fArr[i5 + 1] = (ax1Var.o * ax1Var.i) + ax1Var.r;
                        }
                        z = true;
                    }
                    i5 += 2;
                    i6++;
                }
                if (z) {
                    break;
                }
                i4++;
                i2 = 0;
            }
        } else {
            if (fD2 > f2) {
                f = f2;
            } else {
                length = 0;
            }
            float f7 = fD2 - f;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length2 - 1) {
                ax1 ax1Var2 = ax1VarArr2[length][i8];
                boolean z2 = ax1Var2.p;
                float f8 = ax1Var2.r;
                float f9 = ax1Var2.q;
                if (z2) {
                    float f10 = ax1Var2.a;
                    float f11 = ax1Var2.k;
                    float f12 = ax1Var2.c;
                    ax1VarArr = ax1VarArr2;
                    fArr[i7] = (f9 * f7) + v0g.g(ax1Var2.e, f12, (f - f10) * f11, f12);
                    float f13 = (f - f10) * f11;
                    float f14 = ax1Var2.d;
                    fArr[i7 + 1] = (f8 * f7) + v0g.g(ax1Var2.f, f14, f13, f14);
                } else {
                    ax1VarArr = ax1VarArr2;
                    ax1Var2.c(f);
                    fArr[i7] = (ax1Var2.a() * f7) + (ax1Var2.n * ax1Var2.h) + f9;
                    fArr[i7 + 1] = (ax1Var2.b() * f7) + (ax1Var2.o * ax1Var2.i) + f8;
                }
                i7 += 2;
                i8++;
                ax1VarArr2 = ax1VarArr;
            }
        }
        int length4 = fArr.length;
        for (int i9 = 0; i9 < length4; i9++) {
            if1Var7.e(fArr[i9], i9);
        }
        return if1Var7;
    }
}
