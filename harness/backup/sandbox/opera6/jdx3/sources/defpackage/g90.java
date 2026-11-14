package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class g90 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var};
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
        g90 g90Var = (g90) jf0Var;
        f90 f90Var = (f90) g90Var.n(0);
        f90 f90Var2 = (f90) n(0);
        if (f90Var == null || f90Var2 != null) {
            f90Var = f90Var2;
        }
        if (f90Var != null) {
            q(0, 1, f90Var);
        }
        List listI = jf0.i((List) g90Var.n(1), (List) n(1));
        if (listI != null) {
            q(1, 1, listI);
        }
        List listI2 = jf0.i((List) g90Var.n(2), (List) n(2));
        if (listI2 != null) {
            q(2, 1, listI2);
        }
        return this;
    }
}
