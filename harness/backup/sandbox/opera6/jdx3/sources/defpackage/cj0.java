package defpackage;

/* loaded from: classes.dex */
public final class cj0 extends jf0 {
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
        Boolean bool = (Boolean) ((cj0) jf0Var).n(0);
        Boolean bool2 = (Boolean) n(0);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(0, 1, bool);
        }
        return this;
    }
}
