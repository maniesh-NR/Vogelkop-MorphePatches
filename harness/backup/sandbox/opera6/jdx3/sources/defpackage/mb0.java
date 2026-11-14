package defpackage;

/* loaded from: classes.dex */
public final class mb0 extends jf0 {
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
        mb0 mb0Var = (mb0) jf0Var;
        String str = (String) mb0Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        mp0 mp0Var = (mp0) mb0Var.n(1);
        mp0 mp0Var2 = (mp0) n(1);
        if (mp0Var == null || mp0Var2 != null) {
            mp0Var = mp0Var2;
        }
        if (mp0Var != null) {
            q(1, 1, mp0Var);
        }
        return this;
    }
}
