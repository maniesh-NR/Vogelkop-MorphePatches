package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class hk0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        hk0 hk0Var = (hk0) jf0Var;
        Long lH = jf0.h((Long) hk0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        String str = (String) hk0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        String str3 = (String) hk0Var.n(2);
        String str4 = (String) n(2);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(2, 1, str3);
        }
        List listI = jf0.i((List) hk0Var.n(3), (List) n(3));
        if (listI != null) {
            q(3, 1, listI);
        }
        String str5 = (String) hk0Var.n(4);
        String str6 = (String) n(4);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(4, 1, str5);
        }
        String str7 = (String) hk0Var.n(5);
        String str8 = (String) n(5);
        if (str7 == null || str8 != null) {
            str7 = str8;
        }
        if (str7 != null) {
            q(5, 1, str7);
        }
        Map mapJ = jf0.j((Map) hk0Var.n(6), (Map) n(6));
        if (mapJ != null) {
            q(6, 1, mapJ);
        }
        Integer numG = jf0.g((Integer) hk0Var.n(7), (Integer) n(7));
        if (numG != null) {
            q(7, 1, numG);
        }
        return this;
    }
}
