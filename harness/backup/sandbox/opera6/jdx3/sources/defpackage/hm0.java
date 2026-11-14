package defpackage;

/* loaded from: classes.dex */
public final class hm0 extends jf0 {
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
        hm0 hm0Var = (hm0) jf0Var;
        bp0 bp0Var = (bp0) jf0.f((bp0) hm0Var.n(0), (bp0) n(0));
        if (bp0Var != null) {
            q(0, 1, bp0Var);
        }
        e80 e80Var = (e80) hm0Var.n(1);
        e80 e80Var2 = (e80) n(1);
        if (e80Var == null || e80Var2 != null) {
            e80Var = e80Var2;
        }
        if (e80Var != null) {
            q(1, 1, e80Var);
        }
        return this;
    }

    public final bp0 x(zpa zpaVar) {
        bp0 bp0Var = (bp0) n(0);
        if (bp0Var != null) {
            return bp0Var;
        }
        zpaVar.getClass();
        q(0, 1, new bp0(2443, 1, 3));
        return (bp0) n(0);
    }
}
