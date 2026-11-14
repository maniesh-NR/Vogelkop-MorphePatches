package defpackage;

/* loaded from: classes.dex */
public final class r56 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        r56 r56Var = (r56) jf0Var;
        Long lH = jf0.h((Long) r56Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        Long l = (Long) r56Var.n(1);
        Long l2 = (Long) n(1);
        if (l == null) {
            l = l2;
        }
        if (l != null) {
            q(1, 1, l);
        }
        return this;
    }
}
