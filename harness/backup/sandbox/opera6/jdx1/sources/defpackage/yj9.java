package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class yj9 implements CoroutineContext {
    public final CoroutineContext a;

    public yj9(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final boolean equals(Object obj) {
        return Intrinsics.a(this.a, obj);
    }

    public final Object fold(Object obj, Function2 function2) {
        return this.a.fold(obj, function2);
    }

    public final CoroutineContext.Element get(g gVar) {
        return this.a.get(gVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final CoroutineContext minusKey(g gVar) {
        CoroutineContext coroutineContextMinusKey = this.a.minusKey(gVar);
        int i = kzm.b;
        ot5 ot5Var = d.Hq;
        dx5 dx5Var = get(ot5Var);
        dx5 dx5Var2 = dx5Var instanceof dx5 ? dx5Var : null;
        dx5 dx5Var3 = coroutineContextMinusKey.get(ot5Var);
        dx5 dx5Var4 = dx5Var3 instanceof dx5 ? dx5Var3 : null;
        if ((dx5Var2 instanceof k07) && dx5Var2 != dx5Var4) {
            ((k07) dx5Var2).c = 0;
        }
        return new j07(coroutineContextMinusKey);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextPlus = this.a.plus(coroutineContext);
        int i = kzm.b;
        ot5 ot5Var = d.Hq;
        dx5 dx5Var = get(ot5Var);
        dx5 dx5Var2 = dx5Var instanceof dx5 ? dx5Var : null;
        dx5 dx5Var3 = coroutineContextPlus.get(ot5Var);
        dx5 dx5Var4 = dx5Var3 instanceof dx5 ? dx5Var3 : null;
        if ((dx5Var2 instanceof k07) && dx5Var2 != dx5Var4) {
            ((k07) dx5Var2).c = 0;
        }
        return new j07(coroutineContextPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }
}
