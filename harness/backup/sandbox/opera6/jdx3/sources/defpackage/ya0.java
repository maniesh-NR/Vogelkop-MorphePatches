package defpackage;

/* loaded from: classes.dex */
public final class ya0 extends jf0 {
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
        p90 p90Var = (p90) ((ya0) jf0Var).n(0);
        p90 p90Var2 = (p90) n(0);
        if (p90Var == null || p90Var2 != null) {
            p90Var = p90Var2;
        }
        if (p90Var != null) {
            q(0, 1, p90Var);
        }
        return this;
    }
}
