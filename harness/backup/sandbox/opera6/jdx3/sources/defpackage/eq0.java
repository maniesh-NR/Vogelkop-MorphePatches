package defpackage;

/* loaded from: classes.dex */
public final class eq0 extends jf0 {
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
        eq0 eq0Var = (eq0) jf0Var;
        dq0 dq0Var = (dq0) eq0Var.n(0);
        dq0 dq0Var2 = (dq0) n(0);
        if (dq0Var == null || dq0Var2 != null) {
            dq0Var = dq0Var2;
        }
        if (dq0Var != null) {
            q(0, 1, dq0Var);
        }
        dq0 dq0Var3 = (dq0) eq0Var.n(1);
        dq0 dq0Var4 = (dq0) n(1);
        if (dq0Var3 == null || dq0Var4 != null) {
            dq0Var3 = dq0Var4;
        }
        if (dq0Var3 != null) {
            q(1, 1, dq0Var3);
        }
        dq0 dq0Var5 = (dq0) eq0Var.n(2);
        dq0 dq0Var6 = (dq0) n(2);
        if (dq0Var5 == null || dq0Var6 != null) {
            dq0Var5 = dq0Var6;
        }
        if (dq0Var5 != null) {
            q(2, 1, dq0Var5);
        }
        dq0 dq0Var7 = (dq0) eq0Var.n(3);
        dq0 dq0Var8 = (dq0) n(3);
        if (dq0Var7 == null || dq0Var8 != null) {
            dq0Var7 = dq0Var8;
        }
        if (dq0Var7 != null) {
            q(3, 1, dq0Var7);
        }
        return this;
    }
}
