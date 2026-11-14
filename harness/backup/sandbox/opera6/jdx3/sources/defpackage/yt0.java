package defpackage;

/* loaded from: classes.dex */
public final class yt0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var};
    }

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
        yt0 yt0Var = (yt0) jf0Var;
        Object obj = (zt0) yt0Var.n(0);
        Object obj2 = (zt0) n(0);
        if (obj == null || obj2 != null) {
            obj = obj2;
        }
        if (obj != null) {
            q(0, 1, obj);
        }
        Object obj3 = (q90) yt0Var.n(1);
        Object obj4 = (q90) n(1);
        if (obj3 == null || obj4 != null) {
            obj3 = obj4;
        }
        if (obj3 != null) {
            q(1, 1, obj3);
        }
        Double dValueOf = (Double) yt0Var.n(2);
        Double d = (Double) n(2);
        if (dValueOf == null) {
            dValueOf = d;
        } else if (d != null) {
            dValueOf = Double.valueOf(d.doubleValue() + dValueOf.doubleValue());
        }
        if (dValueOf != null) {
            q(2, 1, dValueOf);
        }
        Object obj5 = (Boolean) yt0Var.n(3);
        Object obj6 = (Boolean) n(3);
        if (obj5 == null || obj6 != null) {
            obj5 = obj6;
        }
        if (obj5 != null) {
            q(3, 1, obj5);
        }
        return this;
    }
}
