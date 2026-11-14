package com.leanplum;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.leanplum.internal.LeanplumManifestHelper;
import com.leanplum.internal.Log;

/* loaded from: classes.dex */
public class LeanplumPushReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent == null) {
                Log.e("Received a null intent.", new Object[0]);
                return;
            }
            String notificationMetadata = LeanplumManifestHelper.parseNotificationMetadata();
            if (notificationMetadata == null) {
                Log.d("Custom broadcast receiver class not set, using default one.", new Object[0]);
                LeanplumPushService.openNotification(context, intent);
                return;
            }
            Log.d("Custom broadcast receiver class found, using it to handle push notifications.", new Object[0]);
            Intent intent2 = new Intent();
            intent2.setAction(LeanplumPushService.LEANPLUM_NOTIFICATION);
            intent2.setClassName(context, notificationMetadata);
            intent2.putExtras(intent.getExtras());
            context.sendBroadcast(intent2);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }
}
