package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rs5 {
    public final puj a = new puj();

    public static void b(rs5 rs5Var, Function2 function2, ue5 ue5Var, Function0 function0, int i) {
        if ((i & 8) != 0) {
            ue5Var = null;
        }
        rs5Var.a.add(new ue5(-1789283891, new l5c(function2, rs5Var, ue5Var, function0), true));
    }

    public final void a(is5 is5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-798501095);
        int i2 = (vt9Var.f(is5Var) ? 4 : 2) | i | (vt9Var.f(this) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            puj pujVar = this.a;
            int size = pujVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((cr9) pujVar.get(i3)).invoke(is5Var, vt9Var, Integer.valueOf(i2 & 14));
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(this, is5Var, i, (byte) 19);
        }
    }
}
