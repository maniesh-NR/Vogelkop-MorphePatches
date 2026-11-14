package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class lhe implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();
    public final AtomicInteger c = new AtomicInteger(1);

    public lhe(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.b.newThread(runnable);
        threadNewThread.setName(this.a + " #" + this.c.getAndIncrement());
        return threadNewThread;
    }
}
