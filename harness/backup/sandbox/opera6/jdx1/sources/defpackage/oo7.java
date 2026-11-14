package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class oo7 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ no7 u;
    public final /* synthetic */ ty v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo7(no7 no7Var, ty tyVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = no7Var;
        this.v = tyVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ty tyVar = this.v;
        no7 no7Var = this.u;
        switch (b) {
            case 0:
                return new oo7(no7Var, tyVar, mt5Var, (byte) 0);
            default:
                return new oo7(no7Var, tyVar, mt5Var, (byte) 1);
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
        ty tyVar = this.v;
        no7 no7Var = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                no7Var.g(tyVar);
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                no7Var.p(tyVar);
                break;
        }
        return Unit.a;
    }
}
