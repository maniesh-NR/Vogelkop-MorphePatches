package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ge2 implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this) {
            if (he2.b == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), he2.a);
                he2.b = threadPoolExecutor2;
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
            }
        }
        he2.b.execute(runnable);
    }
}
