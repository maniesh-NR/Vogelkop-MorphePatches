package defpackage;

/* loaded from: classes.dex */
public final class ds0 extends jf0 {
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
        ds0 ds0Var = (ds0) jf0Var;
        vd0 vd0Var = (vd0) ds0Var.n(0);
        vd0 vd0Var2 = (vd0) n(0);
        if (vd0Var == null || vd0Var2 != null) {
            vd0Var = vd0Var2;
        }
        if (vd0Var != null) {
            q(0, 1, vd0Var);
        }
        op0 op0Var = (op0) ds0Var.n(1);
        op0 op0Var2 = (op0) n(1);
        if (op0Var == null || op0Var2 != null) {
            op0Var = op0Var2;
        }
        if (op0Var != null) {
            q(1, 1, op0Var);
        }
        return this;
    }
}
