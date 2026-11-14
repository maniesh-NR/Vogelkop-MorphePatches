package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k43 {
    public final pyl a;
    public final r68 b;
    public final String c;
    public final dl d;
    public final yo e;
    public final sx f;
    public hvh g;
    public int h;
    public int i;
    public boolean j;

    public k43(bqi bqiVar, zy zyVar, dl dlVar) {
        this.a = bqiVar.k;
        this.b = bqiVar.m;
        this.c = bqiVar.g;
        this.d = dlVar;
        this.e = bqiVar.e;
        sx sxVar = new sx();
        sxVar.b = zyVar;
        this.f = sxVar;
    }

    public abstract void a();

    public final void b(boolean z, String str, boolean z2, v50 v50Var, Long l) {
        if (z) {
            r68 r68Var = this.b;
            xnh xnhVar = r68Var.a;
            SparseArray sparseArray = r68Var.b;
            long jMin = ((wnh) xnhVar.i()).d;
            q68 q68Var = (q68) sparseArray.get(-1000);
            if (q68Var != null) {
                jMin = !q68Var.a() ? -1L : jMin == 0 ? 0L : Math.min(180000L, q68Var.b << 1);
            }
            if (jMin > 0) {
                sparseArray.append(-1000, new q68(jMin));
            }
        }
        if (!z2 || this.h >= 1) {
            c(z, str, false, v50Var, l);
        } else {
            vml.d(new e23(this, z, str, v50Var, l), 0L);
        }
    }

    public final void c(boolean z, String str, boolean z2, v50 v50Var, Long l) {
        String str2;
        if (this.g != null) {
            if (this.j) {
                str2 = str;
                this.a.s(this.i, false, z, str2, v50Var, 0L, l);
                this.j = false;
            } else {
                str2 = str;
            }
            if (!z2) {
                this.f.onFailed(bqi.n(str2, this.c));
            }
            hvh hvhVar = this.g;
            if (hvhVar == null) {
                return;
            }
            this.g = null;
            hvhVar.a(this, z2);
        }
    }

    public final void d(aqi aqiVar) {
        e(Collections.singletonList(aqiVar));
    }

    public final void e(List list) {
        List<yz> list2;
        v50 v50VarE;
        this.b.b.clear();
        if (this.g == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((yz) it.next()).b();
            }
            return;
        }
        Iterator it2 = list.iterator();
        long jM = 0;
        while (it2.hasNext()) {
            jM += ((yz) it2.next()).m();
        }
        if (list.isEmpty()) {
            list2 = list;
            v50VarE = null;
        } else {
            list2 = list;
            v50VarE = ((yz) list2.get(0)).e();
        }
        int size = list2.size();
        Long lValueOf = jM > 0 ? Long.valueOf(jM) : null;
        if (this.j) {
            this.a.s(this.i, true, false, null, v50VarE, size, lValueOf);
            this.j = false;
        }
        for (yz yzVar : list2) {
            if (!this.f.a(yzVar)) {
                yzVar.b();
            }
        }
        hvh hvhVar = this.g;
        if (hvhVar == null) {
            return;
        }
        this.g = null;
        hvhVar.h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k43)) {
            return false;
        }
        k43 k43Var = (k43) obj;
        return this.e == k43Var.e && this.c.equals(k43Var.c);
    }

    public final void f(hvh hvhVar) {
        if (this.g != null) {
            this.g = hvhVar;
            return;
        }
        this.g = hvhVar;
        dl dlVar = this.d;
        q50 q50Var = dlVar.b;
        String str = dlVar.c;
        pyl pylVar = this.a;
        wjh wjhVar = (wjh) pylVar.c;
        o59 o59Var = (o59) wjhVar.f;
        if (o59Var != null && o59Var.f <= -1) {
            o59Var.f = SystemClock.uptimeMillis() - ((o59) wjhVar.f).b;
            wjhVar.p();
        }
        int i = pylVar.b;
        pylVar.b = i + 1;
        ((SparseArray) pylVar.e).put(i, new jp(this.c, this.e, q50Var, str));
        this.i = i;
        this.j = true;
        this.h++;
        a();
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + this.c;
    }
}
