package defpackage;

/* loaded from: classes.dex */
public final class lh0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
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
        lh0 lh0Var = (lh0) jf0Var;
        mh0 mh0Var = (mh0) lh0Var.n(0);
        mh0 mh0Var2 = (mh0) n(0);
        if (mh0Var == null || mh0Var2 != null) {
            mh0Var = mh0Var2;
        }
        if (mh0Var != null) {
            q(0, 1, mh0Var);
        }
        ht0 ht0Var = (ht0) lh0Var.n(1);
        ht0 ht0Var2 = (ht0) n(1);
        if (ht0Var == null || ht0Var2 != null) {
            ht0Var = ht0Var2;
        }
        if (ht0Var != null) {
            q(1, 1, ht0Var);
        }
        kh0 kh0Var = (kh0) lh0Var.n(2);
        kh0 kh0Var2 = (kh0) n(2);
        if (kh0Var == null || kh0Var2 != null) {
            kh0Var = kh0Var2;
        }
        if (kh0Var != null) {
            q(2, 1, kh0Var);
        }
        nh0 nh0Var = (nh0) lh0Var.n(3);
        nh0 nh0Var2 = (nh0) n(3);
        if (nh0Var == null || nh0Var2 != null) {
            nh0Var = nh0Var2;
        }
        if (nh0Var != null) {
            q(3, 1, nh0Var);
        }
        return this;
    }
}
