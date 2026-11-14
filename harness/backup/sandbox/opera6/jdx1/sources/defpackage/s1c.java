package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s1c implements dth, ex5 {
    public final CoroutineContext a;
    public final Function2 b;
    public final a64 c;
    public d3k d;

    public s1c(CoroutineContext coroutineContext, Function2 function2) {
        this.a = coroutineContext;
        this.b = function2;
        this.c = sgb.b(coroutineContext.plus(this));
    }

    @Override // defpackage.dth
    public final void a() {
        d3k d3kVar = this.d;
        if (d3kVar != null) {
            d3kVar.k(na2.a("Old job was still running!", null));
        }
        this.d = na2.B(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.dth
    public final void b() {
        d3k d3kVar = this.d;
        if (d3kVar != null) {
            d3kVar.C(new kj9((byte) 1));
        }
        this.d = null;
    }

    @Override // defpackage.dth
    public final void c() {
        d3k d3kVar = this.d;
        if (d3kVar != null) {
            d3kVar.C(new kj9((byte) 1));
        }
        this.d = null;
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(g gVar) {
        return f.a(this, gVar);
    }

    public final g getKey() {
        return psp.b;
    }

    public final void handleException(Throwable th, CoroutineContext coroutineContext) throws Throwable {
        di5 di5Var = (di5) coroutineContext.get(di5.b);
        if (di5Var != null) {
            phj.A0(th, new gb3(di5Var, this, (byte) 17));
        }
        ex5 ex5Var = this.a.get(psp.b);
        if (ex5Var == null) {
            throw th;
        }
        ex5Var.handleException(th, coroutineContext);
    }

    public final CoroutineContext minusKey(g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.a(this, coroutineContext);
    }
}
