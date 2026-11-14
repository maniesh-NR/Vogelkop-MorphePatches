package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cj6 implements zb6, Runnable, Comparable, xn8 {
    public int A;
    public int B;
    public int C;
    public final e38 d;
    public final ua7 e;
    public ry9 h;
    public hub i;
    public nyg j;
    public s38 k;
    public int l;
    public int m;
    public w97 n;
    public trf o;
    public r38 p;
    public int q;
    public Object r;
    public Thread s;
    public hub t;
    public hub u;
    public Object v;
    public yb6 w;
    public volatile ac6 x;
    public volatile boolean y;
    public volatile boolean z;
    public final bj6 a = new bj6();
    public final ArrayList b = new ArrayList();
    public final abk c = new abk();
    public final qb7 f = new qb7();
    public final ukh g = new ukh((byte) 4);

    public cj6(e38 e38Var, ua7 ua7Var) {
        this.d = e38Var;
        this.e = ua7Var;
    }

    @Override // defpackage.zb6
    public final void a(hub hubVar, Object obj, yb6 yb6Var, int i, hub hubVar2) {
        this.t = hubVar;
        this.v = obj;
        this.w = yb6Var;
        this.C = i;
        this.u = hubVar2;
        if (Thread.currentThread() == this.s) {
            e();
            return;
        }
        this.B = 3;
        r38 r38Var = this.p;
        (r38Var.l ? r38Var.h : r38Var.g).execute(this);
    }

    @Override // defpackage.zb6
    public final void b(hub hubVar, Exception exc, yb6 yb6Var, int i) {
        yb6Var.c();
        ty9 ty9Var = new ty9("Fetching data failed", Collections.singletonList(exc));
        Class clsA = yb6Var.a();
        ty9Var.b = hubVar;
        ty9Var.c = i;
        ty9Var.d = clsA;
        this.b.add(ty9Var);
        if (Thread.currentThread() == this.s) {
            k();
            return;
        }
        this.B = 2;
        r38 r38Var = this.p;
        (r38Var.l ? r38Var.h : r38Var.g).execute(this);
    }

    public final abk c() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cj6 cj6Var = (cj6) obj;
        int iOrdinal = this.j.ordinal() - cj6Var.j.ordinal();
        return iOrdinal == 0 ? this.q - cj6Var.q : iOrdinal;
    }

    public final kyh d(int i, Object obj) {
        qc6 qc6VarB;
        hsc hscVarC = this.a.c(obj.getClass());
        trf trfVar = this.o;
        boolean z = i == 4 || this.a.r;
        mrf mrfVar = dh7.i;
        Boolean bool = (Boolean) trfVar.c(mrfVar);
        if (bool == null || (bool.booleanValue() && !z)) {
            trfVar = new trf();
            trfVar.b.g(this.o.b);
            trfVar.b.put(mrfVar, Boolean.valueOf(z));
        }
        trf trfVar2 = trfVar;
        rc6 rc6Var = (rc6) this.h.b.f;
        synchronized (rc6Var) {
            pc6 pc6Var = (pc6) rc6Var.a.get(obj.getClass());
            if (pc6Var == null) {
                Iterator it = rc6Var.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    pc6 pc6Var2 = (pc6) it.next();
                    if (pc6Var2.a().isAssignableFrom(obj.getClass())) {
                        pc6Var = pc6Var2;
                        break;
                    }
                }
            }
            if (pc6Var == null) {
                pc6Var = rc6.b;
            }
            qc6VarB = pc6Var.b(obj);
        }
        try {
            return hscVarC.a(this.l, this.m, new bp(this, i), qc6VarB, trfVar2);
        } finally {
            qc6VarB.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj6.e():void");
    }

    public final ac6 f() {
        int iA = vep.A(this.A);
        bj6 bj6Var = this.a;
        if (iA == 1) {
            return new lyh(bj6Var, this);
        }
        if (iA == 2) {
            return new kb6(bj6Var.a(), bj6Var, this);
        }
        if (iA == 3) {
            return new iwj(bj6Var, this);
        }
        if (iA == 5) {
            return null;
        }
        qp2.n("Unrecognized stage: ".concat(u35.v(this.A)));
        return null;
    }

    public final int g(int i) {
        int iA = vep.A(i);
        boolean z = false;
        if (iA == 0) {
            switch (this.n.a) {
                case 0:
                case 1:
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return g(2);
        }
        if (iA != 1) {
            if (iA == 2) {
                return 4;
            }
            if (iA == 3 || iA == 5) {
                return 6;
            }
            qp2.o("Unrecognized stage: ".concat(u35.v(i)));
            return 0;
        }
        switch (this.n.a) {
            case 0:
                break;
            case 1:
            default:
                z = true;
                break;
        }
        if (z) {
            return 3;
        }
        return g(3);
    }

    public final void h() {
        boolean zB;
        m();
        ty9 ty9Var = new ty9("Failed to load resource", new ArrayList(this.b));
        r38 r38Var = this.p;
        synchronized (r38Var) {
            r38Var.p = ty9Var;
        }
        synchronized (r38Var) {
            r38Var.b.a();
            if (r38Var.t) {
                r38Var.f();
            } else {
                if (((ArrayList) r38Var.a.b).isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (r38Var.q) {
                    throw new IllegalStateException("Already failed once");
                }
                r38Var.q = true;
                s38 s38Var = r38Var.j;
                ArrayList arrayList = new ArrayList((ArrayList) r38Var.a.b);
                r38Var.d(arrayList.size() + 1);
                r38Var.e.c(r38Var, s38Var, null);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    p38 p38Var = (p38) obj;
                    p38Var.b.execute(new wr9((byte) 9, r38Var, p38Var.a, false));
                }
                r38Var.b();
            }
        }
        ukh ukhVar = this.g;
        synchronized (ukhVar) {
            ukhVar.d = true;
            zB = ukhVar.b();
        }
        if (zB) {
            i();
        }
    }

    public final void i() {
        ukh ukhVar = this.g;
        synchronized (ukhVar) {
            ukhVar.c = false;
            ukhVar.b = false;
            ukhVar.d = false;
        }
        qb7 qb7Var = this.f;
        qb7Var.a = null;
        qb7Var.b = null;
        qb7Var.c = null;
        bj6 bj6Var = this.a;
        bj6Var.c = null;
        bj6Var.d = null;
        bj6Var.n = null;
        bj6Var.g = null;
        bj6Var.k = null;
        bj6Var.i = null;
        bj6Var.o = null;
        bj6Var.j = null;
        bj6Var.p = null;
        bj6Var.a.clear();
        bj6Var.l = false;
        bj6Var.b.clear();
        bj6Var.m = false;
        this.y = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.A = 0;
        this.x = null;
        this.s = null;
        this.t = null;
        this.v = null;
        this.C = 0;
        this.w = null;
        this.z = false;
        this.r = null;
        this.b.clear();
        this.e.K(this);
    }

    public final void j() {
        this.B = 2;
        r38 r38Var = this.p;
        (r38Var.l ? r38Var.h : r38Var.g).execute(this);
    }

    public final void k() {
        this.s = Thread.currentThread();
        SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.z && this.x != null && !(zC = this.x.c())) {
            this.A = g(this.A);
            this.x = f();
            if (this.A == 4) {
                j();
                return;
            }
        }
        if ((this.A == 6 || this.z) && !zC) {
            h();
        }
    }

    public final void l() {
        int iA = vep.A(this.B);
        if (iA == 0) {
            this.A = g(1);
            this.x = f();
            k();
        } else if (iA == 1) {
            k();
        } else if (iA == 2) {
            e();
        } else {
            int i = this.B;
            qp2.n("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void m() {
        this.c.a();
        if (this.y) {
            h9o.m("Already notified", this.b.isEmpty() ? null : (Throwable) am2.k(1, this.b));
        } else {
            this.y = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb6 yb6Var = this.w;
        try {
            try {
                if (this.z) {
                    h();
                    if (yb6Var == null) {
                    }
                } else {
                    l();
                }
            } finally {
                if (yb6Var != null) {
                    yb6Var.c();
                }
            }
        } catch (h94 e) {
            throw e;
        } catch (Throwable th) {
            if (this.A != 5) {
                this.b.add(th);
                h();
            }
            if (!this.z) {
                throw th;
            }
            throw th;
        }
    }
}
