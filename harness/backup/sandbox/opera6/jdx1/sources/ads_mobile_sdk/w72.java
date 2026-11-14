package ads_mobile_sdk;

import defpackage.prb;
import defpackage.ybh;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class w72 extends kuk implements cr9 {
    public boolean a;
    public /* synthetic */ cy0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w72(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.t) {
            case 0:
                w72 w72Var = new w72(3, (mt5) obj3, (byte) 0);
                w72Var.b = (cy0) obj;
                return w72Var.invokeSuspend(Unit.a);
            default:
                w72 w72Var2 = new w72(3, (mt5) obj3, (byte) 1);
                w72Var2.b = (cy0) obj;
                return w72Var2.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    cy0 cy0Var = this.b;
                    prb prbVar = new prb();
                    this.a = true;
                    if (cy0Var.a(prbVar, "onSdkAdUserInteractionClick", this) == px5Var) {
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
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    cy0 cy0Var2 = this.b;
                    prb prbVar2 = new prb();
                    this.a = true;
                    if (cy0Var2.a(prbVar2, "onSdkImpression", this) == px5Var2) {
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
