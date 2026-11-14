package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.anp;
import defpackage.mip;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ml1 implements anp {
    public final Executor a;
    public final mip b;
    public final PriorityQueue c = new PriorityQueue();

    public ml1(Executor executor, mip mipVar) {
        this.a = executor;
        this.b = mipVar;
    }

    @Override // defpackage.anp
    public final void a() {
        synchronized (this.c) {
            if (this.c.isEmpty()) {
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            this.b.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            xz2 xz2Var = (xz2) this.c.peek();
            while (xz2Var != null && xz2Var.b <= jElapsedRealtime) {
                priorityQueue.add(xz2Var);
                xz2Var = (xz2) this.c.peek();
            }
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                try {
                    this.a.execute(((xz2) it.next()).a);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // defpackage.anp
    public final void a(Runnable runnable, long j) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        this.b.getClass();
        xz2 xz2Var = new xz2(runnable, SystemClock.elapsedRealtime() + j);
        synchronized (this.c) {
            this.c.add(xz2Var);
        }
    }
}
