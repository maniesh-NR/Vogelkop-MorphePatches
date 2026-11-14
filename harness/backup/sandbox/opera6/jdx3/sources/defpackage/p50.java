package defpackage;

/* loaded from: classes.dex */
public final class p50 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        p50 p50Var = (p50) jf0Var;
        o50 o50Var = (o50) p50Var.n(0);
        o50 o50Var2 = (o50) n(0);
        if (o50Var == null || o50Var2 != null) {
            o50Var = o50Var2;
        }
        if (o50Var != null) {
            q(0, 1, o50Var);
        }
        u50 u50Var = (u50) p50Var.n(1);
        u50 u50Var2 = (u50) n(1);
        if (u50Var == null || u50Var2 != null) {
            u50Var = u50Var2;
        }
        if (u50Var != null) {
            q(1, 1, u50Var);
        }
        String str = (String) p50Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        String str3 = (String) p50Var.n(3);
        String str4 = (String) n(3);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(3, 1, str3);
        }
        String str5 = (String) p50Var.n(4);
        String str6 = (String) n(4);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(4, 1, str5);
        }
        String str7 = (String) p50Var.n(5);
        String str8 = (String) n(5);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(5, 1, str7);
        }
        String str9 = (String) p50Var.n(6);
        String str10 = (String) n(6);
        if (str9 == null || str10 != null) {
            str9 = str10;
        }
        if (str9 != null) {
            q(6, 1, str9);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 2) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 3) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 4) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 5) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 6) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
