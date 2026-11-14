package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i24 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i24(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
        this.d = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j7h.a(this.b, ((wam) vt9Var.j(abm.a)).m, gyg.P(417635459, new ub3(obj4, (br9) obj3, b2), vt9Var), vt9Var, 384);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                nsj nsjVar = (nsj) obj4;
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zvf zvfVar = b24.a;
                    z14 z14VarG = b24.g(this.b, vt9Var2);
                    boolean zF = vt9Var2.f(nsjVar);
                    Object objK = vt9Var2.K();
                    if (zF || objK == hh5.a) {
                        objK = new lsj(nsjVar, (byte) 1);
                        vt9Var2.g0(objK);
                    }
                    yi4.k((Function0) objK, (c8e) null, false, (paj) null, z14VarG, (zvf) null, gyg.P(521110564, new kej((String) obj3, b2), vt9Var2), vt9Var2, 805306368, 494);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    hn9.c(this.b, (ikl) obj4, (ue5) obj3, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
