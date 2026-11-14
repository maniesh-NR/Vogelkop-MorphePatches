package defpackage;

/* loaded from: classes.dex */
public final class qj0 extends jf0 {
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
        vd0 vd0Var = (vd0) ((qj0) jf0Var).n(0);
        vd0 vd0Var2 = (vd0) n(0);
        if (vd0Var == null || vd0Var2 != null) {
            vd0Var = vd0Var2;
        }
        if (vd0Var != null) {
            q(0, 1, vd0Var);
        }
        return this;
    }
}
