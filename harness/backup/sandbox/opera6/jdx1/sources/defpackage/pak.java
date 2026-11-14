package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pak extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public float u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pak(b3m b3mVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = b3mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pak(s14 s14Var, float f, e8m e8mVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = s14Var;
        this.u = f;
        this.x = e8mVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new pak((s14) this.w, this.u, (e8m) this.x, mt5Var);
            default:
                pak pakVar = new pak((b3m) this.x, mt5Var);
                pakVar.w = obj;
                return pakVar;
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
        float fP;
        nx5 nx5Var;
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.v;
                if (!z) {
                    ybh.y(obj);
                    this.v = true;
                    if (cd1.a((cd1) ((s14) this.w).d, new Float(this.u), (e8m) obj2, this, 12) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.v;
                if (!z2) {
                    ybh.y(obj);
                    nx5 nx5Var2 = (nx5) this.w;
                    fP = mfh.p(nx5Var2.l());
                    nx5Var = nx5Var2;
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fP = this.u;
                    nx5Var = (nx5) this.w;
                    ybh.y(obj);
                }
                while (sgb.M(nx5Var)) {
                    jj7 jj7Var = new jj7((b3m) obj2, fP);
                    this.w = nx5Var;
                    this.u = fP;
                    this.v = true;
                    if (zi4.C(getContext()).t(jj7Var, this) == px5Var2) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
