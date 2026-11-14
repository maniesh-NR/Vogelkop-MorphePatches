package ads_mobile_sdk;

import defpackage.wp9;
import defpackage.xp9;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sn0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ xn0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn0(xn0 xn0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = xn0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        xn0 xn0Var = this.b;
        switch (b) {
            case 0:
                return new sn0(xn0Var, mt5Var, (byte) 0);
            case 1:
                return new sn0(xn0Var, mt5Var, (byte) 1);
            default:
                return new sn0(xn0Var, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        xn0 xn0Var = this.b;
        switch (b) {
            case 0:
                return new sn0(xn0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new sn0(xn0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            default:
                return new sn0(xn0Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        xn0 xn0Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    z2 z2Var = xn0Var.M;
                    this.a = true;
                    if (z2Var.g(this) == px5Var) {
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
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    cy0 cy0Var = (cy0) xn0Var.H.getValue();
                    this.a = true;
                    if (xn0Var.b(cy0Var, this) == px5Var2) {
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
                boolean z3 = this.a;
                if (!z3) {
                    ybh.y(obj);
                    z2 z2Var2 = xn0Var.M;
                    xp9 xp9Var = new xp9(wp9.INTERNAL_ERROR, "show() is not supported for cross-process ad.", null);
                    this.a = true;
                    if (z2Var2.a(xp9Var, (mt5) this) == px5Var3) {
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
