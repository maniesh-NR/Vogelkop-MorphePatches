package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class noi extends kuk implements Function2 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ float v;
    public final /* synthetic */ e8m w;
    public final /* synthetic */ mqh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noi(float f, e8m e8mVar, mqh mqhVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = f;
        this.w = e8mVar;
        this.x = mqhVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        noi noiVar = new noi(this.v, this.w, this.x, mt5Var);
        noiVar.u = obj;
        return noiVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((toi) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            hda hdaVar = new hda(this.x, (toi) this.u, (byte) 28);
            this.t = true;
            if (mfh.g(this.v, this.w, hdaVar, this, 4) == px5Var) {
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
