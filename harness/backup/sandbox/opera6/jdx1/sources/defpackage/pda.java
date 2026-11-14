package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pda implements dr9 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;

    public pda(List list, Function1 function1) {
        this.a = list;
        this.b = function1;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        y4c y4cVar = (y4c) obj;
        int iIntValue = ((Number) obj2).intValue();
        ih5 ih5Var = (ih5) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((vt9) ih5Var).f(y4cVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((vt9) ih5Var).d(iIntValue) ? 32 : 16;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(i & 1, (i & 147) != 146)) {
            hea heaVar = (hea) this.a.get(iIntValue);
            vt9Var.W(-1195107368);
            Function1 function1 = this.b;
            boolean zF = vt9Var.f(function1) | vt9Var.h(heaVar);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                objK = new px6(function1, heaVar, (byte) 1);
                vt9Var.g0(objK);
            }
            y9m.g(heaVar, (Function0) objK, a26.Z(z7e.b, 16.0f, 0.0f, 2), vt9Var, 392);
            vt9Var.p(false);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
