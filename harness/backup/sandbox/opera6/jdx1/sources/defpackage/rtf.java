package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rtf implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ rtf(Function2 function2, byte b) {
        this.a = b;
        this.b = function2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Number) obj3).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    function2.invoke(vt9Var, 0);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    function2.invoke(vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
