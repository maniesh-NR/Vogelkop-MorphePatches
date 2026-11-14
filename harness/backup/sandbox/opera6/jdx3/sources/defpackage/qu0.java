package defpackage;

/* loaded from: classes.dex */
public final class qu0 extends jf0 {
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
        qu0 qu0Var = (qu0) jf0Var;
        uu0 uu0Var = (uu0) qu0Var.n(0);
        uu0 uu0Var2 = (uu0) n(0);
        if (uu0Var == null || uu0Var2 != null) {
            uu0Var = uu0Var2;
        }
        if (uu0Var != null) {
            q(0, 1, uu0Var);
        }
        String str = (String) qu0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        String str3 = (String) qu0Var.n(2);
        String str4 = (String) n(2);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(2, 1, str3);
        }
        pu0 pu0Var = (pu0) qu0Var.n(3);
        pu0 pu0Var2 = (pu0) n(3);
        if (pu0Var == null || pu0Var2 != null) {
            pu0Var = pu0Var2;
        }
        if (pu0Var != null) {
            q(3, 1, pu0Var);
        }
        return this;
    }

    public final void x(qu0 qu0Var) {
        if (n(0) != null) {
            qu0Var.q(0, 1, (uu0) n(0));
        }
        if (n(1) != null) {
            qu0Var.q(1, 1, (String) n(1));
        }
        if (n(2) != null) {
            qu0Var.q(2, 1, (String) n(2));
        }
        if (n(3) != null) {
            qu0Var.q(3, 1, (pu0) n(3));
        }
    }
}
