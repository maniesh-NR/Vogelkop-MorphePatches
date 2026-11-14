package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ y3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(y3 y3Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = y3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        y3 y3Var = this.u;
        switch (b) {
            case 0:
                return new x3(y3Var, mt5Var, (byte) 0);
            default:
                return new x3(y3Var, mt5Var, (byte) 1);
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
        mt5 mt5Var = null;
        y3 y3Var = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                if (y3Var.D == null) {
                    cma cmaVar = new cma();
                    lde ldeVar = y3Var.q;
                    if (ldeVar != null) {
                        na2.B(y3Var.H0(), null, null, new r3(ldeVar, cmaVar, mt5Var, (byte) 0), 3);
                    }
                    y3Var.D = cmaVar;
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                cma cmaVar2 = y3Var.D;
                if (cmaVar2 != null) {
                    dma dmaVar = new dma(cmaVar2);
                    lde ldeVar2 = y3Var.q;
                    if (ldeVar2 != null) {
                        na2.B(y3Var.H0(), null, null, new r3(ldeVar2, dmaVar, mt5Var, (byte) 1), 3);
                    }
                    y3Var.D = null;
                }
                break;
        }
        return Unit.a;
    }
}
