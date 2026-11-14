package defpackage;

/* loaded from: classes.dex */
public final class sg0 extends jf0 {
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
        tg0 tg0Var = (tg0) ((sg0) jf0Var).n(0);
        tg0 tg0Var2 = (tg0) n(0);
        if (tg0Var == null || tg0Var2 != null) {
            tg0Var = tg0Var2;
        }
        if (tg0Var != null) {
            q(0, 1, tg0Var);
        }
        return this;
    }
}
