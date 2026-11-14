package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class oej extends kuk implements dr9 {
    public boolean t;
    public /* synthetic */ w11 u;
    public /* synthetic */ x9d v;
    public /* synthetic */ qej w;
    public final /* synthetic */ pej x;
    public final /* synthetic */ float y;
    public final /* synthetic */ h49 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oej(pej pejVar, float f, h49 h49Var, mt5 mt5Var) {
        super(4, mt5Var);
        this.x = pejVar;
        this.y = f;
        this.z = h49Var;
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
                pej pejVar = this.x;
                float fH = Float.isNaN(((p0g) pejVar.d.k).h()) ? 0.0f : ((p0g) pejVar.d.k).h();
                mqhVar.a = fH;
                n11 n11Var = new n11(w11Var, mqhVar, (byte) 1);
                this.u = null;
                this.v = null;
                this.t = true;
                if (mfh.e(fH, fD, this.y, this.z, n11Var, this) == px5Var) {
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
        float f = this.y;
        h49 h49Var = this.z;
        oej oejVar = new oej(this.x, f, h49Var, (mt5) obj4);
        oejVar.u = (w11) obj;
        oejVar.v = (x9d) obj2;
        oejVar.w = (qej) obj3;
        return oejVar.invokeSuspend(Unit.a);
    }
}
