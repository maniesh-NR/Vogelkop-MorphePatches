package defpackage;

/* loaded from: classes.dex */
public final class co0 extends jf0 {
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
        co0 co0Var = (co0) jf0Var;
        bo0 bo0Var = (bo0) co0Var.n(0);
        bo0 bo0Var2 = (bo0) n(0);
        if (bo0Var == null || bo0Var2 != null) {
            bo0Var = bo0Var2;
        }
        if (bo0Var != null) {
            q(0, 1, bo0Var);
        }
        ep0 ep0Var = (ep0) co0Var.n(1);
        ep0 ep0Var2 = (ep0) n(1);
        if (ep0Var == null || ep0Var2 != null) {
            ep0Var = ep0Var2;
        }
        if (ep0Var != null) {
            q(1, 1, ep0Var);
        }
        dp0 dp0Var = (dp0) co0Var.n(2);
        dp0 dp0Var2 = (dp0) n(2);
        if (dp0Var == null || dp0Var2 != null) {
            dp0Var = dp0Var2;
        }
        if (dp0Var != null) {
            q(2, 1, dp0Var);
        }
        return this;
    }
}
