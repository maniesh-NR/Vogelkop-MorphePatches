package defpackage;

/* loaded from: classes.dex */
public final class d66 extends jf0 {
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
        d66 d66Var = (d66) jf0Var;
        ns0 ns0Var = (ns0) d66Var.n(0);
        ns0 ns0Var2 = (ns0) n(0);
        if (ns0Var == null || ns0Var2 != null) {
            ns0Var = ns0Var2;
        }
        if (ns0Var != null) {
            q(0, 1, ns0Var);
        }
        i80 i80Var = (i80) d66Var.n(1);
        i80 i80Var2 = (i80) n(1);
        if (i80Var == null || i80Var2 != null) {
            i80Var = i80Var2;
        }
        if (i80Var != null) {
            q(1, 1, i80Var);
        }
        Long l = (Long) d66Var.n(2);
        Long l2 = (Long) n(2);
        if (l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(2, 1, l);
        }
        ss0 ss0Var = (ss0) d66Var.n(3);
        ss0 ss0Var2 = (ss0) n(3);
        if (ss0Var == null || ss0Var2 != null) {
            ss0Var = ss0Var2;
        }
        if (ss0Var != null) {
            q(3, 1, ss0Var);
        }
        return this;
    }
}
