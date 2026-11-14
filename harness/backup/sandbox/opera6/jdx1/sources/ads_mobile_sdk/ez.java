package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ez extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ vz b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez(vz vzVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = vzVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        vz vzVar = this.b;
        switch (b) {
            case 0:
                return new ez(vzVar, mt5Var, (byte) 0);
            case 1:
                return new ez(vzVar, mt5Var, (byte) 1);
            case 2:
                return new ez(vzVar, mt5Var, (byte) 2);
            case 3:
                return new ez(vzVar, mt5Var, (byte) 3);
            case 4:
                return new ez(vzVar, mt5Var, (byte) 4);
            default:
                return new ez(vzVar, mt5Var, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        vz vzVar = this.b;
        switch (b) {
            case 0:
                return new ez(vzVar, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new ez(vzVar, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new ez(vzVar, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new ez(vzVar, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            case 4:
                return new ez(vzVar, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            default:
                return new ez(vzVar, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        vz vzVar = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    if (vz.b(vzVar, false, true, this) == px5Var) {
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
                    if (vz.a(vzVar, (nt5) this) == px5Var2) {
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
                    obj = vzVar.y(this);
                    if (obj == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z4 = this.a;
                if (!z4) {
                    ybh.y(obj);
                    this.a = true;
                    obj = vz.h(vzVar, this);
                    if (obj == px5Var4) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 4:
                px5 px5Var5 = px5.a;
                boolean z5 = this.a;
                if (!z5) {
                    ybh.y(obj);
                    ae2 ae2Var = vzVar.x;
                    this.a = true;
                    ae2Var.getClass();
                    if (ae2.a(ae2Var, bc2.CLEAR_REASON_CONSENT_ALLOWLIST_CHANGED, true, (nt5) this) == px5Var5) {
                        break;
                    }
                } else if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var6 = px5.a;
                boolean z6 = this.a;
                if (!z6) {
                    ybh.y(obj);
                    ae2 ae2Var2 = vzVar.x;
                    this.a = true;
                    ae2Var2.getClass();
                    if (ae2.a(ae2Var2, bc2.CLEAR_REASON_CONSENT_DENIED, false, (nt5) this) == px5Var6) {
                        break;
                    }
                } else if (!z6) {
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
