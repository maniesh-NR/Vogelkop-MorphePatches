package defpackage;

/* loaded from: classes.dex */
public final class qao implements xwi {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public qao(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.xwi
    public final long a() {
        return this.a + this.b;
    }

    @Override // defpackage.xwi
    public final long b() {
        return this.f;
    }

    @Override // defpackage.xwi
    public final int c() {
        return this.d;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        double d;
        double d2;
        boolean zIsSeekable = isSeekable();
        int i = this.b;
        long j2 = this.a;
        if (!zIsSeekable) {
            vwi vwiVar = new vwi(0L, j2 + i);
            return new swi(vwiVar, vwiVar);
        }
        long j3 = tym.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        vwi vwiVar2 = new vwi(j3, j2 + tym.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new swi(vwiVar2, vwiVar2);
    }

    @Override // defpackage.xwi
    public final long getTimeUs(long j) {
        long j2 = j - this.a;
        if (!isSeekable() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iF = tym.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iF * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iF == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return this.g != null;
    }
}
