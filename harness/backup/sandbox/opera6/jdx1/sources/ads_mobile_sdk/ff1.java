package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ff1 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ l61 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff1(l61 l61Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = l61Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new ff1(this.b, mt5Var, (byte) 0);
            default:
                return new ff1(this.b, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return new ff1(this.b, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new ff1(this.b, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        l61 l61Var = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    Object objF = ((k61) l61Var.a.get()).f(this);
                    return objF == px5Var ? px5Var : objF;
                }
                if (z) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    this.a = true;
                    Object objF2 = ((k61) l61Var.a.get()).f(this);
                    return objF2 == px5Var2 ? px5Var2 : objF2;
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
