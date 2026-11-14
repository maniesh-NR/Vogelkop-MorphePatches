package ads_mobile_sdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import defpackage.wdp;

/* loaded from: classes.dex */
public final class pb1 implements wdp {
    public static final pb1 b = new pb1();
    public Context a;

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.DISPLAY_COUNT;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        DisplayManager displayManager = (DisplayManager) this.a.getSystemService(DisplayManager.class);
        return displayManager != null ? new hv0(new gj0(displayManager.getDisplays().length)) : new ev0("Unable to get display service", ae1.a);
    }
}
