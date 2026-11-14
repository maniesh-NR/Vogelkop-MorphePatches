package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ag5 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ rn9 b;
    public final /* synthetic */ ue5 c;

    public /* synthetic */ ag5(rn9 rn9Var, ue5 ue5Var) {
        this.b = rn9Var;
        this.c = ue5Var;
    }

    public /* synthetic */ ag5(rn9 rn9Var, ue5 ue5Var, int i) {
        this.b = rn9Var;
        this.c = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ue5 ue5Var = this.c;
        rn9 rn9Var = this.b;
        vt9 vt9Var = (ih5) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rn9Var.b(ue5Var, vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                num.getClass();
                rn9Var.b(ue5Var, vt9Var, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
