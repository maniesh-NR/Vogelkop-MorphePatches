package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c7b extends kuk implements Function2 {
    public /* synthetic */ float t;

    public final mt5 create(Object obj, mt5 mt5Var) {
        c7b c7bVar = new c7b(2, mt5Var);
        c7bVar.t = ((Number) obj).floatValue();
        return c7bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(Float.valueOf(((Number) obj).floatValue()), (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        return Boolean.valueOf(this.t > 0.0f);
    }
}
