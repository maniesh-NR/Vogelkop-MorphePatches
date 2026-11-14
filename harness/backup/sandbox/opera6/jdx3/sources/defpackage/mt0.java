package defpackage;

/* loaded from: classes.dex */
public final class mt0 extends jf0 {
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
        mt0 mt0Var = (mt0) jf0Var;
        ot0 ot0Var = (ot0) mt0Var.n(0);
        ot0 ot0Var2 = (ot0) n(0);
        if (ot0Var == null || ot0Var2 != null) {
            ot0Var = ot0Var2;
        }
        if (ot0Var != null) {
            q(0, 1, ot0Var);
        }
        nt0 nt0Var = (nt0) mt0Var.n(1);
        nt0 nt0Var2 = (nt0) n(1);
        if (nt0Var == null || nt0Var2 != null) {
            nt0Var = nt0Var2;
        }
        if (nt0Var != null) {
            q(1, 1, nt0Var);
        }
        return this;
    }
}
