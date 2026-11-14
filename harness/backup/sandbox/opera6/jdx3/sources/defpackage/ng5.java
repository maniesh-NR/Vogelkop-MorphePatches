package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ng5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pg5 b;

    public /* synthetic */ ng5(pg5 pg5Var, byte b) {
        this.a = b;
        this.b = pg5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        pg5 pg5Var = this.b;
        byte b2 = 1;
        vt9 vt9Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rof.a(gyg.P(1179146059, new ng5(pg5Var, b2), vt9Var2), vt9Var2, 6);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                vt9 vt9Var3 = vt9Var;
                if (vt9Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wyh.a((rg5) pg5Var.d, (ue5) pg5Var.e, vt9Var3, 8);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
