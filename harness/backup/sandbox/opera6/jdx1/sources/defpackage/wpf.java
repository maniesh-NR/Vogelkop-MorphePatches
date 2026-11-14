package defpackage;

/* loaded from: classes.dex */
public final class wpf extends p10 {
    public static final wpf d = new wpf(0, 2, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        dcb dcbVar = (dcb) r05Var.y(1);
        int i = dcbVar != null ? dcbVar.a : 0;
        lr4 lr4Var = (lr4) r05Var.y(0);
        if (i > 0) {
            m9f m9fVar = new m9f();
            m9fVar.c = kw1Var;
            m9fVar.a = i;
            kw1Var = m9fVar;
        }
        lr4Var.S(kw1Var, lqjVar, j1cVar, drfVar != null ? new k5o(drfVar, lqjVar, (byte) 27) : null);
    }
}
