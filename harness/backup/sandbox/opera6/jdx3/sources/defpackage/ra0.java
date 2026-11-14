package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ra0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        ra0 ra0Var = (ra0) jf0Var;
        Boolean bool = (Boolean) ra0Var.n(0);
        Boolean bool2 = (Boolean) n(0);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(0, -1, bool);
        }
        o70 o70Var = (o70) jf0.f((o70) ra0Var.n(1), (o70) n(1));
        if (o70Var != null) {
            q(1, 1, o70Var);
        }
        i90 i90Var = (i90) jf0.f((i90) ra0Var.n(2), (i90) n(2));
        if (i90Var != null) {
            q(2, 1, i90Var);
        }
        Map mapJ = jf0.j((Map) ra0Var.n(3), (Map) n(3));
        if (mapJ != null) {
            q(3, 1, mapJ);
        }
        String str = (String) ra0Var.n(4);
        String str2 = (String) n(4);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(4, 1, str);
        }
        String str3 = (String) ra0Var.n(5);
        String str4 = (String) n(5);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(5, 1, str3);
        }
        gh0 gh0Var = (gh0) jf0.f((gh0) ra0Var.n(6), (gh0) n(6));
        if (gh0Var != null) {
            q(6, 1, gh0Var);
        }
        ca0 ca0Var = (ca0) ra0Var.n(7);
        ca0 ca0Var2 = (ca0) n(7);
        if (ca0Var == null || ca0Var2 != null) {
            ca0Var = ca0Var2;
        }
        if (ca0Var != null) {
            q(7, 1, ca0Var);
        }
        String str5 = (String) ra0Var.n(8);
        String str6 = (String) n(8);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(8, 1, str5);
        }
        String str7 = (String) ra0Var.n(9);
        String str8 = (String) n(9);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(9, 1, str7);
        }
        String str9 = (String) ra0Var.n(10);
        String str10 = (String) n(10);
        if (str9 == null || str10 != null) {
            str9 = str10;
        }
        if (str9 != null) {
            q(10, 1, str9);
        }
        po0 po0Var = (po0) jf0.f((po0) ra0Var.n(11), (po0) n(11));
        if (po0Var != null) {
            q(11, 1, po0Var);
        }
        gp0 gp0Var = (gp0) jf0.f((gp0) ra0Var.n(12), (gp0) n(12));
        if (gp0Var != null) {
            q(12, 1, gp0Var);
        }
        String str11 = (String) ra0Var.n(13);
        String str12 = (String) n(13);
        if (str11 == null || str12 != null) {
            str11 = str12;
        }
        if (str11 != null) {
            q(13, 1, str11);
        }
        qb0 qb0Var = (qb0) jf0.f((qb0) ra0Var.n(14), (qb0) n(14));
        if (qb0Var != null) {
            q(14, 1, qb0Var);
        }
        return this;
    }

    public final qb0 x(zpa zpaVar) {
        qb0 qb0Var = (qb0) n(14);
        if (qb0Var != null) {
            return qb0Var;
        }
        zpaVar.getClass();
        q(14, 1, new qb0(2443, 1, 7));
        return (qb0) n(14);
    }

    public final void y(int i, String str) {
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
