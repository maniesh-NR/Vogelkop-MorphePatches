package defpackage;

/* loaded from: classes.dex */
public final class jnl {
    public final jde a;
    public inl b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public jnl() {
        jde jdeVar = xbb.a;
        this.a = new jde();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(inl inlVar, long j, long j2, float[] fArr, long j3) {
        long j4 = inlVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            inlVar.g = j3;
            inlVar.a(inlVar.e, inlVar.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (ybb.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!ybb.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
