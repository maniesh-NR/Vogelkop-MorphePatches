package defpackage;

/* loaded from: classes.dex */
public final class x89 implements n89 {
    public final int a;
    public final vq7 b;
    public final long c;
    public final long d;

    public x89(int i, int i2, vq7 vq7Var) {
        this.a = i;
        this.b = vq7Var;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    public final float b(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(f, f2, f3, j4) - e(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }

    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }

    public final float e(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fC = this.b.c(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fC) + ((1.0f - fC) * f);
    }
}
