package defpackage;

/* loaded from: classes.dex */
public final class cf0 extends jf0 {
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
        cf0 cf0Var = (cf0) jf0Var;
        we0 we0Var = (we0) cf0Var.n(0);
        we0 we0Var2 = (we0) n(0);
        if (we0Var == null || we0Var2 != null) {
            we0Var = we0Var2;
        }
        if (we0Var != null) {
            q(0, 1, we0Var);
        }
        ci0 ci0Var = (ci0) cf0Var.n(1);
        ci0 ci0Var2 = (ci0) n(1);
        if (ci0Var == null || ci0Var2 != null) {
            ci0Var = ci0Var2;
        }
        if (ci0Var != null) {
            q(1, 1, ci0Var);
        }
        return this;
    }
}
