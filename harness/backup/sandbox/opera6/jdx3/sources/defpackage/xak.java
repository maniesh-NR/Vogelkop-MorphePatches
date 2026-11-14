package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xak implements Runnable {
    public static final Object h = new Object();
    public final Executor a;
    public final v6f b;
    public final AtomicReference d;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object e = h;
    public int f = -1;
    public boolean g = false;

    public xak(AtomicReference atomicReference, Executor executor, v6f v6fVar) {
        this.d = atomicReference;
        this.a = executor;
        this.b = v6fVar;
    }

    public final void a(int i) {
        synchronized (this) {
            if (this.c.get()) {
                if (i <= this.f) {
                    return;
                }
                this.f = i;
                if (this.g) {
                    return;
                }
                this.g = true;
                try {
                    this.a.execute(this);
                } catch (Throwable unused) {
                    synchronized (this) {
                        this.g = false;
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            if (!this.c.get()) {
                this.g = false;
                return;
            }
            Object obj = this.d.get();
            int i = this.f;
            while (true) {
                if (!Objects.equals(this.e, obj)) {
                    this.e = obj;
                    boolean z = obj instanceof ro2;
                    v6f v6fVar = this.b;
                    if (z) {
                        v6fVar.onError((Throwable) null);
                    } else {
                        v6fVar.a(obj);
                    }
                }
                synchronized (this) {
                    if (i == this.f || !this.c.get()) {
                        break;
                    }
                    obj = this.d.get();
                    i = this.f;
                }
            }
            this.g = false;
        }
    }
}
