package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ug0 extends jf0 {
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
        ug0 ug0Var = (ug0) jf0Var;
        List listI = jf0.i((List) ug0Var.n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        Map mapK = jf0.k((Map) ug0Var.n(1), (Map) n(1));
        if (mapK != null) {
            q(1, 1, mapK);
        }
        Map mapL = jf0.l((Map) ug0Var.n(2), (Map) n(2));
        if (mapL != null) {
            q(2, 1, mapL);
        }
        Map mapL2 = jf0.l((Map) ug0Var.n(3), (Map) n(3));
        if (mapL2 != null) {
            q(3, 1, mapL2);
        }
        return this;
    }

    public final if0 x() {
        Map map = (Map) n(2);
        if (map != null && !map.isEmpty()) {
            return new if0(this, 2, map);
        }
        HashMap map2 = new HashMap();
        q(2, 1, map2);
        return new if0(this, 2, map2);
    }
}
