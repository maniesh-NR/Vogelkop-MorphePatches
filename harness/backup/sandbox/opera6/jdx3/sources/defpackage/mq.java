package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mq extends n43 {
    public final dl c;
    public final yz d;
    public int e;
    public final List f;
    public final km g;
    public final ep h;
    public volatile lq i;
    public lq j;
    public final k8 k;
    public final kq l;
    public long m;
    public boolean n;
    public boolean o;

    public mq(yz yzVar, dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        ep epVar;
        super((byte) 1);
        this.i = lq.a;
        this.d = yzVar;
        if (yzVar != null) {
            yzVar.q = h(dlVar);
        }
        this.c = dlVar;
        this.g = kmVar;
        this.k = k8Var;
        this.l = kqVar;
        this.f = list;
        if (dlVar instanceof kl) {
            kl klVar = (kl) dlVar;
            epVar = new ep(klVar.g, klVar.h, klVar.i);
        } else {
            epVar = new ep(pn7.f(ep.d), true, false);
        }
        this.h = epVar;
    }

    @Override // defpackage.n43
    public final boolean e() {
        return g(true, true);
    }

    @Override // defpackage.n43
    public final void f() {
        yz yzVar = this.d;
        boolean z = false;
        if (yzVar != null) {
            if (yzVar.t()) {
                z = !this.d.o();
            } else {
                if ((this.i == lq.d ? this.j : this.i) == lq.a) {
                    z = true;
                }
            }
        }
        yz yzVar2 = this.d;
        if (z) {
            yzVar2.b();
        } else if (yzVar2 != null) {
            yzVar2.q = null;
            yzVar2.c();
        }
    }

    public boolean g(boolean z, boolean z2) {
        yz yzVar = this.d;
        if (yzVar == null || j()) {
            return false;
        }
        if ((z2 && this.h.b) || i(lq.c)) {
            return true;
        }
        if (yzVar.q()) {
            return !z || i(lq.a, lq.b);
        }
        return false;
    }

    public tz h(dl dlVar) {
        return new jq(this, dlVar);
    }

    public final boolean i(lq... lqVarArr) {
        return Arrays.asList(lqVarArr).contains(this.i);
    }

    public final boolean j() {
        return i(lq.d);
    }

    public void k() {
        yz yzVar = this.d;
        if (yzVar != null) {
            this.g.k(yzVar, this.c);
        }
        if (this.h.a) {
            this.i = lq.c;
        }
    }

    public void l(boolean z) {
        boolean z2;
        boolean z3;
        if (this.n != z) {
            this.n = z;
            k8 k8Var = this.k;
            if (!z) {
                k8Var.g0(this);
                return;
            }
            k8Var.getClass();
            lq lqVar = lq.b;
            boolean zI = i(lq.a);
            if (zI) {
                this.m = SystemClock.uptimeMillis();
            } else if (!g(false, false)) {
                if (SystemClock.uptimeMillis() > this.m + this.h.c && this.d != null && this.i == lqVar && m(this.d)) {
                    this.i = lq.c;
                }
            }
            k8Var.p0(this);
            if ((this instanceof no) || !zI) {
                return;
            }
            f5k f5kVar = (f5k) k8Var.b;
            if (f5kVar != null) {
                z2 = true;
                z3 = f5kVar.a.h;
            } else {
                z2 = false;
                z3 = false;
            }
            x5f x5fVar = (x5f) k8Var.a;
            dl dlVar = this.c;
            x5fVar.r(dlVar.b, dlVar.c, this.e, z2, z3);
            this.i = lqVar;
            yz yzVar = this.d;
            if (yzVar != null) {
                this.g.p(yzVar, this.c, z3);
            }
        }
    }

    public boolean m(yz yzVar) {
        if (yzVar.t()) {
            return yzVar.o();
        }
        return true;
    }
}
