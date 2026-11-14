package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b7c extends d3k {
    public final mt5 e;

    public b7c(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.e = hib.a(this, this, function2);
    }

    public final void p0() throws Throwable {
        try {
            mt5 mt5VarB = hib.b(this.e);
            p0i p0iVar = t0i.b;
            c26.J(mt5VarB, Unit.a);
        } catch (Throwable th) {
            vtp.D(th, this);
            throw null;
        }
    }
}
