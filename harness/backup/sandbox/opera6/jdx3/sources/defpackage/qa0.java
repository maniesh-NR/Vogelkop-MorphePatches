package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class qa0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        Boolean bool = Boolean.TRUE;
        df0 df0Var = new df0(-1, bool, jf0.c(bool));
        df0 df0Var2 = df0.d;
        g = new df0[]{df0Var, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2, df0Var2};
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
        qa0 qa0Var = (qa0) jf0Var;
        Boolean bool = (Boolean) qa0Var.n(0);
        Boolean bool2 = (Boolean) n(0);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(0, -1, bool);
        }
        n70 n70Var = (n70) jf0.f((n70) qa0Var.n(1), (n70) n(1));
        if (n70Var != null) {
            q(1, 1, n70Var);
        }
        h90 h90Var = (h90) jf0.f((h90) qa0Var.n(2), (h90) n(2));
        if (h90Var != null) {
            q(2, 1, h90Var);
        }
        Map mapJ = jf0.j((Map) qa0Var.n(3), (Map) n(3));
        if (mapJ != null) {
            q(3, 1, mapJ);
        }
        String str = (String) qa0Var.n(4);
        String str2 = (String) n(4);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(4, 1, str);
        }
        String str3 = (String) qa0Var.n(5);
        String str4 = (String) n(5);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(5, 1, str3);
        }
        fh0 fh0Var = (fh0) jf0.f((fh0) qa0Var.n(6), (fh0) n(6));
        if (fh0Var != null) {
            q(6, 1, fh0Var);
        }
        ba0 ba0Var = (ba0) qa0Var.n(7);
        ba0 ba0Var2 = (ba0) n(7);
        if (ba0Var == null || ba0Var2 != null) {
            ba0Var = ba0Var2;
        }
        if (ba0Var != null) {
            q(7, 1, ba0Var);
        }
        String str5 = (String) qa0Var.n(8);
        String str6 = (String) n(8);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(8, 1, str5);
        }
        String str7 = (String) qa0Var.n(9);
        String str8 = (String) n(9);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(9, 1, str7);
        }
        String str9 = (String) qa0Var.n(10);
        String str10 = (String) n(10);
        if (str9 == null || str10 != null) {
            str9 = str10;
        }
        if (str9 != null) {
            q(10, 1, str9);
        }
        oo0 oo0Var = (oo0) jf0.f((oo0) qa0Var.n(11), (oo0) n(11));
        if (oo0Var != null) {
            q(11, 1, oo0Var);
        }
        fp0 fp0Var = (fp0) jf0.f((fp0) qa0Var.n(12), (fp0) n(12));
        if (fp0Var != null) {
            q(12, 1, fp0Var);
        }
        String str11 = (String) qa0Var.n(13);
        String str12 = (String) n(13);
        if (str11 == null || str12 != null) {
            str11 = str12;
        }
        if (str11 != null) {
            q(13, 1, str11);
        }
        pb0 pb0Var = (pb0) jf0.f((pb0) qa0Var.n(14), (pb0) n(14));
        if (pb0Var != null) {
            q(14, 1, pb0Var);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 4) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 5) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 13) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        switch (i) {
            case 8:
                q(i, str != null ? 1 : 0, str);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                q(i, str != null ? 1 : 0, str);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                q(i, str != null ? 1 : 0, str);
                break;
            default:
                q(i, 1, str);
                break;
        }
    }
}
