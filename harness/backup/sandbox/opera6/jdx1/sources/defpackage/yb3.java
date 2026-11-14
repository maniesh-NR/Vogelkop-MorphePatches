package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class yb3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ pmg w;
    public final /* synthetic */ ztl x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb3(pmg pmgVar, ztl ztlVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = pmgVar;
        this.x = ztlVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                yb3 yb3Var = new yb3(this.w, this.x, mt5Var, (byte) 0);
                yb3Var.v = obj;
                return yb3Var;
            default:
                yb3 yb3Var2 = new yb3(this.w, this.x, mt5Var, (byte) 1);
                yb3Var2.v = obj;
                return yb3Var2;
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
        ztl ztlVar = this.x;
        pmg pmgVar = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    xb3 xb3Var = new xb3((nx5) this.v, ztlVar, null);
                    this.u = true;
                    if (z4o.n(pmgVar, xb3Var, this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    ac3 ac3Var = new ac3((nx5) this.v, ztlVar, null);
                    this.u = true;
                    if (((vuk) pmgVar).T0(ac3Var, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
