package defpackage;

import ads_mobile_sdk.cy0;
import ads_mobile_sdk.gy0;
import ads_mobile_sdk.ry0;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class hlp implements ato {
    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        if (map.keySet().contains("start")) {
            ry0 ry0Var = cy0Var.z;
            ry0Var = ry0Var != null ? ry0Var : null;
            ry0Var.l.incrementAndGet();
            ry0Var.d();
            return Unit.a;
        }
        if (map.keySet().contains("stop")) {
            ry0 ry0Var2 = cy0Var.z;
            ry0Var = ry0Var2 != null ? ry0Var2 : null;
            ry0Var.l.decrementAndGet();
            ry0Var.d();
            return Unit.a;
        }
        if (!map.keySet().contains("cancel")) {
            return Unit.a;
        }
        ry0 ry0Var3 = cy0Var.z;
        if (ry0Var3 == null) {
            ry0Var3 = null;
        }
        ry0Var3.k.set(true);
        na2.B(ry0Var3.c, null, null, new gy0(ry0Var3, ry0Var, (byte) 1), 3);
        ry0Var3.d();
        Unit unit = Unit.a;
        px5 px5Var = px5.a;
        return unit;
    }

    @Override // defpackage.ato
    public final int b() {
        return 8;
    }

    @Override // defpackage.ato
    public final boolean c() {
        return true;
    }
}
