package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class muj extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ afe x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ muj(Function2 function2, afe afeVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = function2;
        this.x = afeVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                muj mujVar = new muj(this.w, this.x, mt5Var, (byte) 0);
                mujVar.v = obj;
                return mujVar;
            case 1:
                muj mujVar2 = new muj(this.w, this.x, mt5Var, (byte) 1);
                mujVar2.v = obj;
                return mujVar2;
            default:
                muj mujVar3 = new muj(this.w, this.x, mt5Var, (byte) 2);
                mujVar3.v = obj;
                return mujVar3;
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
        afe afeVar = this.x;
        Function2 function2 = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    y1h y1hVar = new y1h(afeVar, ((nx5) this.v).l());
                    this.u = true;
                    if (function2.invoke(y1hVar, this) == px5Var) {
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
                    y1h y1hVar2 = new y1h(afeVar, ((nx5) this.v).l());
                    this.u = true;
                    if (function2.invoke(y1hVar2, this) == px5Var2) {
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
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    y1h y1hVar3 = new y1h(afeVar, ((nx5) this.v).l());
                    this.u = true;
                    if (function2.invoke(y1hVar3, this) == px5Var3) {
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
