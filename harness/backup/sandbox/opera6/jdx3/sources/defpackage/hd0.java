package defpackage;

/* loaded from: classes.dex */
public final class hd0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
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
        hd0 hd0Var = (hd0) jf0Var;
        String str = (String) hd0Var.n(0);
        String str2 = (String) n(0);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        Long l = (Long) hd0Var.n(1);
        Long l2 = (Long) n(1);
        if (l == null || l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(1, 1, l);
        }
        Long l3 = (Long) hd0Var.n(2);
        Long l4 = (Long) n(2);
        if (l3 == null || l4 != null) {
            l3 = l4;
        }
        if (l3 != null) {
            q(2, 1, l3);
        }
        String str3 = (String) hd0Var.n(3);
        String str4 = (String) n(3);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(3, 1, str3);
        }
        return this;
    }

    public final void x(hd0 hd0Var) {
        if (n(0) != null) {
            hd0Var.q(0, 1, (String) n(0));
        }
        if (n(1) != null) {
            hd0Var.q(1, 1, (Long) n(1));
        }
        if (n(2) != null) {
            hd0Var.q(2, 1, (Long) n(2));
        }
        if (n(3) != null) {
            hd0Var.q(3, 1, (String) n(3));
        }
    }

    public final void y(int i, String str) {
        if (i == 0) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 3) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
