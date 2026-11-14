package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class n56 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        n56 n56Var = (n56) jf0Var;
        Object objI = jf0.i((List) n56Var.n(0), (List) n(0));
        if (objI != null) {
            q(0, 1, objI);
        }
        Object objI2 = jf0.i((List) n56Var.n(1), (List) n(1));
        if (objI2 != null) {
            q(1, 1, objI2);
        }
        Object objI3 = jf0.i((List) n56Var.n(2), (List) n(2));
        if (objI3 != null) {
            q(2, 1, objI3);
        }
        List listI = jf0.i((List) n56Var.n(3), (List) n(3));
        jf0.s(listI);
        if (listI != null) {
            q(3, 1, listI);
        }
        List listI2 = jf0.i((List) n56Var.n(4), (List) n(4));
        jf0.s(listI2);
        if (listI2 != null) {
            q(4, 1, listI2);
        }
        List listI3 = jf0.i((List) n56Var.n(5), (List) n(5));
        jf0.s(listI3);
        if (listI3 != null) {
            q(5, 1, listI3);
        }
        return this;
    }
}
