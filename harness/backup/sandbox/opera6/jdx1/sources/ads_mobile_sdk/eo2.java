package ads_mobile_sdk;

import defpackage.ybh;
import defpackage.zq;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eo2 extends kuk implements Function2 {
    public final /* synthetic */ uo2 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo2(uo2 uo2Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = uo2Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        uo2 uo2Var = this.a;
        switch (b) {
            case 0:
                return new eo2(uo2Var, mt5Var, (byte) 0);
            default:
                return new eo2(uo2Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        uo2 uo2Var = this.a;
        switch (b) {
            case 0:
                return new eo2(uo2Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new eo2(uo2Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        uo2 uo2Var = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                fv2 fv2Var = new fv2(uo2Var.m, uo2Var.s.j);
                uo2Var.y = fv2Var;
                zq zqVar = uo2Var.A;
                if (zqVar != null) {
                    zqVar.addView(fv2Var);
                }
                uo2Var.A = null;
                return Unit.a;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ji jiVar = uo2Var.u;
                xtb xtbVar = uo2.B[0];
                if (jiVar.getValue(uo2Var) == null) {
                    return Unit.a;
                }
                h9o.t();
                return null;
        }
    }
}
