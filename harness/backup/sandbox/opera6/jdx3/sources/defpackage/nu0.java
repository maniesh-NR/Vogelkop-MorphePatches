package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class nu0 extends jf0 {
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
        nu0 nu0Var = (nu0) jf0Var;
        ou0 ou0Var = (ou0) nu0Var.n(0);
        ou0 ou0Var2 = (ou0) n(0);
        if (ou0Var == null || ou0Var2 != null) {
            ou0Var = ou0Var2;
        }
        if (ou0Var != null) {
            q(0, 1, ou0Var);
        }
        String str = (String) nu0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        List list = (List) nu0Var.n(2);
        List list2 = (List) n(2);
        if (list == null || list2 != null) {
            list = list2;
        }
        List list3 = list;
        if (list3 != null) {
            q(2, 1, list3);
        }
        return this;
    }
}
