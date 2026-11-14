package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s56 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var};
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
        s56 s56Var = (s56) jf0Var;
        List list = (List) s56Var.n(0);
        List list2 = (List) n(0);
        if (list2 != null) {
            list = list2;
        }
        if (list != null) {
            q(0, 1, list);
        }
        Map map = (Map) s56Var.n(1);
        Map map2 = (Map) n(1);
        if (map2 != null) {
            map = map2;
        }
        if (map != null) {
            q(1, 1, map);
        }
        return this;
    }
}
