package ads_mobile_sdk;

import defpackage.aop;
import defpackage.cek;
import defpackage.fsg;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class aq3 implements aop {
    public final yq3 a;
    public final qr0 b;

    public aq3(yq3 yq3Var, qr0 qr0Var) {
        this.a = yq3Var;
        this.b = qr0Var;
    }

    @Override // defpackage.aop
    public final Object b(mt5 mt5Var) {
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:webview_optimize_profile:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            yq3 yq3Var = this.a;
            defpackage.na2.B(yq3Var.e, h.a, null, new fsg(new cek(yq3Var, null, (byte) 21), null, (byte) 3), 2);
        }
        return Unit.a;
    }
}
