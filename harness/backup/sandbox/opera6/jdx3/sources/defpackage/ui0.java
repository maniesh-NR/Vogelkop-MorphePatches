package defpackage;

/* loaded from: classes.dex */
public final class ui0 extends jf0 {
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
        ui0 ui0Var = (ui0) jf0Var;
        bc0 bc0Var = (bc0) ui0Var.n(0);
        bc0 bc0Var2 = (bc0) n(0);
        if (bc0Var == null || bc0Var2 != null) {
            bc0Var = bc0Var2;
        }
        if (bc0Var != null) {
            q(0, 1, bc0Var);
        }
        vb0 vb0Var = (vb0) ui0Var.n(1);
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
