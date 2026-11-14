package defpackage;

/* loaded from: classes.dex */
public final class db0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        db0 db0Var = (db0) jf0Var;
        Long l = (Long) db0Var.n(0);
        Long l2 = (Long) n(0);
        if (l == null || l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(0, 1, l);
        }
        Boolean bool = (Boolean) db0Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        Boolean bool3 = (Boolean) db0Var.n(2);
        Boolean bool4 = (Boolean) n(2);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(2, 1, bool3);
        }
        Boolean bool5 = (Boolean) db0Var.n(3);
        Boolean bool6 = (Boolean) n(3);
        if (bool5 == null || bool6 != null) {
            bool5 = bool6;
        }
        if (bool5 != null) {
            q(3, 1, bool5);
        }
        Boolean bool7 = (Boolean) db0Var.n(4);
        Boolean bool8 = (Boolean) n(4);
        if (bool7 == null || bool8 != null) {
            bool7 = bool8;
        }
        if (bool7 != null) {
            q(4, 1, bool7);
        }
        Long l3 = (Long) db0Var.n(5);
        Long l4 = (Long) n(5);
        if (l3 == null || l4 != null) {
            l3 = l4;
        }
        if (l3 != null) {
            q(5, 1, l3);
        }
        cb0 cb0Var = (cb0) db0Var.n(6);
        cb0 cb0Var2 = (cb0) n(6);
        if (cb0Var == null || cb0Var2 != null) {
            cb0Var = cb0Var2;
        }
        if (cb0Var != null) {
            q(6, 1, cb0Var);
        }
        return this;
    }
}
