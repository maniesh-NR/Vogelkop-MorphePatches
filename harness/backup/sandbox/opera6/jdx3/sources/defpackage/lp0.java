package defpackage;

/* loaded from: classes.dex */
public final class lp0 extends jf0 {
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
        lp0 lp0Var = (lp0) jf0Var;
        Boolean bool = (Boolean) lp0Var.n(0);
        Boolean bool2 = (Boolean) n(0);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(0, 1, bool);
        }
        bj0 bj0Var = (bj0) jf0.f((bj0) lp0Var.n(1), (bj0) n(1));
        if (bj0Var != null) {
            q(1, 1, bj0Var);
        }
        Long lH = jf0.h((Long) lp0Var.n(2), (Long) n(2));
        if (lH != null) {
            q(2, 1, lH);
        }
        return this;
    }
}
