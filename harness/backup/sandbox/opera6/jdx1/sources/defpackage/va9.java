package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class va9 extends kuk implements Function2 {
    public /* synthetic */ int t;

    public final mt5 create(Object obj, mt5 mt5Var) {
        va9 va9Var = new va9(2, mt5Var);
        va9Var.t = ((Number) obj).intValue();
        return va9Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(Integer.valueOf(((Number) obj).intValue()), (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.t;
        px5 px5Var = px5.a;
        ybh.y(obj);
        return Boolean.valueOf(i > 0);
    }
}
