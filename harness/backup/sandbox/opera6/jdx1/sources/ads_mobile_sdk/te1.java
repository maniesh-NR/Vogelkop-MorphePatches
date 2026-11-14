package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class te1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ ue1 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te1(ue1 ue1Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = ue1Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ue1 ue1Var = this.b;
        switch (b) {
            case 0:
                return new te1(ue1Var, mt5Var, (byte) 0);
            case 1:
                return new te1(ue1Var, mt5Var, (byte) 1);
            default:
                return new te1(ue1Var, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        ue1 ue1Var = this.b;
        switch (b) {
            case 0:
                return new te1(ue1Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new te1(ue1Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            default:
                return new te1(ue1Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        ue1 ue1Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    cy0 cy0Var = ue1Var.a;
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
                if (ue1Var.d.L()) {
                    ue1Var.a = null;
                    xu0.b("WebView deallocated.", null);
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    this.a = true;
                    if (ue1Var.b(this) == px5Var2) {
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
                    this.a = true;
                    if (ue1Var.b(this) == px5Var3) {
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
