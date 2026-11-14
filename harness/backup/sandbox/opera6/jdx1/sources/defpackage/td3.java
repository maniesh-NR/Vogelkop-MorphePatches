package defpackage;

/* loaded from: classes.dex */
public final class td3 implements rz0 {
    public final float a;
    public final float b;

    public td3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.rz0
    public final long a(long j, long j2, d2c d2cVar) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        d2c d2cVar2 = d2c.a;
        float f3 = this.a;
        if (d2cVar != d2cVar2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        return (Math.round((f3 + 1.0f) * f) << 32) | (Math.round(f4) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td3)) {
            return false;
        }
        td3 td3Var = (td3) obj;
        return Float.compare(this.a, td3Var.a) == 0 && Float.compare(this.b, td3Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
