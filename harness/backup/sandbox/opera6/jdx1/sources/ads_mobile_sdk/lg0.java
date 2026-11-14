package ads_mobile_sdk;

import defpackage.wdp;

/* loaded from: classes.dex */
public final class lg0 implements wdp {
    public final ek a;

    public lg0(ek ekVar) {
        this.a = ekVar;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.DEBUG_SIGNAL;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        ek ekVar = this.a;
        return new hv0(new kg0((String) ekVar.g.get(), ekVar.h.get()));
    }
}
