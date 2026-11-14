package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class xq6 extends kuk implements dr9 {
    public final /* synthetic */ byte t = 0;
    public /* synthetic */ Object u;
    public /* synthetic */ Object v;
    public /* synthetic */ Object w;

    public /* synthetic */ xq6(int i, mt5 mt5Var) {
        super(i, mt5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq6(v1 v1Var, mt5 mt5Var) {
        super(4, mt5Var);
        this.w = v1Var;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                d2g d2gVar = (d2g) this.u;
                y1g y1gVar = (y1g) this.v;
                vq6 vq6Var = (vq6) this.w;
                px5 px5Var = px5.a;
                ybh.y(obj);
                return new dla(y1gVar, d2gVar, vq6Var.a, vq6Var.b, vq6Var.d, vq6Var.c);
            default:
                t8k t8kVar = (t8k) this.u;
                apn apnVar = (apn) this.v;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                t8kVar.getClass();
                r1 r1VarV = ((v1) this.w).v();
                return Boolean.valueOf(r1VarV != null ? r1VarV.f : apnVar.c());
        }
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.t) {
            case 0:
                xq6 xq6Var = new xq6(4, (mt5) obj4);
                xq6Var.u = (d2g) obj;
                xq6Var.v = (y1g) obj2;
                xq6Var.w = (vq6) obj3;
                return xq6Var.invokeSuspend(Unit.a);
            default:
                xq6 xq6Var2 = new xq6((v1) this.w, (mt5) obj4);
                xq6Var2.u = (t8k) obj;
                xq6Var2.v = (apn) obj2;
                return xq6Var2.invokeSuspend(Unit.a);
        }
    }
}
