package defpackage;

/* loaded from: classes.dex */
public final class ym0 extends jf0 {
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
        ym0 ym0Var = (ym0) jf0Var;
        an0 an0Var = (an0) ym0Var.n(0);
        an0 an0Var2 = (an0) n(0);
        if (an0Var == null || an0Var2 != null) {
            an0Var = an0Var2;
        }
        if (an0Var != null) {
            q(0, 1, an0Var);
        }
        an0 an0Var3 = (an0) ym0Var.n(1);
        an0 an0Var4 = (an0) n(1);
        if (an0Var3 == null || an0Var4 != null) {
            an0Var3 = an0Var4;
        }
        if (an0Var3 != null) {
            q(1, 1, an0Var3);
        }
        return this;
    }
}
