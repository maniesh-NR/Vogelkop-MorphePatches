package defpackage;

/* loaded from: classes.dex */
public final class cm0 extends jf0 {
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
        em0 em0Var = (em0) ((cm0) jf0Var).n(0);
        em0 em0Var2 = (em0) n(0);
        if (em0Var == null || em0Var2 != null) {
            em0Var = em0Var2;
        }
        if (em0Var != null) {
            q(0, 1, em0Var);
        }
        return this;
    }
}
