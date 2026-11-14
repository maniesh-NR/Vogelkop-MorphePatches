package defpackage;

/* loaded from: classes.dex */
public final class hq0 extends jf0 {
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
        ip0 ip0Var = (ip0) ((hq0) jf0Var).n(0);
        ip0 ip0Var2 = (ip0) n(0);
        if (ip0Var == null || ip0Var2 != null) {
            ip0Var = ip0Var2;
        }
        if (ip0Var != null) {
            q(0, 1, ip0Var);
        }
        return this;
    }
}
