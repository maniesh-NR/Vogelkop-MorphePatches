package defpackage;

/* loaded from: classes.dex */
public final class bi0 extends jf0 {
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
        bi0 bi0Var = (bi0) jf0Var;
        vh0 vh0Var = (vh0) jf0.f((vh0) bi0Var.n(0), (vh0) n(0));
        if (vh0Var != null) {
            q(0, 1, vh0Var);
        }
        ai0 ai0Var = (ai0) bi0Var.n(1);
        ai0 ai0Var2 = (ai0) n(1);
        if (ai0Var == null || ai0Var2 != null) {
            ai0Var = ai0Var2;
        }
        if (ai0Var != null) {
            q(1, 1, ai0Var);
        }
        return this;
    }
}
