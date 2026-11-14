package org.chromium.device.screen_orientation;

import android.provider.Settings;

/* loaded from: classes.dex */
public final class ScreenOrientationListener {
    public static boolean isAutoRotateEnabledByUser() {
        return Settings.System.getInt(t8.a.getContentResolver(), "accelerometer_rotation", 0) == 1;
    }
}
