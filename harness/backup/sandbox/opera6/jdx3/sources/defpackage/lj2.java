package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class lj2 {
    public final ode c;
    public final h42 d;
    public final zy9 a = new zy9(this);
    public final ob b = new ob((Object) this, (byte) 4);
    public int g = 0;
    public int f = 0;
    public boolean h = false;
    public int e = 3;

    public lj2() {
        ode odeVar = new ode(Boolean.FALSE);
        this.c = odeVar;
        this.d = b8h.d(odeVar);
    }

    public void a() {
    }

    public final void b(Context context, Runnable runnable) {
        if (this.e == 1) {
            runnable.run();
        } else {
            d(2);
            c(context, this.a, runnable);
        }
    }

    public abstract void c(Context context, zy9 zy9Var, Runnable runnable);

    public final void d(int i) {
        this.e = i;
        this.c.r(Boolean.valueOf(i == 1));
    }
}
