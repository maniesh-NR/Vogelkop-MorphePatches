package defpackage;

import android.content.res.TypedArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n65 {
    public static final n65 b = new n65(0);
    public static final n65 c = new n65(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ n65(byte b2) {
        this.a = b2;
    }

    private final void b(Object obj) {
    }

    public final void a(Object obj) throws Exception {
        boolean zIsTerminated;
        switch (this.a) {
            case 0:
                AutoCloseable autoCloseable = (AutoCloseable) obj;
                if (autoCloseable != null) {
                    if (!(autoCloseable instanceof AutoCloseable)) {
                        if (!(autoCloseable instanceof ExecutorService)) {
                            if (!(autoCloseable instanceof TypedArray)) {
                                hai.d();
                                break;
                            } else {
                                ((TypedArray) autoCloseable).recycle();
                                break;
                            }
                        } else {
                            ExecutorService executorService = (ExecutorService) autoCloseable;
                            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                                executorService.shutdown();
                                boolean z = false;
                                while (!zIsTerminated) {
                                    try {
                                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                    } catch (InterruptedException unused) {
                                        if (!z) {
                                            executorService.shutdownNow();
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                    break;
                                }
                            }
                        }
                    } else {
                        autoCloseable.close();
                        break;
                    }
                }
                break;
        }
    }
}
