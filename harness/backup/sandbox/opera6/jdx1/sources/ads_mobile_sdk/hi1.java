package ads_mobile_sdk;

import defpackage.ato;
import defpackage.obp;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class hi1 implements ato {
    public final obp a;

    public hi1(obp obpVar) {
        this.a = obpVar;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        Integer intOrNull;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        String str = (String) map.get("blurRadius");
        ((mt0) this.a).a((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue(), zEquals);
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 15;
    }
}
