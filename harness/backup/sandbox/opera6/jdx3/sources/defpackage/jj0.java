package defpackage;

/* loaded from: classes.dex */
public final class jj0 extends jf0 {
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
        jj0 jj0Var = (jj0) jf0Var;
        vb0 vb0Var = (vb0) jj0Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        ij0 ij0Var = (ij0) jj0Var.n(1);
        ij0 ij0Var2 = (ij0) n(1);
        if (ij0Var == null || ij0Var2 != null) {
            ij0Var = ij0Var2;
        }
        if (ij0Var != null) {
            q(1, 1, ij0Var);
        }
        String str = (String) jj0Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        String str3 = (String) jj0Var.n(3);
        String str4 = (String) n(3);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(3, 1, str3);
        }
        return this;
    }
}
