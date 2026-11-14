package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ha7 extends Exception {
    public final Throwable a;

    public ha7(Throwable th, dx5 dx5Var, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + dx5Var + " threw an exception, context = " + coroutineContext, th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
