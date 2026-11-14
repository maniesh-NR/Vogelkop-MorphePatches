package defpackage;

/* loaded from: classes.dex */
public final class rl0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var};
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
        rl0 rl0Var = (rl0) jf0Var;
        Long lH = jf0.h((Long) rl0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        ul0 ul0Var = (ul0) rl0Var.n(1);
        ul0 ul0Var2 = (ul0) n(1);
        if (ul0Var == null || ul0Var2 != null) {
            ul0Var = ul0Var2;
        }
        if (ul0Var != null) {
            q(1, 1, ul0Var);
        }
        bj0 bj0Var = (bj0) jf0.f((bj0) rl0Var.n(2), (bj0) n(2));
        if (bj0Var != null) {
            q(2, 1, bj0Var);
        }
        tl0 tl0Var = (tl0) rl0Var.n(3);
        tl0 tl0Var2 = (tl0) n(3);
        if (tl0Var == null || tl0Var2 != null) {
            tl0Var = tl0Var2;
        }
        if (tl0Var != null) {
            q(3, 1, tl0Var);
        }
        Integer numG = jf0.g((Integer) rl0Var.n(4), (Integer) n(4));
        if (numG != null) {
            q(4, 1, numG);
        }
        return this;
    }
}
