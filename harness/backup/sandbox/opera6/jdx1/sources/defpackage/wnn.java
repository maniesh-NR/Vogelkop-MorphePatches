package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class wnn implements twi {
    public final pw7 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public wnn(pw7 pw7Var, int i, long j, long j2) {
        this.a = pw7Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / pw7Var.d;
        this.d = j3;
        this.e = d(j3);
    }

    public final long d(long j) {
        long j2 = j * this.b;
        long j3 = this.a.c;
        String str = tym.a;
        return tym.W(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.e;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        pw7 pw7Var = this.a;
        long j2 = this.d - 1;
        long j3 = tym.j((pw7Var.c * j) / (this.b * 1000000), 0L, j2);
        int i = pw7Var.d;
        long j4 = this.c;
        long jD = d(j3);
        vwi vwiVar = new vwi(jD, (i * j3) + j4);
        if (jD >= j || j3 == j2) {
            return new swi(vwiVar, vwiVar);
        }
        long j5 = j3 + 1;
        return new swi(vwiVar, new vwi(d(j5), (i * j5) + j4));
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return true;
    }
}
