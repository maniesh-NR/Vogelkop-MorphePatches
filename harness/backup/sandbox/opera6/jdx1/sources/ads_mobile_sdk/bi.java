package ads_mobile_sdk;

import defpackage.wdp;

/* loaded from: classes.dex */
public final class bi implements wdp {
    public final g0 a;

    public bi(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.APP_OPEN;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        boolean z;
        g0 g0Var = this.a;
        synchronized (g0Var) {
            z = g0Var.n;
        }
        return new hv0(new ai(z));
    }
}
