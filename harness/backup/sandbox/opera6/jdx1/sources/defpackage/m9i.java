package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m9i {
    public static final o9i a = new o9i(b72.a, rbe.k);

    public static final o9i a(w62 w62Var, sd3 sd3Var, ih5 ih5Var, int i) {
        if (w62Var.equals(b72.a) && Intrinsics.a(sd3Var, rbe.k)) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(-1073830487);
            vt9Var.p(false);
            return a;
        }
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && vt9Var2.f(w62Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !vt9Var2.f(sd3Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = vt9Var2.K();
        if (z3 || objK == hh5.a) {
            objK = new o9i(w62Var, sd3Var);
            vt9Var2.g0(objK);
        }
        o9i o9iVar = (o9i) objK;
        vt9Var2.p(false);
        return o9iVar;
    }
}
