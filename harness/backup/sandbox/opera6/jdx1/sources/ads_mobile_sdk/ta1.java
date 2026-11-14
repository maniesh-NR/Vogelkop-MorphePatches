package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ta1 implements ato {
    public final d91 a;

    public ta1(d91 d91Var) {
        this.a = d91Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) throws Throwable {
        String str = (String) map.get("persistentData");
        if (str != null && !StringsKt.N(str)) {
            d91 d91Var = this.a;
            d91Var.getClass();
            Object objB = d91.b(d91Var, str, mt5Var);
            return objB == px5.a ? objB : Unit.a;
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 42;
    }
}
