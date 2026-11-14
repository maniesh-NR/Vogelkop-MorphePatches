package defpackage;

/* loaded from: classes.dex */
public final class v70 extends jf0 {
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
        v70 v70Var = (v70) jf0Var;
        x70 x70Var = (x70) v70Var.n(0);
        x70 x70Var2 = (x70) n(0);
        if (x70Var == null || x70Var2 != null) {
            x70Var = x70Var2;
        }
        if (x70Var != null) {
            q(0, 1, x70Var);
        }
        x70 x70Var3 = (x70) v70Var.n(1);
        x70 x70Var4 = (x70) n(1);
        if (x70Var3 == null || x70Var4 != null) {
            x70Var3 = x70Var4;
        }
        if (x70Var3 != null) {
            q(1, 1, x70Var3);
        }
        return this;
    }
}
