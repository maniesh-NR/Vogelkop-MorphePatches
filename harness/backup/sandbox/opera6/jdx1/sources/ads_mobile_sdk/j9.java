package ads_mobile_sdk;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class j9 implements rko {
    public final g9 a;
    public final defpackage.r83 b;

    public j9(g9 g9Var, defpackage.r83 r83Var) {
        this.a = g9Var;
        this.b = r83Var;
    }

    public final Object n(mt5 mt5Var) {
        g9 g9Var = this.a;
        String strM = this.b.m();
        if (strM != null) {
            synchronized (g9Var.a) {
                Integer num = (Integer) g9Var.b.get(strM);
                if (num == null) {
                    num = 0;
                }
                g9Var.b.put(strM, Integer.valueOf(num.intValue() + 1));
            }
        } else {
            g9Var.getClass();
        }
        return Unit.a;
    }
}
