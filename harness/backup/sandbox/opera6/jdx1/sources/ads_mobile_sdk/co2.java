package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class co2 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ uo2 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co2(uo2 uo2Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = uo2Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        uo2 uo2Var = this.b;
        switch (b) {
            case 0:
                return new co2(uo2Var, mt5Var, (byte) 0);
            default:
                return new co2(uo2Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        uo2 uo2Var = this.b;
        switch (b) {
            case 0:
                return new co2(uo2Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new co2(uo2Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        uo2 uo2Var = this.b;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    vs2 vs2Var = uo2Var.q;
                    this.a = true;
                    if (vs2Var.c(this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                ((td1) uo2Var.t.a("The backing field has not yet been initialized.")).destroy();
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    CoroutineContext coroutineContext = uo2Var.n;
                    eo2 eo2Var = new eo2(uo2Var, mt5Var, (byte) 0);
                    this.a = true;
                    if (defpackage.na2.Z(coroutineContext, eo2Var, this) == px5Var2) {
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
