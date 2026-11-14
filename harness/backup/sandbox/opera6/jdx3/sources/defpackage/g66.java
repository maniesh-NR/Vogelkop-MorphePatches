package defpackage;

/* loaded from: classes.dex */
public final class g66 extends jf0 {
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
        g66 g66Var = (g66) jf0Var;
        Long l = (Long) g66Var.n(0);
        Long l2 = (Long) n(0);
        if (l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(0, 1, l);
        }
        vb0 vb0Var = (vb0) g66Var.n(1);
        vb0 vb0Var2 = (vb0) n(1);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(1, 1, vb0Var);
        }
        return this;
    }
}
