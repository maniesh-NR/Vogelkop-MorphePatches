package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xz4 implements twi {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public xz4(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.f;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        long[] jArr = this.e;
        int iF = tym.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        vwi vwiVar = new vwi(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new swi(vwiVar, vwiVar);
        }
        int i = iF + 1;
        return new swi(vwiVar, new vwi(jArr[i], jArr2[i]));
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
