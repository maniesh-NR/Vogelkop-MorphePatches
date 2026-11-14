package defpackage;

/* loaded from: classes.dex */
public final class z1k {
    public float a;
    public double b;
    public float c;

    public final long a(float f, float f2, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.a;
        double d = j / 1000.0d;
        float f4 = this.c;
        double d2 = f4 * f4;
        double d3 = this.b;
        double d4 = (-f4) * d3;
        if (f4 > 1.0f) {
            double dSqrt = Math.sqrt(d2 - 1.0d) * d3;
            double d5 = d4 + dSqrt;
            double d6 = d4 - dSqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - f2) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            dSin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
            dExp = Math.exp(d10) * d9 * d6;
            dExp2 = Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double dSqrt2 = Math.sqrt(1.0d - d2) * d3;
                double d12 = f3;
                double d13 = (((-d4) * d12) + f2) * (1.0d / dSqrt2);
                double d14 = dSqrt2 * d;
                double d15 = d * d4;
                dSin = ((Math.sin(d14) * d13) + (Math.cos(d14) * d12)) * Math.exp(d15);
                dCos = (((Math.cos(d14) * dSqrt2 * d13) + (Math.sin(d14) * (-dSqrt2) * d12)) * Math.exp(d15)) + (d4 * dSin);
                return (Float.floatToRawIntBits((float) (dSin + this.a)) << 32) | (Float.floatToRawIntBits((float) dCos) & 4294967295L);
            }
            double d16 = f3;
            double d17 = (d3 * d16) + f2;
            double d18 = (-d3) * d;
            double d19 = (d * d17) + d16;
            dSin = Math.exp(d18) * d19;
            dExp = Math.exp(d18) * d19 * (-this.b);
            dExp2 = Math.exp(d18) * d17;
        }
        dCos = dExp2 + dExp;
        return (Float.floatToRawIntBits((float) (dSin + this.a)) << 32) | (Float.floatToRawIntBits((float) dCos) & 4294967295L);
    }
}
