package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public abstract class ldk {
    public final tcl a;
    public final r16 b;
    public final boolean c;
    public final Object d;
    public final ArrayDeque e;
    public final hd f;
    public ArrayDeque g;
    public int h;
    public boolean i;

    public ldk(tcl tclVar) {
        r16 r16Var = ngh.a;
        this.d = new Object();
        this.e = new ArrayDeque();
        this.g = new ArrayDeque();
        this.h = 1;
        this.c = false;
        this.a = tclVar;
        this.b = r16Var;
        this.f = new hd(this, tclVar);
    }

    public ldk(umi umiVar, boolean z) {
        r16 r16Var = ngh.a;
        this.d = new Object();
        this.e = new ArrayDeque();
        this.g = new ArrayDeque();
        this.h = 1;
        this.c = z;
        this.a = umiVar;
        this.b = r16Var;
        this.f = new hd(this, umiVar);
    }

    public abstract Object a();

    public abstract void b(Object obj);

    public int c() {
        return 2;
    }

    public void d(Object obj) {
    }

    public final void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kdk kdkVar;
        if (this.i || this.h != 3 || (kdkVar = (kdk) this.e.poll()) == null) {
            return;
        }
        this.h = 4;
        kdkVar.d.b.getClass();
        Method method = ngh.b;
        if (method != null) {
            try {
                method.invoke(null, kdkVar);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        } else {
            ngh.d.add(kdkVar);
        }
        kdkVar.b.a(null, null);
    }

    public final void f(Runnable runnable) {
        ArrayDeque arrayDeque = this.g;
        if (arrayDeque != null) {
            arrayDeque.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final void g(Object obj) {
        synchronized (this.d) {
            if (this.i) {
                return;
            }
            this.e.offer(new kdk(this, obj));
            e();
        }
    }

    public final void h() {
        synchronized (this.d) {
            if (this.h != 1) {
                return;
            }
            this.h = 2;
            ((oml) this.f.d).a(null, null);
        }
    }

    public final void i() {
        hd hdVar = this.f;
        hdVar.getClass();
        try {
            ((CountDownLatch) hdVar.c).await();
            ((oml) hdVar.e).cancel(false);
            hdVar.f();
        } catch (InterruptedException unused) {
        }
    }
}
