package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class oq0 extends jf0 {
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
        oq0 oq0Var = (oq0) jf0Var;
        List listI = jf0.i((List) oq0Var.n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        Long lH = jf0.h((Long) oq0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        Map mapL = jf0.l((Map) oq0Var.n(2), (Map) n(2));
        if (mapL != null) {
            q(2, 1, mapL);
        }
        return this;
    }
}
