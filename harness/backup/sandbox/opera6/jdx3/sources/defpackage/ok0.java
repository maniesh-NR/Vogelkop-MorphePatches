package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ok0 extends jf0 {
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
        ok0 ok0Var = (ok0) jf0Var;
        Object objG = jf0.g((Integer) ok0Var.n(0), (Integer) n(0));
        if (objG != null) {
            q(0, 1, objG);
        }
        Map map = (Map) ok0Var.n(1);
        Map map2 = (Map) n(1);
        if (map == null) {
            map = map2;
        } else if (map2 != null) {
            HashMap map3 = new HashMap(map);
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() != null) {
                    Integer num = (Integer) map3.get(entry.getKey());
                    if (num == null) {
                        map3.put((String) entry.getKey(), (Integer) entry.getValue());
                    } else {
                        map3.put((String) entry.getKey(), Integer.valueOf(((Integer) entry.getValue()).intValue() + num.intValue()));
                    }
                }
            }
            map = map3;
        }
        if (map != null) {
            q(1, 1, map);
        }
        Object objG2 = jf0.g((Integer) ok0Var.n(2), (Integer) n(2));
        if (objG2 != null) {
            q(2, 1, objG2);
        }
        return this;
    }
}
