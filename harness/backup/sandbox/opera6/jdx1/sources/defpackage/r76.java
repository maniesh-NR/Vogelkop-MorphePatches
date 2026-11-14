package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r76 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Function1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r76(Function1 function1, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 2;
        this.w = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r76(mt5 mt5Var, Function1 function1, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                r76 r76Var = new r76(mt5Var, this.w, (byte) 0);
                r76Var.v = obj;
                return r76Var;
            case 1:
                r76 r76Var2 = new r76(mt5Var, this.w, (byte) 1);
                r76Var2.v = obj;
                return r76Var2;
            default:
                r76 r76Var3 = new r76(this.w, mt5Var);
                r76Var3.v = obj;
                return r76Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((g3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((g3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Function1 function1 = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                this.u = true;
                Object objInvoke = function1.invoke(this);
                return objInvoke == px5Var ? px5Var : objInvoke;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                this.u = true;
                Object objInvoke2 = function1.invoke(this);
                return objInvoke2 == px5Var2 ? px5Var2 : objInvoke2;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    if (((nx5) this.v).l().get(k0m.b) != null) {
                        this.u = true;
                        Object objInvoke3 = function1.invoke(this);
                        return objInvoke3 == px5Var3 ? px5Var3 : objInvoke3;
                    }
                    qp2.n("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (z3) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
