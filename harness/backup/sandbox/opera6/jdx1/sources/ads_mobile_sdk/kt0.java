package ads_mobile_sdk;

import defpackage.prb;
import defpackage.wp9;
import defpackage.xp9;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kt0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ mt0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt0(mt0 mt0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = mt0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        mt0 mt0Var = this.b;
        switch (b) {
            case 0:
                return new kt0(mt0Var, mt5Var, (byte) 0);
            case 1:
                return new kt0(mt0Var, mt5Var, (byte) 1);
            case 2:
                return new kt0(mt0Var, mt5Var, (byte) 2);
            case 3:
                return new kt0(mt0Var, mt5Var, (byte) 3);
            case 4:
                return new kt0(mt0Var, mt5Var, (byte) 4);
            default:
                return new kt0(mt0Var, mt5Var, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        mt0 mt0Var = this.b;
        switch (b) {
            case 0:
                return new kt0(mt0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new kt0(mt0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new kt0(mt0Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new kt0(mt0Var, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            case 4:
                return new kt0(mt0Var, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            default:
                return new kt0(mt0Var, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        mt0 mt0Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    if (mt0Var.c(this) == px5Var) {
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
                    cy0 cy0VarJ = mt0Var.j();
                    this.a = true;
                    if (mt0Var.b(cy0VarJ, this) == px5Var2) {
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
                    if (mt0Var.b(this) == px5Var3) {
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
                    cy0 cy0VarJ2 = mt0Var.j();
                    prb prbVar = new prb();
                    this.a = true;
                    if (cy0VarJ2.a(prbVar, "onbackblocked", this) == px5Var4) {
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
                    xp9 xp9Var = new xp9(wp9.INTERNAL_ERROR, "Internal error attempting to show fullscreen content.", null);
                    this.a = true;
                    if (mt0Var.a(xp9Var, (mt5) this) == px5Var5) {
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
                    xp9 xp9Var2 = new xp9(wp9.INTERNAL_ERROR, "Internal error attempting to show fullscreen content.", null);
                    this.a = true;
                    if (mt0Var.a(xp9Var2, (mt5) this) == px5Var6) {
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
