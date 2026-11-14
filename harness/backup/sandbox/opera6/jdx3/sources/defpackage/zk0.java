package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class zk0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var};
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
        zk0 zk0Var = (zk0) jf0Var;
        cl0 cl0Var = (cl0) zk0Var.n(0);
        cl0 cl0Var2 = (cl0) n(0);
        if (cl0Var == null || cl0Var2 != null) {
            cl0Var = cl0Var2;
        }
        if (cl0Var != null) {
            q(0, 1, cl0Var);
        }
        String str = (String) zk0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        Map mapL = jf0.l((Map) zk0Var.n(2), (Map) n(2));
        if (mapL != null) {
            q(2, 1, mapL);
        }
        return this;
    }
}
