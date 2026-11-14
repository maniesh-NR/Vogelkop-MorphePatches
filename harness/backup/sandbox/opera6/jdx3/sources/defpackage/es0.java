package defpackage;

/* loaded from: classes.dex */
public final class es0 extends jf0 {
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
        es0 es0Var = (es0) jf0Var;
        vb0 vb0Var = (vb0) es0Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        Boolean bool = (Boolean) es0Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        Boolean bool3 = (Boolean) es0Var.n(2);
        Boolean bool4 = (Boolean) n(2);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(2, 1, bool3);
        }
        Boolean bool5 = (Boolean) es0Var.n(3);
        Boolean bool6 = (Boolean) n(3);
        if (bool5 == null || bool6 != null) {
            bool5 = bool6;
        }
        if (bool5 != null) {
            q(3, 1, bool5);
        }
        fs0 fs0Var = (fs0) es0Var.n(4);
        fs0 fs0Var2 = (fs0) n(4);
        if (fs0Var == null || fs0Var2 != null) {
            fs0Var = fs0Var2;
        }
        if (fs0Var != null) {
            q(4, 1, fs0Var);
        }
        return this;
    }
}
