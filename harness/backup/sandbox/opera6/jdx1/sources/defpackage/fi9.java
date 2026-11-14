package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fi9 implements di9 {
    public final float[] a;
    public final float[] b;

    public fi9(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            qp2.o("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.di9
    public final float a(float f) {
        return phj.g0(f, this.b, this.a);
    }

    @Override // defpackage.di9
    public final float b(float f) {
        return phj.g0(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fi9)) {
            return false;
        }
        fi9 fi9Var = (fi9) obj;
        return Arrays.equals(this.a, fi9Var.a) && Arrays.equals(this.b, fi9Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sko.l("FontScaleConverter{fromSpValues=", Arrays.toString(this.a), ", toDpValues=", Arrays.toString(this.b), "}");
    }
}
