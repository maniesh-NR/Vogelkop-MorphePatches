package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class o11 extends kuk implements dr9 {
    public boolean t;
    public /* synthetic */ w11 u;
    public /* synthetic */ x9d v;
    public /* synthetic */ Object w;
    public final /* synthetic */ a21 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(a21 a21Var, float f, mt5 mt5Var) {
        super(4, mt5Var);
        this.x = a21Var;
        this.y = f;
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            w11 w11Var = this.u;
            float fD = this.v.d(this.w);
            if (!Float.isNaN(fD)) {
                mqh mqhVar = new mqh();
                a21 a21Var = this.x;
                float fH = Float.isNaN(((p0g) a21Var.k).h()) ? 0.0f : ((p0g) a21Var.k).h();
                mqhVar.a = fH;
                h49 h49Var = ((pej) ((j3i) a21Var.c).b).c;
                n11 n11Var = new n11(w11Var, mqhVar, (byte) 0);
                this.u = null;
                this.v = null;
                this.t = true;
                if (mfh.e(fH, fD, this.y, h49Var, n11Var, this) == px5Var) {
                    return px5Var;
                }
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

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        o11 o11Var = new o11(this.x, this.y, (mt5) obj4);
        o11Var.u = (w11) obj;
        o11Var.v = (x9d) obj2;
        o11Var.w = obj3;
        return o11Var.invokeSuspend(Unit.a);
    }
}
