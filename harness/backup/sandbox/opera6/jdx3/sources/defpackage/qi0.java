package defpackage;

/* loaded from: classes.dex */
public final class qi0 extends jf0 {
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
        qi0 qi0Var = (qi0) jf0Var;
        fn0 fn0Var = (fn0) qi0Var.n(0);
        fn0 fn0Var2 = (fn0) n(0);
        if (fn0Var == null || fn0Var2 != null) {
            fn0Var = fn0Var2;
        }
        if (fn0Var != null) {
            q(0, 1, fn0Var);
        }
        fn0 fn0Var3 = (fn0) qi0Var.n(1);
        fn0 fn0Var4 = (fn0) n(1);
        if (fn0Var3 == null || fn0Var4 != null) {
            fn0Var3 = fn0Var4;
        }
        if (fn0Var3 != null) {
            q(1, 1, fn0Var3);
        }
        fn0 fn0Var5 = (fn0) qi0Var.n(2);
        fn0 fn0Var6 = (fn0) n(2);
        if (fn0Var5 == null || fn0Var6 != null) {
            fn0Var5 = fn0Var6;
        }
        if (fn0Var5 != null) {
            q(2, 1, fn0Var5);
        }
        fn0 fn0Var7 = (fn0) qi0Var.n(3);
        fn0 fn0Var8 = (fn0) n(3);
        if (fn0Var7 == null || fn0Var8 != null) {
            fn0Var7 = fn0Var8;
        }
        if (fn0Var7 != null) {
            q(3, 1, fn0Var7);
        }
        return this;
    }
}
