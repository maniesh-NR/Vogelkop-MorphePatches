package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class tkm extends kuk implements dr9 {
    public boolean t;
    public /* synthetic */ long u;

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            long j = this.u;
            qs7 qs7VarX = qs7.x();
            int i = ukm.a;
            qs7VarX.getClass();
            long jMin = Math.min(j * 30000, ukm.a);
            this.t = true;
            if (nb6.p(jMin, this) == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return Boolean.TRUE;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        tkm tkmVar = new tkm(4, (mt5) obj4);
        tkmVar.u = jLongValue;
        return tkmVar.invokeSuspend(Unit.a);
    }
}
