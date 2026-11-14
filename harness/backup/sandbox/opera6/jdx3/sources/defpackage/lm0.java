package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class lm0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var};
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
        lm0 lm0Var = (lm0) jf0Var;
        List listI = jf0.i((List) lm0Var.n(0), (List) n(0));
        if (listI != null) {
            q(0, 1, listI);
        }
        String str = (String) lm0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        Map mapL = jf0.l((Map) lm0Var.n(2), (Map) n(2));
        if (mapL != null) {
            q(2, 1, mapL);
        }
        Boolean bool = (Boolean) lm0Var.n(3);
        Boolean bool2 = (Boolean) n(3);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(3, 1, bool);
        }
        nm0 nm0Var = (nm0) lm0Var.n(4);
        nm0 nm0Var2 = (nm0) n(4);
        if (nm0Var == null || nm0Var2 != null) {
            nm0Var = nm0Var2;
        }
        if (nm0Var != null) {
            q(4, 1, nm0Var);
        }
        return this;
    }
}
