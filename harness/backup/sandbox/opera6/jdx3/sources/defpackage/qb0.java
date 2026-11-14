package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class qb0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        qb0 qb0Var = (qb0) jf0Var;
        Long l = (Long) qb0Var.n(0);
        Long l2 = (Long) n(0);
        if (l == null || l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(0, 1, l);
        }
        String str = (String) qb0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        List list = (List) qb0Var.n(2);
        List list2 = (List) n(2);
        if (list == null || list2 != null) {
            list = list2;
        }
        List list3 = list;
        if (list3 != null) {
            q(2, 1, list3);
        }
        Boolean bool = (Boolean) qb0Var.n(3);
        Boolean bool2 = (Boolean) n(3);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(3, 1, bool);
        }
        Long l3 = (Long) qb0Var.n(4);
        Long l4 = (Long) n(4);
        if (l3 == null || l4 != null) {
            l3 = l4;
        }
        if (l3 != null) {
            q(4, 1, l3);
        }
        Long l5 = (Long) qb0Var.n(5);
        Long l6 = (Long) n(5);
        if (l5 == null || l6 != null) {
            l5 = l6;
        }
        if (l5 != null) {
            q(5, 1, l5);
        }
        String str3 = (String) qb0Var.n(6);
        String str4 = (String) n(6);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(6, 1, str3);
        }
        return this;
    }
}
