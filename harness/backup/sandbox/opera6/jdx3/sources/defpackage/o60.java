package defpackage;

/* loaded from: classes.dex */
public final class o60 extends jf0 {
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
        p60 p60Var = (p60) ((o60) jf0Var).n(0);
        p60 p60Var2 = (p60) n(0);
        if (p60Var == null || p60Var2 != null) {
            p60Var = p60Var2;
        }
        if (p60Var != null) {
            q(0, 1, p60Var);
        }
        return this;
    }
}
