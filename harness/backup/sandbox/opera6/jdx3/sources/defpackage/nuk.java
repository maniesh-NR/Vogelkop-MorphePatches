package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class nuk implements Runnable {
    public final CountDownLatch a = new CountDownLatch(1);

    public nuk(n1f n1fVar) {
    }

    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = ngh.c;
        if (method != null) {
            try {
                method.invoke(null, this);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        } else {
            ngh.d.remove(this);
        }
        this.a.countDown();
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        this.a.await();
    }
}
