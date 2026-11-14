package defpackage;

/* loaded from: classes.dex */
public final class jm0 extends jf0 {
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
        gm0 gm0Var = (gm0) ((jm0) jf0Var).n(0);
        gm0 gm0Var2 = (gm0) n(0);
        if (gm0Var == null || gm0Var2 != null) {
            gm0Var = gm0Var2;
        }
        if (gm0Var != null) {
            q(0, 1, gm0Var);
        }
        return this;
    }
}
