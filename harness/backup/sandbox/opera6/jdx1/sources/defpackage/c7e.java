package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c7e extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ pej v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7e(pej pejVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = pejVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        pej pejVar = this.v;
        switch (b) {
            case 0:
                return new c7e(pejVar, mt5Var, (byte) 0);
            case 1:
                return new c7e(pejVar, mt5Var, (byte) 1);
            case 2:
                return new c7e(pejVar, mt5Var, (byte) 2);
            case 3:
                return new c7e(pejVar, mt5Var, (byte) 3);
            case 4:
                return new c7e(pejVar, mt5Var, (byte) 4);
            case 5:
                return new c7e(pejVar, mt5Var, (byte) 5);
            case 6:
                return new c7e(pejVar, mt5Var, (byte) 6);
            default:
                return new c7e(pejVar, mt5Var, (byte) 7);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        pej pejVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.f(this) == px5Var) {
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
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.d(this) == px5Var2) {
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
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.g(this) == px5Var3) {
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
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.d(this) == px5Var4) {
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
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.b(this) == px5Var5) {
                        break;
                    }
                } else if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 5:
                px5 px5Var6 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.g(this) == px5Var6) {
                        break;
                    }
                } else if (!z6) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 6:
                px5 px5Var7 = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.b(this) == px5Var7) {
                        break;
                    }
                } else if (!z7) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var8 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    this.u = true;
                    if (pejVar.f(this) == px5Var8) {
                        break;
                    }
                } else if (!z8) {
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
