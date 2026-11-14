package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class u60 extends jf0 {
    public static final ef0[] f = {ef0.e, ef0.b};
    public static final df0[] g;

    static {
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
        u60 u60Var = (u60) jf0Var;
        Long lH = jf0.h((Long) u60Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        List listI = jf0.i((List) u60Var.n(1), (List) n(1));
        if (listI != null) {
            q(1, 1, listI);
        }
        return this;
    }
}
