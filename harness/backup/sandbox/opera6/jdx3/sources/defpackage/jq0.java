package defpackage;

/* loaded from: classes.dex */
public final class jq0 extends jf0 {
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
        jq0 jq0Var = (jq0) jf0Var;
        f80 f80Var = (f80) jq0Var.n(0);
        f80 f80Var2 = (f80) n(0);
        if (f80Var == null || f80Var2 != null) {
            f80Var = f80Var2;
        }
        if (f80Var != null) {
            q(0, 1, f80Var);
        }
        Boolean bool = (Boolean) jq0Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        return this;
    }
}
