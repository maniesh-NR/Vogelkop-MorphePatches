package defpackage;

/* loaded from: classes.dex */
public class wn5 implements twi {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public wn5(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = ((Math.max(0L, j3) << 3) * 1000000) / i;
        }
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.f;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            vwi vwiVar = new vwi(0L, j3);
            return new swi(vwiVar, vwiVar);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = ((Math.max(0L, jMax - j3) << 3) * 1000000) / i;
        vwi vwiVar2 = new vwi(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new swi(vwiVar2, new vwi(((Math.max(0L, j5 - j3) << 3) * 1000000) / i, j5));
            }
        }
        return new swi(vwiVar2, vwiVar2);
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return this.d != -1 || this.g;
    }
}
