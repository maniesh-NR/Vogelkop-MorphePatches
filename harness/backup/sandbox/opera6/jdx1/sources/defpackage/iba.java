package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class iba {
    public static final c67 a = new c67((Function2) new nf8((byte) 7), (Function1) new q9a((byte) 3));
    public static final hp7 b = new hp7(new be8((byte) 16), (byte) 0);

    public static final void a(dg5 dg5Var, ue5 ue5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1110033181);
        int i2 = (vt9Var.f(dg5Var) ? 4 : 2) | i;
        boolean z = true;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            if ((((i2 & 14) ^ 6) <= 4 || !vt9Var.h(dg5Var)) && (i2 & 6) != 4) {
                z = false;
            }
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                objK = new al7(dg5Var, (byte) 21);
                vt9Var.g0(objK);
            }
            kfo.c(b.a((hba) w1h.u(objArr, a, (Function0) objK, vt9Var, 0)), gyg.P(1213858211, new bg5(ue5Var, (byte) 3), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(dg5Var, ue5Var, i, (byte) 28);
        }
    }
}
