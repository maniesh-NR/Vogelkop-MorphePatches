package defpackage;

/* loaded from: classes.dex */
public final class fe0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        fe0 fe0Var = (fe0) jf0Var;
        tc0 tc0Var = (tc0) fe0Var.n(0);
        tc0 tc0Var2 = (tc0) n(0);
        if (tc0Var == null || tc0Var2 != null) {
            tc0Var = tc0Var2;
        }
        if (tc0Var != null) {
            q(0, 1, tc0Var);
        }
        String str = (String) fe0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        Long lH = jf0.h((Long) fe0Var.n(2), (Long) n(2));
        if (lH != null) {
            q(2, 1, lH);
        }
        Long lH2 = jf0.h((Long) fe0Var.n(3), (Long) n(3));
        if (lH2 != null) {
            q(3, 1, lH2);
        }
        Long lH3 = jf0.h((Long) fe0Var.n(4), (Long) n(4));
        if (lH3 != null) {
            q(4, 1, lH3);
        }
        Long lH4 = jf0.h((Long) fe0Var.n(5), (Long) n(5));
        if (lH4 != null) {
            q(5, 1, lH4);
        }
        Long lH5 = jf0.h((Long) fe0Var.n(6), (Long) n(6));
        if (lH5 != null) {
            q(6, 1, lH5);
        }
        String str3 = (String) fe0Var.n(7);
        String str4 = (String) n(7);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(7, 1, str3);
        }
        String str5 = (String) fe0Var.n(8);
        String str6 = (String) n(8);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(8, 1, str5);
        }
        Long lH6 = jf0.h((Long) fe0Var.n(9), (Long) n(9));
        if (lH6 != null) {
            q(9, 1, lH6);
        }
        nc0 nc0Var = (nc0) fe0Var.n(10);
        nc0 nc0Var2 = (nc0) n(10);
        if (nc0Var == null || nc0Var2 != null) {
            nc0Var = nc0Var2;
        }
        if (nc0Var != null) {
            q(10, 1, nc0Var);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 1) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 7) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 8) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
