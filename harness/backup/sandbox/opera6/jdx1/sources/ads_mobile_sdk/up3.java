package ads_mobile_sdk;

import defpackage.fsg;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class up3 implements wgp {
    public final Optional a;
    public final nx5 b;
    public final qr0 c;

    public up3(Optional optional, nx5 nx5Var, qr0 qr0Var) {
        this.a = optional;
        this.b = nx5Var;
        this.c = qr0Var;
    }

    public final Unit a(boolean z) {
        qr0 qr0Var = this.c;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:pause_webview_when_not_visible", Boolean.TRUE, fo.a)).booleanValue()) {
            mt5 mt5Var = null;
            cy0 cy0Var = (cy0) this.a.orElse(null);
            if (cy0Var == null) {
                return Unit.a;
            }
            byte b = 3;
            nx5 nx5Var = this.b;
            if (z) {
                defpackage.na2.B(nx5Var, h.a, null, new fsg(new gy1(cy0Var, null, (byte) 6), mt5Var, b), 2);
            } else {
                defpackage.na2.B(nx5Var, h.a, null, new fsg(new gy1(cy0Var, null, (byte) 8), mt5Var, b), 2);
            }
        }
        return Unit.a;
    }
}
