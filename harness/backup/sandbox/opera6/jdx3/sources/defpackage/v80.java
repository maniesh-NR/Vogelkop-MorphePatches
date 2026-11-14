package defpackage;

/* loaded from: classes.dex */
public final class v80 extends jf0 {
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
        v80 v80Var = (v80) jf0Var;
        vb0 vb0Var = (vb0) v80Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        w80 w80Var = (w80) v80Var.n(1);
        w80 w80Var2 = (w80) n(1);
        if (w80Var == null || w80Var2 != null) {
            w80Var = w80Var2;
        }
        if (w80Var != null) {
            q(1, 1, w80Var);
        }
        x80 x80Var = (x80) v80Var.n(2);
        x80 x80Var2 = (x80) n(2);
        if (x80Var == null || x80Var2 != null) {
            x80Var = x80Var2;
        }
        if (x80Var != null) {
            q(2, 1, x80Var);
        }
        Boolean bool = (Boolean) v80Var.n(3);
        Boolean bool2 = (Boolean) n(3);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(3, 1, bool);
        }
        return this;
    }
}
