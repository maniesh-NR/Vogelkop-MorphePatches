package defpackage;

/* loaded from: classes.dex */
public final class rb3 extends gql {
    public static final rb3 g = new rb3(new qb3[0], new iij(0));
    public final jij e;
    public final qb3[] f;

    public rb3(qb3[] qb3VarArr, jij jijVar) {
        this.e = jijVar;
        this.f = qb3VarArr;
    }

    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.e.getFirstIndex();
        }
        return 0;
    }

    public final int b(Object obj) {
        int i = 0;
        while (true) {
            qb3[] qb3VarArr = this.f;
            if (i >= qb3VarArr.length) {
                return -1;
            }
            if (qb3VarArr[i] == obj) {
                return i;
            }
            i++;
        }
    }

    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        return z ? this.e.getLastIndex() : this.f.length - 1;
    }

    public final int e(int i, int i2, boolean z) {
        jij jijVar = this.e;
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                h9o.e();
                return 0;
            }
            if (i == c(z)) {
                return a(z);
            }
            if (z) {
                return jijVar.getNextIndex(i);
            }
        } else {
            if (i == c(z)) {
                return -1;
            }
            if (z) {
                return jijVar.getNextIndex(i);
            }
        }
        return i + 1;
    }

    public final dql f(int i, dql dqlVar, boolean z) {
        qb3 qb3Var = this.f[i];
        dqlVar.i(qb3Var, qb3Var, i, qb3Var.b, 0L);
        return dqlVar;
    }

    public final int h() {
        return this.f.length;
    }

    public final int k(int i, int i2, boolean z) {
        jij jijVar = this.e;
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                h9o.e();
                return 0;
            }
            if (i == a(z)) {
                return c(z);
            }
            if (z) {
                return jijVar.getPreviousIndex(i);
            }
        } else {
            if (i == a(z)) {
                return -1;
            }
            if (z) {
                return jijVar.getPreviousIndex(i);
            }
        }
        return i - 1;
    }

    public final Object l(int i) {
        return this.f[i];
    }

    public final fql m(int i, fql fqlVar, long j) {
        qb3 qb3Var = this.f[i];
        long j2 = qb3Var.b;
        boolean z = j2 == -9223372036854775807L;
        qjd qjdVar = qb3Var.a;
        fqlVar.b(qb3Var, qjdVar, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, !z, z, qb3Var.c ? qjdVar.d : null, 0L, j2, i, i, 0L);
        return fqlVar;
    }

    public final int o() {
        return this.f.length;
    }
}
