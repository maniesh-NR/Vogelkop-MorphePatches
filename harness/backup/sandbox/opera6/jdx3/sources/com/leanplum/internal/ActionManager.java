package com.leanplum.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LocationManager;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.core.BuildConfig;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SharedPreferencesUtil;
import defpackage.sko;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ActionManager {
    private static final long DAY_MILLIS = 86400000;
    public static final String HELD_BACK_ACTION_NAME = "__held_back";
    private static final long HOUR_MILLIS = 3600000;
    private static final String LEANPLUM_LOCAL_PUSH_HELPER = "com.leanplum.internal.LeanplumLocalPushHelper";
    public static final String PUSH_NOTIFICATION_ACTION_NAME = "__Push Notification";
    private static final long WEEK_MILLIS = 604800000;
    private static ActionManager instance = null;
    private static LocationManager locationManager = null;
    private static boolean loggedLocationManagerFailure = false;
    private final Map<String, Map<String, Number>> messageImpressionOccurrences = new HashMap();
    private final Map<String, Number> messageTriggerOccurrences = new HashMap();
    private final Map<String, Number> sessionOccurrences = new HashMap();

    public static class MessageMatchResult {
        public boolean matchedActivePeriod;
        public boolean matchedLimit;
        public boolean matchedTrigger;
        public boolean matchedUnlessTrigger;
    }

    private ActionManager() {
        listenForLocalNotifications();
    }

    public static void addRegionNamesFromTriggersToSet(Map<String, Object> map, Set<String> set) {
        if (map != null) {
            for (Map map2 : (List) CollectionUtil.uncheckedCast(map.get("children"))) {
                String str = (String) map2.get("subject");
                if (str.equals("enterRegion") || str.equals("exitRegion")) {
                    set.add((String) map2.get("noun"));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int countOccurrences(long r10, long r12) {
        /*
            r9 = this;
            android.content.Context r0 = com.leanplum.Leanplum.getContext()
            java.lang.String r1 = "__leanplum_messaging__"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.util.Map r0 = r0.getAll()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "__leanplum_message_occurrences_"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L4f
            java.lang.Object r1 = r1.getValue()
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L4f
            java.lang.String r1 = "{}"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L4f
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r3.countOccurrences(r4, r6, r8)
            int r2 = r2 + r9
            goto L52
        L4f:
            r3 = r9
            r4 = r10
            r6 = r12
        L52:
            r9 = r3
            r10 = r4
            r12 = r6
            goto L17
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.internal.ActionManager.countOccurrences(long, long):int");
    }

    private int countOccurrences(long j, long j2, String str) {
        Map map = (Map) CollectionUtil.uncheckedCast(JsonConverter.fromJson(str));
        Number number = (Number) map.get("min");
        Number number2 = (Number) map.get("max");
        int i = 0;
        if (number != null && number2 != null) {
            long jLongValue = number.longValue();
            for (long jLongValue2 = number2.longValue(); jLongValue2 >= jLongValue; jLongValue2--) {
                Number number3 = (Number) map.get(String.valueOf(jLongValue2));
                if (number3 != null) {
                    if (j > number3.longValue() || number3.longValue() > j2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return i;
    }

    public static void getForegroundandBackgroundRegionNames(Set<String> set, Set<String> set2) {
        Map<String, Object> mapMessages = VarCache.messages();
        Iterator<String> it = mapMessages.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) CollectionUtil.uncheckedCast(mapMessages.get(it.next()));
            Object obj = map.get("action");
            if (obj instanceof String) {
                Set<String> set3 = obj.equals(PUSH_NOTIFICATION_ACTION_NAME) ? set2 : set;
                Map map2 = (Map) CollectionUtil.uncheckedCast(map.get("whenTriggers"));
                Map map3 = (Map) CollectionUtil.uncheckedCast(map.get("unlessTriggers"));
                addRegionNamesFromTriggersToSet(map2, set3);
                addRegionNamesFromTriggersToSet(map3, set3);
            }
        }
    }

    public static synchronized ActionManager getInstance() {
        ActionManager actionManager;
        actionManager = instance;
        if (actionManager == null) {
            actionManager = new ActionManager();
            instance = actionManager;
        }
        return actionManager;
    }

    public static synchronized LocationManager getLocationManager() {
        LocationManager locationManager2 = locationManager;
        if (locationManager2 != null) {
            return locationManager2;
        }
        if (Util.hasPlayServices()) {
            try {
                LocationManager locationManager3 = (LocationManager) Class.forName("com.leanplum.LocationManagerImplementation").getMethod("instance", null).invoke(null, null);
                locationManager = locationManager3;
                return locationManager3;
            } catch (Throwable unused) {
                if (!loggedLocationManagerFailure) {
                    Log.i("Geofencing support requires leanplum-location module and Google Play Services v8.1 and higher.\nAdd this to your build.gradle file:\nimplementation 'com.google.android.gms:play-services-location:8.3.0+'\nimplementation 'com.leanplum:leanplum-location:+'", new Object[0]);
                    loggedLocationManagerFailure = true;
                }
            }
        }
        return null;
    }

    private void listenForLocalNotifications() {
        Leanplum.onAction(PUSH_NOTIFICATION_ACTION_NAME, new ActionCallback() { // from class: com.leanplum.internal.ActionManager.1
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(ActionContext actionContext) {
                Object objValueOf;
                try {
                    String messageId = actionContext.getMessageId();
                    if (actionContext.isPreview()) {
                        objValueOf = Double.valueOf(5.0d);
                    } else {
                        Map map = (Map) CollectionUtil.uncheckedCast(VarCache.getMessageDiffs().get(messageId));
                        if (map == null) {
                            Log.e("Could not find message options for ID " + messageId, new Object[0]);
                            return false;
                        }
                        objValueOf = map.get("countdown");
                    }
                    if (objValueOf instanceof Number) {
                        try {
                            return ((Boolean) LeanplumLocalPushHelper.class.getDeclaredMethod("scheduleLocalPush", ActionContext.class, String.class, Long.TYPE).invoke(new Object(), actionContext, messageId, Long.valueOf((((Number) objValueOf).longValue() * 1000) + Clock.getInstance().currentTimeMillis()))).booleanValue();
                        } catch (Throwable unused) {
                            return false;
                        }
                    }
                    Log.e("Invalid notification countdown: " + objValueOf, new Object[0]);
                    return false;
                } catch (Throwable th) {
                    Log.exception(th);
                    return false;
                }
            }
        });
        Leanplum.onAction("__Cancel__Push Notification", new ActionCallback() { // from class: com.leanplum.internal.ActionManager.2
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(ActionContext actionContext) {
                try {
                    String messageId = actionContext.getMessageId();
                    Context context = Leanplum.getContext();
                    SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0);
                    String str = "__leanplum_local_message_" + messageId;
                    long j = sharedPreferences.getLong(str, 0L);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.remove(str);
                    SharedPreferencesUtil.commitChanges(editorEdit);
                    try {
                        LeanplumLocalPushHelper.class.getDeclaredMethod("cancelLocalPush", Context.class, String.class).invoke(new Object(), context, messageId);
                        boolean z = j > Clock.getInstance().currentTimeMillis();
                        if (z) {
                            Log.i("Cancelled notification", new Object[0]);
                        }
                        return z;
                    } catch (Throwable unused) {
                        return false;
                    }
                } catch (Throwable th) {
                    Log.exception(th);
                    return false;
                }
            }
        });
    }

    private boolean matchedTrigger(Map<String, Object> map, String str, String str2, ActionContext.ContextualValues contextualValues) {
        String str3;
        Map<String, ?> map2;
        if (!((String) map.get("subject")).equals(str) || ((str3 = (String) map.get("noun")) != null ? !str3.equals(str2) : str2 != null)) {
            return false;
        }
        String str4 = (String) map.get("verb");
        List<Object> list = (List) CollectionUtil.uncheckedCast(map.get("objects"));
        if (!"changesTo".equals(str4)) {
            if ("changesFromTo".equals(str4)) {
                return (contextualValues == null || list.size() != 2 || list.get(0) == null || list.get(1) == null || contextualValues.previousAttributeValue == null || contextualValues.attributeValue == null || !list.get(0).toString().equalsIgnoreCase(contextualValues.previousAttributeValue.toString()) || !list.get(1).toString().equalsIgnoreCase(contextualValues.attributeValue.toString())) ? false : true;
            }
            if (!"triggersWithParameter".equals(str4)) {
                return true;
            }
            if (list == null || contextualValues == null || (map2 = contextualValues.parameters) == null) {
                return false;
            }
            return matchedTriggerParameters(list, map2);
        }
        if (contextualValues != null && list != null) {
            for (Object obj : list) {
                if (obj == null) {
                    if (contextualValues.attributeValue == null) {
                        return true;
                    }
                } else if (obj.toString().equalsIgnoreCase(contextualValues.attributeValue.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean matchedTriggerParameters(List<Object> list, Map<String, ?> map) {
        Object obj;
        if (list.size() == 0 || list.size() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i += 2) {
            Object obj2 = list.get(i);
            Object obj3 = list.get(i + 1);
            if (obj2 == null || obj3 == null || (obj = map.get(obj2)) == null || !obj.toString().equalsIgnoreCase(obj3.toString())) {
                return false;
            }
        }
        return true;
    }

    private boolean matchedTriggers(Object obj, String str, String str2, ActionContext.ContextualValues contextualValues) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Iterator it = ((List) CollectionUtil.uncheckedCast(((Map) CollectionUtil.uncheckedCast(obj)).get("children"))).iterator();
        while (it.hasNext()) {
            if (matchedTrigger((Map) CollectionUtil.uncheckedCast(it.next()), str, str2, contextualValues)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Number] */
    private boolean matchesLimitTimes(int i, int i2, String str, Map<String, Number> map, String str2) {
        int i3;
        boolean z;
        boolean z2;
        int i4 = i2;
        Long lValueOf = 0L;
        if (str.equals("limitSession")) {
            Number number = this.sessionOccurrences.get(str2);
            if (number != 0) {
                lValueOf = number;
            }
        } else {
            if (map == null || map.isEmpty()) {
                return true;
            }
            Number number2 = map.get("min");
            Number number3 = map.get("max");
            if (number2 == null) {
                number2 = lValueOf;
            }
            if (number3 == null) {
                number3 = lValueOf;
            }
            if (str.equals("limitUser")) {
                lValueOf = Long.valueOf((number3.longValue() - number2.longValue()) + 1);
            } else {
                if (str.equals("limitMinute")) {
                    i4 *= 60;
                } else if (str.equals("limitHour")) {
                    i4 *= 3600;
                } else {
                    if (str.equals("limitDay")) {
                        i3 = 86400;
                    } else if (str.equals("limitWeek")) {
                        i3 = 604800;
                    } else if (str.equals("limitMonth")) {
                        i3 = 2592000;
                    }
                    i4 *= i3;
                }
                long jCurrentTimeMillis = Clock.getInstance().currentTimeMillis();
                int i5 = 0;
                for (long jLongValue = number3.longValue(); jLongValue >= number2.longValue(); jLongValue--) {
                    if (map.containsKey(String.valueOf(jLongValue))) {
                        z = true;
                        z2 = false;
                        if ((jCurrentTimeMillis - map.get(String.valueOf(jLongValue)).longValue()) / 1000 > i4) {
                            break;
                        }
                        i5++;
                        if (i5 >= i) {
                            return false;
                        }
                    }
                }
            }
        }
        z = true;
        z2 = false;
        return lValueOf.longValue() < ((long) i) ? z : z2;
    }

    private boolean matchesLimits(String str, Map<String, Object> map) throws NumberFormatException {
        ActionManager actionManager;
        String str2;
        int i;
        if (map == null) {
            return true;
        }
        List list = (List) CollectionUtil.uncheckedCast(map.get("children"));
        if (list.isEmpty()) {
            return true;
        }
        Map<String, Number> messageImpressionOccurrences = getMessageImpressionOccurrences(str);
        int messageTriggerOccurrences = getMessageTriggerOccurrences(str) + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) CollectionUtil.uncheckedCast(it.next());
            String string = map2.get("subject").toString();
            String string2 = map2.get("noun").toString();
            String string3 = map2.get("verb").toString();
            if (string.equals("times")) {
                List list2 = (List) CollectionUtil.uncheckedCast(map2.get("objects"));
                int i2 = list2.size() > 0 ? Integer.parseInt(list2.get(0).toString()) : 0;
                int i3 = Integer.parseInt(string2);
                str2 = str;
                int i4 = i2;
                actionManager = this;
                if (!actionManager.matchesLimitTimes(i3, i4, string3, messageImpressionOccurrences, str2)) {
                    return false;
                }
            } else {
                actionManager = this;
                str2 = str;
                if (string.equals("onNthOccurrence")) {
                    if (messageTriggerOccurrences != Integer.parseInt(string2)) {
                        return false;
                    }
                } else if (string.equals("everyNthOccurrence") && ((i = Integer.parseInt(string2)) == 0 || messageTriggerOccurrences % i != 0)) {
                    return false;
                }
            }
            this = actionManager;
            str = str2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Number] */
    private void recordImpression(String str) {
        Map<String, Number> map;
        Number number = this.sessionOccurrences.get(str);
        if (number == null) {
            number = l;
        }
        this.sessionOccurrences.put(str, Long.valueOf(number.longValue() + 1));
        Map<String, Number> messageImpressionOccurrences = getMessageImpressionOccurrences(str);
        if (messageImpressionOccurrences == null || messageImpressionOccurrences.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put("min", l);
            map2.put("max", l);
            map2.put(BuildConfig.BUILD_NUMBER, Long.valueOf(Clock.getInstance().currentTimeMillis()));
            map = map2;
        } else {
            Number number2 = messageImpressionOccurrences.get("min");
            Number number3 = messageImpressionOccurrences.get("max");
            if (number2 == null) {
                number2 = l;
            }
            long jLongValue = (number3 != 0 ? number3 : 0L).longValue() + 1;
            Long lValueOf = Long.valueOf(jLongValue);
            messageImpressionOccurrences.put(String.valueOf(lValueOf), Long.valueOf(Clock.getInstance().currentTimeMillis()));
            if ((jLongValue - number2.longValue()) + 1 > 100) {
                messageImpressionOccurrences.remove(String.valueOf(number2));
                messageImpressionOccurrences.put("min", Long.valueOf(number2.longValue() + 1));
            }
            messageImpressionOccurrences.put("max", lValueOf);
            map = messageImpressionOccurrences;
        }
        saveMessageImpressionOccurrences(map, str);
    }

    private void trackHeldBackEvent(String str) {
        HashMap map = new HashMap();
        map.put(Constants.Params.MESSAGE_ID, str);
        LeanplumInternal.track(Constants.HELD_BACK_EVENT_NAME, 0.0d, null, null, map);
    }

    private void trackImpressionEvent(String str) {
        HashMap map = new HashMap();
        map.put(Constants.Params.MESSAGE_ID, str);
        LeanplumInternal.track(null, 0.0d, null, null, map);
    }

    public int dailyOccurrencesCount() {
        long jCurrentTimeMillis = Clock.getInstance().currentTimeMillis();
        return countOccurrences(jCurrentTimeMillis - 86400000, jCurrentTimeMillis);
    }

    public Map<String, Number> getMessageImpressionOccurrences(String str) {
        Map<String, Number> map = this.messageImpressionOccurrences.get(str);
        if (map != null) {
            return map;
        }
        Map<String, Number> map2 = (Map) CollectionUtil.uncheckedCast(JsonConverter.fromJson(Leanplum.getContext().getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).getString("__leanplum_message_occurrences_" + str, "{}")));
        this.messageImpressionOccurrences.put(str, map2);
        return map2;
    }

    public int getMessageTriggerOccurrences(String str) {
        Number number = this.messageTriggerOccurrences.get(str);
        if (number != null) {
            return number.intValue();
        }
        int i = Leanplum.getContext().getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).getInt("__leanplum_message_trigger_occurrences_" + str, 0);
        this.messageTriggerOccurrences.put(str, Integer.valueOf(i));
        return i;
    }

    public void muteFutureMessagesOfKind(String str) {
        if (str != null) {
            SharedPreferences.Editor editorEdit = Leanplum.getContext().getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).edit();
            editorEdit.putBoolean("__leanplum_message_muted_".concat(str), true);
            SharedPreferencesUtil.commitChanges(editorEdit);
        }
    }

    public void recordChainedActionImpression(String str) {
        trackImpressionEvent(str);
    }

    public void recordHeldBackImpression(String str, String str2) {
        trackHeldBackEvent(str2);
        recordImpression(str);
    }

    public void recordLocalPushImpression(String str) {
        trackImpressionEvent(str);
    }

    public void recordMessageImpression(String str) {
        trackImpressionEvent(str);
        recordImpression(str);
    }

    public void recordMessageTrigger(String str) {
        saveMessageTriggerOccurrences(getMessageTriggerOccurrences(str) + 1, str);
    }

    public void saveMessageImpressionOccurrences(Map<String, Number> map, String str) {
        SharedPreferences.Editor editorEdit = Leanplum.getContext().getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).edit();
        editorEdit.putString(sko.j("__leanplum_message_occurrences_", str), JsonConverter.toJson(map));
        this.messageImpressionOccurrences.put(str, map);
        SharedPreferencesUtil.commitChanges(editorEdit);
    }

    public void saveMessageTriggerOccurrences(int i, String str) {
        SharedPreferences.Editor editorEdit = Leanplum.getContext().getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).edit();
        editorEdit.putInt("__leanplum_message_trigger_occurrences_" + str, i);
        this.messageTriggerOccurrences.put(str, Integer.valueOf(i));
        SharedPreferencesUtil.commitChanges(editorEdit);
    }

    public int sessionOccurrencesCount() {
        Iterator<Map.Entry<String, Number>> it = this.sessionOccurrences.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Number value = it.next().getValue();
            if (value != null) {
                iIntValue = value.intValue() + iIntValue;
            }
        }
        return iIntValue;
    }

    public MessageMatchResult shouldShowMessage(String str, Map<String, Object> map, String str2, String str3, ActionContext.ContextualValues contextualValues) {
        MessageMatchResult messageMatchResult = new MessageMatchResult();
        boolean z = false;
        if (!Leanplum.getContext().getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).getBoolean("__leanplum_message_muted_" + str, false)) {
            messageMatchResult.matchedTrigger = matchedTriggers(map.get("whenTriggers"), str2, str3, contextualValues);
            boolean zMatchedTriggers = matchedTriggers(map.get("unlessTriggers"), str2, str3, contextualValues);
            messageMatchResult.matchedUnlessTrigger = zMatchedTriggers;
            if (messageMatchResult.matchedTrigger || zMatchedTriggers) {
                Object obj = map.get("whenLimits");
                messageMatchResult.matchedLimit = matchesLimits(str, obj instanceof Map ? (Map) CollectionUtil.uncheckedCast(obj) : null);
                Object obj2 = map.get("startTime");
                Object obj3 = map.get("endTime");
                if (obj2 == null || obj3 == null) {
                    messageMatchResult.matchedActivePeriod = true;
                    return messageMatchResult;
                }
                long time = Clock.getInstance().newDate().getTime();
                if (time >= ((Long) obj2).longValue() && time <= ((Long) obj3).longValue()) {
                    z = true;
                }
                messageMatchResult.matchedActivePeriod = z;
                return messageMatchResult;
            }
        }
        return messageMatchResult;
    }

    public boolean shouldSuppressMessages() {
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        for (Map<String, Object> map : VarCache.localCaps()) {
            if ("IN_APP".equals(map.get(Constants.Keys.PUSH_METRIC_CHANNEL))) {
                String str = (String) map.get(Constants.Params.TYPE);
                Integer num = (Integer) map.get("limit");
                if (num != null) {
                    if ("DAY".equals(str)) {
                        iIntValue2 = num.intValue();
                    } else if ("WEEK".equals(str)) {
                        iIntValue = num.intValue();
                    } else if ("SESSION".equals(str)) {
                        iIntValue3 = num.intValue();
                    }
                }
            }
        }
        if (iIntValue > 0 && weeklyOccurrencesCount() >= iIntValue) {
            return true;
        }
        if (iIntValue2 <= 0 || dailyOccurrencesCount() < iIntValue2) {
            return iIntValue3 > 0 && sessionOccurrencesCount() >= iIntValue3;
        }
        return true;
    }

    public int weeklyOccurrencesCount() {
        long jCurrentTimeMillis = Clock.getInstance().currentTimeMillis();
        return countOccurrences(jCurrentTimeMillis - WEEK_MILLIS, jCurrentTimeMillis);
    }
}
