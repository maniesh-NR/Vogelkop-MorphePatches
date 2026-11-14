package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class j80 implements ato {
    public final z2 a;

    public j80(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("asset");
        if (str == null || str.length() == 0) {
            xh3.a("No asset name provided in custom click GMSG.", null, 6);
            return Unit.a;
        }
        px5 px5VarA = this.a.a(str, mt5Var);
        return px5VarA == px5.a ? px5VarA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 35;
    }
}
