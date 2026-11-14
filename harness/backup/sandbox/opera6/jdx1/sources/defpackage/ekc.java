package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ekc {
    public static final Object k = new Object();
    public final Object a;
    public final jhi b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final vl9 j;

    public ekc() {
        this.a = new Object();
        this.b = new jhi();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new vl9(this, (byte) 10);
        this.e = obj;
        this.g = -1;
    }

    public ekc(Object obj) {
        this.a = new Object();
        this.b = new jhi();
        this.c = 0;
        this.f = k;
        this.j = new vl9(this, (byte) 10);
        this.e = obj;
        this.g = 0;
    }

    public static void b(String str) {
        if (cx1.C().a.C()) {
            return;
        }
        qp2.n(sko.k("Cannot invoke ", str, " on a background thread"));
    }

    public final void e(dkc dkcVar) {
        if (dkcVar.b) {
            if (!dkcVar.d()) {
                dkcVar.a(false);
                return;
            }
            int i = dkcVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dkcVar.c = i2;
            dkcVar.a.d0(this.e);
        }
    }

    public final void f(dkc dkcVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dkcVar != null) {
                e(dkcVar);
                dkcVar = null;
            } else {
                jhi jhiVar = this.b;
                hhi hhiVar = new hhi(jhiVar);
                jhiVar.c.put(hhiVar, Boolean.FALSE);
                while (hhiVar.hasNext()) {
                    e((dkc) ((Map.Entry) hhiVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object g() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final boolean h() {
        return this.c > 0;
    }

    public final boolean i() {
        return this.e != k;
    }

    public final void j(ndc ndcVar, f7f f7fVar) {
        b("observe");
        if (((qdc) ndcVar.getLifecycle()).i != qcc.a) {
            ckc ckcVar = new ckc(this, ndcVar, f7fVar);
            dkc dkcVar = (dkc) this.b.b(f7fVar, ckcVar);
            if (dkcVar == null) {
                ndcVar.getLifecycle().a(ckcVar);
            } else {
                if (dkcVar.c(ndcVar)) {
                    return;
                }
                qp2.o("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public final void k(f7f f7fVar) {
        b("observeForever");
        bkc bkcVar = new bkc(this, f7fVar);
        dkc dkcVar = (dkc) this.b.b(f7fVar, bkcVar);
        if (dkcVar instanceof ckc) {
            qp2.o("Cannot add the same observer with different lifecycles");
        } else {
            if (dkcVar != null) {
                return;
            }
            bkcVar.a(true);
        }
    }

    public void l() {
    }

    public void m() {
    }

    public void n(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            cx1.C().D(this.j);
        }
    }

    public void p(f7f f7fVar) {
        b("removeObserver");
        dkc dkcVar = (dkc) this.b.c(f7fVar);
        if (dkcVar == null) {
            return;
        }
        dkcVar.b();
        dkcVar.a(false);
    }

    public final void q(ndc ndcVar) {
        b("removeObservers");
        Iterator it = this.b.iterator();
        while (true) {
            fhi fhiVar = (fhi) it;
            if (!fhiVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) fhiVar.next();
            if (((dkc) entry.getValue()).c(ndcVar)) {
                p((f7f) entry.getKey());
            }
        }
    }

    public void r(Object obj) {
        b("setValue");
        this.g++;
        this.e = obj;
        f(null);
    }
}
