package defpackage;

/* loaded from: classes.dex */
public final class su0 extends jf0 {
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
        su0 su0Var = (su0) jf0Var;
        ru0 ru0Var = (ru0) su0Var.n(0);
        ru0 ru0Var2 = (ru0) n(0);
        if (ru0Var == null || ru0Var2 != null) {
            ru0Var = ru0Var2;
        }
        if (ru0Var != null) {
            q(0, 1, ru0Var);
        }
        String str = (String) su0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        tu0 tu0Var = (tu0) su0Var.n(2);
        tu0 tu0Var2 = (tu0) n(2);
        if (tu0Var == null || tu0Var2 != null) {
            tu0Var = tu0Var2;
        }
        if (tu0Var != null) {
            q(2, 1, tu0Var);
        }
        String str3 = (String) su0Var.n(3);
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
