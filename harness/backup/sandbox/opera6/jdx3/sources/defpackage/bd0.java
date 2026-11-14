package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bd0 extends jf0 {
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
        bd0 bd0Var = (bd0) jf0Var;
        dd0 dd0Var = (dd0) bd0Var.n(0);
        dd0 dd0Var2 = (dd0) n(0);
        if (dd0Var == null || dd0Var2 != null) {
            dd0Var = dd0Var2;
        }
        if (dd0Var != null) {
            q(0, 1, dd0Var);
        }
        String str = (String) bd0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        String str3 = (String) bd0Var.n(2);
        String str4 = (String) n(2);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(2, 1, str3);
        }
        List listI = jf0.i((List) bd0Var.n(3), (List) n(3));
        if (listI != null) {
            q(3, 1, listI);
        }
        km0 km0Var = (km0) bd0Var.n(4);
        km0 km0Var2 = (km0) n(4);
        if (km0Var == null || km0Var2 != null) {
            km0Var = km0Var2;
        }
        if (km0Var != null) {
            q(4, 1, km0Var);
        }
        Boolean bool = (Boolean) bd0Var.n(5);
        Boolean bool2 = (Boolean) n(5);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(5, 1, bool);
        }
        xc0 xc0Var = (xc0) bd0Var.n(6);
        xc0 xc0Var2 = (xc0) n(6);
        if (xc0Var == null || xc0Var2 != null) {
            xc0Var = xc0Var2;
        }
        if (xc0Var != null) {
            q(6, 1, xc0Var);
        }
        String str5 = (String) bd0Var.n(7);
        String str6 = (String) n(7);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(7, 1, str5);
        }
        Long lH = jf0.h((Long) bd0Var.n(8), (Long) n(8));
        if (lH != null) {
            q(8, 1, lH);
        }
        Long lH2 = jf0.h((Long) bd0Var.n(9), (Long) n(9));
        if (lH2 != null) {
            q(9, 1, lH2);
        }
        return this;
    }
}
