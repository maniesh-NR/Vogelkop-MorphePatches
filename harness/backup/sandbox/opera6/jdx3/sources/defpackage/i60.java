package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i60 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        ef0 ef0Var2 = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var2, ef0Var, ef0Var, ef0Var, ef0Var2, ef0Var2, ef0Var, ef0Var2, ef0Var2, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        i60 i60Var = (i60) jf0Var;
        Long lH = jf0.h((Long) i60Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Long lH2 = jf0.h((Long) i60Var.n(1), (Long) n(1));
        if (lH2 != null) {
            q(1, 1, lH2);
        }
        List listI = jf0.i((List) i60Var.n(2), (List) n(2));
        if (listI != null) {
            q(2, 1, listI);
        }
        Map mapL = jf0.l((Map) i60Var.n(3), (Map) n(3));
        if (mapL != null) {
            q(3, 1, mapL);
        }
        Map mapL2 = jf0.l((Map) i60Var.n(4), (Map) n(4));
        if (mapL2 != null) {
            q(4, 1, mapL2);
        }
        Map mapL3 = jf0.l((Map) i60Var.n(5), (Map) n(5));
        if (mapL3 != null) {
            q(5, 1, mapL3);
        }
        Long lH3 = jf0.h((Long) i60Var.n(6), (Long) n(6));
        if (lH3 != null) {
            q(6, 1, lH3);
        }
        Long lH4 = jf0.h((Long) i60Var.n(7), (Long) n(7));
        if (lH4 != null) {
            q(7, 1, lH4);
        }
        d80 d80Var = (d80) i60Var.n(8);
        d80 d80Var2 = (d80) n(8);
        if (d80Var == null || d80Var2 != null) {
            d80Var = d80Var2;
        }
        if (d80Var != null) {
            q(8, 1, d80Var);
        }
        Long lH5 = jf0.h((Long) i60Var.n(9), (Long) n(9));
        if (lH5 != null) {
            q(9, 1, lH5);
        }
        Long lH6 = jf0.h((Long) i60Var.n(10), (Long) n(10));
        if (lH6 != null) {
            q(10, 1, lH6);
        }
        Map mapL4 = jf0.l((Map) i60Var.n(11), (Map) n(11));
        if (mapL4 != null) {
            q(11, 1, mapL4);
        }
        return this;
    }

    public final Map x() {
        Map map = (Map) n(5);
        if (map != null && !map.isEmpty()) {
            return new if0(this, 5, map);
        }
        HashMap map2 = new HashMap();
        q(5, 1, map2);
        return new if0(this, 5, map2);
    }
}
