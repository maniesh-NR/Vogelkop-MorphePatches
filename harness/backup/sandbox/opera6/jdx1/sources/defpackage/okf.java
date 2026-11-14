package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class okf implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ikl c;

    public /* synthetic */ okf(String str, ikl iklVar, byte b) {
        this.a = b;
        this.b = str;
        this.c = iklVar;
    }

    public /* synthetic */ okf(String str, ikl iklVar, int i) {
        this.a = (byte) 2;
        this.b = str;
        this.c = iklVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ikl iklVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ijl.b(this.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, this.c, vt9Var, 0, 0, 131070);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zi4.h(str, iklVar, vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                zi4.h(str, iklVar, (ih5) obj, aoh.m(1));
                break;
            default:
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zi4.h(str, iklVar, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
