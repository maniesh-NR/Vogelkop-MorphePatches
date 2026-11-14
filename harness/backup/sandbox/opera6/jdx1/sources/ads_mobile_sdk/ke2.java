package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ke2 implements ato {
    public final xq0 a;

    public ke2(xq0 xq0Var) {
        this.a = xq0Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("key");
        String str2 = (String) map.get("state");
        if (str == null || str.length() == 0) {
            return Unit.a;
        }
        xq0 xq0Var = this.a;
        xq0Var.getClass();
        Object objA = xq0.a(xq0Var, str, str2, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 54;
    }
}
