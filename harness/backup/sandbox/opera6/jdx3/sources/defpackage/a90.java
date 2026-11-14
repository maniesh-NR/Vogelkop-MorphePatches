package defpackage;

/* loaded from: classes.dex */
public final class a90 extends jf0 {
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
        a90 a90Var = (a90) jf0Var;
        c90 c90Var = (c90) a90Var.n(0);
        c90 c90Var2 = (c90) n(0);
        if (c90Var == null || c90Var2 != null) {
            c90Var = c90Var2;
        }
        if (c90Var != null) {
            q(0, 1, c90Var);
        }
        op0 op0Var = (op0) a90Var.n(1);
        op0 op0Var2 = (op0) n(1);
        if (op0Var == null || op0Var2 != null) {
            op0Var = op0Var2;
        }
        if (op0Var != null) {
            q(1, 1, op0Var);
        }
        return this;
    }
}
