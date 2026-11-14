package defpackage;

/* loaded from: classes.dex */
public final class fr0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var};
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
        fr0 fr0Var = (fr0) jf0Var;
        gr0 gr0Var = (gr0) fr0Var.n(0);
        gr0 gr0Var2 = (gr0) n(0);
        if (gr0Var == null || gr0Var2 != null) {
            gr0Var = gr0Var2;
        }
        if (gr0Var != null) {
            q(0, 1, gr0Var);
        }
        Long lH = jf0.h((Long) fr0Var.n(1), (Long) n(1));
        if (lH != null) {
            q(1, 1, lH);
        }
        gr0 gr0Var3 = (gr0) fr0Var.n(2);
        gr0 gr0Var4 = (gr0) n(2);
        if (gr0Var3 == null || gr0Var4 != null) {
            gr0Var3 = gr0Var4;
        }
        if (gr0Var3 != null) {
            q(2, 1, gr0Var3);
        }
        return this;
    }
}
