package defpackage;

/* loaded from: classes.dex */
public final class nb0 extends jf0 {
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
        nb0 nb0Var = (nb0) jf0Var;
        Long lH = jf0.h((Long) nb0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        bh0 bh0Var = (bh0) nb0Var.n(1);
        bh0 bh0Var2 = (bh0) n(1);
        if (bh0Var == null || bh0Var2 != null) {
            bh0Var = bh0Var2;
        }
        if (bh0Var != null) {
            q(1, 1, bh0Var);
        }
        return this;
    }
}
