package ads_mobile_sdk;

import defpackage.r3p;
import java.util.Optional;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class t12 implements r3p {
    public final bq1 a;
    public final Optional b;
    public final nx5 c;

    public t12(bq1 bq1Var, Optional optional, nx5 nx5Var) {
        this.a = bq1Var;
        this.b = optional;
        this.c = nx5Var;
    }

    @Override // defpackage.r3p
    public final Object b(nn3 nn3Var, mt5 mt5Var) {
        mt5 mt5Var2 = null;
        cy0 cy0Var = (cy0) this.b.orElse(null);
        if (cy0Var == null) {
            return Unit.a;
        }
        pn3 pn3Var = nn3Var.a;
        if (pn3Var == pn3.a || pn3Var == pn3.b) {
            defpackage.na2.B(this.c, null, null, new zj((Object) this, (Object) cy0Var, mt5Var2, (byte) 4), 3);
        }
        return Unit.a;
    }
}
