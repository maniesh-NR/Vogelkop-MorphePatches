package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ue4 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ ve4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue4(ve4 ve4Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = ve4Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ve4 ve4Var = this.v;
        switch (b) {
            case 0:
                return new ue4(ve4Var, mt5Var, (byte) 0);
            default:
                return new ue4(ve4Var, mt5Var, (byte) 1);
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
        ve4 ve4Var = this.v;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    unb unbVar = ve4Var.a;
                    this.u = true;
                    unbVar.k((CancellationException) null);
                    Object objZ = unbVar.Z(this);
                    if (objZ != px5Var) {
                        objZ = Unit.a;
                    }
                    if (objZ == px5Var) {
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
                ue4 ue4Var = new ue4(ve4Var, mt5Var, (byte) 0);
                this.u = true;
                Object objW = uyg.w(3000L, ue4Var, this);
                return objW == px5Var2 ? px5Var2 : objW;
        }
    }
}
