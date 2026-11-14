package defpackage;

/* loaded from: classes.dex */
public final class p55 extends kk9 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public p55(gql gqlVar, long j, long j2, boolean z) throws q55 {
        super(gqlVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new q55(2, j, j2);
        }
        boolean z2 = false;
        if (gqlVar.h() != 1) {
            throw new q55(0);
        }
        fql fqlVarM = gqlVar.m(0, new fql(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !fqlVarM.j && jMax != 0 && !fqlVarM.g) {
            throw new q55(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? fqlVarM.l : Math.max(0L, j2);
        long j3 = fqlVarM.l;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (fqlVarM.h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // defpackage.kk9, defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        this.e.f(0, dqlVar, z);
        long j = dqlVar.e - this.f;
        long j2 = this.h;
        dqlVar.i(dqlVar.a, dqlVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j);
        return dqlVar;
    }

    @Override // defpackage.kk9, defpackage.gql
    public final fql m(int i, fql fqlVar, long j) {
        this.e.m(0, fqlVar, 0L);
        long j2 = fqlVar.o;
        long j3 = this.f;
        fqlVar.o = j2 + j3;
        fqlVar.l = this.h;
        fqlVar.h = this.i;
        long j4 = fqlVar.k;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            fqlVar.k = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            fqlVar.k = jMax - j3;
        }
        long jC0 = tym.c0(j3);
        long j6 = fqlVar.d;
        if (j6 != -9223372036854775807L) {
            fqlVar.d = j6 + jC0;
        }
        long j7 = fqlVar.e;
        if (j7 != -9223372036854775807L) {
            fqlVar.e = j7 + jC0;
        }
        return fqlVar;
    }
}
