package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class s60 extends jf0 {
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
        s60 s60Var = (s60) jf0Var;
        Long lH = jf0.h((Long) s60Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Map mapL = jf0.l((Map) s60Var.n(1), (Map) n(1));
        if (mapL != null) {
            q(1, 1, mapL);
        }
        return this;
    }
}
