package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class t5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr0 b;

    public /* synthetic */ t5f(vr0 vr0Var, byte b) {
        this.a = b;
        this.b = vr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vr0 vr0Var = this.b;
        td0 td0Var = (td0) obj;
        switch (b) {
            case 0:
                td0Var.a.getClass();
                tr0 tr0Var = new tr0(2443, -1, 1);
                qd0 qd0Var = td0Var.b;
                List list = (List) qd0Var.n(61);
                ((list == null || list.isEmpty()) ? new hf0(qd0Var, 61, vep.t(qd0Var, 61, 1)) : new hf0(qd0Var, 61, list)).add(tr0Var);
                tr0Var.q(0, vr0Var == null ? 0 : 1, vr0Var);
                break;
            default:
                td0Var.a.getClass();
                ur0 ur0Var = new ur0(2443, -1, 1);
                qd0 qd0Var2 = td0Var.b;
                List list2 = (List) qd0Var2.n(60);
                ((list2 == null || list2.isEmpty()) ? new hf0(qd0Var2, 60, vep.t(qd0Var2, 60, 1)) : new hf0(qd0Var2, 60, list2)).add(ur0Var);
                ur0Var.q(0, vr0Var == null ? 0 : 1, vr0Var);
                break;
        }
        return Unit.a;
    }
}
