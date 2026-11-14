package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ed0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
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
        ed0 ed0Var = (ed0) jf0Var;
        List listI = jf0.i((List) ed0Var.n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        Map mapK = jf0.k((Map) ed0Var.n(1), (Map) n(1));
        if (mapK != null) {
            q(1, 1, mapK);
        }
        return this;
    }
}
