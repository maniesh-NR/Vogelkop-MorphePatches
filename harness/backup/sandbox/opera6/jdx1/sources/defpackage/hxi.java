package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hxi extends fxi {
    public final shf j;
    public final shf k;
    public final long l;

    public hxi(bjh bjhVar, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, long j6, shf shfVar, shf shfVar2, long j7, long j8) {
        super(bjhVar, j, j2, j3, j5, arrayList, j6, j7, j8);
        this.j = shfVar;
        this.k = shfVar2;
        this.l = j4;
    }

    @Override // defpackage.kxi
    public final bjh a(evh evhVar) {
        shf shfVar = this.j;
        if (shfVar == null) {
            return this.a;
        }
        oj9 oj9Var = evhVar.a;
        return new bjh(shfVar.j(0L, 0L, oj9Var.a, oj9Var.j), 0L, -1L);
    }

    @Override // defpackage.fxi
    public final long d(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = me3.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.fxi
    public final bjh h(cvh cvhVar, long j) {
        ArrayList arrayList = this.f;
        long j2 = this.d;
        long j3 = arrayList != null ? ((ixi) arrayList.get((int) (j - j2))).a : (j - j2) * this.e;
        oj9 oj9Var = cvhVar.a;
        return new bjh(this.k.j(j, j3, oj9Var.a, oj9Var.j), 0L, -1L);
    }
}
