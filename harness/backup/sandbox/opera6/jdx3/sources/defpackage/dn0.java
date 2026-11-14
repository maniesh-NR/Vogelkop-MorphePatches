package defpackage;

/* loaded from: classes.dex */
public final class dn0 extends jf0 {
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
        en0 en0Var = (en0) ((dn0) jf0Var).n(0);
        en0 en0Var2 = (en0) n(0);
        if (en0Var == null || en0Var2 != null) {
            en0Var = en0Var2;
        }
        if (en0Var != null) {
            q(0, 1, en0Var);
        }
        return this;
    }
}
