package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class okj implements mj6 {
    public final uy9 a;
    public final qj6[] e;
    public final rj6[] f;
    public int g;
    public int h;
    public qj6 i;
    public oj6 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public okj(qj6[] qj6VarArr, rj6[] rj6VarArr) {
        this.e = qj6VarArr;
        this.g = qj6VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = b();
        }
        this.f = rj6VarArr;
        this.h = rj6VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = c();
        }
        uy9 uy9Var = new uy9(this);
        this.a = uy9Var;
        uy9Var.start();
    }

    @Override // defpackage.mj6
    public final void a(long j) {
        synchronized (this.b) {
            z4o.H(this.g == this.e.length || this.k);
            this.m = j;
        }
    }

    public qj6 b() {
        return new qj6(1);
    }

    public abstract rj6 c();

    public oj6 d(Throwable th) {
        return new kwa("Unexpected decode error", th);
    }

    @Override // defpackage.mj6
    public final Object dequeueInputBuffer() {
        qj6 qj6Var;
        synchronized (this.b) {
            oj6 oj6Var = this.j;
            if (oj6Var != null) {
                throw oj6Var;
            }
            z4o.H(this.i == null);
            int i = this.g;
            if (i == 0) {
                qj6Var = null;
            } else {
                qj6[] qj6VarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                qj6Var = qj6VarArr[i2];
            }
            this.i = qj6Var;
        }
        return qj6Var;
    }

    public abstract oj6 e(qj6 qj6Var, rj6 rj6Var, boolean z);

    public final boolean f() {
        boolean z;
        oj6 oj6VarD;
        synchronized (this.b) {
            while (!this.l) {
                if (!this.c.isEmpty() && this.h > 0) {
                    break;
                }
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            qj6 qj6Var = (qj6) this.c.removeFirst();
            rj6[] rj6VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            rj6 rj6Var = rj6VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (qj6Var.d(4)) {
                rj6Var.a(4);
            } else {
                rj6Var.c = qj6Var.g;
                if (qj6Var.d(134217728)) {
                    rj6Var.a(134217728);
                }
                long j = qj6Var.g;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    rj6Var.d = true;
                }
                try {
                    oj6VarD = e(qj6Var, rj6Var, z2);
                } catch (OutOfMemoryError e) {
                    oj6VarD = d(e);
                } catch (RuntimeException e2) {
                    oj6VarD = d(e2);
                }
                if (oj6VarD != null) {
                    synchronized (this.b) {
                        this.j = oj6VarD;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k || rj6Var.d) {
                    rj6Var.j();
                } else {
                    this.d.addLast(rj6Var);
                }
                qj6Var.i();
                qj6[] qj6VarArr = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                qj6VarArr[i2] = qj6Var;
            }
            return true;
        }
    }

    @Override // defpackage.mj6
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            qj6 qj6Var = this.i;
            if (qj6Var != null) {
                qj6Var.i();
                qj6[] qj6VarArr = this.e;
                int i = this.g;
                this.g = i + 1;
                qj6VarArr[i] = qj6Var;
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                qj6 qj6Var2 = (qj6) this.c.removeFirst();
                qj6Var2.i();
                qj6[] qj6VarArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                qj6VarArr2[i2] = qj6Var2;
            }
            while (!this.d.isEmpty()) {
                ((rj6) this.d.removeFirst()).j();
            }
        }
    }

    @Override // defpackage.mj6
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final rj6 dequeueOutputBuffer() {
        synchronized (this.b) {
            oj6 oj6Var = this.j;
            if (oj6Var != null) {
                throw oj6Var;
            }
            if (this.d.isEmpty()) {
                return null;
            }
            return (rj6) this.d.removeFirst();
        }
    }

    @Override // defpackage.mj6
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(qj6 qj6Var) {
        synchronized (this.b) {
            oj6 oj6Var = this.j;
            if (oj6Var != null) {
                throw oj6Var;
            }
            z4o.w(qj6Var == this.i);
            this.c.addLast(qj6Var);
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
            this.i = null;
        }
    }

    public final void i(rj6 rj6Var) {
        synchronized (this.b) {
            rj6Var.i();
            rj6[] rj6VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            rj6VarArr[i] = rj6Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.mj6
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
