package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a63 implements ed6 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public nd6 d;

    public a63(boolean z) {
        this.a = z;
    }

    public final void a(int i) {
        nd6 nd6Var = this.d;
        String str = tym.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            pl6 pl6Var = (pl6) this.b.get(i2);
            boolean z = this.a;
            synchronized (pl6Var) {
                csh cshVar = pl6.p;
                if (z && (nd6Var.h & 8) != 8) {
                    pl6Var.i += i;
                }
            }
        }
    }

    @Override // defpackage.ed6
    public final void c(pl6 pl6Var) {
        pl6Var.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(pl6Var)) {
            return;
        }
        arrayList.add(pl6Var);
        this.c++;
    }

    public final void d() {
        nd6 nd6Var = this.d;
        String str = tym.a;
        for (int i = 0; i < this.c; i++) {
            pl6 pl6Var = (pl6) this.b.get(i);
            boolean z = this.a;
            synchronized (pl6Var) {
                csh cshVar = pl6.p;
                if (z && (nd6Var.h & 8) != 8) {
                    z4o.H(pl6Var.g > 0);
                    pl6Var.d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i2 = (int) (jElapsedRealtime - pl6Var.h);
                    pl6Var.j += i2;
                    long j = pl6Var.k;
                    long j2 = pl6Var.i;
                    pl6Var.k = j + j2;
                    if (i2 > 0) {
                        pl6Var.f.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i2);
                        if (pl6Var.j >= 2000 || pl6Var.k >= 524288) {
                            pl6Var.l = (long) pl6Var.f.k();
                        }
                        pl6Var.b(i2, pl6Var.i, pl6Var.l);
                        pl6Var.h = jElapsedRealtime;
                        pl6Var.i = 0L;
                    }
                    pl6Var.g--;
                }
            }
        }
        this.d = null;
    }

    public final void e() {
        for (int i = 0; i < this.c; i++) {
            ((pl6) this.b.get(i)).getClass();
        }
    }

    public final void f(nd6 nd6Var) {
        this.d = nd6Var;
        for (int i = 0; i < this.c; i++) {
            pl6 pl6Var = (pl6) this.b.get(i);
            boolean z = this.a;
            synchronized (pl6Var) {
                csh cshVar = pl6.p;
                if (z && (nd6Var.h & 8) != 8) {
                    if (pl6Var.g == 0) {
                        pl6Var.d.getClass();
                        pl6Var.h = SystemClock.elapsedRealtime();
                    }
                    pl6Var.g++;
                }
            }
        }
    }
}
