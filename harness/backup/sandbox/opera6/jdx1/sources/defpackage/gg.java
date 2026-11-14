package defpackage;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final class gg implements Runnable {
    public final /* synthetic */ byte a;
    public final Runnable b;

    public /* synthetic */ gg(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(10);
                this.b.run();
                return;
            case 1:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                this.b.run();
                return;
            case 2:
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    synchronized (y55.h) {
                        vk2 vk2Var = y55.i;
                        if (vk2Var != null) {
                            vk2Var.run(th);
                            return;
                        }
                        return;
                    }
                }
            case 3:
                try {
                    this.b.run();
                    return;
                } catch (Exception unused) {
                    mkh.v("Executor");
                    return;
                }
            case 4:
                this.b.run();
                return;
            case 5:
                this.b.run();
                return;
            case 6:
                this.b.run();
                return;
            case 7:
                try {
                    this.b.run();
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            case 8:
                Runnable runnable = this.b;
                Deque deque = (Deque) m3e.b.get();
                Preconditions.checkNotNull(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
            default:
                Runnable runnable2 = this.b;
                m3e.b.set(new ArrayDeque());
                runnable2.run();
                return;
        }
    }

    public final String toString() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 4:
                return runnable.toString();
            case 5:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
