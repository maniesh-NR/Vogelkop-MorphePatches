package defpackage;

/* loaded from: classes.dex */
public final class f60 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        f60 f60Var = (f60) jf0Var;
        g60 g60Var = (g60) f60Var.n(0);
        g60 g60Var2 = (g60) n(0);
        if (g60Var == null || g60Var2 != null) {
            g60Var = g60Var2;
        }
        if (g60Var != null) {
            q(0, 1, g60Var);
        }
        Long lH = jf0.h((Long) f60Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        q50 q50Var = (q50) f60Var.n(2);
        q50 q50Var2 = (q50) n(2);
        if (q50Var == null || q50Var2 != null) {
            q50Var = q50Var2;
        }
        if (q50Var != null) {
            q(2, 1, q50Var);
        }
        String str = (String) f60Var.n(3);
        String str2 = (String) n(3);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(3, 1, str);
        }
        Long lH2 = jf0.h((Long) f60Var.n(4), (Long) n(4));
        if (lH2 != null) {
            q(4, 1, lH2);
        }
        v50 v50Var = (v50) f60Var.n(5);
        v50 v50Var2 = (v50) n(5);
        if (v50Var == null || v50Var2 != null) {
            v50Var = v50Var2;
        }
        if (v50Var != null) {
            q(5, 1, v50Var);
        }
        Long lH3 = jf0.h((Long) f60Var.n(6), (Long) n(6));
        if (lH3 != null) {
            q(6, 1, lH3);
        }
        Long lH4 = jf0.h((Long) f60Var.n(7), (Long) n(7));
        if (lH4 != null) {
            q(7, 1, lH4);
        }
        return this;
    }
}
