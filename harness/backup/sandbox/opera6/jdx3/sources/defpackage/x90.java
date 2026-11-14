package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class x90 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        x90 x90Var = (x90) jf0Var;
        String str = (String) x90Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        y90 y90Var = (y90) x90Var.n(1);
        y90 y90Var2 = (y90) n(1);
        if (y90Var == null || y90Var2 != null) {
            y90Var = y90Var2;
        }
        if (y90Var != null) {
            q(1, 1, y90Var);
        }
        Boolean bool = (Boolean) x90Var.n(2);
        Boolean bool2 = (Boolean) n(2);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(2, 1, bool);
        }
        List listI = jf0.i((List) x90Var.n(3), (List) n(3));
        if (listI != null) {
            q(3, 1, listI);
        }
        return this;
    }
}
