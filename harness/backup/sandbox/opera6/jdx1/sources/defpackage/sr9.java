package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class sr9 implements ListenableFuture {
    public final ListenableFuture a;
    public l94 b;

    public sr9() {
        this.a = k1g.z(new d06(this));
    }

    public sr9(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.a = listenableFuture;
    }

    public static sr9 a(ListenableFuture listenableFuture) {
        return listenableFuture instanceof sr9 ? (sr9) listenableFuture : new sr9(listenableFuture);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.a.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public Object get() {
        return this.a.get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }
}
