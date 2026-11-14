package ads_mobile_sdk;

import defpackage.prb;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wq1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ zq1 b;
    public final /* synthetic */ cy0 c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq1(zq1 zq1Var, cy0 cy0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = zq1Var;
        this.c = cy0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        cy0 cy0Var = this.c;
        zq1 zq1Var = this.b;
        switch (b) {
            case 0:
                return new wq1(zq1Var, cy0Var, mt5Var, (byte) 0);
            default:
                return new wq1(zq1Var, cy0Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        cy0 cy0Var = this.c;
        zq1 zq1Var = this.b;
        switch (b) {
            case 0:
                return new wq1(zq1Var, cy0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new wq1(zq1Var, cy0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        cy0 cy0Var = this.c;
        zq1 zq1Var = this.b;
        switch (b) {
            case 0:
                Unit unit = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    bq1 bq1Var = zq1Var.c;
                    this.a = true;
                    if (bq1Var.a(cy0Var) == unit) {
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
                px5 px5Var = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    bq1 bq1Var2 = zq1Var.c;
                    String str = zq1Var.d;
                    this.a = true;
                    bq1Var2.getClass();
                    prb prbVar = new prb();
                    prbVar.r("js", str);
                    Object objA = cy0Var.a(prbVar, "onReadyEventReceived", this);
                    if (objA != px5Var) {
                        objA = Unit.a;
                    }
                    if (objA == px5Var) {
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
