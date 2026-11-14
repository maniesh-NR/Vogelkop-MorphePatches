package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class zm0 extends jf0 {
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
        zm0 zm0Var = (zm0) jf0Var;
        wm0 wm0Var = (wm0) zm0Var.n(0);
        wm0 wm0Var2 = (wm0) n(0);
        if (wm0Var == null || wm0Var2 != null) {
            wm0Var = wm0Var2;
        }
        if (wm0Var != null) {
            q(0, 1, wm0Var);
        }
        xm0 xm0Var = (xm0) zm0Var.n(1);
        xm0 xm0Var2 = (xm0) n(1);
        if (xm0Var == null || xm0Var2 != null) {
            xm0Var = xm0Var2;
        }
        if (xm0Var != null) {
            q(1, 1, xm0Var);
        }
        List listI = jf0.i((List) zm0Var.n(2), (List) n(2));
        if (listI != null) {
            q(2, 1, listI);
        }
        an0 an0Var = (an0) zm0Var.n(3);
        an0 an0Var2 = (an0) n(3);
        if (an0Var == null || an0Var2 != null) {
            an0Var = an0Var2;
        }
        if (an0Var != null) {
            q(3, 1, an0Var);
        }
        String str = (String) zm0Var.n(4);
        String str2 = (String) n(4);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(4, 1, str);
        }
        String str3 = (String) zm0Var.n(5);
        String str4 = (String) n(5);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(5, 1, str3);
        }
        String str5 = (String) zm0Var.n(6);
        String str6 = (String) n(6);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(6, 1, str5);
        }
        List listI2 = jf0.i((List) zm0Var.n(7), (List) n(7));
        if (listI2 != null) {
            q(7, 1, listI2);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 4) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 5) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 6) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
