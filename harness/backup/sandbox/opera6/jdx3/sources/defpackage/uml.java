package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uml implements rmi, Handler.Callback {
    public final Handler a = new Handler(Looper.getMainLooper(), this);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        schedule(runnable, 0L, TimeUnit.MILLISECONDS);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        Object obj = message.obj;
        if (!(obj instanceof Runnable)) {
            return false;
        }
        ((Runnable) obj).run();
        return true;
    }

    @Override // defpackage.rmi
    public final qmi schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.a;
        handler.sendMessageDelayed(Message.obtain(handler, 1, runnable), timeUnit.toMillis(j));
        return new p1j(this, runnable);
    }
}
