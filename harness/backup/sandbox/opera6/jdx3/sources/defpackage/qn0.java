package defpackage;

/* loaded from: classes.dex */
public final class qn0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        qn0 qn0Var = (qn0) jf0Var;
        sj0 sj0Var = (sj0) qn0Var.n(0);
        sj0 sj0Var2 = (sj0) n(0);
        if (sj0Var == null || sj0Var2 != null) {
            sj0Var = sj0Var2;
        }
        if (sj0Var != null) {
            q(0, 1, sj0Var);
        }
        xn0 xn0Var = (xn0) qn0Var.n(1);
        xn0 xn0Var2 = (xn0) n(1);
        if (xn0Var == null || xn0Var2 != null) {
            xn0Var = xn0Var2;
        }
        if (xn0Var != null) {
            q(1, 1, xn0Var);
        }
        String str = (String) qn0Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        String str3 = (String) qn0Var.n(3);
        String str4 = (String) n(3);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(3, 1, str3);
        }
        String str5 = (String) qn0Var.n(4);
        String str6 = (String) n(4);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(4, 1, str5);
        }
        String str7 = (String) qn0Var.n(5);
        String str8 = (String) n(5);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(5, 1, str7);
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
        } else if (i != 5) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
