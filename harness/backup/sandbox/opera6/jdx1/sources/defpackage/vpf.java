package defpackage;

/* loaded from: classes.dex */
public final class vpf extends p10 {
    public static final vpf d = new vpf(0, 2, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        qt9 qt9Var = (qt9) r05Var.y(0);
        Object objY = r05Var.y(1);
        if (objY instanceof zt9) {
            zt9 zt9Var = (zt9) objY;
            ((dfe) j1cVar.d).c(zt9Var);
            ((tee) j1cVar.c).a(zt9Var);
        }
        if (lqjVar.n != 0) {
            mh5.a("Can only append a slot if not current inserting");
        }
        int i = lqjVar.i;
        int i2 = lqjVar.j;
        int iC = lqjVar.c(qt9Var);
        int iF = lqjVar.f(lqjVar.q(iC + 1), lqjVar.b);
        lqjVar.i = iF;
        lqjVar.j = iF;
        lqjVar.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        lqjVar.c[iF] = objY;
        lqjVar.i = i;
        lqjVar.j = i2;
    }
}
