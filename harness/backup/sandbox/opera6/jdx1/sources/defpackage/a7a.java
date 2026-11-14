package defpackage;

/* loaded from: classes.dex */
public final class a7a implements fog {
    public final rz0 a;
    public final k9f b;
    public long c = 0;

    public a7a(rz0 rz0Var, k9f k9fVar) {
        this.a = rz0Var;
        this.b = k9fVar;
    }

    @Override // defpackage.fog
    public final long b(ccb ccbVar, long j, d2c d2cVar, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return ybb.c(ybb.c(ccbVar.c(), scd.f0(jA)), this.a.a(j2, 0L, d2cVar));
    }
}
