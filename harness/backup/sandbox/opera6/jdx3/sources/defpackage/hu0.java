package defpackage;

/* loaded from: classes.dex */
public final class hu0 extends jf0 {
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
        gu0 gu0Var = (gu0) ((hu0) jf0Var).n(0);
        gu0 gu0Var2 = (gu0) n(0);
        if (gu0Var == null || gu0Var2 != null) {
            gu0Var = gu0Var2;
        }
        if (gu0Var != null) {
            q(0, 1, gu0Var);
        }
        return this;
    }
}
