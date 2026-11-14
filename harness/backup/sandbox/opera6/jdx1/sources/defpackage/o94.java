package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o94 implements ListenableFuture {
    public final WeakReference a;
    public final n94 b = new n94(this);

    public o94(l94 l94Var) {
        this.a = new WeakReference(l94Var);
    }

    public final boolean a(Throwable th) {
        return this.b.k(th);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        l94 l94Var = (l94) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && l94Var != null) {
            l94Var.a = null;
            l94Var.b = null;
            l94Var.c.j(null);
        }
        return zCancel;
    }

    public final Object get() {
        return this.b.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.b.a instanceof p6;
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }
}
