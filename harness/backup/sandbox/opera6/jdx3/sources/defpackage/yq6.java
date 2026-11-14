package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class yq6 extends kuk implements er9 {
    public final /* synthetic */ xm5 A;
    public final /* synthetic */ x77 B;
    public final /* synthetic */ qe6 C;
    public final /* synthetic */ k5o D;
    public boolean t;
    public /* synthetic */ boolean u;
    public /* synthetic */ boolean v;
    public /* synthetic */ boolean w;
    public /* synthetic */ boolean x;
    public final /* synthetic */ i06 y;
    public final /* synthetic */ eq6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq6(i06 i06Var, eq6 eq6Var, xm5 xm5Var, x77 x77Var, qe6 qe6Var, k5o k5oVar, mt5 mt5Var) {
        super(5, mt5Var);
        this.y = i06Var;
        this.z = eq6Var;
        this.A = xm5Var;
        this.B = x77Var;
        this.C = qe6Var;
        this.D = k5oVar;
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.u;
        boolean z2 = this.v;
        boolean z3 = this.w;
        boolean z4 = this.x;
        px5 px5Var = px5.a;
        boolean z5 = this.t;
        if (z5) {
            if (z5) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ybh.y(obj);
        wq6 wq6Var = new wq6(this.y, z4, z, z2, z3, this.z, this.A, this.B, this.C, this.D, null);
        this.u = z;
        this.v = z2;
        this.w = z3;
        this.x = z4;
        this.t = true;
        Object objQ = sgb.q(wq6Var, this);
        return objQ == px5Var ? px5Var : objQ;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        qe6 qe6Var = this.C;
        k5o k5oVar = this.D;
        yq6 yq6Var = new yq6(this.y, this.z, this.A, this.B, qe6Var, k5oVar, (mt5) obj5);
        yq6Var.u = zBooleanValue;
        yq6Var.v = zBooleanValue2;
        yq6Var.w = zBooleanValue3;
        yq6Var.x = zBooleanValue4;
        return yq6Var.invokeSuspend(Unit.a);
    }
}
