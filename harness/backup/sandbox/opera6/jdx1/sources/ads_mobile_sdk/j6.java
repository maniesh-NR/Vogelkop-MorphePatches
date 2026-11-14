package ads_mobile_sdk;

import android.os.Build;
import defpackage.mip;

/* loaded from: classes.dex */
public final class j6 extends sr {
    public final ki0 l;

    public j6(qr0 qr0Var, ki0 ki0Var, nx5 nx5Var, mip mipVar, ux2 ux2Var, g0 g0Var) {
        super(mipVar, nx5Var, ux2Var, qr0Var, g0Var);
        this.l = ki0Var;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.AD_SERVICES_EXTENSION_VERSION;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        int iIntValue;
        int i = Build.VERSION.SDK_INT;
        ki0 ki0Var = this.l;
        if (i >= 33) {
            iIntValue = ((Number) ki0Var.l.getValue()).intValue();
        } else {
            qr0 qr0Var = this.f;
            qr0Var.getClass();
            iIntValue = (!((Boolean) qr0Var.a("gads:attribution_reporting_for_android_s:enabled", Boolean.FALSE, fo.a)).booleanValue() || i < 31) ? 0 : ((Number) ki0Var.l.getValue()).intValue();
        }
        return new hv0(new i6(iIntValue));
    }
}
