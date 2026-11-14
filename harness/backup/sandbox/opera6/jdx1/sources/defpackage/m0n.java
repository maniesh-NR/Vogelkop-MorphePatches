package defpackage;

/* loaded from: classes.dex */
public final class m0n implements xwi {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public m0n(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
    }

    @Override // defpackage.xwi
    public final long a() {
        return this.d;
    }

    @Override // defpackage.xwi
    public final long b() {
        return this.e;
    }

    @Override // defpackage.xwi
    public final int c() {
        return this.f;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        long[] jArr = this.a;
        int iF = tym.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        vwi vwiVar = new vwi(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new swi(vwiVar, vwiVar);
        }
        int i = iF + 1;
        return new swi(vwiVar, new vwi(jArr[i], jArr2[i]));
    }

    @Override // defpackage.xwi
    public final long getTimeUs(long j) {
        return this.a[tym.f(this.b, j, true)];
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return true;
    }
}
