package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class krc extends lim {
    public final u55 a;
    public final orm b;
    public long c;

    public krc(u55 u55Var, orm ormVar) {
        this.a = u55Var;
        this.b = ormVar;
        ((ulp) u55Var).getClass();
        this.c = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        hf0 hf0Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        x5f x5fVar = (x5f) this.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            ug0 ug0VarY = x56VarF.E(zpaVar).y(zpaVar);
            List list = (List) ug0VarY.n(0);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ug0VarY.q(0, 1, arrayList);
                hf0Var = new hf0(ug0VarY, 0, arrayList);
            } else {
                hf0Var = new hf0(ug0VarY, 0, list);
            }
            hf0Var.add(Long.valueOf(jElapsedRealtime));
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.a.getClass();
        this.c = SystemClock.elapsedRealtime();
    }
}
