package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fqf extends p10 {
    public static final fqf d = new fqf(0, 1, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        dfe dfeVar;
        znh znhVar = (znh) r05Var.y(0);
        see seeVar = (see) j1cVar.i;
        if (seeVar == null || ((g8g) seeVar.g(znhVar)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) j1cVar.j;
        if (arrayList != null && (dfeVar = (dfe) vep.r(1, arrayList)) != null) {
            j1cVar.d = dfeVar;
        }
        seeVar.k(znhVar);
    }
}
