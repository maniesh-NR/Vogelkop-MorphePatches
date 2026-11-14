package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class dy4 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ue5 c;

    public /* synthetic */ dy4(long j, ue5 ue5Var, byte b) {
        this.a = b;
        this.b = j;
        this.c = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ue5 ue5Var = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Number) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kfo.c(aq5.a.a(new u95(j)), ue5Var, vt9Var, 8);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hn9.d(j, ue5Var, vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    hn9.d(j, ue5Var, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
