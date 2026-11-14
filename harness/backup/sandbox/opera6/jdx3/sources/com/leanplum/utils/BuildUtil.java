package com.leanplum.utils;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class BuildUtil {
    private static int targetSdk = -1;

    public static int createIntentFlags(int i) {
        return i | 67108864;
    }

    private static int getTargetSdkVersion(Context context) {
        int i = targetSdk;
        if (i != -1 || context == null) {
            return i;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        targetSdk = i2;
        return i2;
    }

    public static boolean isNotificationChannelSupported(Context context) {
        return getTargetSdkVersion(context) >= 26;
    }

    public static boolean shouldDisableTrampolines(Context context) {
        return Build.VERSION.SDK_INT >= 31 && getTargetSdkVersion(context) >= 31;
    }
}
