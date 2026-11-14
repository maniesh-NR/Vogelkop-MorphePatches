package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class vu0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var};
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
        vu0 vu0Var = (vu0) jf0Var;
        Long lH = jf0.h((Long) vu0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Long lH2 = jf0.h((Long) vu0Var.n(1), (Long) n(1));
        if (lH2 != null) {
            q(1, 1, lH2);
        }
        Map mapL = jf0.l((Map) vu0Var.n(2), (Map) n(2));
        if (mapL != null) {
            q(2, 1, mapL);
        }
        return this;
    }
}
