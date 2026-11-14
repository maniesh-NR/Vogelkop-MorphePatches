package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class amc extends kuk implements Function1 {
    public boolean t;
    public final /* synthetic */ gmc u;
    public final /* synthetic */ long v;
    public final /* synthetic */ oi9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amc(gmc gmcVar, long j, oi9 oi9Var, mt5 mt5Var) {
        super(1, mt5Var);
        this.u = gmcVar;
        this.v = j;
        this.w = oi9Var;
    }

    public final mt5 create(mt5 mt5Var) {
        return new amc(this.u, this.v, this.w, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        byte b = 1;
        if (!z) {
            ybh.y(obj);
            wlc wlcVar = (wlc) this.u.a.get();
            this.t = true;
            if (kfo.a0(this, wlcVar.a, false, true, new qv0(this.w, this.v, b)) == px5Var) {
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
    }
}
