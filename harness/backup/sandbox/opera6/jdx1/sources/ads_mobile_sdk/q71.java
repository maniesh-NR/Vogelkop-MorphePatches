package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class q71 implements ato {
    public final e7 a;

    public q71(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("disabled");
        ((AtomicBoolean) this.a.a).set(!(str != null && Boolean.parseBoolean(str)));
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 18;
    }
}
