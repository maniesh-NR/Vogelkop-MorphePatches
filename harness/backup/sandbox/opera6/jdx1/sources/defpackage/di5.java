package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class di5 implements ci5, drf, CoroutineContext.Element {
    public static final rbe b = new rbe((byte) 29);
    public final vt9 a;

    public di5(vt9 vt9Var) {
        this.a = vt9Var;
    }

    public final List a(Integer num) {
        return this.a.D();
    }

    public final boolean c() {
        return this.a.C;
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final /* bridge */ CoroutineContext.Element get(g gVar) {
        return f.a(this, gVar);
    }

    public final g getKey() {
        return b;
    }

    public final /* bridge */ CoroutineContext minusKey(g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.a(this, coroutineContext);
    }
}
