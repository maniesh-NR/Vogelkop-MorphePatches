package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class yr0 implements ato {
    public final nx5 a;

    public yr0(nx5 nx5Var) {
        this.a = nx5Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        int i;
        String str = (String) map.get("height");
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull != null) {
            synchronized (cy0Var) {
                i = cy0Var.t;
            }
            if (i != intOrNull.intValue()) {
                int iIntValue = intOrNull.intValue();
                synchronized (cy0Var) {
                    cy0Var.t = iIntValue;
                }
                xh3.a(this.a, new gy1(cy0Var, null, (byte) 10));
            }
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 55;
    }
}
