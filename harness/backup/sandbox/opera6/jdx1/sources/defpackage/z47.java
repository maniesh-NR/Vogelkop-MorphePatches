package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class z47 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qsj b;

    public /* synthetic */ z47(qsj qsjVar, byte b) {
        this.a = b;
        this.b = qsjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        qsj qsjVar = this.b;
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aoh.b(qsjVar, null, null, vt9Var, 0);
                } else {
                    vt9Var.Q();
                }
                break;
            case 1:
                vt9 vt9Var2 = (vt9) ih5Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aoh.b(qsjVar, null, null, vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                break;
            case 2:
                vt9 vt9Var3 = (vt9) ih5Var;
                if (vt9Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aoh.b(qsjVar, null, null, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
            case 3:
                vt9 vt9Var4 = (vt9) ih5Var;
                if (vt9Var4.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aoh.b(qsjVar, null, null, vt9Var4, 0);
                } else {
                    vt9Var4.Q();
                }
                break;
            case 4:
                vt9 vt9Var5 = (vt9) ih5Var;
                if (vt9Var5.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aoh.b(qsjVar, null, null, vt9Var5, 0);
                } else {
                    vt9Var5.Q();
                }
                break;
            case 5:
                vt9 vt9Var6 = (vt9) ih5Var;
                if (vt9Var6.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aoh.b(qsjVar, null, null, vt9Var6, 0);
                } else {
                    vt9Var6.Q();
                }
                break;
            default:
                vt9 vt9Var7 = (vt9) ih5Var;
                if (vt9Var7.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aoh.b(qsjVar, null, null, vt9Var7, 6);
                } else {
                    vt9Var7.Q();
                }
                break;
        }
        return Unit.a;
    }
}
