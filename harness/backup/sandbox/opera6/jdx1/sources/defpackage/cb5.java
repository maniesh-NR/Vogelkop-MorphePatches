package defpackage;

/* loaded from: classes.dex */
public abstract class cb5 {
    public static final db5 a = new db5(b72.c, rbe.n);

    public static final db5 a(z62 z62Var, rd3 rd3Var, ih5 ih5Var, int i) {
        if (z62Var.equals(b72.c) && rd3Var.equals(rbe.n)) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(-1446604504);
            vt9Var.p(false);
            return a;
        }
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && vt9Var2.f(z62Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !vt9Var2.f(rd3Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = vt9Var2.K();
        if (z3 || objK == hh5.a) {
            objK = new db5(z62Var, rd3Var);
            vt9Var2.g0(objK);
        }
        db5 db5Var = (db5) objK;
        vt9Var2.p(false);
        return db5Var;
    }
}
