package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r38 implements xn8 {
    public final f38 c;
    public final ua7 d;
    public final f38 e;
    public final wy9 f;
    public final wy9 g;
    public final wy9 h;
    public s38 j;
    public boolean k;
    public boolean l;
    public kyh m;
    public int n;
    public boolean o;
    public ty9 p;
    public boolean q;
    public t38 r;
    public cj6 s;
    public volatile boolean t;
    public final q38 a = new q38(new ArrayList(2));
    public final abk b = new abk();
    public final AtomicInteger i = new AtomicInteger();

    public r38(wy9 wy9Var, wy9 wy9Var2, wy9 wy9Var3, wy9 wy9Var4, f38 f38Var, f38 f38Var2, ua7 ua7Var) {
        this.f = wy9Var;
        this.g = wy9Var2;
        this.h = wy9Var4;
        this.e = f38Var;
        this.c = f38Var2;
        this.d = ua7Var;
    }

    public final synchronized void a(zlj zljVar, ng8 ng8Var) {
        this.b.a();
        ((ArrayList) this.a.b).add(new p38(zljVar, ng8Var));
        boolean z = false;
        if (this.o) {
            d(1);
            ng8Var.execute(new vr9((byte) 10, (Object) this, (Object) zljVar, z));
        } else if (this.q) {
            d(1);
            ng8Var.execute(new wr9((byte) 9, this, zljVar, false));
        } else {
            qyn.g("Cannot add callbacks to a cancelled EngineJob", !this.t);
        }
    }

    public final void b() {
        t38 t38Var;
        synchronized (this) {
            this.b.a();
            qyn.g("Not yet complete!", e());
            int iDecrementAndGet = this.i.decrementAndGet();
            qyn.g("Can't decrement below 0", iDecrementAndGet >= 0);
            if (iDecrementAndGet == 0) {
                t38Var = this.r;
                f();
            } else {
                t38Var = null;
            }
        }
        if (t38Var != null) {
            t38Var.c();
        }
    }

    public final abk c() {
        return this.b;
    }

    public final synchronized void d(int i) {
        t38 t38Var;
        qyn.g("Not yet complete!", e());
        if (this.i.getAndAdd(i) == 0 && (t38Var = this.r) != null) {
            t38Var.a();
        }
    }

    public final boolean e() {
        return this.q || this.o || this.t;
    }

    public final synchronized void f() {
        boolean zB;
        if (this.j == null) {
            throw new IllegalArgumentException();
        }
        ((ArrayList) this.a.b).clear();
        this.j = null;
        this.r = null;
        this.m = null;
        this.q = false;
        this.t = false;
        this.o = false;
        cj6 cj6Var = this.s;
        ukh ukhVar = cj6Var.g;
        synchronized (ukhVar) {
            try {
                ukhVar.b = true;
                zB = ukhVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zB) {
            cj6Var.i();
        }
        this.s = null;
        this.p = null;
        this.n = 0;
        this.d.K(this);
    }

    public final synchronized void g(zlj zljVar) {
        this.b.a();
        ((ArrayList) this.a.b).remove(new p38(zljVar, pg8.b));
        if (((ArrayList) this.a.b).isEmpty()) {
            if (!e()) {
                this.t = true;
                cj6 cj6Var = this.s;
                cj6Var.z = true;
                ac6 ac6Var = cj6Var.x;
                if (ac6Var != null) {
                    ac6Var.cancel();
                }
                f38 f38Var = this.e;
                s38 s38Var = this.j;
                synchronized (f38Var) {
                    qfb qfbVar = f38Var.a;
                    qfbVar.getClass();
                    HashMap map = (HashMap) qfbVar.b;
                    if (this == map.get(s38Var)) {
                        map.remove(s38Var);
                    }
                }
            }
            if ((this.o || this.q) && this.i.get() == 0) {
                f();
            }
        }
    }
}
