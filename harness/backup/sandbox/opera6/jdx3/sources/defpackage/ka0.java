package defpackage;

/* loaded from: classes.dex */
public final class ka0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        ka0 ka0Var = (ka0) jf0Var;
        ja0 ja0Var = (ja0) ka0Var.n(0);
        ja0 ja0Var2 = (ja0) n(0);
        if (ja0Var == null || ja0Var2 != null) {
            ja0Var = ja0Var2;
        }
        if (ja0Var != null) {
            q(0, 1, ja0Var);
        }
        Boolean bool = (Boolean) ka0Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        Boolean bool3 = (Boolean) ka0Var.n(2);
        Boolean bool4 = (Boolean) n(2);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(2, 1, bool3);
        }
        Boolean bool5 = (Boolean) ka0Var.n(3);
        Boolean bool6 = (Boolean) n(3);
        if (bool5 == null || bool6 != null) {
            bool5 = bool6;
        }
        if (bool5 != null) {
            q(3, 1, bool5);
        }
        Boolean bool7 = (Boolean) ka0Var.n(4);
        Boolean bool8 = (Boolean) n(4);
        if (bool7 == null || bool8 != null) {
            bool7 = bool8;
        }
        if (bool7 != null) {
            q(4, 1, bool7);
        }
        ma0 ma0Var = (ma0) ka0Var.n(5);
        ma0 ma0Var2 = (ma0) n(5);
        if (ma0Var == null || ma0Var2 != null) {
            ma0Var = ma0Var2;
        }
        if (ma0Var != null) {
            q(5, 1, ma0Var);
        }
        Long lH = jf0.h((Long) ka0Var.n(6), (Long) n(6));
        if (lH != null) {
            q(6, 1, lH);
        }
        return this;
    }
}
