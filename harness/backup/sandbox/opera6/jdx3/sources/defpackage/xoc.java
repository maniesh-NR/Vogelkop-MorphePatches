package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class xoc {
    public final x5f a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean e;

    public xoc(x5f x5fVar) {
        this.a = x5fVar;
    }

    public final void a(tg0 tg0Var) {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            sg0 sg0Var = new sg0(2443, -1, 1);
            sg0Var.q(0, 1, tg0Var);
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(10);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 10, vep.t(qd0VarB, 10, 1)) : new hf0(qd0VarB, 10, list)).add(sg0Var);
            x5fVar.U0(x56VarF);
        }
    }
}
