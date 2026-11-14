package com.opera.android.preinstall;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class PreinstallInitializer extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context)) {
            return;
        }
        if ("android.intent.action.USER_INITIALIZE".equals(intent.getAction()) || "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, PreinstallInitializer.class.getName()), 2, 1);
        }
    }
}
