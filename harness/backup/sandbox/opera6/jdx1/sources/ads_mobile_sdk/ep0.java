package ads_mobile_sdk;

import defpackage.fvo;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ep0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ qp0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep0(qp0 qp0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = qp0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        qp0 qp0Var = this.b;
        switch (b) {
            case 0:
                return new ep0(qp0Var, mt5Var, (byte) 0);
            default:
                return new ep0(qp0Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        qp0 qp0Var = this.b;
        switch (b) {
            case 0:
                return new ep0(qp0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new ep0(qp0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        qp0 qp0Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    fvo fvoVar = (fvo) qp0Var.c.get();
                    if (fvoVar != null) {
                        this.a = true;
                        if (qp0.b(qp0Var, fvoVar, (nt5) this) == px5Var) {
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
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    fvo fvoVar2 = (fvo) qp0Var.c.get();
                    if (fvoVar2 != null) {
                        this.a = true;
                        if (qp0.a(qp0Var, fvoVar2, (nt5) this) == px5Var2) {
                            break;
                        }
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
