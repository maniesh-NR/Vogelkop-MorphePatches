package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m5o {
    public final xm5 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    static {
        qs7.B("WorkTimer");
    }

    public m5o(xm5 xm5Var) {
        this.a = xm5Var;
    }

    public final void a(w4o w4oVar) {
        synchronized (this.d) {
            if (((l5o) this.b.remove(w4oVar)) != null) {
                qs7 qs7VarX = qs7.x();
                Objects.toString(w4oVar);
                qs7VarX.getClass();
                this.c.remove(w4oVar);
            }
        }
    }
}
