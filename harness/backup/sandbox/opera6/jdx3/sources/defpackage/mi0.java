package defpackage;

/* loaded from: classes.dex */
public final class mi0 extends jf0 {
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
        li0 li0Var = (li0) ((mi0) jf0Var).n(0);
        li0 li0Var2 = (li0) n(0);
        if (li0Var == null || li0Var2 != null) {
            li0Var = li0Var2;
        }
        if (li0Var != null) {
            q(0, 1, li0Var);
        }
        return this;
    }
}
