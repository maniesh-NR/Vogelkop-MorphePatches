package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j79 extends kuk implements Function2 {
    public final /* synthetic */ short t;
    public final /* synthetic */ n79 u;
    public final /* synthetic */ bm8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public j79(long j, n79 n79Var, bm8 bm8Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (int) j;
        this.u = n79Var;
        this.v = bm8Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new j79(this.t, this.u, this.v, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        long jCurrentTimeMillis = System.currentTimeMillis() + this.t;
        cwa cwaVar = this.u.h;
        if (cwaVar != null) {
            cwaVar.a(jCurrentTimeMillis, this.v);
        }
        return Unit.a;
    }
}
