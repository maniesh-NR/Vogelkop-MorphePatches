package defpackage;

/* loaded from: classes.dex */
public final class alg extends kk9 {
    public final /* synthetic */ byte f = 0;
    public final Object g;

    public alg(gql gqlVar) {
        super(gqlVar);
        this.g = new fql();
    }

    public alg(gql gqlVar, qjd qjdVar) {
        super(gqlVar);
        this.g = qjdVar;
    }

    @Override // defpackage.kk9, defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        switch (this.f) {
            case 0:
                gql gqlVar = this.e;
                dql dqlVarF = gqlVar.f(i, dqlVar, z);
                if (gqlVar.m(dqlVarF.c, (fql) this.g, 0L).a()) {
                    dqlVarF.j(dqlVar.a, dqlVar.b, dqlVar.c, dqlVar.d, dqlVar.e, to.f, true);
                } else {
                    dqlVarF.f = true;
                }
                return dqlVarF;
            default:
                return super.f(i, dqlVar, z);
        }
    }

    @Override // defpackage.kk9, defpackage.gql
    public final fql m(int i, fql fqlVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, fqlVar, j);
                qjd qjdVar = (qjd) this.g;
                fqlVar.b = qjdVar;
                mjd mjdVar = qjdVar.b;
                return fqlVar;
            default:
                return super.m(i, fqlVar, j);
        }
    }
}
