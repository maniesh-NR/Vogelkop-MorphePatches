package defpackage;

/* loaded from: classes.dex */
public final class eql extends gql {
    public final csh e;
    public final csh f;
    public final int[] g;
    public final int[] h;

    public eql(csh cshVar, csh cshVar2, int[] iArr) {
        z4o.w(cshVar.d == iArr.length);
        this.e = cshVar;
        this.f = cshVar2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    @Override // defpackage.gql
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.gql
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gql
    public final int c(boolean z) {
        int i = this.e.d;
        if (p()) {
            return -1;
        }
        return z ? this.g[i - 1] : i - 1;
    }

    @Override // defpackage.gql
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    @Override // defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        dql dqlVar2 = (dql) this.f.get(i);
        dqlVar.j(dqlVar2.a, dqlVar2.b, dqlVar2.c, dqlVar2.d, dqlVar2.e, dqlVar2.g, dqlVar2.f);
        return dqlVar;
    }

    @Override // defpackage.gql
    public final int h() {
        return this.f.d;
    }

    @Override // defpackage.gql
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // defpackage.gql
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gql
    public final fql m(int i, fql fqlVar, long j) {
        fql fqlVar2 = (fql) this.e.get(i);
        fqlVar.b(fqlVar2.a, fqlVar2.b, fqlVar2.c, fqlVar2.d, fqlVar2.e, fqlVar2.f, fqlVar2.g, fqlVar2.h, fqlVar2.i, fqlVar2.k, fqlVar2.l, fqlVar2.m, fqlVar2.n, fqlVar2.o);
        fqlVar.j = fqlVar2.j;
        return fqlVar;
    }

    @Override // defpackage.gql
    public final int o() {
        return this.e.d;
    }
}
