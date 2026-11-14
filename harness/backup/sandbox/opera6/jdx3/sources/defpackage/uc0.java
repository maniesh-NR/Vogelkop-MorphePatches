package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class uc0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        List list = Collections.EMPTY_LIST;
        g = new df0[]{df0Var, df0Var, new df0(-1, list, jf0.c(list)), df0Var, new df0(-1, list, jf0.c(list)), df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        uc0 uc0Var = (uc0) jf0Var;
        List listI = jf0.i((List) uc0Var.n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        vq0 vq0Var = (vq0) jf0.f((vq0) uc0Var.n(1), (vq0) n(1));
        if (vq0Var != null) {
            q(1, 1, vq0Var);
        }
        List listI2 = jf0.i((List) uc0Var.n(2), (List) n(2));
        if (listI2 != null) {
            q(2, -1, listI2);
        }
        List listI3 = jf0.i((List) uc0Var.n(3), (List) n(3));
        if (listI3 != null) {
            q(3, 1, listI3);
        }
        List listI4 = jf0.i((List) uc0Var.n(4), (List) n(4));
        if (listI4 != null) {
            q(4, -1, listI4);
        }
        List listI5 = jf0.i((List) uc0Var.n(5), (List) n(5));
        if (listI5 != null) {
            q(5, 1, listI5);
        }
        List listI6 = jf0.i((List) uc0Var.n(6), (List) n(6));
        if (listI6 != null) {
            q(6, 1, listI6);
        }
        List listI7 = jf0.i((List) uc0Var.n(7), (List) n(7));
        if (listI7 != null) {
            q(7, 1, listI7);
        }
        List listI8 = jf0.i((List) uc0Var.n(8), (List) n(8));
        if (listI8 != null) {
            q(8, 1, listI8);
        }
        List listI9 = jf0.i((List) uc0Var.n(9), (List) n(9));
        if (listI9 != null) {
            q(9, 1, listI9);
        }
        List listI10 = jf0.i((List) uc0Var.n(10), (List) n(10));
        if (listI10 != null) {
            q(10, 1, listI10);
        }
        List listI11 = jf0.i((List) uc0Var.n(11), (List) n(11));
        if (listI11 != null) {
            q(11, 1, listI11);
        }
        return this;
    }

    public final vq0 x(zpa zpaVar) {
        vq0 vq0Var = (vq0) n(1);
        if (vq0Var != null) {
            return vq0Var;
        }
        zpaVar.getClass();
        q(1, 1, new vq0(2443, 1, 2));
        return (vq0) n(1);
    }
}
