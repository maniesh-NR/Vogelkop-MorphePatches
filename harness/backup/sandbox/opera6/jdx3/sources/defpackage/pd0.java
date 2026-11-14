package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class pd0 extends jf0 {
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
        pd0 pd0Var = (pd0) jf0Var;
        List listI = jf0.i((List) pd0Var.n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        Map mapL = jf0.l((Map) pd0Var.n(1), (Map) n(1));
        if (mapL != null) {
            q(1, 1, mapL);
        }
        return this;
    }
}
