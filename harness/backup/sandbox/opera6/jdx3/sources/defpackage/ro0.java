package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ro0 extends jf0 {
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
        ro0 ro0Var = (ro0) jf0Var;
        Long lH = jf0.h((Long) ro0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Long lH2 = jf0.h((Long) ro0Var.n(1), (Long) n(1));
        if (lH2 != null) {
            q(1, 1, lH2);
        }
        Long lH3 = jf0.h((Long) ro0Var.n(2), (Long) n(2));
        if (lH3 != null) {
            q(2, 1, lH3);
        }
        Long lH4 = jf0.h((Long) ro0Var.n(3), (Long) n(3));
        if (lH4 != null) {
            q(3, 1, lH4);
        }
        List listI = jf0.i((List) ro0Var.n(4), (List) n(4));
        if (listI != null) {
            q(4, 1, listI);
        }
        List listI2 = jf0.i((List) ro0Var.n(5), (List) n(5));
        if (listI2 != null) {
            q(5, 1, listI2);
        }
        return this;
    }

    public final hf0 x() {
        List list = (List) n(5);
        if (list != null && !list.isEmpty()) {
            return new hf0(this, 5, list);
        }
        ArrayList arrayList = new ArrayList();
        q(5, 1, arrayList);
        return new hf0(this, 5, arrayList);
    }
}
