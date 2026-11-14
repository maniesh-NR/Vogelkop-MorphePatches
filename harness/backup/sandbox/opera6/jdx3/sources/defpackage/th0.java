package defpackage;

/* loaded from: classes.dex */
public final class th0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var};
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
        th0 th0Var = (th0) jf0Var;
        Long lH = jf0.h((Long) th0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        vh0 vh0Var = (vh0) jf0.f((vh0) th0Var.n(1), (vh0) n(1));
        if (vh0Var != null) {
            q(1, 1, vh0Var);
        }
        uh0 uh0Var = (uh0) th0Var.n(2);
        uh0 uh0Var2 = (uh0) n(2);
        if (uh0Var == null || uh0Var2 != null) {
            uh0Var = uh0Var2;
        }
        if (uh0Var != null) {
            q(2, 1, uh0Var);
        }
        Boolean bool = (Boolean) th0Var.n(3);
        Boolean bool2 = (Boolean) n(3);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(3, 1, bool);
        }
        return this;
    }
}
