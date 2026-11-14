package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x62 implements w62, z62 {
    public final float a;
    public final boolean b;
    public final y62 c;
    public final float d;

    public x62(float f, boolean z, y62 y62Var) {
        this.a = f;
        this.b = z;
        this.c = y62Var;
        this.d = f;
    }

    @Override // defpackage.w62, defpackage.z62
    public final float b() {
        return this.d;
    }

    @Override // defpackage.w62
    public final void c(n27 n27Var, int i, int[] iArr, d2c d2cVar, int[] iArr2) {
        int i2;
        if (iArr.length != 0) {
            int iM = n27Var.M(this.a);
            boolean z = this.b && d2cVar == d2c.b;
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int iMin = 0;
                int i4 = 0;
                while (i3 < length) {
                    int iMax = Math.max(0, i - iArr[i3]);
                    iArr2[i4] = iMax;
                    iMin = Math.min(iM, iMax);
                    i = iArr2[i4] - iMin;
                    i3++;
                    i4++;
                }
                i2 = i + iMin;
            } else {
                int length2 = iArr.length;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i5 < length2) {
                    int i9 = iArr[i5];
                    int iMin2 = Math.min(i6, i - i9);
                    iArr2[i8] = iMin2;
                    int iMin3 = Math.min(iM, (i - iMin2) - i9);
                    int i10 = iArr2[i8] + i9 + iMin3;
                    i5++;
                    i7 = iMin3;
                    i6 = i10;
                    i8++;
                }
                i2 = i - (i6 - i7);
            }
            y62 y62Var = this.c;
            if (y62Var == null || i2 <= 0) {
                return;
            }
            int iB = y62Var.b(i2, d2cVar);
            if (z) {
                iB -= i2;
            }
            if (iB != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iB;
                }
            }
        }
    }

    @Override // defpackage.z62
    public final void e(n27 n27Var, int i, int[] iArr, int[] iArr2) {
        c(n27Var, i, iArr, d2c.a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x62)) {
            return false;
        }
        x62 x62Var = (x62) obj;
        return gh7.b(this.a, x62Var.a) && this.b == x62Var.b && Intrinsics.a(this.c, x62Var.c);
    }

    public final int hashCode() {
        int iK = fki.k(Float.hashCode(this.a) * 31, 31, this.b);
        y62 y62Var = this.c;
        return iK + (y62Var == null ? 0 : y62Var.hashCode());
    }

    public final String toString() {
        return (this.b ? "" : "Absolute") + "Arrangement#spacedAligned(" + gh7.c(this.a) + ", " + this.c + ")";
    }
}
