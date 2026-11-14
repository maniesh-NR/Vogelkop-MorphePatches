package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class iq0 extends jf0 {
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
        iq0 iq0Var = (iq0) jf0Var;
        Map mapL = jf0.l((Map) iq0Var.n(0), (Map) n(0));
        if (mapL != null) {
            q(0, 1, mapL);
        }
        Map mapL2 = jf0.l((Map) iq0Var.n(1), (Map) n(1));
        if (mapL2 != null) {
            q(1, 1, mapL2);
        }
        List listI = jf0.i((List) iq0Var.n(2), (List) n(2));
        if (listI != null) {
            q(2, 1, listI);
        }
        return this;
    }
}
