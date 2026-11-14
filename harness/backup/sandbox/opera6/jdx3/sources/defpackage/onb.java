package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class onb implements Executor {
    public final jnb a;
    public final dnb b = new dnb(this, 3);
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public onb(jnb jnbVar) {
        this.a = jnbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
