package defpackage;

/* loaded from: classes.dex */
public final class ls0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0.b, ef0Var, ef0Var};
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
        ls0 ls0Var = (ls0) jf0Var;
        String str = (String) ls0Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        String str3 = (String) ls0Var.n(1);
        String str4 = (String) n(1);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(1, 1, str3);
        }
        String str5 = (String) ls0Var.n(2);
        String str6 = (String) n(2);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(2, 1, str5);
        }
        String str7 = (String) ls0Var.n(3);
        String str8 = (String) n(3);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(3, 1, str7);
        }
        String str9 = (String) ls0Var.n(4);
        String str10 = (String) n(4);
        if (str9 == null || str10 != null) {
            str9 = str10;
        }
        if (str9 != null) {
            q(4, 1, str9);
        }
        String str11 = (String) ls0Var.n(5);
        String str12 = (String) n(5);
        if (str11 == null || str12 != null) {
            str11 = str12;
        }
        if (str11 != null) {
            q(5, 1, str11);
        }
        ao0 ao0Var = (ao0) jf0.f((ao0) ls0Var.n(6), (ao0) n(6));
        if (ao0Var != null) {
            q(6, 1, ao0Var);
        }
        Long l = (Long) ls0Var.n(7);
        Long l2 = (Long) n(7);
        if (l == null || l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(7, 1, l);
        }
        Integer num = (Integer) ls0Var.n(8);
        Integer num2 = (Integer) n(8);
        if (num == null || num2 != null) {
            num = num2;
        }
        if (num != null) {
            q(8, 1, num);
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
        if (i == 4) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 5) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
