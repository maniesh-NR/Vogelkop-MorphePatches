package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class acc implements cr9 {
    public final /* synthetic */ jbg a;
    public final /* synthetic */ w27 b;

    public acc(jbg jbgVar, w27 w27Var) {
        this.a = jbgVar;
        this.b = w27Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Number) obj3).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            ui6.c((String) this.a.get(this.b.a), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
