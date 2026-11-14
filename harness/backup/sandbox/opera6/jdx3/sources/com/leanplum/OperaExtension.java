package com.leanplum;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Log;
import com.leanplum.internal.Socket;
import com.leanplum.internal.Util;
import com.leanplum.utils.BuildUtil;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class OperaExtension {
    static final String TEST_IN_APP = "_test_in_app_";
    static final String TEST_IN_APP_DATA = "_test_in_app_data_";

    public static void handleScheduledLocalPushMessage(Context context, Bundle bundle) {
        try {
            String messageId = LeanplumPushService.getMessageId(bundle);
            Intent intent = LeanplumLocalPushListenerService.getIntent(context);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0);
            long j = sharedPreferences.getLong("__leanplum_local_message_" + messageId, 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j > 0 && j > jCurrentTimeMillis) {
                alarmManager.cancel(PendingIntent.getBroadcast(context, messageId.hashCode(), intent, BuildUtil.createIntentFlags(134217728)));
            }
            String string = bundle.getString("delivery_time");
            if (string == null) {
                LeanplumPushService.handleNotification(context, bundle);
                return;
            }
            long j2 = Long.parseLong(string);
            if (j2 <= jCurrentTimeMillis) {
                return;
            }
            intent.putExtras(bundle);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, messageId.hashCode(), intent, BuildUtil.createIntentFlags(134217728));
            if (Util.isXiaomiDevice()) {
                alarmManager.setExact(0, j2, broadcast);
            } else {
                alarmManager.setAndAllowWhileIdle(0, j2, broadcast);
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("__leanplum_local_message_".concat(messageId), j2);
            SharedPreferencesUtil.commitChanges(editorEdit);
            Log.i("Scheduling PNS local notification.", new Object[0]);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void handleTestInAppMessage(@NonNull String str) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(str));
            Socket.handleTriggerEvent(jSONArray);
        } catch (JSONException e) {
            Log.e(e.toString(), new Object[0]);
        }
    }

    public static Map<String, String> removePNSPrefix(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("pns_")) {
                map2.put(key.substring(4), entry.getValue());
            } else {
                map2.put(key, entry.getValue());
            }
        }
        return map2;
    }
}
