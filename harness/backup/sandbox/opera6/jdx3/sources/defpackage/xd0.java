package defpackage;

/* loaded from: classes.dex */
public final class xd0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
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
        xd0 xd0Var = (xd0) jf0Var;
        ll0 ll0Var = (ll0) xd0Var.n(0);
        ll0 ll0Var2 = (ll0) n(0);
        if (ll0Var == null || ll0Var2 != null) {
            ll0Var = ll0Var2;
        }
        if (ll0Var != null) {
            q(0, 1, ll0Var);
        }
        wd0 wd0Var = (wd0) xd0Var.n(1);
        wd0 wd0Var2 = (wd0) n(1);
        if (wd0Var == null || wd0Var2 != null) {
            wd0Var = wd0Var2;
        }
        if (wd0Var != null) {
            q(1, 1, wd0Var);
        }
        return this;
    }
}
