package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class hv2 implements w82 {
    public final String a;
    public final int b;
    public final b59 c;
    public final d53 d;
    public final ip1 e;
    public boolean f;
    public c53 g;
    public boolean h;
    public boolean i;
    public final fv2 j = new fv2(this, 1);

    public hv2(String str, long j, String str2, b59 b59Var, d53 d53Var, ip1 ip1Var) {
        this.a = sko.k(str, "/", str2);
        this.b = (int) j;
        this.c = b59Var;
        this.d = d53Var;
        this.e = ip1Var;
    }

    @Override // defpackage.w82
    public final void a(c53 c53Var) {
        this.g = c53Var;
        if (this.h || c53Var == null) {
            return;
        }
        this.e.accept(c53Var);
        this.g = null;
        this.f = true;
    }

    @Override // defpackage.w82
    public final void c(c53 c53Var) {
        this.g = null;
    }

    @Override // defpackage.w82
    public final void d(k92 k92Var, Exception exc) {
        this.g = null;
    }

    public final void e() {
        long j;
        boolean z = this.i;
        fv2 fv2Var = this.j;
        if (z) {
            vml.a(fv2Var);
            this.i = false;
        }
        if (this.f || this.h || this.g != null) {
            j = -1;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = ((SharedPreferences) this.c.get()).getLong(z1m.l(new StringBuilder("autorefresh.time["), this.a, "]"), 0L);
            if (j2 > System.currentTimeMillis()) {
                j2 = 0;
            }
            long j3 = jCurrentTimeMillis - j2;
            long j4 = this.b;
            j = j3 < j4 ? j4 - j3 : 0L;
        }
        if (j == 0) {
            f();
            this.d.e(this, null, this);
        } else {
            if (j < 0) {
                return;
            }
            this.i = true;
            vml.d(fv2Var, Math.max(1000L, j));
        }
    }

    public final void f() {
        ((SharedPreferences) this.c.get()).edit().putLong(z1m.l(new StringBuilder("autorefresh.time["), this.a, "]"), System.currentTimeMillis()).apply();
    }

    public final String toString() {
        return this.a;
    }
}
