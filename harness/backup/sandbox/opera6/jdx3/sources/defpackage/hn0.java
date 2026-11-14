package defpackage;

/* loaded from: classes.dex */
public final class hn0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        hn0 hn0Var = (hn0) jf0Var;
        String str = (String) hn0Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        String str3 = (String) hn0Var.n(1);
        String str4 = (String) n(1);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(1, 1, str3);
        }
        String str5 = (String) hn0Var.n(2);
        String str6 = (String) n(2);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(2, 1, str5);
        }
        String str7 = (String) hn0Var.n(3);
        String str8 = (String) n(3);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(3, 1, str7);
        }
        Long l = (Long) hn0Var.n(4);
        Long l2 = (Long) n(4);
        if (l == null || l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(4, 1, l);
        }
        String str9 = (String) hn0Var.n(5);
        String str10 = (String) n(5);
        if (str9 == null || str10 != null) {
            str9 = str10;
        }
        if (str9 != null) {
            q(5, 1, str9);
        }
        Boolean bool = (Boolean) hn0Var.n(6);
        Boolean bool2 = (Boolean) n(6);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(6, 1, bool);
        }
        Long l3 = (Long) hn0Var.n(7);
        Long l4 = (Long) n(7);
        if (l3 == null || l4 != null) {
            l3 = l4;
        }
        if (l3 != null) {
            q(7, 1, l3);
        }
        String str11 = (String) hn0Var.n(8);
        String str12 = (String) n(8);
        if (str11 == null || str12 != null) {
            str11 = str12;
        }
        if (str11 != null) {
            q(8, 1, str11);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 0) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 1) {
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
        if (i == 5) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 8) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
