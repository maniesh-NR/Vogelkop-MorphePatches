package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ju0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var};
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
        ju0 ju0Var = (ju0) jf0Var;
        vb0 vb0Var = (vb0) ju0Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        ku0 ku0Var = (ku0) ju0Var.n(1);
        ku0 ku0Var2 = (ku0) n(1);
        if (ku0Var == null || ku0Var2 != null) {
            ku0Var = ku0Var2;
        }
        if (ku0Var != null) {
            q(1, 1, ku0Var);
        }
        Long lH = jf0.h((Long) ju0Var.n(2), (Long) n(2));
        if (lH != null) {
            q(2, 1, lH);
        }
        List listI = jf0.i((List) ju0Var.n(3), (List) n(3));
        if (listI != null) {
            q(3, 1, listI);
        }
        return this;
    }
}
