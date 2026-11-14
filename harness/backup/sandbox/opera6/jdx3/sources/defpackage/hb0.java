package defpackage;

/* loaded from: classes.dex */
public final class hb0 extends jf0 {
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
        hb0 hb0Var = (hb0) jf0Var;
        ib0 ib0Var = (ib0) hb0Var.n(0);
        ib0 ib0Var2 = (ib0) n(0);
        if (ib0Var == null || ib0Var2 != null) {
            ib0Var = ib0Var2;
        }
        if (ib0Var != null) {
            q(0, 1, ib0Var);
        }
        String str = (String) hb0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        Boolean bool = (Boolean) hb0Var.n(2);
        Boolean bool2 = (Boolean) n(2);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(2, 1, bool);
        }
        gb0 gb0Var = (gb0) jf0.f((gb0) hb0Var.n(3), (gb0) n(3));
        if (gb0Var != null) {
            q(3, 1, gb0Var);
        }
        return this;
    }
}
