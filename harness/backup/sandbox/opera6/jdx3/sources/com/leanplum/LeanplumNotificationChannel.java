package com.leanplum;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.leanplum.internal.CollectionUtil;
import com.leanplum.internal.Constants;
import com.leanplum.internal.JsonConverter;
import com.leanplum.internal.Log;
import com.leanplum.utils.BuildUtil;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

@TargetApi(26)
/* loaded from: classes.dex */
class LeanplumNotificationChannel {
    public static final /* synthetic */ int a = 0;
    private static final Set<String> externallyManagedChannels = new HashSet();

    @TargetApi(26)
    private static class NotificationChannelData {
        boolean bypassDnd;
        String description;
        boolean enableLights;
        boolean enableVibration;
        String groupId;
        String id;
        int importance;
        int lightColor;
        int lockscreenVisibility;
        String name;
        boolean showBadge;
        long[] vibrationPattern;

        public NotificationChannelData(Map<String, Object> map) {
            this.importance = 3;
            this.enableLights = false;
            this.lightColor = 0;
            this.enableVibration = false;
            this.vibrationPattern = null;
            this.lockscreenVisibility = 1;
            this.bypassDnd = false;
            this.showBadge = false;
            this.id = (String) map.get("id");
            this.name = (String) map.get(Constants.Params.NAME);
            this.description = (String) map.get("description");
            this.groupId = (String) map.get("groupId");
            this.importance = ((Integer) CollectionUtil.getOrDefault(map, "importance", Integer.valueOf(this.importance))).intValue();
            this.enableLights = ((Boolean) CollectionUtil.getOrDefault(map, "enable_lights", Boolean.valueOf(this.enableLights))).booleanValue();
            this.lightColor = ((Integer) CollectionUtil.getOrDefault(map, "light_color", Integer.valueOf(this.lightColor))).intValue();
            this.enableVibration = ((Boolean) CollectionUtil.getOrDefault(map, "enable_vibration", Boolean.valueOf(this.enableVibration))).booleanValue();
            this.lockscreenVisibility = ((Integer) CollectionUtil.getOrDefault(map, "lockscreen_visibility", Integer.valueOf(this.lockscreenVisibility))).intValue();
            this.bypassDnd = ((Boolean) CollectionUtil.getOrDefault(map, "bypass_dnd", Boolean.valueOf(this.bypassDnd))).booleanValue();
            this.showBadge = ((Boolean) CollectionUtil.getOrDefault(map, "show_badge", Boolean.valueOf(this.showBadge))).booleanValue();
            try {
                List list = (List) CollectionUtil.uncheckedCast(CollectionUtil.getOrDefault(map, "vibration_pattern", null));
                if (list != null) {
                    this.vibrationPattern = new long[list.size()];
                    Iterator it = list.iterator();
                    for (int i = 0; i < this.vibrationPattern.length; i++) {
                        Number number = (Number) it.next();
                        if (number != null) {
                            this.vibrationPattern[i] = number.longValue();
                        }
                    }
                }
            } catch (Exception unused) {
                Log.d("Failed to parse vibration pattern.", new Object[0]);
            }
            int i2 = this.importance;
            if (i2 < 0 && i2 > 5) {
                this.importance = 3;
            }
            int i3 = this.lockscreenVisibility;
            if (i3 >= -1 || i3 <= 1) {
                return;
            }
            this.lockscreenVisibility = 1;
        }
    }

    @TargetApi(26)
    private static class NotificationGroupData {
        String id;
        String name;

        public NotificationGroupData(Map<String, Object> map) {
            this.id = (String) map.get("id");
            this.name = (String) map.get(Constants.Params.NAME);
        }
    }

    public static void addExternallyManagedChannel(String str) {
        externallyManagedChannels.add(str);
    }

    public static void configureChannels(Context context, JSONArray jSONArray, JSONArray jSONArray2, String str) {
        configureNotificationGroups(context, jSONArray);
        configureNotificationChannels(context, jSONArray2);
        configureDefaultNotificationChannel(context, str);
    }

    public static void configureDefaultNotificationChannel(Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                storeDefaultNotificationChannel(context, str);
            } catch (Throwable th) {
                Log.exception(th);
            }
        }
    }

    public static void configureNotificationChannels(Context context, JSONArray jSONArray) {
        if (context == null || jSONArray == null) {
            return;
        }
        try {
            List<HashMap<String, Object>> listRetrieveNotificationChannels = retrieveNotificationChannels(context);
            List<HashMap> listListFromJson = JsonConverter.listFromJson(jSONArray);
            if (listRetrieveNotificationChannels != null && listListFromJson != null) {
                listRetrieveNotificationChannels.removeAll(listListFromJson);
                for (HashMap<String, Object> map : listRetrieveNotificationChannels) {
                    if (map != null) {
                        deleteNotificationChannel(context, (String) map.get("id"));
                    }
                }
            }
            storeNotificationChannels(context, listListFromJson);
            if (listListFromJson != null) {
                for (HashMap map2 : listListFromJson) {
                    if (map2 != null) {
                        createNotificationChannel(context, map2);
                    }
                }
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void configureNotificationGroups(Context context, JSONArray jSONArray) {
        if (context == null || jSONArray == null) {
            return;
        }
        try {
            List<HashMap<String, Object>> listRetrieveNotificationGroups = retrieveNotificationGroups(context);
            List<HashMap> listListFromJson = JsonConverter.listFromJson(jSONArray);
            if (listRetrieveNotificationGroups != null && listListFromJson != null) {
                listRetrieveNotificationGroups.removeAll(listListFromJson);
                for (HashMap<String, Object> map : listRetrieveNotificationGroups) {
                    if (map != null) {
                        deleteNotificationGroup(context, (String) map.get("id"));
                    }
                }
            }
            storeNotificationGroups(context, listListFromJson);
            if (listListFromJson != null) {
                for (HashMap map2 : listListFromJson) {
                    if (map2 != null) {
                        createNotificationGroup(context, map2);
                    }
                }
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static String createNotificationChannel(Context context, Map<String, Object> map) {
        if (context != null && map != null) {
            try {
                NotificationChannelData notificationChannelData = new NotificationChannelData(map);
                boolean zContains = externallyManagedChannels.contains(notificationChannelData.id);
                String str = notificationChannelData.id;
                if (zContains) {
                    return str;
                }
                createNotificationChannel(context, str, notificationChannelData.name, notificationChannelData.importance, notificationChannelData.description, notificationChannelData.groupId, notificationChannelData.enableLights, notificationChannelData.lightColor, notificationChannelData.enableVibration, notificationChannelData.vibrationPattern, notificationChannelData.lockscreenVisibility, notificationChannelData.bypassDnd, notificationChannelData.showBadge);
                return notificationChannelData.id;
            } catch (Exception unused) {
                Log.e("Failed to create notification channel.", new Object[0]);
            }
        }
        return null;
    }

    private static void createNotificationChannel(Context context, String str, String str2, int i, String str3, String str4, boolean z, int i2, boolean z2, long[] jArr, int i3, boolean z3, boolean z4) {
        if (context == null || TextUtils.isEmpty(str) || !BuildUtil.isNotificationChannelSupported(context)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager == null) {
                Log.e("Notification manager is null", new Object[0]);
                return;
            }
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            if (!TextUtils.isEmpty(str3)) {
                notificationChannel.setDescription(str3);
            }
            if (z) {
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(i2);
            }
            if (z2) {
                notificationChannel.enableVibration(true);
                if (jArr != null && jArr.length != 0) {
                    notificationChannel.setVibrationPattern(jArr);
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                notificationChannel.setGroup(str4);
            }
            notificationChannel.setLockscreenVisibility(i3);
            notificationChannel.setBypassDnd(z3);
            notificationChannel.setShowBadge(z4);
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    private static String createNotificationGroup(Context context, Map<String, Object> map) {
        if (context == null || map == null) {
            return null;
        }
        NotificationGroupData notificationGroupData = new NotificationGroupData(map);
        createNotificationGroup(context, notificationGroupData.id, notificationGroupData.name);
        return notificationGroupData.id;
    }

    private static void createNotificationGroup(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || !BuildUtil.isNotificationChannelSupported(context)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                Log.e("Notification manager is null", new Object[0]);
            } else {
                notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(str, str2));
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    private static void deleteNotificationChannel(Context context, String str) {
        if (context == null || !BuildUtil.isNotificationChannelSupported(context) || externallyManagedChannels.contains(str)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                Log.e("Notification manager is null", new Object[0]);
            } else {
                notificationManager.deleteNotificationChannel(str);
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    private static void deleteNotificationGroup(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || !BuildUtil.isNotificationChannelSupported(context)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                Log.e("Notification manager is null", new Object[0]);
            } else {
                notificationManager.deleteNotificationChannelGroup(str);
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static String getDefaultNotificationChannelId(Context context) {
        if (BuildUtil.isNotificationChannelSupported(context)) {
            return retrieveDefaultNotificationChannel(context);
        }
        return null;
    }

    public static List<NotificationChannel> getNotificationChannels(Context context) {
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            return notificationManager.getNotificationChannels();
        }
        Log.e("Notification manager is null", new Object[0]);
        return null;
    }

    public static List<NotificationChannelGroup> getNotificationGroups(Context context) {
        if (!BuildUtil.isNotificationChannelSupported(context)) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            return notificationManager.getNotificationChannelGroups();
        }
        Log.e("Cannot get Notification Channel Groups, notificationManager is null.", new Object[0]);
        return null;
    }

    private static String retrieveDefaultNotificationChannel(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).getString(Constants.Defaults.DEFAULT_NOTIFICATION_CHANNEL_KEY, null);
        } catch (Exception unused) {
            Log.e("Failed to convert default notification channels json.", new Object[0]);
            return null;
        }
    }

    private static List<HashMap<String, Object>> retrieveNotificationChannels(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String string = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).getString(Constants.Defaults.NOTIFICATION_CHANNELS_KEY, null);
            if (string == null) {
                return null;
            }
            return JsonConverter.listFromJson(new JSONArray(string));
        } catch (Exception unused) {
            Log.e("Failed to convert notification channels json.", new Object[0]);
            return null;
        }
    }

    private static List<HashMap<String, Object>> retrieveNotificationGroups(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String string = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).getString(Constants.Defaults.NOTIFICATION_GROUPS_KEY, null);
            if (string == null) {
                return null;
            }
            return JsonConverter.listFromJson(new JSONArray(string));
        } catch (Exception unused) {
            Log.e("Failed to convert notification channels json.", new Object[0]);
            return null;
        }
    }

    private static void storeDefaultNotificationChannel(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).edit();
        editorEdit.putString(Constants.Defaults.DEFAULT_NOTIFICATION_CHANNEL_KEY, str);
        SharedPreferencesUtil.commitChanges(editorEdit);
    }

    private static void storeNotificationChannels(Context context, List<HashMap<String, Object>> list) {
        if (context == null || list == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).edit();
        editorEdit.putString(Constants.Defaults.NOTIFICATION_CHANNELS_KEY, new JSONArray((Collection) list).toString());
        SharedPreferencesUtil.commitChanges(editorEdit);
    }

    private static void storeNotificationGroups(Context context, List<HashMap<String, Object>> list) {
        if (context == null || list == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).edit();
        editorEdit.putString(Constants.Defaults.NOTIFICATION_GROUPS_KEY, new JSONArray((Collection) list).toString());
        SharedPreferencesUtil.commitChanges(editorEdit);
    }
}
