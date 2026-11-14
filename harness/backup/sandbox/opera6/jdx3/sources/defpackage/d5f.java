package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class d5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vb0 b;

    public /* synthetic */ d5f(vb0 vb0Var, byte b) {
        this.a = b;
        this.b = vb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        vb0 vb0Var = this.b;
        switch (b) {
            case 0:
                ((td0) obj).b(new d5f(vb0Var, b2));
                break;
            case 1:
                yb0 yb0Var = (yb0) obj;
                yb0Var.a.getClass();
                yr0 yr0Var = new yr0(2443, -1, 1);
                xb0 xb0Var = yb0Var.b;
                List list = (List) xb0Var.n(51);
                ((list == null || list.isEmpty()) ? new hf0(xb0Var, 51, am2.q(xb0Var, 51, 1)) : new hf0(xb0Var, 51, list)).add(yr0Var);
                yr0Var.q(0, 1, vb0Var);
                break;
            case 2:
                yb0 yb0Var2 = (yb0) ((ck0) obj).d().c.getValue();
                yb0Var2.a.getClass();
                of0 of0Var = new of0(2443, -1, 1);
                xb0 xb0Var2 = yb0Var2.b;
                List list2 = (List) xb0Var2.n(49);
                ((list2 == null || list2.isEmpty()) ? new hf0(xb0Var2, 49, am2.q(xb0Var2, 49, 1)) : new hf0(xb0Var2, 49, list2)).add(of0Var);
                of0Var.q(0, 1, vb0Var);
                break;
            default:
                yb0 yb0Var3 = (yb0) obj;
                yb0Var3.a.getClass();
                dv0 dv0Var = new dv0(2443, -1, 1);
                xb0 xb0Var3 = yb0Var3.b;
                List list3 = (List) xb0Var3.n(52);
                ((list3 == null || list3.isEmpty()) ? new hf0(xb0Var3, 52, am2.q(xb0Var3, 52, 1)) : new hf0(xb0Var3, 52, list3)).add(dv0Var);
                dv0Var.q(0, 1, vb0Var);
                break;
        }
        return Unit.a;
    }
}
