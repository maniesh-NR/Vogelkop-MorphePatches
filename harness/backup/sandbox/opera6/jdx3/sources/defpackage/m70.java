package defpackage;

/* loaded from: classes.dex */
public final class m70 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        m70 m70Var = (m70) jf0Var;
        gn0 gn0Var = (gn0) m70Var.n(0);
        gn0 gn0Var2 = (gn0) n(0);
        if (gn0Var == null || gn0Var2 != null) {
            gn0Var = gn0Var2;
        }
        if (gn0Var != null) {
            q(0, 1, gn0Var);
        }
        Long lH = jf0.h((Long) m70Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        return this;
    }
}
