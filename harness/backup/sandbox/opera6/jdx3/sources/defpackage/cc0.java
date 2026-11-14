package defpackage;

/* loaded from: classes.dex */
public final class cc0 extends jf0 {
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
        cc0 cc0Var = (cc0) jf0Var;
        dc0 dc0Var = (dc0) cc0Var.n(0);
        dc0 dc0Var2 = (dc0) n(0);
        if (dc0Var == null || dc0Var2 != null) {
            dc0Var = dc0Var2;
        }
        if (dc0Var != null) {
            q(0, 1, dc0Var);
        }
        Boolean bool = (Boolean) cc0Var.n(1);
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
