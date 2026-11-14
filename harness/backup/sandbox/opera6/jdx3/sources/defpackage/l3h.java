package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l3h extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ i07 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3h(i07 i07Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = i07Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        i07 i07Var = this.v;
        switch (b) {
            case 0:
                return new l3h(i07Var, mt5Var, (byte) 0);
            default:
                return new l3h(i07Var, mt5Var, (byte) 1);
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
        i07 i07Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    Object objA = i07Var.A(this);
                    return objA == px5Var ? px5Var : objA;
                }
                if (z) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    Object objA2 = i07Var.A(this);
                    return objA2 == px5Var2 ? px5Var2 : objA2;
                }
                if (z2) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
