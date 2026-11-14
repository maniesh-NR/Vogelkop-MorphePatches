package defpackage;

/* loaded from: classes.dex */
public final class ft0 extends jf0 {
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
        ft0 ft0Var = (ft0) jf0Var;
        gt0 gt0Var = (gt0) ft0Var.n(0);
        gt0 gt0Var2 = (gt0) n(0);
        if (gt0Var == null || gt0Var2 != null) {
            gt0Var = gt0Var2;
        }
        if (gt0Var != null) {
            q(0, 1, gt0Var);
        }
        Boolean bool = (Boolean) ft0Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        Boolean bool3 = (Boolean) ft0Var.n(2);
        Boolean bool4 = (Boolean) n(2);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(2, 1, bool3);
        }
        return this;
    }
}
