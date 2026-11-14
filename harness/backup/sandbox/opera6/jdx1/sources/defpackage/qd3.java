package defpackage;

/* loaded from: classes.dex */
public final class qd3 implements rz0 {
    public final float a;

    public qd3(float f) {
        this.a = f;
    }

    @Override // defpackage.rz0
    public final long a(long j, long j2, d2c d2cVar) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = (1.0f + this.a) * (((int) (j3 >> 32)) / 2.0f);
        float f2 = 0.0f * (((int) (j3 & 4294967295L)) / 2.0f);
        return (Math.round(f) << 32) | (Math.round(f2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd3) && Float.compare(this.a, ((qd3) obj).a) == 0;
    }

    public final int hashCode() {
        return (Float.hashCode(this.a) * 31) - 1082130432;
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
