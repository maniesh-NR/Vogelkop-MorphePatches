package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class fr4 extends sr9 implements Runnable {
    public ed2 c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue(1);
    public final CountDownLatch e = new CountDownLatch(1);
    public ListenableFuture f;
    public volatile ListenableFuture g;

    public fr4(ed2 ed2Var, ListenableFuture listenableFuture) {
        this.c = ed2Var;
        listenableFuture.getClass();
        this.f = listenableFuture;
    }

    public static Object c(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // defpackage.sr9
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.f;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture listenableFuture2 = this.g;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.sr9
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.e.await();
            ListenableFuture listenableFuture2 = this.g;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.a.get();
    }

    @Override // defpackage.sr9
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.e.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            ListenableFuture listenableFuture2 = this.g;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return this.a.get(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [fr4, java.lang.Object, sr9] */
    /* JADX WARN: Type inference failed for: r5v1, types: [fr4] */
    /* JADX WARN: Type inference failed for: r5v3, types: [sr9] */
    /* JADX WARN: Type inference failed for: r5v6, types: [sr9] */
    /* JADX WARN: Type inference failed for: r5v7, types: [sr9] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        fr4 fr4Var;
        try {
            try {
                try {
                    try {
                        ListenableFuture listenableFutureApply = this.c.apply(k1g.F(this.f));
                        this.g = listenableFutureApply;
                        if (this.a.isCancelled()) {
                            listenableFutureApply.cancel(((Boolean) c(this.d)).booleanValue());
                            this.g = null;
                        } else {
                            listenableFutureApply.addListener(new wr9((byte) 4, (Object) this, listenableFutureApply, false), n97.a());
                        }
                    } catch (UndeclaredThrowableException e) {
                        Throwable cause = e.getCause();
                        l94 l94Var = this.b;
                        fr4Var = this;
                        if (l94Var != null) {
                            l94Var.d(cause);
                            fr4Var = this;
                        }
                    } catch (Exception e2) {
                        l94 l94Var2 = this.b;
                        fr4Var = this;
                        if (l94Var2 != null) {
                            l94Var2.d(e2);
                            fr4Var = this;
                        }
                    }
                } finally {
                    this.c = null;
                    this.f = null;
                    this.e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause2 = e3.getCause();
                l94 l94Var3 = this.b;
                if (l94Var3 != null) {
                    l94Var3.d(cause2);
                }
            }
        } catch (Error e4) {
            l94 l94Var4 = this.b;
            fr4Var = this;
            if (l94Var4 != null) {
                l94Var4.d(e4);
                fr4Var = this;
            }
        }
    }
}
