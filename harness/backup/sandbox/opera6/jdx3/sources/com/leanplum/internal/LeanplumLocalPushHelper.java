package com.leanplum.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumLocalPushListenerService;
import com.leanplum.internal.Constants;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.utils.BuildUtil;
import com.leanplum.utils.SharedPreferencesUtil;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
class LeanplumLocalPushHelper {
    public static void cancelLocalPush(Context context, String str) {
        try {
            Intent intent = LeanplumLocalPushListenerService.getIntent(context);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, str.hashCode(), intent, BuildUtil.createIntentFlags(134217728));
            if (alarmManager == null || broadcast == null) {
                return;
            }
            alarmManager.cancel(broadcast);
        } catch (Throwable unused) {
        }
    }

    public static boolean scheduleLocalPush(ActionContext actionContext, String str, long j) {
        try {
            Context context = Leanplum.getContext();
            Intent intent = LeanplumLocalPushListenerService.getIntent(context);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0);
            long j2 = sharedPreferences.getLong("__leanplum_local_message_" + str, 0L);
            if (j2 > 0 && j2 > System.currentTimeMillis()) {
                if (j2 < j) {
                    return false;
                }
                if (j2 >= j) {
                    alarmManager.cancel(PendingIntent.getBroadcast(context, str.hashCode(), intent, BuildUtil.createIntentFlags(134217728)));
                }
            }
            Map map = (Map) actionContext.objectNamed("Advanced options.Data");
            if (map != null) {
                for (String str2 : map.keySet()) {
                    intent.putExtra(str2, (Serializable) map.get(str2));
                }
            }
            String strStringNamed = actionContext.stringNamed(Constants.Values.DEFAULT_PUSH_ACTION);
            Boolean bool = Boolean.TRUE;
            boolean zEquals = bool.equals(actionContext.objectNamed("Advanced options.Mute inside app"));
            if (strStringNamed != null) {
                if (zEquals) {
                    intent.putExtra(Constants.Keys.PUSH_MESSAGE_ID_MUTE_WITH_ACTION, str);
                } else {
                    intent.putExtra(Constants.Keys.PUSH_MESSAGE_ID_NO_MUTE_WITH_ACTION, str);
                }
            } else if (zEquals) {
                intent.putExtra(Constants.Keys.PUSH_MESSAGE_ID_MUTE, str);
            } else {
                intent.putExtra(Constants.Keys.PUSH_MESSAGE_ID_NO_MUTE, str);
            }
            String strStringNamed2 = actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE);
            if (strStringNamed2 == null) {
                strStringNamed2 = Constants.Values.DEFAULT_PUSH_MESSAGE;
            }
            intent.putExtra(Constants.Keys.PUSH_MESSAGE_TEXT, strStringNamed2);
            String strStringNamed3 = actionContext.stringNamed("Android options.Collapse key");
            if (strStringNamed3 != null) {
                intent.putExtra("collapseKey", strStringNamed3);
            }
            if (bool.equals(actionContext.objectNamed("Android options.Delay while idle"))) {
                intent.putExtra("delayWhileIdle", true);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, str.hashCode(), intent, BuildUtil.createIntentFlags(134217728));
            if (Util.isXiaomiDevice()) {
                alarmManager.setExact(0, j, broadcast);
            } else {
                alarmManager.setAndAllowWhileIdle(0, j, broadcast);
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("__leanplum_local_message_" + str, j);
            SharedPreferencesUtil.commitChanges(editorEdit);
            Log.i("Scheduling local notification.", new Object[0]);
            return true;
        } catch (Throwable th) {
            Log.exception(th);
            return false;
        }
    }
}
