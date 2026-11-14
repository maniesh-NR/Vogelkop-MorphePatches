package defpackage;

/* loaded from: classes.dex */
public final class rk0 extends jf0 {
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
        rk0 rk0Var = (rk0) jf0Var;
        qk0 qk0Var = (qk0) rk0Var.n(0);
        qk0 qk0Var2 = (qk0) n(0);
        if (qk0Var == null || qk0Var2 != null) {
            qk0Var = qk0Var2;
        }
        if (qk0Var != null) {
            q(0, 1, qk0Var);
        }
        sk0 sk0Var = (sk0) rk0Var.n(1);
        sk0 sk0Var2 = (sk0) n(1);
        if (sk0Var == null || sk0Var2 != null) {
            sk0Var = sk0Var2;
        }
        if (sk0Var != null) {
            q(1, 1, sk0Var);
        }
        tk0 tk0Var = (tk0) rk0Var.n(2);
        tk0 tk0Var2 = (tk0) n(2);
        if (tk0Var == null || tk0Var2 != null) {
            tk0Var = tk0Var2;
        }
        if (tk0Var != null) {
            q(2, 1, tk0Var);
        }
        Boolean bool = (Boolean) rk0Var.n(3);
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
