package defpackage;

/* loaded from: classes.dex */
public final class rn0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        rn0 rn0Var = (rn0) jf0Var;
        String str = (String) rn0Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        Boolean bool = (Boolean) rn0Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        String str3 = (String) rn0Var.n(2);
        String str4 = (String) n(2);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(2, 1, str3);
        }
        String str5 = (String) rn0Var.n(3);
        String str6 = (String) n(3);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(3, 1, str5);
        }
        String str7 = (String) rn0Var.n(4);
        String str8 = (String) n(4);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(4, 1, str7);
        }
        String str9 = (String) rn0Var.n(5);
        String str10 = (String) n(5);
        if (str9 == null || str10 != null) {
            str9 = str10;
        }
        if (str9 != null) {
            q(5, 1, str9);
        }
        String str11 = (String) rn0Var.n(6);
        String str12 = (String) n(6);
        if (str11 == null || str12 != null) {
            str11 = str12;
        }
        if (str11 != null) {
            q(6, 1, str11);
        }
        ln0 ln0Var = (ln0) rn0Var.n(7);
        ln0 ln0Var2 = (ln0) n(7);
        if (ln0Var == null || ln0Var2 != null) {
            ln0Var = ln0Var2;
        }
        if (ln0Var != null) {
            q(7, 1, ln0Var);
        }
        Boolean bool3 = (Boolean) rn0Var.n(8);
        Boolean bool4 = (Boolean) n(8);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(8, 1, bool3);
        }
        String str13 = (String) rn0Var.n(9);
        String str14 = (String) n(9);
        if (str13 == null || str14 != null) {
            str13 = str14;
        }
        if (str13 != null) {
            q(9, 1, str13);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 0) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 9) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
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
