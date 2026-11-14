package defpackage;

/* loaded from: classes.dex */
public final class du0 extends jf0 {
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
        cu0 cu0Var = (cu0) ((du0) jf0Var).n(0);
        cu0 cu0Var2 = (cu0) n(0);
        if (cu0Var == null || cu0Var2 != null) {
            cu0Var = cu0Var2;
        }
        if (cu0Var != null) {
            q(0, 1, cu0Var);
        }
        return this;
    }
}
