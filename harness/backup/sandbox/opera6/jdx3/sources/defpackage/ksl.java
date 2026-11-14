package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ksl extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ xbf v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ksl(xbf xbfVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = xbfVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        xbf xbfVar = this.v;
        switch (b) {
            case 0:
                return new ksl(xbfVar, mt5Var, (byte) 0);
            default:
                return new ksl(xbfVar, mt5Var, (byte) 1);
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
        xbf xbfVar = this.v;
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
                nh4 nh4Var = new nh4(1, hib.b(this));
                nh4Var.s();
                xbfVar.z(new bha(nh4Var, (byte) 9));
                Object objQ = nh4Var.q();
                return objQ == px5Var ? px5Var : objQ;
            default:
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
                nh4 nh4Var2 = new nh4(1, hib.b(this));
                nh4Var2.s();
                xbfVar.A(new bha(nh4Var2, (byte) 10));
                Object objQ2 = nh4Var2.q();
                return objQ2 == px5Var2 ? px5Var2 : objQ2;
        }
    }
}
