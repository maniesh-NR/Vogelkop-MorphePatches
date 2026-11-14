package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rh3 implements wv5 {
    public static final tmj b = new tmj((byte) 15);
    public final e7 a;

    public rh3() {
        e7 e7Var = new e7((byte) 7, false);
        e7Var.a = hh3.b().a;
        this.a = e7Var;
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(kotlin.coroutines.g gVar) {
        return f.a(this, gVar);
    }

    public final kotlin.coroutines.g getKey() {
        return b;
    }

    public final CoroutineContext minusKey(kotlin.coroutines.g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.a(this, coroutineContext);
    }

    public final void restoreThreadContext(Object obj) {
        eh3 eh3Var = (eh3) obj;
        gh3 gh3VarB = hh3.b();
        gh3VarB.c = null;
        hh3.a(gh3VarB, eh3Var.a);
        gh3VarB.c = eh3Var.b;
    }

    public final Object updateThreadContext() {
        gh3 gh3VarB = hh3.b();
        e7 e7Var = this.a;
        eh3 eh3Var = new eh3(hh3.a(gh3VarB, (rg3) e7Var.a), gh3VarB.c);
        gh3VarB.c = e7Var;
        return eh3Var;
    }
}
