package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class a41 implements ato {
    public final ek a;

    public a41(ek ekVar) {
        this.a = ekVar;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("key");
        String str2 = (String) map.get("value");
        if (str == null || str.length() == 0) {
            return Unit.a;
        }
        ek ekVar = this.a;
        ekVar.getClass();
        Object objA = ek.a(ekVar, str, str2, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 53;
    }
}
