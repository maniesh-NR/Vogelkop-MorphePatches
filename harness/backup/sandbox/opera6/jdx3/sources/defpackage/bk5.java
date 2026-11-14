package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class bk5 {
    public final jk5 a;
    public final ik5 b;
    public final qb7 c;
    public final jw1 d;
    public final Runnable e;
    public final kze f;
    public lh4 g;
    public zj5 h;

    public bk5(jk5 jk5Var, ik5 ik5Var, qb7 qb7Var, jw1 jw1Var, Runnable runnable) {
        kze kzeVar = new kze(ak5.a);
        this.a = jk5Var;
        this.b = ik5Var;
        this.c = qb7Var;
        this.d = jw1Var;
        this.e = runnable;
        this.f = kzeVar;
    }

    public final boolean a() {
        int iOrdinal = ((ak5) this.f.g()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                h9o.p();
                return false;
            }
        }
        return false;
    }

    public final boolean b(p58 p58Var) {
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        zj5 zj5Var = this.h;
        if (zj5Var != null) {
            c(zj5Var.a, zj5Var.b, Collections.singletonList(p58Var));
            return zA;
        }
        lh4 lh4Var = this.g;
        if (lh4Var != null) {
            lh4Var.b = null;
            this.g = null;
        }
        jk5 jk5Var = this.a;
        synchronized (jk5Var.d) {
            jk5Var.e = null;
        }
        this.h = null;
        d(ak5.a);
        return zA;
    }

    public final void c(String str, gk5 gk5Var, List list) {
        jk5 jk5Var = this.a;
        synchronized (jk5Var.d) {
            jk5Var.e = null;
        }
        ck5 ck5Var = new ck5(str, gk5Var, list);
        lh4 lh4Var = this.g;
        if (lh4Var != null) {
            lh4Var.b = null;
            this.g = null;
        }
        this.h = null;
        this.a.b.r(new eb8(ck5Var));
        d(ak5.a);
    }

    public final void d(ak5 ak5Var) {
        kze kzeVar = this.f;
        if (kzeVar.g() != ak5Var) {
            kzeVar.r(ak5Var);
        }
    }

    public final boolean e(String str, gk5 gk5Var) {
        int iOrdinal = ((ak5) this.f.g()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
            }
            return false;
        }
        jk5 jk5Var = this.a;
        synchronized (jk5Var.d) {
            if (jk5Var.e != null) {
                return false;
            }
            jk5Var.e = str;
            this.h = new zj5(str, gk5Var);
            d(ak5.b);
            lh4 lh4Var = new lh4(new su((Object) this, (Object) gk5Var, (Object) str, (byte) 16), (byte) 0);
            this.g = lh4Var;
            ik5 ik5Var = this.b;
            hk5 hk5Var = new hk5(ik5Var.a, new ki5((byte) 6), lh4Var);
            lpe lpeVar = ik5Var.b;
            ks3 ks3Var = lpeVar.B;
            d3k d3kVar = (d3k) ks3Var.i;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            ks3Var.i = null;
            ((ArrayList) ks3Var.h).clear();
            lpeVar.a(new f9((Object) hk5Var, (Object) ik5Var, (Object) str, (byte) 23));
            return true;
        }
    }
}
