package defpackage;

/* loaded from: classes.dex */
public final class e1n implements b1n {
    public final byte a;
    public final a1n b;
    public final long c;
    public final long d;

    /* JADX WARN: Multi-variable type inference failed */
    public e1n(int i, a1n a1nVar, long j) {
        puh puhVar = puh.a;
        this.a = i;
        this.b = a1nVar;
        if (i < 1) {
            qp2.o("Iterations count can't be less than 1");
            throw null;
        }
        this.c = (a1nVar.o() + a1nVar.g()) * 1000000;
        this.d = j * 1000000;
    }

    public final long a(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        long jMin = Math.min(j2 / j3, this.a - 1);
        puh puhVar = puh.a;
        return j2 - (jMin * j3);
    }

    @Override // defpackage.y0n
    public final long c(if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return (this.a * this.c) - this.d;
    }

    public final if1 d(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? t(j4 - j2, if1Var, if1Var2, if1Var3) : if1Var2;
    }

    @Override // defpackage.y0n
    public final if1 t(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return this.b.t(a(j), if1Var, if1Var2, d(j, if1Var, if1Var3, if1Var2));
    }

    @Override // defpackage.y0n
    public final if1 w(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return this.b.w(a(j), if1Var, if1Var2, d(j, if1Var, if1Var3, if1Var2));
    }
}
