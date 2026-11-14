package defpackage;

/* loaded from: classes.dex */
public final class mo0 extends jf0 {
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
        mo0 mo0Var = (mo0) jf0Var;
        no0 no0Var = (no0) mo0Var.n(0);
        no0 no0Var2 = (no0) n(0);
        if (no0Var == null || no0Var2 != null) {
            no0Var = no0Var2;
        }
        if (no0Var != null) {
            q(0, 1, no0Var);
        }
        lo0 lo0Var = (lo0) mo0Var.n(1);
        lo0 lo0Var2 = (lo0) n(1);
        if (lo0Var == null || lo0Var2 != null) {
            lo0Var = lo0Var2;
        }
        if (lo0Var != null) {
            q(1, 1, lo0Var);
        }
        return this;
    }
}
