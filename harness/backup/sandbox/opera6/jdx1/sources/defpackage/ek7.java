package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class ek7 {
    public static final dk7 a = new dk7(3, null, (byte) 0);
    public static final dk7 b = new dk7(3, null, (byte) 1);

    public static c8e a(c8e c8eVar, gk7 gk7Var, boolean z, boolean z2, cr9 cr9Var, int i) {
        fsf fsfVar = fsf.a;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        return c8eVar.d(new bk7(gk7Var, z3, z2, a, cr9Var));
    }

    public static final gk7 b(Function1 function1, ih5 ih5Var) {
        afe afeVarO = hyg.o(function1, ih5Var);
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        if (objK == hh5.a) {
            qn6 qn6Var = new qn6(new gb1(afeVarO, (byte) 12));
            vt9Var.g0(qn6Var);
            objK = qn6Var;
        }
        return (gk7) objK;
    }

    public static final long c(long j) {
        return w0h.a(Float.isNaN(i1n.b(j)) ? 0.0f : i1n.b(j), Float.isNaN(i1n.c(j)) ? 0.0f : i1n.c(j));
    }
}
