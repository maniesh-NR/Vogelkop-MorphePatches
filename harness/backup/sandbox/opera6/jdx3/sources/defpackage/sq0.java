package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class sq0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var};
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
        sq0 sq0Var = (sq0) jf0Var;
        Long lH = jf0.h((Long) sq0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        hr0 hr0Var = (hr0) sq0Var.n(1);
        hr0 hr0Var2 = (hr0) n(1);
        if (hr0Var == null || hr0Var2 != null) {
            hr0Var = hr0Var2;
        }
        if (hr0Var != null) {
            q(1, 1, hr0Var);
        }
        String str = (String) sq0Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        Map mapL = jf0.l((Map) sq0Var.n(3), (Map) n(3));
        if (mapL != null) {
            q(3, 1, mapL);
        }
        return this;
    }
}
