package defpackage;

/* loaded from: classes.dex */
public final class np0 extends jf0 {
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
        np0 np0Var = (np0) jf0Var;
        String str = (String) np0Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        String str3 = (String) np0Var.n(1);
        String str4 = (String) n(1);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(1, 1, str3);
        }
        pu0 pu0Var = (pu0) np0Var.n(2);
        pu0 pu0Var2 = (pu0) n(2);
        if (pu0Var == null || pu0Var2 != null) {
            pu0Var = pu0Var2;
        }
        if (pu0Var != null) {
            q(2, 1, pu0Var);
        }
        iu0 iu0Var = (iu0) np0Var.n(3);
        iu0 iu0Var2 = (iu0) n(3);
        if (iu0Var == null || iu0Var2 != null) {
            iu0Var = iu0Var2;
        }
        if (iu0Var != null) {
            q(3, 1, iu0Var);
        }
        return this;
    }
}
