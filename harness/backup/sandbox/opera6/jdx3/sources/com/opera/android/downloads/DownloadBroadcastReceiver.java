package com.opera.android.downloads;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class DownloadBroadcastReceiver extends BroadcastReceiver {
    public static final HashSet a = new HashSet(Arrays.asList("com.opera.android.action.APP_START", "android.intent.action.BOOT_COMPLETED"));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context) || intent == null) {
            return;
        }
        if (a.contains(intent.getAction())) {
            ev4.k(context);
        }
        if (DownloadService.e) {
            return;
        }
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) DownloadBroadcastReceiver.class), 2, 1);
    }
}
