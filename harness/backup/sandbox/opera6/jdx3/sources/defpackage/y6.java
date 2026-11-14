package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y6 extends kuk implements Function2 {
    public boolean t;
    public final /* synthetic */ jpi u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(jpi jpiVar, float f, float f2, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = jpiVar;
        this.v = f;
        this.w = f2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new y6(this.u, this.v, this.w, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            long jFloatToRawIntBits = (Float.floatToRawIntBits(this.v) << 32) | (Float.floatToRawIntBits(this.w) & 4294967295L);
            this.t = true;
            if (epi.b(this.u.R, jFloatToRawIntBits, this) == px5Var) {
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
