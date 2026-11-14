package defpackage;

/* loaded from: classes.dex */
public final class c80 extends jf0 {
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
        c80 c80Var = (c80) jf0Var;
        a80 a80Var = (a80) c80Var.n(0);
        a80 a80Var2 = (a80) n(0);
        if (a80Var == null || a80Var2 != null) {
            a80Var = a80Var2;
        }
        if (a80Var != null) {
            q(0, 1, a80Var);
        }
        b80 b80Var = (b80) c80Var.n(1);
        b80 b80Var2 = (b80) n(1);
        if (b80Var == null || b80Var2 != null) {
            b80Var = b80Var2;
        }
        if (b80Var != null) {
            q(1, 1, b80Var);
        }
        Boolean bool = (Boolean) c80Var.n(2);
        Boolean bool2 = (Boolean) n(2);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(2, 1, bool);
        }
        return this;
    }
}
