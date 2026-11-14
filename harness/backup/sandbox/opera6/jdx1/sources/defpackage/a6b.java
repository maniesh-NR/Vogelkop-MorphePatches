package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class a6b implements xwi {
    public final long a;
    public final long b;
    public final int c;
    public final z5b d;

    public a6b(long j, long j2, long j3) {
        this.d = new z5b(new long[]{j2}, new long[]{0}, j);
        this.a = j2;
        this.b = j3;
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.c = -2147483647;
            return;
        }
        long jW = tym.W(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jW > 0 && jW <= 2147483647L) {
            i = (int) jW;
        }
        this.c = i;
    }

    @Override // defpackage.xwi
    public final long a() {
        return this.a;
    }

    @Override // defpackage.xwi
    public final long b() {
        return this.b;
    }

    @Override // defpackage.xwi
    public final int c() {
        return this.c;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.d.c;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        return this.d.getSeekPoints(j);
    }

    @Override // defpackage.xwi
    public final long getTimeUs(long j) {
        z5b z5bVar = this.d;
        j0d j0dVar = z5bVar.b;
        if (j0dVar.b == 0) {
            return -9223372036854775807L;
        }
        return j0dVar.d(tym.d(z5bVar.a, j));
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return this.d.isSeekable();
    }
}
