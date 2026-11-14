package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n07 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ u07 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n07(u07 u07Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = u07Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        u07 u07Var = this.v;
        switch (b) {
            case 0:
                return new n07(u07Var, mt5Var, (byte) 0);
            case 1:
                return new n07(u07Var, mt5Var, (byte) 1);
            default:
                return new n07(u07Var, mt5Var, (byte) 2);
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
        u07 u07Var = this.v;
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
                ism ismVarN = u07Var.n();
                this.u = true;
                Object objB = ismVarN.b(this);
                return objB == px5Var ? px5Var : objB;
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
                cd5 cd5VarE = u07Var.n().e();
                this.u = true;
                Object objA = cd5VarE.A(this);
                return objA == px5Var2 ? px5Var2 : objA;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (z3) {
                    if (z3) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                cd5 cd5VarF = u07Var.n().f();
                this.u = true;
                Object objA2 = cd5VarF.A(this);
                return objA2 == px5Var3 ? px5Var3 : objA2;
        }
    }
}
