package defpackage;

/* loaded from: classes.dex */
public abstract class bvf {
    public static final yi5 a = new yi5(new w5f((byte) 14));

    public static final c8e a(c8e c8eVar) {
        return c8eVar.d(new cvf());
    }

    public static final v51 b(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.W(282942128);
        w51 w51Var = (w51) vt9Var.j(a);
        if (w51Var == null) {
            vt9Var.p(false);
            return null;
        }
        boolean zF = vt9Var.f(w51Var);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            v51 v51Var = new v51(w51Var.a, w51Var.b, w51Var.c, w51Var.d);
            vt9Var.g0(v51Var);
            objK = v51Var;
        }
        v51 v51Var2 = (v51) objK;
        vt9Var.p(false);
        return v51Var2;
    }
}
