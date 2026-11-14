package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hk3 extends g4 {
    public final Thread e;
    public final tc8 f;

    public hk3(CoroutineContext coroutineContext, Thread thread, tc8 tc8Var) {
        super(coroutineContext, true);
        this.e = thread;
        this.f = tc8Var;
    }

    public final void j(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (Intrinsics.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
