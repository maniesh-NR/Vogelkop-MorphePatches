package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class uo0 extends jf0 {
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
        uo0 uo0Var = (uo0) jf0Var;
        Map mapL = jf0.l((Map) uo0Var.n(0), (Map) n(0));
        if (mapL != null) {
            q(0, 1, mapL);
        }
        Map mapL2 = jf0.l((Map) uo0Var.n(1), (Map) n(1));
        if (mapL2 != null) {
            q(1, 1, mapL2);
        }
        ro0 ro0Var = (ro0) jf0.f((ro0) uo0Var.n(2), (ro0) n(2));
        if (ro0Var != null) {
            q(2, 1, ro0Var);
        }
        List listI = jf0.i((List) uo0Var.n(3), (List) n(3));
        if (listI != null) {
            q(3, 1, listI);
        }
        List listI2 = jf0.i((List) uo0Var.n(4), (List) n(4));
        if (listI2 != null) {
            q(4, 1, listI2);
        }
        mn0 mn0Var = (mn0) jf0.f((mn0) uo0Var.n(5), (mn0) n(5));
        if (mn0Var != null) {
            q(5, 1, mn0Var);
        }
        return this;
    }
}
