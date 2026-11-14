package defpackage;

/* loaded from: classes.dex */
public final class os0 extends jf0 {
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
        os0 os0Var = (os0) jf0Var;
        ps0 ps0Var = (ps0) os0Var.n(0);
        ps0 ps0Var2 = (ps0) n(0);
        if (ps0Var == null || ps0Var2 != null) {
            ps0Var = ps0Var2;
        }
        if (ps0Var != null) {
            q(0, 1, ps0Var);
        }
        String str = (String) os0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        String str3 = (String) os0Var.n(2);
        String str4 = (String) n(2);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(2, 1, str3);
        }
        return this;
    }
}
