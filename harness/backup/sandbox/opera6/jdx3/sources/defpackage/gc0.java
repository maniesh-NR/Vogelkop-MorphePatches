package defpackage;

/* loaded from: classes.dex */
public final class gc0 extends jf0 {
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
        gc0 gc0Var = (gc0) jf0Var;
        eg0 eg0Var = (eg0) gc0Var.n(0);
        eg0 eg0Var2 = (eg0) n(0);
        if (eg0Var == null || eg0Var2 != null) {
            eg0Var = eg0Var2;
        }
        if (eg0Var != null) {
            q(0, 1, eg0Var);
        }
        String str = (String) gc0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        String str3 = (String) gc0Var.n(2);
        String str4 = (String) n(2);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(2, 1, str3);
        }
        return this;
    }
}
