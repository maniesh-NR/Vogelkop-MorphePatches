package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class qw6 extends w1h {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new ad4((byte) 2));
    public volatile Handler c;

    public final boolean C() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
