package defpackage;

/* loaded from: classes.dex */
public final class aqf extends p10 {
    public static final aqf d = new aqf(0, 2, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        int i;
        dcb dcbVar = (dcb) r05Var.y(0);
        int iC = lqjVar.c((qt9) r05Var.y(1));
        if (lqjVar.t >= iC) {
            mh5.a("Check failed");
        }
        nb6.M(lqjVar, kw1Var, iC);
        int i2 = lqjVar.t;
        int iD = lqjVar.v;
        while (iD >= 0 && !lqjVar.x(iD)) {
            iD = lqjVar.D(iD, lqjVar.b);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i2) {
            if (lqjVar.u(i2, iT)) {
                if (lqjVar.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += lqjVar.x(iT) ? 1 : lqjVar.b[(lqjVar.q(iT) * 5) + 1] & 67108863;
                iT += lqjVar.t(iT);
            }
        }
        while (true) {
            i = lqjVar.t;
            if (i >= iC) {
                break;
            }
            if (lqjVar.u(iC, i)) {
                int i3 = lqjVar.t;
                if (i3 < lqjVar.u && (lqjVar.b[(lqjVar.q(i3) * 5) + 1] & 1073741824) != 0) {
                    kw1Var.r(lqjVar.C(lqjVar.t));
                    iK = 0;
                }
                lqjVar.O();
            } else {
                iK += lqjVar.K();
            }
        }
        if (i != iC) {
            mh5.a("Check failed");
        }
        dcbVar.a = iK;
    }
}
