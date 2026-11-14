package defpackage;

/* loaded from: classes.dex */
public final class z70 extends jf0 {
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
        z70 z70Var = (z70) jf0Var;
        y70 y70Var = (y70) z70Var.n(0);
        y70 y70Var2 = (y70) n(0);
        if (y70Var == null || y70Var2 != null) {
            y70Var = y70Var2;
        }
        if (y70Var != null) {
            q(0, 1, y70Var);
        }
        Long lH = jf0.h((Long) z70Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        return this;
    }
}
