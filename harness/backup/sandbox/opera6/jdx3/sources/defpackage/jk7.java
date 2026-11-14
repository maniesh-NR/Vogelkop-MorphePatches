package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class jk7 {
    public boolean a;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public jk7() {
        d2c d2cVar = d2c.a;
        this.b = 0L;
        this.a = false;
        this.e = new uh4();
    }

    public jk7(y8j y8jVar) {
        ExecutorService executorServiceNewFixedThreadPool;
        this.e = y8jVar;
        this.c = l08.a;
        cs csVar = c9j.x;
        synchronized (x7d.b) {
            executorServiceNewFixedThreadPool = x7d.c;
            if (executorServiceNewFixedThreadPool == null) {
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                x7d.c = executorServiceNewFixedThreadPool;
            }
        }
        this.d = new c37(executorServiceNewFixedThreadPool, csVar);
    }
}
