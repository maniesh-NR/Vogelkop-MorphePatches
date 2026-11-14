package defpackage;

/* loaded from: classes.dex */
public final class xr0 extends jf0 {
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
        xr0 xr0Var = (xr0) jf0Var;
        zr0 zr0Var = (zr0) xr0Var.n(0);
        zr0 zr0Var2 = (zr0) n(0);
        if (zr0Var == null || zr0Var2 != null) {
            zr0Var = zr0Var2;
        }
        if (zr0Var != null) {
            q(0, 1, zr0Var);
        }
        as0 as0Var = (as0) xr0Var.n(1);
        as0 as0Var2 = (as0) n(1);
        if (as0Var == null || as0Var2 != null) {
            as0Var = as0Var2;
        }
        if (as0Var != null) {
            q(1, 1, as0Var);
        }
        kf0 kf0Var = (kf0) xr0Var.n(2);
        kf0 kf0Var2 = (kf0) n(2);
        if (kf0Var == null || kf0Var2 != null) {
            kf0Var = kf0Var2;
        }
        if (kf0Var != null) {
            q(2, 1, kf0Var);
        }
        return this;
    }
}
