package defpackage;

/* loaded from: classes.dex */
public final class e90 extends jf0 {
    public static final ef0[] f = {ef0.b};
    public static final df0[] g = {df0.d};

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
        d90 d90Var = (d90) ((e90) jf0Var).n(0);
        d90 d90Var2 = (d90) n(0);
        if (d90Var == null || d90Var2 != null) {
            d90Var = d90Var2;
        }
        if (d90Var != null) {
            q(0, 1, d90Var);
        }
        return this;
    }
}
