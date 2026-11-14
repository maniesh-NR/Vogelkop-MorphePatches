package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fxf extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ gu6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fxf(gu6 gu6Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = gu6Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        gu6 gu6Var = this.v;
        switch (b) {
            case 0:
                return new fxf(gu6Var, mt5Var, (byte) 0);
            case 1:
                return new fxf(gu6Var, mt5Var, (byte) 1);
            default:
                return new fxf(gu6Var, mt5Var, (byte) 2);
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
        Object objF;
        Object objF2;
        byte b = this.t;
        gu6 gu6Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    txf txfVar = uxf.a;
                    if (gu6Var.k() - 1 < 0 || (objF = gu6Var.f(gu6Var.k() - 1, rm5.R(0.0f, 0.0f, null, 7), this)) != px5Var) {
                        objF = Unit.a;
                    }
                    if (objF == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    txf txfVar2 = uxf.a;
                    if (gu6Var.k() + 1 >= gu6Var.n() || (objF2 = gu6Var.f(gu6Var.k() + 1, rm5.R(0.0f, 0.0f, null, 7), this)) != px5Var2) {
                        objF2 = Unit.a;
                    }
                    if (objF2 == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    Object objS = sxf.s(gu6Var, gfe.a, new wv0(2, (mt5) null, (byte) 3), this);
                    if (objS != px5Var3) {
                        objS = Unit.a;
                    }
                    if (objS == px5Var3) {
                        break;
                    }
                } else if (!z3) {
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
