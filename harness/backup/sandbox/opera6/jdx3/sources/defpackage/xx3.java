package defpackage;

/* loaded from: classes.dex */
public final class xx3 implements zx3 {
    public final lsc a;

    public xx3(lsc lscVar) {
        this.a = lscVar;
    }

    @Override // defpackage.zx3
    public final lsc a(ay3 ay3Var, eri eriVar, zpa zpaVar, sk6 sk6Var, p6l p6lVar) {
        sqh sqhVar = ay3Var.l;
        lqm lqmVar = ay3Var.a;
        lsc lscVar = this.a;
        wqm.g(lscVar, sqhVar, lqmVar);
        String strA = sk6Var.a(lscVar.a);
        if (strA != null) {
            lscVar.a = strA;
        }
        if (ay3Var.o != 1) {
            return lscVar;
        }
        lscVar.l = true;
        return lscVar;
    }
}
