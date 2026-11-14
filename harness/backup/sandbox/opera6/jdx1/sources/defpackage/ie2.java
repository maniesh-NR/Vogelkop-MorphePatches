package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ie2 implements Runnable {
    public static Handler g;
    public boolean e;
    public final /* synthetic */ je2 f;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final m3d a = new m3d(this, new y97((Object) this, (byte) 2), (byte) 1);

    public ie2(je2 je2Var) {
        this.f = je2Var;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (ie2.class) {
            handler = g;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                g = handler;
            }
        }
        handler.post(new wr9((byte) 14, this, obj, false));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e = false;
        this.f.executePendingTask();
    }
}
