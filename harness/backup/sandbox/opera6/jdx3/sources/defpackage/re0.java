package defpackage;

/* loaded from: classes.dex */
public final class re0 extends jf0 {
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
        re0 re0Var = (re0) jf0Var;
        wm0 wm0Var = (wm0) re0Var.n(0);
        wm0 wm0Var2 = (wm0) n(0);
        if (wm0Var == null || wm0Var2 != null) {
            wm0Var = wm0Var2;
        }
        if (wm0Var != null) {
            q(0, 1, wm0Var);
        }
        xm0 xm0Var = (xm0) re0Var.n(1);
        xm0 xm0Var2 = (xm0) n(1);
        if (xm0Var == null || xm0Var2 != null) {
            xm0Var = xm0Var2;
        }
        if (xm0Var != null) {
            q(1, 1, xm0Var);
        }
        String str = (String) re0Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        String str3 = (String) re0Var.n(3);
        String str4 = (String) n(3);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(3, 1, str3);
        }
        return this;
    }
}
