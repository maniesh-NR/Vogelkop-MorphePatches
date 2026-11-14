package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class q5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ vb0 c;

    public /* synthetic */ q5f(long j, vb0 vb0Var, byte b) {
        this.a = b;
        this.b = j;
        this.c = vb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vb0 vb0Var = this.c;
        long j = this.b;
        yb0 yb0Var = (yb0) obj;
        switch (b) {
            case 0:
                yb0Var.a.getClass();
                g66 g66Var = new g66(2443, -1, 2);
                xb0 xb0Var = yb0Var.b;
                List list = (List) xb0Var.n(53);
                ((list == null || list.isEmpty()) ? new hf0(xb0Var, 53, am2.q(xb0Var, 53, 1)) : new hf0(xb0Var, 53, list)).add(g66Var);
                g66Var.p(0, 1, j);
                g66Var.q(1, 1, vb0Var);
                break;
            default:
                yb0Var.a.getClass();
                f66 f66Var = new f66(2443, -1, 2);
                xb0 xb0Var2 = yb0Var.b;
                List list2 = (List) xb0Var2.n(54);
                ((list2 == null || list2.isEmpty()) ? new hf0(xb0Var2, 54, am2.q(xb0Var2, 54, 1)) : new hf0(xb0Var2, 54, list2)).add(f66Var);
                f66Var.p(0, 1, j);
                f66Var.q(1, 1, vb0Var);
                break;
        }
        return Unit.a;
    }
}
