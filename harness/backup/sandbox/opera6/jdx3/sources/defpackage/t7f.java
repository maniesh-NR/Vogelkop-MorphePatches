package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t7f extends AbstractExecutorService implements AutoCloseable {
    public final AtomicInteger a = new AtomicInteger();
    public final dhi b = new dhi(Executors.newScheduledThreadPool(3, Executors.defaultThreadFactory()));
    public final dhi c = new dhi(Executors.newScheduledThreadPool(6, Executors.defaultThreadFactory()));

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Boolean boolValueOf;
        sg3 sg3Var;
        if (!(runnable instanceof s7f) || (sg3Var = ((s7f) runnable).a) == null) {
            boolValueOf = null;
        } else {
            Uri uri = sg3Var.f.b;
            boolValueOf = Boolean.valueOf((sg3Var.h & 4) == 0 && uri != null && uri.toString().startsWith("http"));
        }
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.a.getAndIncrement() % 2 == 0);
        }
        if (boolValueOf.booleanValue()) {
            this.c.execute(runnable);
        } else {
            this.b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new s7f(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new s7f(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
