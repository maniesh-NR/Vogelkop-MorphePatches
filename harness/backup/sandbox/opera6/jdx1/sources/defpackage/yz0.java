package defpackage;

/* loaded from: classes.dex */
public final class yz0 implements fog {
    public final td3 a;

    public yz0(td3 td3Var) {
        this.a = td3Var;
    }

    @Override // defpackage.fog
    public final long b(ccb ccbVar, long j, d2c d2cVar, long j2) {
        td3 td3Var = this.a;
        long jA = td3Var.a(0L, (ccbVar.d() << 32) | (ccbVar.b() & 4294967295L), d2cVar);
        long jA2 = td3Var.a(0L, j2, d2cVar);
        long j3 = ((-((int) (jA2 >> 32))) << 32) | ((-((int) (jA2 & 4294967295L))) & 4294967295L);
        d2c d2cVar2 = d2c.a;
        return ybb.c(ybb.c(ybb.c(ccbVar.c(), jA), j3), 0 << 32);
    }
}
