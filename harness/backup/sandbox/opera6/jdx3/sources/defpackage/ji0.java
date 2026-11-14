package defpackage;

/* loaded from: classes.dex */
public final class ji0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var};
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
        ji0 ji0Var = (ji0) jf0Var;
        Long lH = jf0.h((Long) ji0Var.n(0), (Long) n(0));
        if (lH != null) {
            q(0, 1, lH);
        }
        String str = (String) ji0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        String str3 = (String) ji0Var.n(2);
        String str4 = (String) n(2);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(2, 1, str3);
        }
        ii0 ii0Var = (ii0) ji0Var.n(3);
        ii0 ii0Var2 = (ii0) n(3);
        if (ii0Var == null || ii0Var2 != null) {
            ii0Var = ii0Var2;
        }
        if (ii0Var != null) {
            q(3, 1, ii0Var);
        }
        Long lH2 = jf0.h((Long) ji0Var.n(4), (Long) n(4));
        if (lH2 != null) {
            q(4, 1, lH2);
        }
        return this;
    }
}
