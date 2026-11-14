package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class a2j implements Executor {
    public static final Logger f = Logger.getLogger(a2j.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final wr9 e = new wr9(this);

    public a2j(Executor executor) {
        this.a = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.b) {
            int i = this.c;
            if (i == 4 || i == 3) {
                this.b.add(runnable);
                return;
            }
            long j = this.d;
            gg ggVar = new gg(runnable, (byte) 5);
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
            } catch (Error | RuntimeException e) {
                synchronized (this.b) {
                    int i2 = this.c;
                    boolean z = (i2 == 1 || i2 == 2) && this.b.removeLastOccurrence(ggVar);
                    if (!(e instanceof RejectedExecutionException) || z) {
                        throw e;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
