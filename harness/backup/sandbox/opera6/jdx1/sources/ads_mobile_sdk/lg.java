package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class lg implements ato {
    public final z2 a;

    public lg(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("name");
        if (str == null) {
            xu0.c("App event with no name parameter.", null);
            return Unit.a;
        }
        px5 px5VarA = this.a.a(str, (String) map.get("info"), mt5Var);
        return px5VarA == px5.a ? px5VarA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 13;
    }
}
