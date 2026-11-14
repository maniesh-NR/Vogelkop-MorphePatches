package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class xt0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0.e, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var};
    }

    public final List A() {
        List list = (List) n(2);
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public final List B() {
        List list = (List) n(4);
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
        xt0 xt0Var = (xt0) jf0Var;
        Map mapL = jf0.l((Map) xt0Var.n(0), (Map) n(0));
        if (mapL != null) {
            q(0, 1, mapL);
        }
        List listI = jf0.i((List) xt0Var.n(1), (List) n(1));
        if (listI != null) {
            q(1, 1, listI);
        }
        List listI2 = jf0.i((List) xt0Var.n(2), (List) n(2));
        if (listI2 != null) {
            q(2, 1, listI2);
        }
        h66 h66Var = (h66) jf0.f((h66) xt0Var.n(3), (h66) n(3));
        if (h66Var != null) {
            q(3, 1, h66Var);
        }
        List listI3 = jf0.i((List) xt0Var.n(4), (List) n(4));
        if (listI3 != null) {
            q(4, 1, listI3);
        }
        return this;
    }

    public final void x(xt0 xt0Var, zpa zpaVar) {
        if (n(0) != null) {
            HashMap map = (HashMap) n(0);
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                bu0 bu0Var = new bu0(2443, -1, 2);
                String str = (String) entry.getKey();
                bu0 bu0Var2 = (bu0) ((jf0) entry.getValue());
                if (bu0Var2.n(0) != null) {
                    bu0Var.q(0, 1, (Boolean) bu0Var2.n(0));
                }
                if (bu0Var2.n(1) != null) {
                    bu0Var.q(1, 1, (Boolean) bu0Var2.n(1));
                }
                map2.put(str, bu0Var);
            }
            xt0Var.q(0, 1, map2);
        }
        if (n(3) != null) {
            h66 h66Var = (h66) n(3);
            h66 h66Var2 = new h66(2443, 1, 14);
            if (h66Var.n(0) != null) {
                h66Var2.q(0, 1, (Boolean) h66Var.n(0));
            }
            if (h66Var.n(1) != null) {
                h66Var2.q(1, 1, (Long) h66Var.n(1));
            }
            if (h66Var.n(2) != null) {
                h66Var2.q(2, 1, (Boolean) h66Var.n(2));
            }
            if (h66Var.n(3) != null) {
                h66Var2.q(3, 1, (Boolean) h66Var.n(3));
            }
            if (h66Var.n(4) != null) {
                h66Var2.q(4, 1, (Boolean) h66Var.n(4));
            }
            if (h66Var.n(5) != null) {
                h66Var2.q(5, 1, (Boolean) h66Var.n(5));
            }
            if (h66Var.n(6) != null) {
                h66Var2.q(6, 1, (Boolean) h66Var.n(6));
            }
            if (h66Var.n(7) != null) {
                h66Var2.q(7, 1, (Boolean) h66Var.n(7));
            }
            if (h66Var.n(8) != null) {
                h66Var2.q(8, 1, (Boolean) h66Var.n(8));
            }
            if (h66Var.n(9) != null) {
                h66Var2.q(9, 1, (eu0) h66Var.n(9));
            }
            if (h66Var.n(10) != null) {
                h66Var2.q(10, 1, (Boolean) h66Var.n(10));
            }
            if (h66Var.n(11) != null) {
                h66Var2.q(11, 1, (Boolean) h66Var.n(11));
            }
            if (h66Var.n(12) != null) {
                h66Var2.q(12, 1, (hc0) h66Var.n(12));
            }
            if (h66Var.n(13) != null) {
                h66Var2.q(13, 1, (Boolean) h66Var.n(13));
            }
            xt0Var.q(3, 1, h66Var2);
        }
    }

    public final List y() {
        List list = (List) n(1);
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public final Map z() {
        Map map = (Map) n(0);
        if (map != null) {
            return Collections.unmodifiableMap(map);
        }
        return null;
    }
}
