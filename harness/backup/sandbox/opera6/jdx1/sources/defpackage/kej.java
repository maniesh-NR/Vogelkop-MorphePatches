package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class kej implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ kej(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ytl ytlVar = (ytl) obj;
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((vt9) ih5Var).f(ytlVar) : ((vt9) ih5Var).h(ytlVar) ? 4 : 2;
                }
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    wtl.a(ytlVar, null, 0.0f, null, 0L, 0L, gyg.P(-999924215, new o31(this.b, (byte) 7), vt9Var), vt9Var, (iIntValue & 14) | 805306368);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ijl.b(this.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, vt9Var2, 0, 0, 262142);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
