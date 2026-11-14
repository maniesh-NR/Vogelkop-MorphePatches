package defpackage;

/* loaded from: classes.dex */
public final class q70 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        q70 q70Var = (q70) jf0Var;
        p70 p70Var = (p70) q70Var.n(0);
        p70 p70Var2 = (p70) n(0);
        if (p70Var == null || p70Var2 != null) {
            p70Var = p70Var2;
        }
        if (p70Var != null) {
            q(0, 1, p70Var);
        }
        String str = (String) q70Var.n(1);
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
