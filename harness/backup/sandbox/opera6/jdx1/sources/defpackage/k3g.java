package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k3g implements CoroutineContext.Element {
    public static final r16 b = new r16();
    public final j3g a;

    public k3g(j3g j3gVar) {
        this.a = j3gVar;
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(g gVar) {
        return f.a(this, gVar);
    }

    public final g getKey() {
        return b;
    }

    public final CoroutineContext minusKey(g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.a(this, coroutineContext);
    }
}
