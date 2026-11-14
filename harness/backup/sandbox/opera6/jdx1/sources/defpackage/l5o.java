package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l5o implements Runnable {
    public final m5o a;
    public final w4o b;

    public l5o(m5o m5oVar, w4o w4oVar) {
        this.a = m5oVar;
        this.b = w4oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            if (((l5o) this.a.b.remove(this.b)) != null) {
                c17 c17Var = (c17) this.a.c.remove(this.b);
                if (c17Var != null) {
                    w4o w4oVar = this.b;
                    qs7 qs7VarX = qs7.x();
                    Objects.toString(w4oVar);
                    qs7VarX.getClass();
                    c17Var.h.execute(new b17(c17Var, (byte) 0));
                }
            } else {
                qs7 qs7VarX2 = qs7.x();
                Objects.toString(this.b);
                qs7VarX2.getClass();
            }
        }
    }
}
