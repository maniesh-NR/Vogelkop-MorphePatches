package defpackage;

/* loaded from: classes.dex */
public final class dm0 extends jf0 {
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
        dm0 dm0Var = (dm0) jf0Var;
        em0 em0Var = (em0) dm0Var.n(0);
        em0 em0Var2 = (em0) n(0);
        if (em0Var == null || em0Var2 != null) {
            em0Var = em0Var2;
        }
        if (em0Var != null) {
            q(0, 1, em0Var);
        }
        am0 am0Var = (am0) dm0Var.n(1);
        am0 am0Var2 = (am0) n(1);
        if (am0Var == null || am0Var2 != null) {
            am0Var = am0Var2;
        }
        if (am0Var != null) {
            q(1, 1, am0Var);
        }
        return this;
    }
}
