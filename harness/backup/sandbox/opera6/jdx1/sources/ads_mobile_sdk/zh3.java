package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class zh3 implements ato {
    public final w12 a;

    public zh3(w12 w12Var) {
        this.a = w12Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        w12 w12Var = this.a;
        w12Var.g.getAndSet(true);
        Object objA = w12Var.a(mt5Var);
        px5 px5Var = px5.a;
        if (objA != px5Var) {
            objA = Unit.a;
        }
        return objA == px5Var ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 31;
    }
}
