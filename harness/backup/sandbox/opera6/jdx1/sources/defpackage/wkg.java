package defpackage;

/* loaded from: classes.dex */
public final class wkg extends gql {
    public static final Object j = new Object();
    public final qjd e;
    public final boolean f;
    public final boolean g;
    public final ljd h;
    public final long i;

    public wkg(xkg xkgVar) {
        this.e = xkgVar.g();
        this.f = xkgVar.c0();
        this.g = xkgVar.F();
        this.h = xkgVar.t0() ? ljd.f : null;
        this.i = tym.N(xkgVar.T());
    }

    @Override // defpackage.gql
    public final int b(Object obj) {
        return j != obj ? -1 : 0;
    }

    @Override // defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        long j2 = this.i;
        Object obj = j;
        dqlVar.i(obj, obj, 0, j2, 0L);
        dqlVar.f = false;
        return dqlVar;
    }

    @Override // defpackage.gql
    public final int h() {
        return 1;
    }

    @Override // defpackage.gql
    public final Object l(int i) {
        return j;
    }

    @Override // defpackage.gql
    public final fql m(int i, fql fqlVar, long j2) {
        fqlVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        fqlVar.j = false;
        return fqlVar;
    }

    @Override // defpackage.gql
    public final int o() {
        return 1;
    }
}
