package defpackage;

/* loaded from: classes.dex */
public final class h80 extends jf0 {
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
        g80 g80Var = (g80) ((h80) jf0Var).n(0);
        g80 g80Var2 = (g80) n(0);
        if (g80Var == null || g80Var2 != null) {
            g80Var = g80Var2;
        }
        if (g80Var != null) {
            q(0, 1, g80Var);
        }
        return this;
    }
}
