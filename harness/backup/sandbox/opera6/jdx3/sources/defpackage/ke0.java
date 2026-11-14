package defpackage;

/* loaded from: classes.dex */
public final class ke0 extends jf0 {
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
        ke0 ke0Var = (ke0) jf0Var;
        Boolean bool = (Boolean) ke0Var.n(0);
        Boolean bool2 = (Boolean) n(0);
        if (bool == null || bool2 != null) {
            bool = bool2;
        }
        if (bool != null) {
            q(0, 1, bool);
        }
        String str = (String) ke0Var.n(1);
        String str2 = (String) n(1);
        if (str == null || str2 != null) {
            str = str2;
        }
        if (str != null) {
            q(1, 1, str);
        }
        le0 le0Var = (le0) ke0Var.n(2);
        le0 le0Var2 = (le0) n(2);
        if (le0Var == null || le0Var2 != null) {
            le0Var = le0Var2;
        }
        if (le0Var != null) {
            q(2, 1, le0Var);
        }
        je0 je0Var = (je0) ke0Var.n(3);
        je0 je0Var2 = (je0) n(3);
        if (je0Var == null || je0Var2 != null) {
            je0Var = je0Var2;
        }
        if (je0Var != null) {
            q(3, 1, je0Var);
        }
        return this;
    }
}
