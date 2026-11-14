package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q78 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ u78 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q78(u78 u78Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = u78Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        u78 u78Var = this.v;
        switch (b) {
            case 0:
                return new q78(u78Var, mt5Var, (byte) 0);
            default:
                return new q78(u78Var, mt5Var, (byte) 1);
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
        u78 u78Var = this.v;
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
                plh plhVar = u78Var.m;
                xf xfVar = new xf(2, null, (byte) 14);
                this.u = true;
                Object objF = cs5.F(plhVar, xfVar, this);
                return objF == px5Var ? px5Var : objF;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    t78 t78Var = new t78((byte) 0, (mt5) null, u78Var);
                    this.u = true;
                    if (zch.A(t78Var, this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    Object obj2 = ((t0i) obj).a;
                }
                return Unit.a;
        }
    }
}
