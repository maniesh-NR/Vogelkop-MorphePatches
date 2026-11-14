package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class rv6 extends kuk implements cr9 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ float v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv6(byte b, mt5 mt5Var, Object obj) {
        super(3, mt5Var);
        this.t = b;
        this.w = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.t;
        Object obj4 = this.w;
        float fFloatValue = ((Number) obj2).floatValue();
        mt5 mt5Var = (mt5) obj3;
        switch (b) {
            case 0:
                rv6 rv6Var = new rv6((byte) 0, mt5Var, (amj) obj4);
                rv6Var.v = fFloatValue;
                return rv6Var.invokeSuspend(Unit.a);
            default:
                rv6 rv6Var2 = new rv6((byte) 1, mt5Var, (i8m) obj4);
                rv6Var2.v = fFloatValue;
                return rv6Var2.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                rul rulVar = ((amj) obj2).k;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    float f = this.v;
                    tul state = rulVar.getState();
                    wi6 wi6VarC = rulVar.c();
                    we1 we1VarD = rulVar.d();
                    this.u = true;
                    if (so1.i(state, f, wi6VarC, we1VarD, this) == px5Var) {
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
                rul rulVar2 = ((i8m) obj2).o;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    float f2 = this.v;
                    tul state2 = rulVar2.getState();
                    wi6 wi6VarC2 = rulVar2.c();
                    we1 we1VarD2 = rulVar2.d();
                    this.u = true;
                    if (so1.i(state2, f2, wi6VarC2, we1VarD2, this) == px5Var2) {
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
