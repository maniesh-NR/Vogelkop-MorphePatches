package defpackage;

/* loaded from: classes.dex */
public final class p56 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var, ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var, df0Var, df0Var, df0Var};
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
        p56 p56Var = (p56) jf0Var;
        vb0 vb0Var = (vb0) p56Var.n(0);
        vb0 vb0Var2 = (vb0) n(0);
        if (vb0Var == null || vb0Var2 != null) {
            vb0Var = vb0Var2;
        }
        if (vb0Var != null) {
            q(0, 1, vb0Var);
        }
        kb0 kb0Var = (kb0) p56Var.n(1);
        kb0 kb0Var2 = (kb0) n(1);
        if (kb0Var == null || kb0Var2 != null) {
            kb0Var = kb0Var2;
        }
        if (kb0Var != null) {
            q(1, 1, kb0Var);
        }
        ac0 ac0Var = (ac0) p56Var.n(2);
        ac0 ac0Var2 = (ac0) n(2);
        if (ac0Var == null || ac0Var2 != null) {
            ac0Var = ac0Var2;
        }
        if (ac0Var != null) {
            q(2, 1, ac0Var);
        }
        jb0 jb0Var = (jb0) p56Var.n(3);
        jb0 jb0Var2 = (jb0) n(3);
        if (jb0Var == null || jb0Var2 != null) {
            jb0Var = jb0Var2;
        }
        if (jb0Var != null) {
            q(3, 1, jb0Var);
        }
        Long l = (Long) p56Var.n(4);
        Long l2 = (Long) n(4);
        if (l2 != null) {
            l = l2;
        }
        if (l != null) {
            q(4, 1, l);
        }
        String str = (String) p56Var.n(5);
        String str2 = (String) n(5);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(5, 1, str);
        }
        return this;
    }
}
