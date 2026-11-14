package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class c60 extends jf0 {
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
        c60 c60Var = (c60) jf0Var;
        t50 t50Var = (t50) jf0.f((t50) c60Var.n(0), (t50) n(0));
        if (t50Var != null) {
            q(0, 1, t50Var);
        }
        List listI = jf0.i((List) c60Var.n(1), (List) n(1));
        if (listI != null) {
            q(1, 1, listI);
        }
        List listI2 = jf0.i((List) c60Var.n(2), (List) n(2));
        if (listI2 != null) {
            q(2, 1, listI2);
        }
        return this;
    }
}
