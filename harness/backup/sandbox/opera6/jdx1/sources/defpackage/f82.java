package defpackage;

/* loaded from: classes.dex */
public final class f82 {
    public float a;
    public float b;

    public final i89 a(float f) {
        double dB = b(f);
        return new i89(f, (float) (Math.exp(1.7362676463664735d * dB) * this.a * this.b), (long) (Math.exp(dB / 1.3582017421722412d) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = g61.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
