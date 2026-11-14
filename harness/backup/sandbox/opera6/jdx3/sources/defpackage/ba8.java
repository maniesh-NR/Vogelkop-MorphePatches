package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ba8 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ x5f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba8(x5f x5fVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = x5fVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        x5f x5fVar = this.v;
        switch (b) {
            case 0:
                ba8 ba8Var = new ba8(x5fVar, mt5Var, (byte) 0);
                ba8Var.u = obj;
                return ba8Var;
            case 1:
                ba8 ba8Var2 = new ba8(x5fVar, mt5Var, (byte) 1);
                ba8Var2.u = obj;
                return ba8Var2;
            default:
                ba8 ba8Var3 = new ba8(x5fVar, mt5Var, (byte) 2);
                ba8Var3.u = obj;
                return ba8Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((qe0) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((q3h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((dpn) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        x5f x5fVar = this.v;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                qe0 qe0Var = (qe0) obj2;
                px5 px5Var = px5.a;
                ybh.y(obj);
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                kd0 kd0Var = ((ld0) ((nd0) new ck0(zpaVar, x56VarF).v.getValue()).c.getValue()).b;
                kd0Var.getClass();
                kd0Var.q(5, qe0Var == null ? 0 : 1, qe0Var);
                x5fVar.U0(x56VarF);
                break;
            case 1:
                q3h q3hVar = (q3h) obj2;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                if (!(q3hVar instanceof o3h)) {
                    if (!Intrinsics.a(q3hVar, p3h.a)) {
                        h9o.p();
                        break;
                    } else {
                        x5fVar.N0(24);
                    }
                } else {
                    o3h o3hVar = (o3h) q3hVar;
                    x5fVar.M0(24, o3hVar.b, o3hVar.a);
                }
                break;
            default:
                dpn dpnVar = (dpn) obj2;
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                if (!(dpnVar instanceof bpn)) {
                    if (!Intrinsics.a(dpnVar, cpn.a)) {
                        h9o.p();
                        break;
                    } else {
                        x5fVar.N0(23);
                    }
                } else {
                    bpn bpnVar = (bpn) dpnVar;
                    x5fVar.M0(23, bpnVar.b, bpnVar.a);
                }
                break;
        }
        return null;
    }
}
