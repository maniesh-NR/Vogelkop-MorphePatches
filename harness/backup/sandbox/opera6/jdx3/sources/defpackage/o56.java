package defpackage;

/* loaded from: classes.dex */
public final class o56 extends jf0 {
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
        Long l = (Long) ((o56) jf0Var).n(0);
        Long l2 = (Long) n(0);
        if (l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(0, 1, l);
        }
        return this;
    }
}
