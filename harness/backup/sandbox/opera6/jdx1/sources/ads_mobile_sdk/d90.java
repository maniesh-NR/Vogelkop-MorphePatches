package ads_mobile_sdk;

import defpackage.aop;
import defpackage.fsg;
import defpackage.r7p;
import defpackage.u6k;
import defpackage.xzh;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class d90 extends k61 implements aop, r7p, rko {
    public final b90 c;
    public final nx5 d;
    public final qr0 e;

    public d90(b90 b90Var, nx5 nx5Var, qr0 qr0Var) {
        super((fw0) null, 1);
        this.c = b90Var;
        this.d = nx5Var;
        this.e = qr0Var;
    }

    @Override // defpackage.r7p
    public final Object a(n13 n13Var, a2 a2Var, xzh xzhVar, mt5 mt5Var) {
        qr0 qr0Var = this.e;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:cct_v2_prewarm_on_ad_loaded:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            b();
        }
        return Unit.a;
    }

    public final void b() {
        u6k u6kVar = new u6k((byte) 13, null, this);
        defpackage.na2.B(this.d, h.a, null, new fsg(u6kVar, null, (byte) 3), 2);
    }

    @Override // defpackage.aop
    public final Unit f() {
        qr0 qr0Var = this.e;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:cct_v2_prewarm_on_signal_generated:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            b();
        }
        return Unit.a;
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        qr0 qr0Var = this.e;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:cct_v2_prewarm_at_init:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            b();
        }
        return new hv0(Unit.a);
    }

    public final Object q(mt5 mt5Var) {
        qr0 qr0Var = this.e;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:cct_v2_prewarm_on_impression:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            b();
        }
        return Unit.a;
    }
}
