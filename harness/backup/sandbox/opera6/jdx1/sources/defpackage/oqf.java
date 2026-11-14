package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class oqf extends p10 {
    public static final oqf d = new oqf(0, 1, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        znh znhVar = (znh) r05Var.y(0);
        Set set = (Set) j1cVar.f;
        if (set == null) {
            return;
        }
        g8g g8gVar = new g8g(set);
        see seeVar = (see) j1cVar.i;
        if (seeVar == null) {
            long[] jArr = imi.a;
            seeVar = new see();
            j1cVar.i = seeVar;
        }
        seeVar.m(znhVar, g8gVar);
        ((dfe) j1cVar.d).c(new zt9(g8gVar, -1));
    }
}
