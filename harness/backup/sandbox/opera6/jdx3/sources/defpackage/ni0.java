package defpackage;

/* loaded from: classes.dex */
public final class ni0 extends jf0 {
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
        ni0 ni0Var = (ni0) jf0Var;
        vh0 vh0Var = (vh0) jf0.f((vh0) ni0Var.n(0), (vh0) n(0));
        if (vh0Var != null) {
            q(0, 1, vh0Var);
        }
        pi0 pi0Var = (pi0) ni0Var.n(1);
        pi0 pi0Var2 = (pi0) n(1);
        if (pi0Var == null || pi0Var2 != null) {
            pi0Var = pi0Var2;
        }
        if (pi0Var != null) {
            q(1, 1, pi0Var);
        }
        oi0 oi0Var = (oi0) ni0Var.n(2);
        oi0 oi0Var2 = (oi0) n(2);
        if (oi0Var == null || oi0Var2 != null) {
            oi0Var = oi0Var2;
        }
        if (oi0Var != null) {
            q(2, 1, oi0Var);
        }
        return this;
    }
}
