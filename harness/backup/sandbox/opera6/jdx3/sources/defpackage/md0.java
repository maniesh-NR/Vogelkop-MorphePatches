package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class md0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        ef0 ef0Var2 = ef0.b;
        f = new ef0[]{ef0Var, ef0Var2, ef0Var2};
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
        md0 md0Var = (md0) jf0Var;
        kd0 kd0Var = (kd0) jf0.f((kd0) md0Var.n(0), (kd0) n(0));
        if (kd0Var != null) {
            q(0, 1, kd0Var);
        }
        List listI = jf0.i((List) md0Var.n(1), (List) n(1));
        if (listI != null) {
            q(1, 1, listI);
        }
        List listI2 = jf0.i((List) md0Var.n(2), (List) n(2));
        if (listI2 != null) {
            q(2, 1, listI2);
        }
        return this;
    }

    public final void x(md0 md0Var, zpa zpaVar) {
        if (n(0) != null) {
            kd0 kd0Var = (kd0) n(0);
            kd0 kd0Var2 = new kd0(2443, 1, 11);
            if (kd0Var.n(0) != null) {
                kd0Var2.q(0, 1, (Boolean) kd0Var.n(0));
            }
            if (kd0Var.n(1) != null) {
                kd0Var2.q(1, 1, (String) kd0Var.n(1));
            }
            if (kd0Var.n(2) != null) {
                kd0Var2.q(2, 1, (Long) kd0Var.n(2));
            }
            if (kd0Var.n(3) != null) {
                kd0Var2.q(3, 1, (Long) kd0Var.n(3));
            }
            if (kd0Var.n(4) != null) {
                kd0Var2.q(4, 1, (Long) kd0Var.n(4));
            }
            if (kd0Var.n(5) != null) {
                kd0Var2.q(5, 1, (qe0) kd0Var.n(5));
            }
            if (kd0Var.n(6) != null) {
                kd0Var2.q(6, 1, (ad0) kd0Var.n(6));
            }
            if (kd0Var.n(7) != null) {
                kd0Var2.q(7, 1, (Long) kd0Var.n(7));
            }
            if (kd0Var.n(8) != null) {
                kd0Var2.q(8, 1, (jd0) kd0Var.n(8));
            }
            if (kd0Var.n(9) != null) {
                hd0 hd0Var = (hd0) kd0Var.n(9);
                hd0 hd0VarY = zpa.y();
                hd0Var.x(hd0VarY);
                kd0Var2.q(9, 1, hd0VarY);
            }
            if (kd0Var.n(10) != null) {
                HashMap map = (HashMap) kd0Var.n(10);
                HashMap map2 = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    hd0 hd0VarY2 = zpa.y();
                    String str = (String) entry.getKey();
                    ((hd0) ((jf0) entry.getValue())).x(hd0VarY2);
                    map2.put(str, hd0VarY2);
                }
                kd0Var2.q(10, 1, map2);
            }
            md0Var.q(0, 1, kd0Var2);
        }
    }

    public final List y() {
        List list = (List) n(1);
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
