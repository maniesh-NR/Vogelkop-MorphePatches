package defpackage;

/* loaded from: classes.dex */
public final class xqf extends p10 {
    public static final xqf d = new xqf(1, 0, 2);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        int iX = r05Var.x(0);
        int i = lqjVar.v;
        int iM = lqjVar.M(lqjVar.q(i), lqjVar.b);
        int iF = lqjVar.f(lqjVar.q(i + 1), lqjVar.b);
        for (int iMax = Math.max(iM, iF - iX); iMax < iF; iMax++) {
            Object obj = lqjVar.c[lqjVar.g(iMax)];
            if (obj instanceof zt9) {
                j1cVar.f((zt9) obj);
            } else if (obj instanceof znh) {
                ((znh) obj).c();
            }
        }
        if (iX <= 0) {
            mh5.a("Check failed");
        }
        int i2 = lqjVar.v;
        int iM2 = lqjVar.M(lqjVar.q(i2), lqjVar.b);
        int iF2 = lqjVar.f(lqjVar.q(i2 + 1), lqjVar.b) - iX;
        if (iF2 < iM2) {
            mh5.a("Check failed");
        }
        lqjVar.I(iF2, iX, i2);
        int i3 = lqjVar.i;
        if (i3 >= iM2) {
            lqjVar.i = i3 - iX;
        }
    }
}
