package defpackage;

/* loaded from: classes.dex */
public final class vh0 extends jf0 {
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
        vh0 vh0Var = (vh0) jf0Var;
        sh0 sh0Var = (sh0) vh0Var.n(0);
        sh0 sh0Var2 = (sh0) n(0);
        if (sh0Var == null || sh0Var2 != null) {
            sh0Var = sh0Var2;
        }
        if (sh0Var != null) {
            q(0, 1, sh0Var);
        }
        rh0 rh0Var = (rh0) vh0Var.n(1);
        rh0 rh0Var2 = (rh0) n(1);
        if (rh0Var == null || rh0Var2 != null) {
            rh0Var = rh0Var2;
        }
        if (rh0Var != null) {
            q(1, 1, rh0Var);
        }
        qh0 qh0Var = (qh0) vh0Var.n(2);
        qh0 qh0Var2 = (qh0) n(2);
        if (qh0Var == null || qh0Var2 != null) {
            qh0Var = qh0Var2;
        }
        if (qh0Var != null) {
            q(2, 1, qh0Var);
        }
        return this;
    }
}
