package defpackage;

/* loaded from: classes.dex */
public final class f70 extends jf0 {
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
        f70 f70Var = (f70) jf0Var;
        String str = (String) f70Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        h70 h70Var = (h70) f70Var.n(1);
        h70 h70Var2 = (h70) n(1);
        if (h70Var == null || h70Var2 != null) {
            h70Var = h70Var2;
        }
        if (h70Var != null) {
            q(1, 1, h70Var);
        }
        return this;
    }
}
