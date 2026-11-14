package defpackage;

/* loaded from: classes.dex */
public final class kqf extends p10 {
    public static final kqf d = new kqf(0, 3, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        drf k5oVar;
        iqj iqjVar = (iqj) r05Var.y(1);
        qt9 qt9Var = (qt9) r05Var.y(0);
        p69 p69Var = (p69) r05Var.y(2);
        lqj lqjVarE = iqjVar.e();
        if (drfVar != null) {
            try {
                k5oVar = new k5o(drfVar, lqjVar, (byte) 27);
            } catch (Throwable th) {
                lqjVarE.e(false);
                throw th;
            }
        } else {
            k5oVar = null;
        }
        if (!p69Var.j.I0()) {
            mh5.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        p69Var.i.H0(kw1Var, lqjVarE, j1cVar, k5oVar);
        lqjVarE.e(true);
        lqjVar.d();
        qt9Var.getClass();
        lqjVar.z(iqjVar, iqjVar.b(qt9Var));
        lqjVar.j();
    }
}
