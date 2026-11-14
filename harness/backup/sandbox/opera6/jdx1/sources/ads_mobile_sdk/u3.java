package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.ato;
import defpackage.ufp;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class u3 implements ato {
    public final w3 a;
    public final ufp b;

    public u3(w3 w3Var, ufp ufpVar) {
        this.a = w3Var;
        this.b = ufpVar;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("info");
        if (str == null) {
            str = "";
        }
        Bundle bundleA = bw2.a(str);
        if (bundleA == null) {
            xh3.a("Unable to parse ad metadata info: ".concat(str), null, 6);
            return Unit.a;
        }
        this.a.a.setValue(w3.b[0], bundleA);
        Object objA = this.b.a(bundleA, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 20;
    }
}
