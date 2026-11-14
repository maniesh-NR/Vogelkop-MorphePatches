package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uqf extends p10 {
    public static final uqf d = new uqf(0, 1, 1);

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        znh znhVar = (znh) r05Var.y(0);
        see seeVar = (see) j1cVar.i;
        g8g g8gVar = seeVar != null ? (g8g) seeVar.g(znhVar) : null;
        if (g8gVar != null) {
            ArrayList arrayList = (ArrayList) j1cVar.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                j1cVar.j = arrayList;
            }
            arrayList.add((dfe) j1cVar.d);
            j1cVar.d = g8gVar.b;
        }
    }
}
