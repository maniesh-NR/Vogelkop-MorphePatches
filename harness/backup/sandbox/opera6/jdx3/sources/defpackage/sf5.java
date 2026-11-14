package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class sf5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tf5 b;

    public /* synthetic */ sf5(tf5 tf5Var, byte b) {
        this.a = b;
        this.b = tf5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        tf5 tf5Var = this.b;
        byte b2 = 1;
        vt9 vt9Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rof.a(gyg.P(-1997356339, new sf5(tf5Var, b2), vt9Var2), vt9Var2, 6);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                vt9 vt9Var3 = vt9Var;
                if (vt9Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tf5Var.c.invoke(vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                break;
        }
        return Unit.a;
    }
}
