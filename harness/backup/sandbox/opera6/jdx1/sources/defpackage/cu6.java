package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class cu6 implements twi {
    public final /* synthetic */ du6 a;

    public cu6(du6 du6Var) {
        this.a = du6Var;
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return (this.a.f * 1000000) / r5.d.i;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        du6 du6Var = this.a;
        long j2 = du6Var.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((du6Var.d.i * j) / 1000000);
        long j3 = du6Var.c;
        vwi vwiVar = new vwi(j, tym.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(du6Var.f)).longValue() + j2) - 30000, du6Var.b, j3 - 1));
        return new swi(vwiVar, vwiVar);
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return true;
    }
}
