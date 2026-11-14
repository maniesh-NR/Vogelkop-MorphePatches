package ads_mobile_sdk;

import defpackage.m7p;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pt0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ st0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt0(st0 st0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = st0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        st0 st0Var = this.b;
        switch (b) {
            case 0:
                return new pt0(st0Var, mt5Var, (byte) 0);
            default:
                return new pt0(st0Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        st0 st0Var = this.b;
        switch (b) {
            case 0:
                return new pt0(st0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new pt0(st0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        st0 st0Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    m7p m7pVar = st0Var.F;
                    this.a = true;
                    if (m7pVar.m(this) == px5Var) {
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
                    z2 z2Var = st0Var.N;
                    this.a = true;
                    if (z2Var.g(this) == px5Var2) {
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
