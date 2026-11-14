package com.leanplum;

import android.content.Context;
import android.os.Bundle;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class LeanplumFirebaseServiceHandler {
    private Bundle getBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    public void onCreate(Context context) {
        Leanplum.setApplicationContext(context);
    }

    public void onMessageReceived(rth rthVar, Context context) {
        try {
            Map<String, String> data = rthVar.getData();
            Log.i("Received push notification message: %s", data.toString());
            HashMap map = (HashMap) data;
            if (map.containsKey("_test_in_app_")) {
                String str = (String) map.get("_test_in_app_data_");
                if (str != null) {
                    OperaExtension.handleTestInAppMessage(str);
                    return;
                }
                return;
            }
            String str2 = map.containsKey(Constants.Keys.PUSH_MESSAGE_SILENT_TRACK) ? "FCM_SILENT_TRACK" : "FCM";
            if (map.containsKey(Constants.Keys.PUSH_MESSAGE_TEXT)) {
                Bundle bundle = getBundle(data);
                bundle.putString(Constants.Keys.CHANNEL_INTERNAL_KEY, str2);
                LeanplumPushService.handleNotification(context, bundle);
            } else if (map.containsKey(Constants.Keys.PUSH_MESSAGE_TEXT_PNS)) {
                Bundle bundle2 = getBundle(OperaExtension.removePNSPrefix(data));
                bundle2.putString(Constants.Keys.CHANNEL_INTERNAL_KEY, str2);
                OperaExtension.handleScheduledLocalPushMessage(context, bundle2);
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void onNewToken(String str, Context context) {
        LeanplumPushService.getPushProviders().setRegistrationId(PushProviderType.FCM, str);
    }
}
