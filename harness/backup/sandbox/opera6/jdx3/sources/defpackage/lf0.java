package defpackage;

/* loaded from: classes.dex */
public final class lf0 extends jf0 {
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
        lf0 lf0Var = (lf0) jf0Var;
        kf0 kf0Var = (kf0) lf0Var.n(0);
        kf0 kf0Var2 = (kf0) n(0);
        if (kf0Var == null || kf0Var2 != null) {
            kf0Var = kf0Var2;
        }
        if (kf0Var != null) {
            q(0, 1, kf0Var);
        }
        mf0 mf0Var = (mf0) lf0Var.n(1);
        mf0 mf0Var2 = (mf0) n(1);
        if (mf0Var == null || mf0Var2 != null) {
            mf0Var = mf0Var2;
        }
        if (mf0Var != null) {
            q(1, 1, mf0Var);
        }
        return this;
    }
}
