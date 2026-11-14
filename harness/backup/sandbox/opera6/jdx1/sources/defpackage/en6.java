package defpackage;

/* loaded from: classes.dex */
public final class en6 {
    public final m14 a;
    public final evh b;
    public final oa3 c;
    public final gb6 d;
    public final long e;
    public final long f;

    public en6(long j, evh evhVar, oa3 oa3Var, m14 m14Var, long j2, gb6 gb6Var) {
        this.e = j;
        this.b = evhVar;
        this.c = oa3Var;
        this.f = j2;
        this.a = m14Var;
        this.d = gb6Var;
    }

    public final en6 a(long j, evh evhVar) throws uc3 {
        long jR;
        long jR2;
        gb6 gb6VarC = this.b.c();
        gb6 gb6VarC2 = evhVar.c();
        if (gb6VarC == null) {
            return new en6(j, evhVar, this.c, this.a, this.f, gb6VarC);
        }
        if (!gb6VarC.P()) {
            return new en6(j, evhVar, this.c, this.a, this.f, gb6VarC2);
        }
        long jZ = gb6VarC.z(j);
        if (jZ == 0) {
            return new en6(j, evhVar, this.c, this.a, this.f, gb6VarC2);
        }
        gb6VarC2.getClass();
        long jS = gb6VarC.S();
        long timeUs = gb6VarC.getTimeUs(jS);
        long j2 = jZ + jS;
        long j3 = j2 - 1;
        long jA = gb6VarC.a(j3, j) + gb6VarC.getTimeUs(j3);
        long jS2 = gb6VarC2.S();
        long timeUs2 = gb6VarC2.getTimeUs(jS2);
        long j4 = this.f;
        if (jA == timeUs2) {
            jR = j2 - jS2;
        } else {
            if (jA < timeUs2) {
                throw new uc3();
            }
            if (timeUs2 < timeUs) {
                jR2 = j4 - (gb6VarC2.r(timeUs, j) - jS);
                return new en6(j, evhVar, this.c, this.a, jR2, gb6VarC2);
            }
            jR = gb6VarC.r(timeUs2, j) - jS2;
        }
        jR2 = jR + j4;
        return new en6(j, evhVar, this.c, this.a, jR2, gb6VarC2);
    }

    public final long b(long j) {
        gb6 gb6Var = this.d;
        gb6Var.getClass();
        long j2 = this.e;
        long jK = gb6Var.k(j2, j) + this.f;
        gb6Var.getClass();
        return (gb6Var.V(j2, j) + jK) - 1;
    }

    public final long c() {
        gb6 gb6Var = this.d;
        gb6Var.getClass();
        return gb6Var.z(this.e);
    }

    public final long d(long j) {
        long jE = e(j);
        gb6 gb6Var = this.d;
        gb6Var.getClass();
        return gb6Var.a(j - this.f, this.e) + jE;
    }

    public final long e(long j) {
        gb6 gb6Var = this.d;
        gb6Var.getClass();
        return gb6Var.getTimeUs(j - this.f);
    }

    public final boolean f(long j, long j2) {
        gb6 gb6Var = this.d;
        gb6Var.getClass();
        return gb6Var.P() || j2 == -9223372036854775807L || d(j) <= j2;
    }
}
