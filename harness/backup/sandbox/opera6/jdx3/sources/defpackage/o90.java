package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class o90 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var};
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
        o90 o90Var = (o90) jf0Var;
        n90 n90Var = (n90) o90Var.n(0);
        n90 n90Var2 = (n90) n(0);
        if (n90Var == null || n90Var2 != null) {
            n90Var = n90Var2;
        }
        if (n90Var != null) {
            q(0, 1, n90Var);
        }
        String str = (String) o90Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        Long lH = jf0.h((Long) o90Var.n(2), (Long) n(2));
        if (lH != null) {
            q(2, 1, lH);
        }
        Long lH2 = jf0.h((Long) o90Var.n(3), (Long) n(3));
        if (lH2 != null) {
            q(3, 1, lH2);
        }
        Map mapL = jf0.l((Map) o90Var.n(4), (Map) n(4));
        if (mapL != null) {
            q(4, 1, mapL);
        }
        return this;
    }
}
