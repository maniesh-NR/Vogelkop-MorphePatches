package defpackage;

/* loaded from: classes.dex */
public final class ol0 extends jf0 {
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
        ol0 ol0Var = (ol0) jf0Var;
        sp0 sp0Var = (sp0) ol0Var.n(0);
        sp0 sp0Var2 = (sp0) n(0);
        if (sp0Var == null || sp0Var2 != null) {
            sp0Var = sp0Var2;
        }
        if (sp0Var != null) {
            q(0, 1, sp0Var);
        }
        tp0 tp0Var = (tp0) ol0Var.n(1);
        tp0 tp0Var2 = (tp0) n(1);
        if (tp0Var == null || tp0Var2 != null) {
            tp0Var = tp0Var2;
        }
        if (tp0Var != null) {
            q(1, 1, tp0Var);
        }
        return this;
    }
}
