package defpackage;

/* loaded from: classes.dex */
public final class zh0 extends jf0 {
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
        zh0 zh0Var = (zh0) jf0Var;
        yh0 yh0Var = (yh0) zh0Var.n(0);
        yh0 yh0Var2 = (yh0) n(0);
        if (yh0Var == null || yh0Var2 != null) {
            yh0Var = yh0Var2;
        }
        if (yh0Var != null) {
            q(0, 1, yh0Var);
        }
        vh0 vh0Var = (vh0) jf0.f((vh0) zh0Var.n(1), (vh0) n(1));
        if (vh0Var != null) {
            q(1, 1, vh0Var);
        }
        return this;
    }
}
