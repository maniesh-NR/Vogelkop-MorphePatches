package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class dg2 extends kuk implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ jz2 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg2(jz2 jz2Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = jz2Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                dg2 dg2Var = new dg2(this.b, mt5Var, (byte) 0);
                dg2Var.a = obj;
                return dg2Var;
            default:
                dg2 dg2Var2 = new dg2(this.b, mt5Var, (byte) 1);
                dg2Var2.a = obj;
                return dg2Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                dg2 dg2Var = new dg2(this.b, (mt5) obj2, (byte) 0);
                dg2Var.a = (cy0) obj;
                return dg2Var.invokeSuspend(Unit.a);
            default:
                dg2 dg2Var2 = new dg2(this.b, (mt5) obj2, (byte) 1);
                dg2Var2.a = (cy0) obj;
                return dg2Var2.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                ry0 ry0Var = ((cy0) this.a).z;
                (ry0Var != null ? ry0Var : null).u = this.b;
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                cy0 cy0Var = (cy0) this.a;
                ry0 ry0Var2 = cy0Var.z;
                (ry0Var2 != null ? ry0Var2 : null).u = this.b;
                cy0Var.setOnClickListener(new pkm(this.b, (byte) 18));
                cy0Var.setOnTouchListener(new m42(this.b, (byte) 10));
                break;
        }
        return Unit.a;
    }
}
