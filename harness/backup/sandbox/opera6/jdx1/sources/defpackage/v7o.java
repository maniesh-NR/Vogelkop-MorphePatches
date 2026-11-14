package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v7o extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ w7o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7o(w7o w7oVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = w7oVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        w7o w7oVar = this.v;
        switch (b) {
            case 0:
                return new v7o(w7oVar, mt5Var, (byte) 0);
            default:
                return new v7o(w7oVar, mt5Var, (byte) 1);
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
        w7o w7oVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    v31 v31Var = w7oVar.a;
                    this.u = true;
                    Object objL = v31Var.v.l(this);
                    if (objL != px5Var) {
                        objL = Unit.a;
                    }
                    if (objL == px5Var) {
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
                    v31 v31Var2 = w7oVar.a;
                    this.u = true;
                    Object objA = v31Var2.w.a(this);
                    if (objA != px5Var2) {
                        objA = Unit.a;
                    }
                    if (objA == px5Var2) {
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
