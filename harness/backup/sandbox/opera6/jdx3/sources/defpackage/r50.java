package defpackage;

/* loaded from: classes.dex */
public final class r50 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        r50 r50Var = (r50) jf0Var;
        q50 q50Var = (q50) r50Var.n(0);
        q50 q50Var2 = (q50) n(0);
        if (q50Var == null || q50Var2 != null) {
            q50Var = q50Var2;
        }
        if (q50Var != null) {
            q(0, 1, q50Var);
        }
        Boolean bool = (Boolean) r50Var.n(1);
        Boolean bool2 = (Boolean) n(1);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(1, 1, bool);
        }
        String str = (String) r50Var.n(2);
        String str2 = (String) n(2);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(2, 1, str);
        }
        s50 s50Var = (s50) r50Var.n(3);
        s50 s50Var2 = (s50) n(3);
        if (s50Var == null || s50Var2 != null) {
            s50Var = s50Var2;
        }
        if (s50Var != null) {
            q(3, 1, s50Var);
        }
        Long lH = jf0.h((Long) r50Var.n(4), (Long) n(4));
        if (lH != null) {
            q(4, 1, lH);
        }
        Boolean bool3 = (Boolean) r50Var.n(5);
        Boolean bool4 = (Boolean) n(5);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(5, 1, bool3);
        }
        return this;
    }
}
