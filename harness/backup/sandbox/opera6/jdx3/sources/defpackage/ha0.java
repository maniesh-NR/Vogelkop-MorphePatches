package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ha0 extends jf0 {
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
        ha0 ha0Var = (ha0) jf0Var;
        vb0 vb0Var = (vb0) ha0Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        la0 la0Var = (la0) ha0Var.n(1);
        la0 la0Var2 = (la0) n(1);
        if (la0Var == null || la0Var2 != null) {
            la0Var = la0Var2;
        }
        if (la0Var != null) {
            q(1, 1, la0Var);
        }
        List listI = jf0.i((List) ha0Var.n(2), (List) n(2));
        if (listI != null) {
            q(2, 1, listI);
        }
        return this;
    }
}
