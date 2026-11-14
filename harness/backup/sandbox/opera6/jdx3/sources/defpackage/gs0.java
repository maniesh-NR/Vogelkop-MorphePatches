package defpackage;

/* loaded from: classes.dex */
public final class gs0 extends jf0 {
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
        hs0 hs0Var = (hs0) ((gs0) jf0Var).n(0);
        hs0 hs0Var2 = (hs0) n(0);
        if (hs0Var == null || hs0Var2 != null) {
            hs0Var = hs0Var2;
        }
        if (hs0Var != null) {
            q(0, 1, hs0Var);
        }
        return this;
    }
}
