package defpackage;

import android.app.NotificationManager;
import java.util.List;

/* loaded from: classes.dex */
public final class y0f implements fd2 {
    public final x5f a;

    public /* synthetic */ y0f(x5f x5fVar) {
        this.a = x5fVar;
    }

    public final void a(msh mshVar) {
        x5f x5fVar = this.a;
        zpa zpaVar = x5fVar.d;
        if (x5fVar.h) {
            x56 x56VarF = zpa.F();
            x56VarF.E(zpaVar).z(zpaVar).e(0);
            x5fVar.U0(x56VarF);
        }
        nb8 nb8Var = mshVar.B;
        if (nb8Var != null) {
            String str = nb8Var.i;
            if (x5fVar.h) {
                x56 x56VarF2 = zpa.F();
                new ck0(zpaVar, x56VarF2).j(new j5f(str, od0.b, 5));
                x5fVar.U0(x56VarF2);
            }
        }
    }

    @Override // defpackage.fd2
    public final Object b(Object obj) {
        q0i q0iVar;
        NotificationManager notificationManager = (NotificationManager) obj;
        try {
            p0i p0iVar = t0i.b;
            q0iVar = notificationManager.getNotificationChannels();
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (!(q0iVar instanceof q0i)) {
            q0iVar = Integer.valueOf(((List) q0iVar).size());
        }
        return new t0i(q0iVar);
    }

    public final void c(rs0 rs0Var) {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            qs0 qs0Var = new qs0(2443, -1, 1);
            qs0Var.q(0, rs0Var == null ? 0 : 1, rs0Var);
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(40);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 40, vep.t(qd0VarB, 40, 1)) : new hf0(qd0VarB, 40, list)).add(qs0Var);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.fd2
    public final void onResult(Object obj) {
        Object obj2 = ((t0i) obj).a;
        if (t0i.d(obj2) == null) {
            long jIntValue = ((Number) obj2).intValue();
            x5f x5fVar = this.a;
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.N(zpaVar).p(6, 1, jIntValue);
            x5fVar.U0(x56VarF);
        }
    }
}
