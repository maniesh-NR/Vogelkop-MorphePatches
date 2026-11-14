package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class c23 implements ato {
    public final ha2 a;

    public c23(ha2 ha2Var) {
        this.a = ha2Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("enabled");
        if (!kotlin.text.c.m(str, "true", true) && !kotlin.text.c.m(str, "false", true)) {
            return Unit.a;
        }
        ha2 ha2Var = this.a;
        boolean z = Boolean.parseBoolean(str);
        ha2Var.getClass();
        try {
            hz0 hz0Var = (hz0) ha2Var.e.getValue();
            hz0Var.getClass();
            synchronized (hz0.class) {
                hz0Var.a.a(Boolean.valueOf(z), "paidv2_user_option");
            }
        } catch (Exception e) {
            xh3.a("Exception while setting GpidV2 UserOption", e, 4);
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 28;
    }
}
