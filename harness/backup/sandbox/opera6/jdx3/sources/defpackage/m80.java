package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class m80 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        m80 m80Var = (m80) jf0Var;
        Long lH = jf0.h((Long) m80Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Long lH2 = jf0.h((Long) m80Var.n(1), (Long) n(1));
        if (lH2 != null) {
            q(1, 1, lH2);
        }
        Long lH3 = jf0.h((Long) m80Var.n(2), (Long) n(2));
        if (lH3 != null) {
            q(2, 1, lH3);
        }
        Long lH4 = jf0.h((Long) m80Var.n(3), (Long) n(3));
        if (lH4 != null) {
            q(3, 1, lH4);
        }
        Map mapL = jf0.l((Map) m80Var.n(4), (Map) n(4));
        if (mapL != null) {
            q(4, 1, mapL);
        }
        Long lH5 = jf0.h((Long) m80Var.n(5), (Long) n(5));
        if (lH5 != null) {
            q(5, 1, lH5);
        }
        Long lH6 = jf0.h((Long) m80Var.n(6), (Long) n(6));
        if (lH6 != null) {
            q(6, 1, lH6);
        }
        return this;
    }
}
