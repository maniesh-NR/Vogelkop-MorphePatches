package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cqc extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ dqc v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqc(dqc dqcVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = dqcVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        dqc dqcVar = this.v;
        switch (b) {
            case 0:
                return new cqc(dqcVar, mt5Var, (byte) 0);
            default:
                return new cqc(dqcVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        dqc dqcVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    cq6 cq6Var = (cq6) dqcVar.b.get();
                    this.u = true;
                    if (cq6Var.a(this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    Object obj2 = ((t0i) obj).a;
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    cq6 cq6Var2 = (cq6) dqcVar.b.get();
                    this.u = true;
                    if (cq6Var2.b(this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    Object obj3 = ((t0i) obj).a;
                }
                break;
        }
        return Unit.a;
    }
}
