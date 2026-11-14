package defpackage;

/* loaded from: classes.dex */
public final class v56 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.e;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, new df0(-1, 0L, jf0.c(0L)), new df0(-1, 0L, jf0.c(0L)), new df0(-1, 0, jf0.c(0)), df0Var, df0Var, df0Var, new df0(-1, 0L, jf0.c(0L)), df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        v56 v56Var = (v56) jf0Var;
        String str = (String) v56Var.n(0);
        String str2 = (String) n(0);
        if (str == null) {
            str = str2;
        }
        if (str != null) {
            q(0, 1, str);
        }
        fk0 fk0Var = (fk0) jf0.f((fk0) v56Var.n(1), (fk0) n(1));
        if (fk0Var != null) {
            q(1, 1, fk0Var);
        }
        Long l = (Long) v56Var.n(2);
        Long l2 = (Long) n(2);
        if (l == null) {
            l = l2;
        }
        if (l != null) {
            q(2, -1, l);
        }
        Long l3 = (Long) v56Var.n(3);
        Long l4 = (Long) n(3);
        if (l4 != null) {
            l3 = l4;
        }
        if (l3 != null) {
            q(3, -1, l3);
        }
        Integer num = (Integer) v56Var.n(4);
        Integer num2 = (Integer) n(4);
        if (num == null || num2 != null) {
            num = num2;
        }
        if (num != null) {
            q(4, -1, num);
        }
        String str3 = (String) v56Var.n(5);
        String str4 = (String) n(5);
        if (str3 == null || str4 != null) {
            str3 = str4;
        }
        if (str3 != null) {
            q(5, 1, str3);
        }
        Long l5 = (Long) v56Var.n(6);
        Long l6 = (Long) n(6);
        if (l5 == null || l6 != null) {
            l5 = l6;
        }
        if (l5 != null) {
            q(6, 1, l5);
        }
        Long l7 = (Long) v56Var.n(7);
        Long l8 = (Long) n(7);
        if (l7 == null || l8 != null) {
            l7 = l8;
        }
        if (l7 != null) {
            q(7, 1, l7);
        }
        Long l9 = (Long) v56Var.n(8);
        Long l10 = (Long) n(8);
        if (l9 == null || l10 != null) {
            l9 = l10;
        }
        if (l9 != null) {
            q(8, -1, l9);
        }
        Long l11 = (Long) v56Var.n(9);
        if (l11 != null) {
            q(9, 1, l11);
        }
        String str5 = (String) v56Var.n(10);
        String str6 = (String) n(10);
        if (str5 == null || str6 != null) {
            str5 = str6;
        }
        if (str5 != null) {
            q(10, 1, str5);
        }
        Boolean bool = (Boolean) v56Var.n(11);
        Boolean bool2 = (Boolean) n(11);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(11, 1, bool);
        }
        Boolean bool3 = (Boolean) v56Var.n(12);
        Boolean bool4 = (Boolean) n(12);
        if (bool3 == null || bool4 != null) {
            bool3 = bool4;
        }
        if (bool3 != null) {
            q(12, 1, bool3);
        }
        ob0 ob0Var = (ob0) jf0.f((ob0) v56Var.n(13), (ob0) n(13));
        if (ob0Var != null) {
            q(13, 1, ob0Var);
        }
        rf0 rf0Var = (rf0) jf0.f((rf0) v56Var.n(14), (rf0) n(14));
        if (rf0Var != null) {
            q(14, 1, rf0Var);
        }
        hn0 hn0Var = (hn0) jf0.f((hn0) v56Var.n(15), (hn0) n(15));
        if (hn0Var != null) {
            q(15, 1, hn0Var);
        }
        qr0 qr0Var = (qr0) jf0.f((qr0) v56Var.n(16), (qr0) n(16));
        if (qr0Var != null) {
            q(16, 1, qr0Var);
        }
        ks0 ks0Var = (ks0) jf0.f((ks0) v56Var.n(17), (ks0) n(17));
        if (ks0Var != null) {
            q(17, 1, ks0Var);
        }
        pd0 pd0Var = (pd0) jf0.f((pd0) v56Var.n(18), (pd0) n(18));
        if (pd0Var != null) {
            q(18, 1, pd0Var);
        }
        return this;
    }

    public final void x(int i, String str) {
        if (i == 0) {
            q(i, str != null ? 1 : 0, str);
            return;
        }
        if (i == 5) {
            q(i, str != null ? 1 : 0, str);
        } else if (i != 10) {
            q(i, 1, str);
        } else {
            q(i, str != null ? 1 : 0, str);
        }
    }
}
