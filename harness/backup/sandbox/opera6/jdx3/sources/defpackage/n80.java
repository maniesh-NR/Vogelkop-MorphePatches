package defpackage;

/* loaded from: classes.dex */
public final class n80 extends jf0 {
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
        o80 o80Var = (o80) ((n80) jf0Var).n(0);
        o80 o80Var2 = (o80) n(0);
        if (o80Var == null || o80Var2 != null) {
            o80Var = o80Var2;
        }
        if (o80Var != null) {
            q(0, 1, o80Var);
        }
        return this;
    }
}
