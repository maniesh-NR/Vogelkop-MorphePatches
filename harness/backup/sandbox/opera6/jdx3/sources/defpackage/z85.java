package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class z85 extends a08 {
    public g82 a;
    public y85 b;
    public boolean c;
    public long d;
    public int e;
    public boolean f;

    @Override // defpackage.a08, defpackage.r82
    public void a() {
        if (this.c) {
            e();
        }
        this.c = true;
        this.d = SystemClock.uptimeMillis();
    }

    @Override // defpackage.a08, defpackage.r82
    public final void c(int i) {
        this.e = i;
    }

    @Override // defpackage.a08, defpackage.r82
    public void d(g82 g82Var, lqm lqmVar, boolean z) {
        g82 g82Var2 = this.a;
        if (g82Var2 != null && this.c && !g82Var2.a.equals(g82Var.a)) {
            e();
        }
        this.a = g82Var;
        this.b = null;
        this.f = z;
    }

    @Override // defpackage.r82
    public final void e() {
        if (this.a == null || !this.c) {
            return;
        }
        this.c = false;
        if (this.f) {
            this.b = null;
            return;
        }
        y85 y85Var = new y85(SystemClock.uptimeMillis() - this.d, this.e);
        this.b = y85Var;
        f(this.a, y85Var);
    }

    public void f(g82 g82Var, y85 y85Var) {
    }
}
