package org.chromium.ui.base;

/* loaded from: classes.dex */
public final class DeviceFormFactor {
    public static boolean isRunningChromeOs() {
        return t8.a.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }

    @Deprecated
    public static boolean isTablet() {
        return t8.a.getResources().getInteger(2131492935) >= 2;
    }
}
