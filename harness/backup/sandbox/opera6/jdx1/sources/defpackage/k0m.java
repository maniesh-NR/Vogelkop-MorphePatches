package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k0m implements CoroutineContext.Element {
    public static final ioj b = new ioj((byte) 6);
    public final d a;

    public k0m(d dVar) {
        this.a = dVar;
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
