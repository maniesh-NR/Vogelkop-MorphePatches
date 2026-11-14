package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class w70 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        w70 w70Var = (w70) jf0Var;
        t70 t70Var = (t70) w70Var.n(0);
        t70 t70Var2 = (t70) n(0);
        if (t70Var == null || t70Var2 != null) {
            t70Var = t70Var2;
        }
        if (t70Var != null) {
            q(0, 1, t70Var);
        }
        u70 u70Var = (u70) w70Var.n(1);
        u70 u70Var2 = (u70) n(1);
        if (u70Var == null || u70Var2 != null) {
            u70Var = u70Var2;
        }
        if (u70Var != null) {
            q(1, 1, u70Var);
        }
        List listI = jf0.i((List) w70Var.n(2), (List) n(2));
        if (listI != null) {
            q(2, 1, listI);
        }
        x70 x70Var = (x70) w70Var.n(3);
        x70 x70Var2 = (x70) n(3);
        if (x70Var == null || x70Var2 != null) {
            x70Var = x70Var2;
        }
        if (x70Var != null) {
            q(3, 1, x70Var);
        }
        String str = (String) w70Var.n(4);
        String str2 = (String) n(4);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(4, 1, str);
        }
        String str3 = (String) w70Var.n(5);
        String str4 = (String) n(5);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(5, 1, str3);
        }
        String str5 = (String) w70Var.n(6);
        String str6 = (String) n(6);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(6, 1, str5);
        }
        return this;
    }
}
