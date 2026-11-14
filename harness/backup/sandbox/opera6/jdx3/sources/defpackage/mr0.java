package defpackage;

/* loaded from: classes.dex */
public final class mr0 extends jf0 {
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
        mr0 mr0Var = (mr0) jf0Var;
        Long lH = jf0.h((Long) mr0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        nr0 nr0Var = (nr0) mr0Var.n(1);
        nr0 nr0Var2 = (nr0) n(1);
        if (nr0Var == null || nr0Var2 != null) {
            nr0Var = nr0Var2;
        }
        if (nr0Var != null) {
            q(1, 1, nr0Var);
        }
        return this;
    }
}
