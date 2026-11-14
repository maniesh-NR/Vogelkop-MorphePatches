package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class rog {
    public static final anf a = new anf((byte) 2);

    public static void a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        ks3.I(41, (Build.VERSION.SDK_INT < 33 || !powerManager.isLowPowerStandbyEnabled()) ? powerManager.isPowerSaveMode() ? "low_power" : "normal" : "low_power_standby");
    }
}
