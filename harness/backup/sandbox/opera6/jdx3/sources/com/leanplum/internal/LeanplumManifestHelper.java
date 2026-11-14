package com.leanplum.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumPushService;
import com.leanplum.internal.ResourceQualifiers;

/* loaded from: classes.dex */
public class LeanplumManifestHelper {
    public static boolean disableComponent(Context context, PackageManager packageManager, String str) {
        if (context != null && packageManager != null && str != null) {
            try {
                packageManager.setComponentEnabledSetting(new ComponentName(context, str), 2, 1);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean enableComponent(Context context, PackageManager packageManager, Class cls) {
        if (cls != null && context != null && packageManager != null) {
            try {
                packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) cls), 1, 1);
                return true;
            } catch (Throwable unused) {
                Log.i("Could not enable component: %s", cls.getName());
            }
        }
        return false;
    }

    public static boolean enableServiceAndStart(Context context, PackageManager packageManager, Class cls) {
        if (!enableComponent(context, packageManager, cls)) {
            return false;
        }
        try {
            context.startService(new Intent(context, (Class<?>) cls));
            return true;
        } catch (Throwable unused) {
            Log.i("Could not start service for class: %s", cls.getName());
            return false;
        }
    }

    public static Class getClassForName(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String parseNotificationMetadata() {
        try {
            Context context = Leanplum.getContext();
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL).metaData.getString(LeanplumPushService.LEANPLUM_NOTIFICATION);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean wasComponentEnabled(Context context, PackageManager packageManager, Class cls) {
        int componentEnabledSetting;
        return (cls == null || context == null || packageManager == null || (componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(context, (Class<?>) cls))) == 0 || 2 == componentEnabledSetting) ? false : true;
    }
}
