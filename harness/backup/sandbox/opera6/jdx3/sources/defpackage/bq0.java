package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bq0 extends jf0 {
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
        bq0 bq0Var = (bq0) jf0Var;
        Long lH = jf0.h((Long) bq0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        List listI = jf0.i((List) bq0Var.n(1), (List) n(1));
        if (listI != null) {
            q(1, 1, listI);
        }
        List listI2 = jf0.i((List) bq0Var.n(2), (List) n(2));
        if (listI2 != null) {
            q(2, 1, listI2);
        }
        return this;
    }
}
