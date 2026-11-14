package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class gxo {
    public static final gxo c = new gxo();
    public static final Handler d = new Handler(Looper.getMainLooper());
    public final ExecutorService a;
    public final ExecutorService b;

    public gxo() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.a = Executors.newFixedThreadPool(iAvailableProcessors <= 1 ? 10 : iAvailableProcessors);
        this.b = Executors.newSingleThreadExecutor();
    }

    public static void a(Runnable runnable) {
        c.a.submit(runnable);
    }

    public static void c(Runnable runnable) {
        d.post(runnable);
    }

    public final void b(Runnable runnable) {
        this.a.execute(runnable);
    }
}
