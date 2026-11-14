package defpackage;

/* loaded from: classes.dex */
public final class fp0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        Float fValueOf = Float.valueOf(0.0f);
        g = new df0[]{new df0(-1, fValueOf, jf0.c(fValueOf)), new df0(-1, 0, jf0.c(0)), new df0(-1, 0, jf0.c(0)), df0.d};
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
        fp0 fp0Var = (fp0) jf0Var;
        Float f2 = (Float) fp0Var.n(0);
        Float f3 = (Float) n(0);
        if (f2 == null || f3 != null) {
            f2 = f3;
        }
        if (f2 != null) {
            q(0, -1, f2);
        }
        Integer num = (Integer) fp0Var.n(1);
        Integer num2 = (Integer) n(1);
        if (num == null || num2 != null) {
            num = num2;
        }
        if (num != null) {
            q(1, -1, num);
        }
        Integer num3 = (Integer) fp0Var.n(2);
        Integer num4 = (Integer) n(2);
        if (num3 == null || num4 != null) {
            num3 = num4;
        }
        if (num3 != null) {
            q(2, -1, num3);
        }
        ne0 ne0Var = (ne0) fp0Var.n(3);
        ne0 ne0Var2 = (ne0) n(3);
        if (ne0Var == null || ne0Var2 != null) {
            ne0Var = ne0Var2;
        }
        if (ne0Var != null) {
            q(3, 1, ne0Var);
        }
        return this;
    }
}
