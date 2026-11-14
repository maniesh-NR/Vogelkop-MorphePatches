package defpackage;

/* loaded from: classes.dex */
public final class qs0 extends jf0 {
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
        rs0 rs0Var = (rs0) ((qs0) jf0Var).n(0);
        rs0 rs0Var2 = (rs0) n(0);
        if (rs0Var == null || rs0Var2 != null) {
            rs0Var = rs0Var2;
        }
        if (rs0Var != null) {
            q(0, 1, rs0Var);
        }
        return this;
    }
}
