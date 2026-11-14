package ads_mobile_sdk;

import defpackage.pqh;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class uj1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ pqh b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj1(pqh pqhVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = pqhVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new uj1(this.b, mt5Var, (byte) 0);
            default:
                return new uj1(this.b, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return new uj1(this.b, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new uj1(this.b, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        pqh pqhVar = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    cy0 cy0Var = (cy0) pqhVar.a;
                    if (cy0Var != null) {
                        this.a = true;
                        if (cy0Var.a((mt5) this) == px5Var) {
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
                    cy0 cy0Var2 = (cy0) pqhVar.a;
                    if (cy0Var2 != null) {
                        this.a = true;
                        if (cy0Var2.a((mt5) this) == px5Var2) {
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
