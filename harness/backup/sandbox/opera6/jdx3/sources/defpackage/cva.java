package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cva implements MessageQueue.IdleHandler {
    public final MessageQueue a;
    public final ArrayDeque b;
    public boolean c;

    public cva() {
        MessageQueue messageQueueMyQueue = Looper.myQueue();
        this.b = new ArrayDeque();
        this.a = messageQueueMyQueue;
    }

    public final void a(Runnable runnable) {
        b(runnable, 0L);
    }

    public final void b(Runnable runnable, long j) {
        if (j != 0) {
            runnable = new bva(this, runnable);
        }
        this.b.add(runnable);
        if (j != 0) {
            vml.d(runnable, j);
        }
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.addIdleHandler(this);
    }

    public final boolean c(Runnable runnable) {
        Runnable runnable2;
        ArrayDeque arrayDeque = this.b;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                runnable2 = null;
                break;
            }
            runnable2 = (Runnable) it.next();
            if (!runnable2.equals(runnable)) {
                if ((runnable2 instanceof bva) && ((bva) runnable2).a.equals(runnable)) {
                    it.remove();
                    break;
                }
            } else {
                it.remove();
                break;
            }
        }
        if (runnable2 instanceof bva) {
            vml.a(runnable2);
        }
        if (runnable2 != null && arrayDeque.isEmpty()) {
            this.c = false;
            this.a.removeIdleHandler(this);
        }
        return runnable2 != null;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ((Runnable) arrayDeque.removeFirst()).run();
        boolean zIsEmpty = arrayDeque.isEmpty();
        if (zIsEmpty) {
            this.c = false;
            this.a.removeIdleHandler(this);
        }
        return !zIsEmpty;
    }
}
