package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class va0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
    }

    @Override // defpackage.jf0
    public final df0 a(int i) {
        return g[i];
    }

    @Override // defpackage.jf0
    public final ef0 b(int i) {
        return f[i];
    }

    @Override // defpackage.jf0
    public final jf0 m(jf0 jf0Var) {
        va0 va0Var = (va0) jf0Var;
        Map mapL = jf0.l((Map) va0Var.n(0), (Map) n(0));
        if (mapL != null) {
            q(0, 1, mapL);
        }
        Long lH = jf0.h((Long) va0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        k90 k90Var = (k90) jf0.f((k90) va0Var.n(2), (k90) n(2));
        if (k90Var != null) {
            q(2, 1, k90Var);
        }
        lg0 lg0Var = (lg0) jf0.f((lg0) va0Var.n(3), (lg0) n(3));
        if (lg0Var != null) {
            q(3, 1, lg0Var);
        }
        Map mapL2 = jf0.l((Map) va0Var.n(4), (Map) n(4));
        if (mapL2 != null) {
            q(4, 1, mapL2);
        }
        List listI = jf0.i((List) va0Var.n(5), (List) n(5));
        if (listI != null) {
            q(5, 1, listI);
        }
        return this;
    }
}
