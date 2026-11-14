package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gy0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ ry0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy0(ry0 ry0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = ry0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ry0 ry0Var = this.b;
        switch (b) {
            case 0:
                return new gy0(ry0Var, mt5Var, (byte) 0);
            case 1:
                return new gy0(ry0Var, mt5Var, (byte) 1);
            default:
                return new gy0(ry0Var, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        ry0 ry0Var = this.b;
        switch (b) {
            case 0:
                return new gy0(ry0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new gy0(ry0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            default:
                return new gy0(ry0Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        ry0 ry0Var = this.b;
        switch (b) {
            case 0:
                Unit unit = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    mt0 mt0Var = ry0Var.b.o;
                    if (mt0Var != null) {
                        this.a = true;
                        if (mt0Var.a((nt5) this) == unit) {
                            break;
                        }
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                px5 px5Var = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    cy0 cy0Var = ry0Var.b;
                    this.a = true;
                    if (cy0Var.a((mt5) this) == px5Var) {
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
                px5 px5Var2 = px5.a;
                boolean z3 = this.a;
                if (!z3) {
                    ybh.y(obj);
                    cy0 cy0Var2 = ry0Var.b;
                    this.a = true;
                    Object objZ = defpackage.na2.Z(cy0Var2.a, new gy1(cy0Var2, null, (byte) 4), this);
                    if (objZ != px5Var2) {
                        objZ = Unit.a;
                    }
                    if (objZ == px5Var2) {
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
