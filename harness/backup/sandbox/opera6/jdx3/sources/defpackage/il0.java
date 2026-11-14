package defpackage;

/* loaded from: classes.dex */
public final class il0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var};
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
        il0 il0Var = (il0) jf0Var;
        kl0 kl0Var = (kl0) il0Var.n(0);
        kl0 kl0Var2 = (kl0) n(0);
        if (kl0Var == null || kl0Var2 != null) {
            kl0Var = kl0Var2;
        }
        if (kl0Var != null) {
            q(0, 1, kl0Var);
        }
        Long lH = jf0.h((Long) il0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        gl0 gl0Var = (gl0) il0Var.n(2);
        gl0 gl0Var2 = (gl0) n(2);
        if (gl0Var == null || gl0Var2 != null) {
            gl0Var = gl0Var2;
        }
        if (gl0Var != null) {
            q(2, 1, gl0Var);
        }
        Long lH2 = jf0.h((Long) il0Var.n(3), (Long) n(3));
        if (lH2 != null) {
            q(3, 1, lH2);
        }
        return this;
    }
}
