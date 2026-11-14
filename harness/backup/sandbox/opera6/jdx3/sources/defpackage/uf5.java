package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class uf5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vf5 b;

    public /* synthetic */ uf5(vf5 vf5Var, byte b) {
        this.a = b;
        this.b = vf5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        vf5 vf5Var = this.b;
        byte b2 = 1;
        vt9 vt9Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rof.a(gyg.P(1833829039, new uf5(vf5Var, b2), vt9Var2), vt9Var2, 6);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                vt9 vt9Var3 = vt9Var;
                if (vt9Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = vt9Var3.h(vf5Var);
                    Object objK = vt9Var3.K();
                    if (zH || objK == hh5.a) {
                        objK = new r94(vf5Var, (byte) 11);
                        vt9Var3.g0(objK);
                    }
                    vf5Var.g0((Function0) objK, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
