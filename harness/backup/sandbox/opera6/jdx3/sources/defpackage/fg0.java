package defpackage;

/* loaded from: classes.dex */
public final class fg0 extends jf0 {
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
        fg0 fg0Var = (fg0) jf0Var;
        vb0 vb0Var = (vb0) fg0Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        Long lH = jf0.h((Long) fg0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        dg0 dg0Var = (dg0) fg0Var.n(2);
        dg0 dg0Var2 = (dg0) n(2);
        if (dg0Var == null || dg0Var2 != null) {
            dg0Var = dg0Var2;
        }
        if (dg0Var != null) {
            q(2, 1, dg0Var);
        }
        gg0 gg0Var = (gg0) fg0Var.n(3);
        gg0 gg0Var2 = (gg0) n(3);
        if (gg0Var == null || gg0Var2 != null) {
            gg0Var = gg0Var2;
        }
        if (gg0Var != null) {
            q(3, 1, gg0Var);
        }
        String str = (String) fg0Var.n(4);
        String str2 = (String) n(4);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(4, 1, str);
        }
        return this;
    }
}
