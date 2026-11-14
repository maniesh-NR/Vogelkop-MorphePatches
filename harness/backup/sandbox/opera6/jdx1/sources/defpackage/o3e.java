package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class o3e implements xwi {
    public final long[] a;
    public final long[] b;
    public final long c;

    public o3e(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? tym.N(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long[] jArr, long[] jArr2, long j) {
        int iF = tym.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.xwi
    public final long a() {
        return 0L;
    }

    @Override // defpackage.xwi
    public final long b() {
        return -1L;
    }

    @Override // defpackage.xwi
    public final int c() {
        return -2147483647;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        Pair pairD = d(this.b, this.a, tym.c0(tym.j(j, 0L, this.c)));
        vwi vwiVar = new vwi(tym.N(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new swi(vwiVar, vwiVar);
    }

    @Override // defpackage.xwi
    public final long getTimeUs(long j) {
        return tym.N(((Long) d(this.a, this.b, j).second).longValue());
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return true;
    }
}
