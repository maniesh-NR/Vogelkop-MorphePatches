package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w94 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ cd5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w94(cd5 cd5Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = cd5Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        cd5 cd5Var = this.v;
        switch (b) {
            case 0:
                return new w94(cd5Var, mt5Var, (byte) 0);
            case 1:
                return new w94(cd5Var, mt5Var, (byte) 1);
            case 2:
                return new w94(cd5Var, mt5Var, (byte) 2);
            default:
                return new w94(cd5Var, mt5Var, (byte) 3);
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
        cd5 cd5Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    if (cd5Var.A(this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    Object objA = cd5Var.A(this);
                    return objA == px5Var2 ? px5Var2 : objA;
                }
                if (z2) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    if (nb6.p(5000L, this) == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                cd5Var.j0(new eg9(false));
                return Unit.a;
            default:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    this.u = true;
                    Object objA2 = cd5Var.A(this);
                    return objA2 == px5Var4 ? px5Var4 : objA2;
                }
                if (z4) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
