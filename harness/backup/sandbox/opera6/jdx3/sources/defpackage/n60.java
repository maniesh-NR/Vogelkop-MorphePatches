package defpackage;

/* loaded from: classes.dex */
public final class n60 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        n60 n60Var = (n60) jf0Var;
        Long lH = jf0.h((Long) n60Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Boolean bool = (Boolean) n60Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        Long lH2 = jf0.h((Long) n60Var.n(2), (Long) n(2));
        if (lH2 != null) {
            q(2, 1, lH2);
        }
        return this;
    }
}
