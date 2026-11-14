package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e7e extends kuk implements cr9 {
    public /* synthetic */ float t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7e(Function1 function1, mt5 mt5Var) {
        super(3, mt5Var);
        this.u = function1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        e7e e7eVar = new e7e(this.u, (mt5) obj3);
        e7eVar.t = fFloatValue;
        return e7eVar.invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        this.u.invoke(new Float(this.t));
        return Unit.a;
    }
}
