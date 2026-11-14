package defpackage;

/* loaded from: classes.dex */
public final class fj0 extends jf0 {
    public static final ef0[] f = {ef0.e};
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
        gj0 gj0Var = (gj0) ((fj0) jf0Var).n(0);
        gj0 gj0Var2 = (gj0) n(0);
        if (gj0Var == null || gj0Var2 != null) {
            gj0Var = gj0Var2;
        }
        if (gj0Var != null) {
            q(0, 1, gj0Var);
        }
        return this;
    }
}
