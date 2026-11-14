package defpackage;

/* loaded from: classes.dex */
public final class y80 extends jf0 {
    public static final ef0[] f = {ef0.b};
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
        z80 z80Var = (z80) ((y80) jf0Var).n(0);
        z80 z80Var2 = (z80) n(0);
        if (z80Var == null || z80Var2 != null) {
            z80Var = z80Var2;
        }
        if (z80Var != null) {
            q(0, 1, z80Var);
        }
        return this;
    }
}
