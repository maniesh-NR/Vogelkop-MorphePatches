package defpackage;

/* loaded from: classes.dex */
public final class r80 extends jf0 {
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
        r80 r80Var = (r80) jf0Var;
        q80 q80Var = (q80) r80Var.n(0);
        q80 q80Var2 = (q80) n(0);
        if (q80Var == null || q80Var2 != null) {
            q80Var = q80Var2;
        }
        if (q80Var != null) {
            q(0, 1, q80Var);
        }
        Long lH = jf0.h((Long) r80Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        return this;
    }
}
