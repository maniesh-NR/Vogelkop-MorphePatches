package ads_mobile_sdk;

import defpackage.prb;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class aq1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ cy0 b;
    public final /* synthetic */ prb c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq1(cy0 cy0Var, prb prbVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = cy0Var;
        this.c = prbVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        prb prbVar = this.c;
        cy0 cy0Var = this.b;
        switch (b) {
            case 0:
                return new aq1(cy0Var, prbVar, mt5Var, (byte) 0);
            case 1:
                return new aq1(cy0Var, prbVar, mt5Var, (byte) 1);
            case 2:
                return new aq1(cy0Var, prbVar, mt5Var, (byte) 2);
            default:
                return new aq1(cy0Var, prbVar, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        prb prbVar = this.c;
        cy0 cy0Var = this.b;
        switch (b) {
            case 0:
                return new aq1(cy0Var, prbVar, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new aq1(cy0Var, prbVar, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new aq1(cy0Var, prbVar, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            default:
                return new aq1(cy0Var, prbVar, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        prb prbVar = this.c;
        cy0 cy0Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    if (cy0Var.a(prbVar, "onScreenInfoChanged", this) == px5Var) {
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
                    this.a = true;
                    if (cy0Var.a(prbVar, "onAdVisibilityChanged", this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.a;
                if (!z3) {
                    ybh.y(obj);
                    this.a = true;
                    if (cy0Var.b(prbVar, "google.afma.nativeAds.renderVideo", this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var4 = px5.a;
                boolean z4 = this.a;
                if (!z4) {
                    ybh.y(obj);
                    this.a = true;
                    if (cy0Var.a(prbVar, "onshow", this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
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
