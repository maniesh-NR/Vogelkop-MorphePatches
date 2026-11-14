package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class de0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var};
    }

    public final List A() {
        List list = (List) n(3);
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
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
        de0 de0Var = (de0) jf0Var;
        List listI = jf0.i((List) de0Var.n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        List listI2 = jf0.i((List) de0Var.n(1), (List) n(1));
        if (listI2 != null) {
            q(1, 1, listI2);
        }
        List listI3 = jf0.i((List) de0Var.n(2), (List) n(2));
        if (listI3 != null) {
            q(2, 1, listI3);
        }
        List listI4 = jf0.i((List) de0Var.n(3), (List) n(3));
        if (listI4 != null) {
            q(3, 1, listI4);
        }
        return this;
    }

    public final List x() {
        List list = (List) n(1);
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public final List y() {
        List list = (List) n(0);
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public final List z() {
        List list = (List) n(2);
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }
}
