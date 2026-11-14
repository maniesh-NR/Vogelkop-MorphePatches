package defpackage;

/* loaded from: classes.dex */
public final class lu0 extends jf0 {
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
        lu0 lu0Var = (lu0) jf0Var;
        vb0 vb0Var = (vb0) lu0Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        mu0 mu0Var = (mu0) lu0Var.n(1);
        mu0 mu0Var2 = (mu0) n(1);
        if (mu0Var == null || mu0Var2 != null) {
            mu0Var = mu0Var2;
        }
        if (mu0Var != null) {
            q(1, 1, mu0Var);
        }
        Boolean bool = (Boolean) lu0Var.n(2);
        Boolean bool2 = (Boolean) n(2);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(2, 1, bool);
        }
        String str = (String) lu0Var.n(3);
        String str2 = (String) n(3);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(3, 1, str);
        }
        return this;
    }
}
