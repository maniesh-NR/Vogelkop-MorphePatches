package defpackage;

/* loaded from: classes.dex */
public final class yp0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var};
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
        yp0 yp0Var = (yp0) jf0Var;
        Boolean bool = (Boolean) yp0Var.n(0);
        Boolean bool2 = (Boolean) n(0);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(0, 1, bool);
        }
        Long lH = jf0.h((Long) yp0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        bj0 bj0Var = (bj0) jf0.f((bj0) yp0Var.n(2), (bj0) n(2));
        if (bj0Var != null) {
            q(2, 1, bj0Var);
        }
        Long lH2 = jf0.h((Long) yp0Var.n(3), (Long) n(3));
        if (lH2 != null) {
            q(3, 1, lH2);
        }
        return this;
    }
}
