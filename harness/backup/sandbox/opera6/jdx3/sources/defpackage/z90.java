package defpackage;

/* loaded from: classes.dex */
public final class z90 extends jf0 {
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
        z90 z90Var = (z90) jf0Var;
        vb0 vb0Var = (vb0) z90Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        aa0 aa0Var = (aa0) z90Var.n(1);
        aa0 aa0Var2 = (aa0) n(1);
        if (aa0Var == null || aa0Var2 != null) {
            aa0Var = aa0Var2;
        }
        if (aa0Var != null) {
            q(1, 1, aa0Var);
        }
        String str = (String) z90Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        return this;
    }
}
