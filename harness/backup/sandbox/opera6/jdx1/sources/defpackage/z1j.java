package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class z1j implements Executor {
    public static final y6c f = new y6c(z1j.class);
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final vr9 e = new vr9(this);

    public z1j(Executor executor) {
        executor.getClass();
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.b) {
            int i = this.c;
            if (i == 4 || i == 3) {
                this.b.add(runnable);
                return;
            }
            long j = this.d;
            gg ggVar = new gg(runnable, (byte) 4);
            this.b.add(ggVar);
            this.c = 2;
            try {
                this.a.execute(this.e);
                if (this.c == 2) {
                    synchronized (this.b) {
                        if (this.d == j && this.c == 2) {
                            this.c = 3;
                        }
                    }
                }
            } catch (Throwable th) {
                synchronized (this.b) {
                    int i2 = this.c;
                    boolean z = (i2 == 1 || i2 == 2) && this.b.removeLastOccurrence(ggVar);
                    if (!(th instanceof RejectedExecutionException) || z) {
                        throw th;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
