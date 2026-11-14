package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class im1 implements ato {
    public final bn0 a;
    public final a2 b;

    public im1(bn0 bn0Var, a2 a2Var) {
        this.a = bn0Var;
        this.b = a2Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str;
        String str2 = (String) map.get("eventName");
        if (str2 != null && (str = (String) map.get("eventId")) != null) {
            ym0 ym0Var = ym0.b;
            if (!str2.equals("_ac")) {
                ym0Var = ym0.c;
                if (!str2.equals("_ai")) {
                    return Unit.a;
                }
            }
            Bundle bundle = this.b.q;
            bn0 bn0Var = this.a;
            bn0Var.getClass();
            px5 px5VarA = bn0.a(bn0Var, ym0Var, bundle, str);
            return px5VarA == px5.a ? px5VarA : Unit.a;
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 49;
    }
}
