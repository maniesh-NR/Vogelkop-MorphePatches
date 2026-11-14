package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class pfp {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        a.postDelayed(runnable, 0L);
    }

    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final void c(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            a(runnable);
        }
    }
}
