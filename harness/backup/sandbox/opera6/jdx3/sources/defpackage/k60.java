package defpackage;

/* loaded from: classes.dex */
public final class k60 extends jf0 {
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
        l60 l60Var = (l60) ((k60) jf0Var).n(0);
        l60 l60Var2 = (l60) n(0);
        if (l60Var == null || l60Var2 != null) {
            l60Var = l60Var2;
        }
        if (l60Var != null) {
            q(0, 1, l60Var);
        }
        return this;
    }
}
