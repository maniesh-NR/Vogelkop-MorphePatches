package defpackage;

/* loaded from: classes.dex */
public final class si0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        si0 si0Var = (si0) jf0Var;
        u50 u50Var = (u50) si0Var.n(0);
        u50 u50Var2 = (u50) n(0);
        if (u50Var == null || u50Var2 != null) {
            u50Var = u50Var2;
        }
        if (u50Var != null) {
            q(0, 1, u50Var);
        }
        v50 v50Var = (v50) si0Var.n(1);
        v50 v50Var2 = (v50) n(1);
        if (v50Var == null || v50Var2 != null) {
            v50Var = v50Var2;
        }
        if (v50Var != null) {
            q(1, 1, v50Var);
        }
        String str = (String) si0Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        String str3 = (String) si0Var.n(3);
        String str4 = (String) n(3);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(3, 1, str3);
        }
        String str5 = (String) si0Var.n(4);
        String str6 = (String) n(4);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(4, 1, str5);
        }
        String str7 = (String) si0Var.n(5);
        String str8 = (String) n(5);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(5, 1, str7);
        }
        String str9 = (String) si0Var.n(6);
        String str10 = (String) n(6);
        if (str9 == null || str10 != null) {
            str9 = str10;
        }
        if (str9 != null) {
            q(6, 1, str9);
        }
        String str11 = (String) si0Var.n(7);
        String str12 = (String) n(7);
        if (str11 == null || str12 != null) {
            str11 = str12;
        }
        if (str11 != null) {
            q(7, 1, str11);
        }
        String str13 = (String) si0Var.n(8);
        String str14 = (String) n(8);
        if (str13 == null || str14 != null) {
            str13 = str14;
        }
        if (str13 != null) {
            q(8, 1, str13);
        }
        String str15 = (String) si0Var.n(9);
        String str16 = (String) n(9);
        if (str15 == null || str16 != null) {
            str15 = str16;
        }
        if (str15 != null) {
            q(9, 1, str15);
        }
        return this;
    }

    public final void x(int i, String str) {
        switch (i) {
            case 2:
                q(i, str != null ? 1 : 0, str);
                break;
            case 3:
                q(i, str != null ? 1 : 0, str);
                break;
            case 4:
                q(i, str != null ? 1 : 0, str);
                break;
            case 5:
                q(i, str != null ? 1 : 0, str);
                break;
            case 6:
                q(i, str != null ? 1 : 0, str);
                break;
            case 7:
                q(i, str != null ? 1 : 0, str);
                break;
            case 8:
                q(i, str != null ? 1 : 0, str);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                q(i, str != null ? 1 : 0, str);
                break;
            default:
                q(i, 1, str);
                break;
        }
    }
}
