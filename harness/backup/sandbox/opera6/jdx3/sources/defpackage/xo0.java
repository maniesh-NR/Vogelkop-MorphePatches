package defpackage;

/* loaded from: classes.dex */
public final class xo0 extends jf0 {
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
        xo0 xo0Var = (xo0) jf0Var;
        vb0 vb0Var = (vb0) xo0Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        yo0 yo0Var = (yo0) xo0Var.n(1);
        yo0 yo0Var2 = (yo0) n(1);
        if (yo0Var == null || yo0Var2 != null) {
            yo0Var = yo0Var2;
        }
        if (yo0Var != null) {
            q(1, 1, yo0Var);
        }
        return this;
    }
}
