package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class wd2 implements Executor {
    public final /* synthetic */ byte a;
    public final Handler b;

    public wd2() {
        this.a = (byte) 0;
        this.b = new Handler(Looper.getMainLooper());
    }

    public wd2(Handler handler, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                handler.getClass();
                this.b = handler;
                break;
            default:
                this.b = handler;
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Handler handler = this.b;
        switch (b) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
