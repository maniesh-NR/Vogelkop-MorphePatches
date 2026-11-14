package defpackage;

/* loaded from: classes.dex */
public final class mg0 extends jf0 {
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
        ng0 ng0Var = (ng0) ((mg0) jf0Var).n(0);
        ng0 ng0Var2 = (ng0) n(0);
        if (ng0Var == null || ng0Var2 != null) {
            ng0Var = ng0Var2;
        }
        if (ng0Var != null) {
            q(0, 1, ng0Var);
        }
        return this;
    }
}
