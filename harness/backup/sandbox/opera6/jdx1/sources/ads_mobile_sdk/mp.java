package ads_mobile_sdk;

import android.content.Context;
import android.os.BatteryManager;
import defpackage.mip;

/* loaded from: classes.dex */
public final class mp extends sr {
    public final BatteryManager l;

    public mp(qr0 qr0Var, Context context, nx5 nx5Var, mip mipVar, ux2 ux2Var, g0 g0Var) {
        super(mipVar, nx5Var, ux2Var, qr0Var, g0Var);
        this.l = (BatteryManager) context.getSystemService(BatteryManager.class);
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.BATTERY;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        return new hv0(new lp(r5.getIntProperty(4) / 100.0d, this.l.isCharging()));
    }
}
