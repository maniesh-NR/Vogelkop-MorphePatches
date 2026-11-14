package defpackage;

/* loaded from: classes.dex */
public final class pc0 extends jf0 {
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
        pc0 pc0Var = (pc0) jf0Var;
        oc0 oc0Var = (oc0) pc0Var.n(0);
        oc0 oc0Var2 = (oc0) n(0);
        if (oc0Var == null || oc0Var2 != null) {
            oc0Var = oc0Var2;
        }
        if (oc0Var != null) {
            q(0, 1, oc0Var);
        }
        nc0 nc0Var = (nc0) pc0Var.n(1);
        nc0 nc0Var2 = (nc0) n(1);
        if (nc0Var == null || nc0Var2 != null) {
            nc0Var = nc0Var2;
        }
        if (nc0Var != null) {
            q(1, 1, nc0Var);
        }
        return this;
    }
}
