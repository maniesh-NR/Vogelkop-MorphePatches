package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class m60 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        m60 m60Var = (m60) jf0Var;
        Map mapL = jf0.l((Map) m60Var.n(0), (Map) n(0));
        if (mapL != null) {
            q(0, 1, mapL);
        }
        Long lH = jf0.h((Long) m60Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        Long lH2 = jf0.h((Long) m60Var.n(2), (Long) n(2));
        if (lH2 != null) {
            q(2, 1, lH2);
        }
        return this;
    }
}
