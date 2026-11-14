package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class u56 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, new df0(-1, 0L, jf0.c(0L)), new df0(-1, 0L, jf0.c(0L)), df0Var, df0Var, new df0(-1, 0L, jf0.c(0L)), df0Var, df0Var, df0Var, df0Var};
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
        u56 u56Var = (u56) jf0Var;
        String str = (String) u56Var.n(0);
        String str2 = (String) n(0);
        if (str == null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        ek0 ek0Var = (ek0) jf0.f((ek0) u56Var.n(1), (ek0) n(1));
        if (ek0Var != null) {
            q(1, 1, ek0Var);
        }
        Long l = (Long) u56Var.n(2);
        Long l2 = (Long) n(2);
        if (l == null) {
            l = l2;
        }
        if (l != null) {
            q(2, -1, l);
        }
        Long l3 = (Long) u56Var.n(3);
        Long l4 = (Long) n(3);
        if (l4 != null) {
            l3 = l4;
        }
        if (l3 != null) {
            q(3, -1, l3);
        }
        Long l5 = (Long) u56Var.n(4);
        Long l6 = (Long) n(4);
        if (l5 == null || l6 != null) {
            l5 = l6;
        }
        if (l5 != null) {
            q(4, 1, l5);
        }
        Long l7 = (Long) u56Var.n(5);
        Long l8 = (Long) n(5);
        if (l7 == null || l8 != null) {
            l7 = l8;
        }
        if (l7 != null) {
            q(5, 1, l7);
        }
        Long l9 = (Long) u56Var.n(6);
        Long l10 = (Long) n(6);
        if (l9 == null || l10 != null) {
            l9 = l10;
        }
        if (l9 != null) {
            q(6, -1, l9);
        }
        Long l11 = (Long) u56Var.n(7);
        if (l11 != null) {
            q(7, 1, l11);
        }
        String str3 = (String) u56Var.n(8);
        String str4 = (String) n(8);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(8, 1, str3);
        }
        qf0 qf0Var = (qf0) jf0.f((qf0) u56Var.n(9), (qf0) n(9));
        if (qf0Var != null) {
            q(9, 1, qf0Var);
        }
        Map mapL = jf0.l((Map) u56Var.n(10), (Map) n(10));
        if (mapL != null) {
            q(10, 1, mapL);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 0) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 8) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
