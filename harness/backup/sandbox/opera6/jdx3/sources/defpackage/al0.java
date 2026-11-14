package defpackage;

/* loaded from: classes.dex */
public final class al0 extends jf0 {
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
        al0 al0Var = (al0) jf0Var;
        bl0 bl0Var = (bl0) al0Var.n(0);
        bl0 bl0Var2 = (bl0) n(0);
        if (bl0Var == null || bl0Var2 != null) {
            bl0Var = bl0Var2;
        }
        if (bl0Var != null) {
            q(0, 1, bl0Var);
        }
        Long lH = jf0.h((Long) al0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        return this;
    }
}
