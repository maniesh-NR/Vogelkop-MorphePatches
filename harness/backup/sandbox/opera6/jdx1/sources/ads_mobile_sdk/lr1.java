package ads_mobile_sdk;

import defpackage.jdp;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lr1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ rr1 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr1(rr1 rr1Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = rr1Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        rr1 rr1Var = this.b;
        switch (b) {
            case 0:
                return new lr1(rr1Var, mt5Var, (byte) 0);
            default:
                return new lr1(rr1Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        rr1 rr1Var = this.b;
        switch (b) {
            case 0:
                return new lr1(rr1Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new lr1(rr1Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        rr1 rr1Var = this.b;
        switch (b) {
            case 0:
                Unit unit = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    jdp jdpVar = (jdp) rr1Var.f.get();
                    this.a = true;
                    if (jdpVar.h(this) == unit) {
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
                Unit unit2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    jdp jdpVar2 = (jdp) rr1Var.f.get();
                    this.a = true;
                    if (jdpVar2.d(this) == unit2) {
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
