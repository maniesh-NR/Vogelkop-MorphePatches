package defpackage;

/* loaded from: classes.dex */
public final class j80 extends jf0 {
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
        j80 j80Var = (j80) jf0Var;
        q50 q50Var = (q50) j80Var.n(0);
        q50 q50Var2 = (q50) n(0);
        if (q50Var == null || q50Var2 != null) {
            q50Var = q50Var2;
        }
        if (q50Var != null) {
            q(0, 1, q50Var);
        }
        String str = (String) j80Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        return this;
    }
}
