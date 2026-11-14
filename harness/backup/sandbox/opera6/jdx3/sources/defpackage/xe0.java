package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class xe0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var};
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
        xe0 xe0Var = (xe0) jf0Var;
        Map mapK = jf0.k((Map) xe0Var.n(0), (Map) n(0));
        if (mapK != null) {
            q(0, 1, mapK);
        }
        Long lH = jf0.h((Long) xe0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        return this;
    }
}
