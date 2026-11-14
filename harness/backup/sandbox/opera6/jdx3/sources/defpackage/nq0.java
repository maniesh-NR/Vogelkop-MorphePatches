package defpackage;

/* loaded from: classes.dex */
public final class nq0 extends jf0 {
    public static final ef0[] f = {ef0.e};
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
        mq0 mq0Var = (mq0) ((nq0) jf0Var).n(0);
        mq0 mq0Var2 = (mq0) n(0);
        if (mq0Var == null || mq0Var2 != null) {
            mq0Var = mq0Var2;
        }
        if (mq0Var != null) {
            q(0, 1, mq0Var);
        }
        return this;
    }
}
