package ads_mobile_sdk;

import defpackage.ato;
import defpackage.llp;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class xr2 implements ato {
    public final llp a;

    public xr2(llp llpVar) {
        this.a = llpVar;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        Object objB;
        String str = (String) map.get("action");
        boolean zEquals = "pause".equals(str);
        llp llpVar = this.a;
        if (!zEquals) {
            return ("resume".equals(str) && (objB = llpVar.b(true, mt5Var)) == px5.a) ? objB : Unit.a;
        }
        Object objA = llpVar.a(true, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 7;
    }
}
