package defpackage;

/* loaded from: classes.dex */
public final class sf0 extends jf0 {
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
        Integer numG = jf0.g((Integer) ((sf0) jf0Var).n(0), (Integer) n(0));
        if (numG != null) {
            q(0, 1, numG);
        }
        return this;
    }
}
