package defpackage;

/* loaded from: classes.dex */
public final class rc0 extends jf0 {
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
        rc0 rc0Var = (rc0) jf0Var;
        qc0 qc0Var = (qc0) rc0Var.n(0);
        qc0 qc0Var2 = (qc0) n(0);
        if (qc0Var == null || qc0Var2 != null) {
            qc0Var = qc0Var2;
        }
        if (qc0Var != null) {
            q(0, 1, qc0Var);
        }
        nc0 nc0Var = (nc0) rc0Var.n(1);
        nc0 nc0Var2 = (nc0) n(1);
        if (nc0Var == null || nc0Var2 != null) {
            nc0Var = nc0Var2;
        }
        if (nc0Var != null) {
            q(1, 1, nc0Var);
        }
        return this;
    }
}
