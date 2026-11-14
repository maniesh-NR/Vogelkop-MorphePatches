package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ey6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ gy6 u;
    public final /* synthetic */ pzh v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey6(gy6 gy6Var, pzh pzhVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = gy6Var;
        this.v = pzhVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        pzh pzhVar = this.v;
        gy6 gy6Var = this.u;
        switch (b) {
            case 0:
                return new ey6(gy6Var, pzhVar, mt5Var, (byte) 0);
            default:
                return new ey6(gy6Var, pzhVar, mt5Var, (byte) 1);
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
        pzh pzhVar = this.v;
        gy6 gy6Var = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                return gy6Var.c.a(pzhVar.g.string(), doe.Companion.serializer());
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                return gy6Var.c.a(pzhVar.g.string(), vne.Companion.serializer());
        }
    }
}
