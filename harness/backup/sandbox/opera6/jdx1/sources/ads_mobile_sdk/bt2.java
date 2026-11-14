package ads_mobile_sdk;

import defpackage.bpd;
import defpackage.fsg;
import defpackage.rnp;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class bt2 extends tl {
    public final uo2 e;

    public bt2(td1 td1Var, fv2 fv2Var, uo2 uo2Var) {
        super(td1Var, fv2Var);
        this.e = uo2Var;
    }

    @Override // ads_mobile_sdk.ov
    public final rnp a() {
        return (rnp) this.e.t.a("The backing field has not yet been initialized.");
    }

    @Override // ads_mobile_sdk.tl
    public final td1 b() {
        return (td1) this.e.t.a("The backing field has not yet been initialized.");
    }

    @Override // ads_mobile_sdk.ov, defpackage.ui
    public final void destroy() {
        uo2 uo2Var = this.e;
        defpackage.na2.B(uo2Var.b, h.a, null, new fsg(new co2(uo2Var, null, (byte) 0), null, (byte) 3), 2);
    }

    @Override // ads_mobile_sdk.tl
    public final void setAdEventCallback(bpd bpdVar) {
        b().j().a(bpdVar);
    }
}
