package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class is0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var};
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
        is0 is0Var = (is0) jf0Var;
        op0 op0Var = (op0) is0Var.n(0);
        op0 op0Var2 = (op0) n(0);
        if (op0Var == null || op0Var2 != null) {
            op0Var = op0Var2;
        }
        if (op0Var != null) {
            q(0, 1, op0Var);
        }
        Map mapL = jf0.l((Map) is0Var.n(1), (Map) n(1));
        if (mapL != null) {
            q(1, 1, mapL);
        }
        return this;
    }
}
