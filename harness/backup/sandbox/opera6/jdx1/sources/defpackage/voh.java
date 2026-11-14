package defpackage;

/* loaded from: classes.dex */
public final class voh {
    public static final voh e = new voh(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public voh(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        float f6 = ((f4 - f5) / 2.0f) + f5;
        return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
    }

    public final long c() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final long d() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final voh e(voh vohVar) {
        return new voh(Math.max(this.a, vohVar.a), Math.max(this.b, vohVar.b), Math.min(this.c, vohVar.c), Math.min(this.d, vohVar.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voh)) {
            return false;
        }
        voh vohVar = (voh) obj;
        return Float.compare(this.a, vohVar.a) == 0 && Float.compare(this.b, vohVar.b) == 0 && Float.compare(this.c, vohVar.c) == 0 && Float.compare(this.d, vohVar.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(voh vohVar) {
        return (this.a < vohVar.c) & (vohVar.a < this.c) & (this.b < vohVar.d) & (vohVar.b < this.d);
    }

    public final voh h(float f, float f2) {
        return new voh(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final voh i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new voh(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strM0 = scd.m0(this.a);
        String strM02 = scd.m0(this.b);
        return sko.n(z1m.n("Rect.fromLTRB(", strM0, ", ", strM02, ", "), scd.m0(this.c), ", ", scd.m0(this.d), ")");
    }
}
