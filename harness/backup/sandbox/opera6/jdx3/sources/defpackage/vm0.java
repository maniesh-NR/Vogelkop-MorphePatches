package defpackage;

/* loaded from: classes.dex */
public final class vm0 extends jf0 {
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
        vm0 vm0Var = (vm0) jf0Var;
        um0 um0Var = (um0) vm0Var.n(0);
        um0 um0Var2 = (um0) n(0);
        if (um0Var == null || um0Var2 != null) {
            um0Var = um0Var2;
        }
        if (um0Var != null) {
            q(0, 1, um0Var);
        }
        Long lH = jf0.h((Long) vm0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        return this;
    }
}
