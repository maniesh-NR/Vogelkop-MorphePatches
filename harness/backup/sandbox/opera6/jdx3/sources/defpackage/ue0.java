package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ue0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0.b, ef0Var, ef0Var};
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
        ue0 ue0Var = (ue0) jf0Var;
        Integer numG = jf0.g((Integer) ue0Var.n(0), (Integer) n(0));
        if (numG != null) {
            q(0, 1, numG);
        }
        Integer numG2 = jf0.g((Integer) ue0Var.n(1), (Integer) n(1));
        if (numG2 != null) {
            q(1, 1, numG2);
        }
        Integer numG3 = jf0.g((Integer) ue0Var.n(2), (Integer) n(2));
        if (numG3 != null) {
            q(2, 1, numG3);
        }
        Map mapL = jf0.l((Map) ue0Var.n(3), (Map) n(3));
        if (mapL != null) {
            q(3, 1, mapL);
        }
        return this;
    }
}
