package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class e59 {
    public final HashMap a = new HashMap();

    public final void a(d59 d59Var, c59 c59Var) {
        this.a.put(d59Var, c59Var);
    }

    public final String b(d59 d59Var) {
        c59 c59Var = (c59) this.a.get(d59Var);
        ExecutorService executorService = c59.l;
        m59 m59Var = c59Var.b;
        if (m59Var == null) {
            m59Var = new m59(c59Var.b(), c59Var.c.e, c59Var.h, c59Var);
            c59Var.b = m59Var;
        }
        return ((SharedPreferences) m59Var.f).getString("last_fcm_token", null);
    }

    public final void c(d59 d59Var, boolean z) {
        c59 c59Var = (c59) this.a.get(d59Var);
        if (c59Var.d != z || c59Var.e) {
            c59Var.e = false;
            c59Var.d = z;
            m59 m59Var = c59Var.b;
            if (m59Var != null) {
                c59Var.a(m59Var);
            }
        }
    }
}
