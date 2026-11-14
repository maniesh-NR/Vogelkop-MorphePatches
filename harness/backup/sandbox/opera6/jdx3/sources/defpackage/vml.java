package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class vml {
    public static final ScheduledExecutorService a;
    public static final ScheduledExecutorService b;
    public static final ScheduledExecutorService c;
    public static final umi d;
    public static final wjh e;
    public static final Handler f;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new lhe("Opera I/O"));
        a = scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool2 = Executors.newScheduledThreadPool(3, new lhe("Opera Critical I/O"));
        b = scheduledExecutorServiceNewScheduledThreadPool2;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool3 = Executors.newScheduledThreadPool(6, new lhe("Opera Network"));
        c = scheduledExecutorServiceNewScheduledThreadPool3;
        d = new umi(new uml(), new dhi(scheduledExecutorServiceNewScheduledThreadPool), new dhi(scheduledExecutorServiceNewScheduledThreadPool2), new dhi(scheduledExecutorServiceNewScheduledThreadPool3));
        cv6 cv6Var = bb7.a;
        e = new wjh(s6d.a, bb7.a, new jg8(scheduledExecutorServiceNewScheduledThreadPool), new jg8(scheduledExecutorServiceNewScheduledThreadPool2), new jg8(scheduledExecutorServiceNewScheduledThreadPool3), (byte) 22);
        f = new Handler(Looper.getMainLooper());
    }

    public static void a(Runnable runnable) {
        f.removeCallbacks(runnable);
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void c(Runnable runnable) {
        f.post(runnable);
    }

    public static void d(Runnable runnable, long j) {
        f.postDelayed(runnable, j);
    }

    public static void e(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            c(runnable);
        }
    }
}
