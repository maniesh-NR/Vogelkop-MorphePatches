package defpackage;

/* loaded from: classes.dex */
public final class hj0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        hj0 hj0Var = (hj0) jf0Var;
        od0 od0Var = (od0) hj0Var.n(0);
        od0 od0Var2 = (od0) n(0);
        if (od0Var == null || od0Var2 != null) {
            od0Var = od0Var2;
        }
        if (od0Var != null) {
            q(0, 1, od0Var);
        }
        Long lH = jf0.h((Long) hj0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        Long lH2 = jf0.h((Long) hj0Var.n(2), (Long) n(2));
        if (lH2 != null) {
            q(2, 1, lH2);
        }
        Long lH3 = jf0.h((Long) hj0Var.n(3), (Long) n(3));
        if (lH3 != null) {
            q(3, 1, lH3);
        }
        Long lH4 = jf0.h((Long) hj0Var.n(4), (Long) n(4));
        if (lH4 != null) {
            q(4, 1, lH4);
        }
        Long lH5 = jf0.h((Long) hj0Var.n(5), (Long) n(5));
        if (lH5 != null) {
            q(5, 1, lH5);
        }
        return this;
    }
}
