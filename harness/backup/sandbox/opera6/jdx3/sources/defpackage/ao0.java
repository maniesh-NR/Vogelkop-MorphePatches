package defpackage;

/* loaded from: classes.dex */
public final class ao0 extends jf0 {
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
        ao0 ao0Var = (ao0) jf0Var;
        Boolean bool = (Boolean) ao0Var.n(0);
        Boolean bool2 = (Boolean) n(0);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(0, 1, bool);
        }
        Boolean bool3 = (Boolean) ao0Var.n(1);
        Boolean bool4 = (Boolean) n(1);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(1, 1, bool3);
        }
        f80 f80Var = (f80) ao0Var.n(2);
        f80 f80Var2 = (f80) n(2);
        if (f80Var == null || f80Var2 != null) {
            f80Var = f80Var2;
        }
        if (f80Var != null) {
            q(2, 1, f80Var);
        }
        return this;
    }
}
