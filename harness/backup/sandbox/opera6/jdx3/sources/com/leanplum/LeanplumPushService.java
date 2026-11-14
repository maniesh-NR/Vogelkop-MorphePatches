package com.leanplum;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.leanplum.LeanplumNotificationHelper;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.internal.ActionManager;
import com.leanplum.internal.Constants;
import com.leanplum.internal.JsonConverter;
import com.leanplum.internal.LeanplumInternal;
import com.leanplum.internal.Log;
import com.leanplum.internal.PushActionPersistenceKt;
import com.leanplum.internal.Request;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.internal.RequestSender;
import com.leanplum.internal.Util;
import com.leanplum.internal.VarCache;
import com.leanplum.utils.BuildUtil;
import defpackage.l1f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LeanplumPushService {
    public static final String LEANPLUM_ACTION_PARAM = "lp_action_param";
    public static final String LEANPLUM_MESSAGE_ID = "lp_message_id";
    public static final String LEANPLUM_MESSAGE_PARAM = "lp_message_param";
    public static final String LEANPLUM_NOTIFICATION = "LP_NOTIFICATION";
    public static final String LEANPLUM_SENDER_ID = "44059457771";
    private static final int NOTIFICATION_GROUP_ID = -656655216;
    private static final String NOTIFICATION_GROUP_KEY = "leanplum_notification_group";
    private static final int NOTIFICATION_ID = 1;
    private static final String OPEN_ACTION = "Open";
    private static final String OPEN_URL = "Open URL";
    private static final String URL = "URL";
    private static Class<? extends Activity> callbackClass;
    private static LeanplumPushNotificationCustomizer customizer;
    private static DeeplinkIntentCustomizer deeplinkIntentCustomizer;
    private static LeanplumOnPushOpenedCallback onPushOpenedCallback;
    private static final PushProviders pushProviders = new PushProviders();
    private static boolean useNotificationBuilderCustomizer = false;
    private static boolean overrideDefaultGroupingBehavior = false;
    private static int minNotificationsToGroup = 4;
    private static String defaultNotificationTag = null;
    private static String defaultNotificationGroupTag = null;

    public static void addExternallyManagedChannel(String str) {
        LeanplumNotificationChannel.addExternallyManagedChannel(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areActionsEmbedded(Bundle bundle) {
        return bundle.containsKey(Constants.Keys.PUSH_MESSAGE_ACTION);
    }

    private static Notification buildGroupingSummary(Context context, Bundle bundle, LeanplumNotificationHelper.NotificationGroupInfo notificationGroupInfo) {
        l1f notificationCompatBuilder = LeanplumNotificationHelper.getNotificationCompatBuilder(context, bundle);
        if (notificationCompatBuilder == null) {
            return null;
        }
        notificationCompatBuilder.r = notificationGroupInfo.key;
        notificationCompatBuilder.s = true;
        notificationCompatBuilder.h(16, true);
        notificationCompatBuilder.G.icon = LeanplumNotificationHelper.getDefaultPushNotificationIconResourceId(context);
        LeanplumPushNotificationCustomizer leanplumPushNotificationCustomizer = customizer;
        if (leanplumPushNotificationCustomizer != null) {
            leanplumPushNotificationCustomizer.customizeGroupingNotification(notificationCompatBuilder);
        }
        return notificationCompatBuilder.b();
    }

    @TargetApi(31)
    private static Intent createActivityIntent(Context context, Bundle bundle) {
        Intent deepLinkIntent;
        String string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ACTION);
        if (string != null && string.contains("Open URL") && (deepLinkIntent = getDeepLinkIntent(bundle)) != null) {
            resolveIntentActivity(context, deepLinkIntent);
            if (getMessageId(bundle) != null) {
                deepLinkIntent.putExtras(bundle);
            }
            return deepLinkIntent;
        }
        Intent actionIntent = getActionIntent(context);
        if (actionIntent == null) {
            return null;
        }
        actionIntent.putExtras(bundle);
        actionIntent.addFlags(335544320);
        return actionIntent;
    }

    private static Intent createBroadcastIntent(Context context, Bundle bundle, Class<? extends BroadcastReceiver> cls) {
        Intent intent = new Intent(context, cls);
        intent.addCategory("lpAction");
        intent.putExtras(bundle);
        return intent;
    }

    private static PendingIntent createContentIntent(Context context, Bundle bundle) {
        return createContentIntent(context, bundle, LeanplumPushReceiver.class);
    }

    @NonNull
    public static PendingIntent createContentIntent(Context context, Bundle bundle, Class<? extends BroadcastReceiver> cls) {
        if (BuildUtil.shouldDisableTrampolines(context)) {
            return PendingIntent.getActivity(context, new Random().nextInt(), createActivityIntent(context, bundle), BuildUtil.createIntentFlags(134217728));
        }
        return PendingIntent.getBroadcast(context.getApplicationContext(), new Random().nextInt(), createBroadcastIntent(context, bundle, cls), BuildUtil.createIntentFlags(0));
    }

    private static Intent getActionIntent(Context context) {
        Class<? extends Activity> callbackClass2 = getCallbackClass();
        return callbackClass2 != null ? new Intent(context, callbackClass2) : context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private static Class<? extends Activity> getCallbackClass() {
        return callbackClass;
    }

    private static Intent getDeepLinkIntent(Bundle bundle) {
        try {
            String string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ACTION);
            if (string == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(new JSONObject(string).getString("URL")));
            intent.setFlags(268435456);
            DeeplinkIntentCustomizer deeplinkIntentCustomizer2 = deeplinkIntentCustomizer;
            return deeplinkIntentCustomizer2 != null ? deeplinkIntentCustomizer2.customize(Leanplum.getContext(), intent) : intent;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String getMessageId(Bundle bundle) {
        String string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ID_NO_MUTE_WITH_ACTION);
        if (string == null && (string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ID_MUTE_WITH_ACTION)) == null && (string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ID_NO_MUTE)) == null) {
            string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ID_MUTE);
        }
        if (string != null) {
            bundle.putString(Constants.Keys.PUSH_MESSAGE_ID, string);
        }
        return string;
    }

    @NonNull
    public static PushProviders getPushProviders() {
        return pushProviders;
    }

    public static void handleNotification(Context context, Bundle bundle) throws NumberFormatException {
        PushTracking.trackDelivery(context, bundle);
        if (PushTracking.isFcmSilentPush(bundle) || shouldMuteNotification(bundle)) {
            return;
        }
        if (getMessageId(bundle) == null || !LeanplumInternal.hasCalledStart()) {
            showNotification(context, bundle);
        } else {
            showNotification(context, bundle);
        }
    }

    private static boolean isActivityWithIntentStarted(Context context, Bundle bundle) {
        Intent deepLinkIntent;
        String string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ACTION);
        if (string != null && string.contains("Open URL") && (deepLinkIntent = getDeepLinkIntent(bundle)) != null) {
            resolveIntentActivity(context, deepLinkIntent);
            String messageId = getMessageId(bundle);
            if (messageId != null) {
                new ActionContext(ActionManager.PUSH_NOTIFICATION_ACTION_NAME, null, messageId).track(OPEN_ACTION, 0.0d, null);
                try {
                    context.startActivity(deepLinkIntent);
                    return true;
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
        return false;
    }

    private static void maybePostGroupSummary(Context context, NotificationManager notificationManager, Bundle bundle, LeanplumNotificationHelper.NotificationGroupInfo notificationGroupInfo) {
        Notification notificationBuildGroupingSummary;
        if (!LeanplumNotificationHelper.isGroupingSupported().booleanValue() || notificationGroupInfo == null || LeanplumNotificationHelper.getNumberOfActiveNotifications(notificationManager, notificationGroupInfo.key) < notificationGroupInfo.minNotificationsToGroup || (notificationBuildGroupingSummary = buildGroupingSummary(context, bundle, notificationGroupInfo)) == null) {
            return;
        }
        notificationManager.notify(notificationGroupInfo.tag, notificationGroupInfo.id, notificationBuildGroupingSummary);
    }

    public static void onActivityNotificationClick(@NonNull Bundle bundle) {
        String str;
        if (bundle.containsKey(Constants.Keys.PUSH_OCCURRENCE_ID)) {
            str = (String) bundle.get(Constants.Keys.PUSH_OCCURRENCE_ID);
        } else {
            if (!bundle.containsKey(Constants.Keys.LOCAL_PUSH_OCCURRENCE_ID)) {
                Log.i("Skipping execution of Open Action because occurrenceId is missing.", new Object[0]);
                return;
            }
            str = (String) bundle.get(Constants.Keys.LOCAL_PUSH_OCCURRENCE_ID);
        }
        if (PushActionPersistenceKt.isOpened(str)) {
            Log.i("Open Action from activity intent is already executed.", new Object[0]);
            return;
        }
        Log.d("Executing Open Action from push notification.", new Object[0]);
        PushActionPersistenceKt.recordOpenAction(str);
        PushTracking.trackOpen(bundle);
        if (getDeepLinkIntent(bundle) == null) {
            performPushNotificationAction(bundle);
            return;
        }
        String messageId = getMessageId(bundle);
        if (messageId != null) {
            new ActionContext(ActionManager.PUSH_NOTIFICATION_ACTION_NAME, null, messageId).track(OPEN_ACTION, 0.0d, null);
        }
    }

    public static void onPushNotificationOpened(@NonNull Bundle bundle) {
        LeanplumOnPushOpenedCallback leanplumOnPushOpenedCallback = onPushOpenedCallback;
        if (leanplumOnPushOpenedCallback != null) {
            leanplumOnPushOpenedCallback.onLeanplumPushOpened(bundle);
        }
    }

    public static void onStart() {
        PushProviders pushProviders2 = pushProviders;
        pushProviders2.init();
        pushProviders2.updateRegistrationIdsAndBackend();
    }

    public static void openNotification(Context context, Intent intent) {
        Bundle bundlePreHandlePushNotification = preHandlePushNotification(context, intent);
        if (bundlePreHandlePushNotification == null) {
            return;
        }
        openNotification(context, bundlePreHandlePushNotification);
    }

    public static void openNotification(Context context, @NonNull Bundle bundle) {
        Log.d("Opening push notification action.", new Object[0]);
        PushTracking.trackOpen(bundle);
        if (isActivityWithIntentStarted(context, bundle)) {
            return;
        }
        Class<? extends Activity> callbackClass2 = getCallbackClass();
        Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity == null || LeanplumActivityHelper.isActivityPaused || (callbackClass2 != null && !callbackClass2.isInstance(currentActivity))) {
            Intent actionIntent = getActionIntent(context);
            if (actionIntent == null) {
                return;
            }
            actionIntent.putExtras(bundle);
            actionIntent.addFlags(335544320);
            context.startActivity(actionIntent);
        }
        performPushNotificationAction(bundle);
    }

    public static void overrideDefaultGroupingBehavior(int i, String str) {
        overrideDefaultGroupingBehavior = true;
        minNotificationsToGroup = i;
        defaultNotificationGroupTag = str;
    }

    public static Map<String, Object> parseNotificationBundle(Bundle bundle) {
        try {
            String string = bundle.getString(Constants.Keys.PUSH_MESSAGE_ACTION);
            String string2 = bundle.getString(Constants.Keys.PUSH_MESSAGE_TEXT);
            String messageId = getMessageId(bundle);
            HashMap map = new HashMap();
            map.put(LEANPLUM_ACTION_PARAM, JsonConverter.fromJson(string));
            map.put(LEANPLUM_MESSAGE_PARAM, string2);
            map.put(LEANPLUM_MESSAGE_ID, messageId);
            return map;
        } catch (Throwable unused) {
            Log.i("Failed to parse notification bundle.", new Object[0]);
            return null;
        }
    }

    private static void performPushNotificationAction(@NonNull final Bundle bundle) {
        LeanplumActivityHelper.queueActionUponActive(new VariablesChangedCallback() { // from class: com.leanplum.LeanplumPushService.3
            @Override // com.leanplum.callbacks.VariablesChangedCallback
            public void variablesChanged() {
                try {
                    final String messageId = LeanplumPushService.getMessageId(bundle);
                    if (messageId != null) {
                        if (!LeanplumPushService.areActionsEmbedded(bundle)) {
                            Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback() { // from class: com.leanplum.LeanplumPushService.3.1
                                @Override // com.leanplum.callbacks.VariablesChangedCallback
                                public void variablesChanged() {
                                    try {
                                        LeanplumPushService.requireMessageContent(messageId, new VariablesChangedCallback() { // from class: com.leanplum.LeanplumPushService.3.1.1
                                            @Override // com.leanplum.callbacks.VariablesChangedCallback
                                            public void variablesChanged() {
                                                try {
                                                    LeanplumInternal.performTrackedAction(Constants.Values.DEFAULT_PUSH_ACTION, messageId);
                                                } catch (Throwable th) {
                                                    Log.exception(th);
                                                }
                                            }
                                        });
                                    } catch (Throwable th) {
                                        Log.exception(th);
                                    }
                                }
                            });
                            return;
                        }
                        HashMap map = new HashMap();
                        map.put(Constants.Values.DEFAULT_PUSH_ACTION, JsonConverter.fromJson(bundle.getString(Constants.Keys.PUSH_MESSAGE_ACTION)));
                        ActionContext actionContext = new ActionContext(ActionManager.PUSH_NOTIFICATION_ACTION_NAME, map, messageId);
                        actionContext.preventRealtimeUpdating();
                        actionContext.update();
                        actionContext.runTrackedActionNamed(Constants.Values.DEFAULT_PUSH_ACTION);
                    }
                } catch (Throwable th) {
                    Log.exception(th);
                }
            }
        });
    }

    public static void postHandlePushNotification(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.d("Could not post handle push notification, extras are null.", new Object[0]);
        } else {
            performPushNotificationAction(extras);
        }
    }

    public static Bundle preHandlePushNotification(Context context, Intent intent) {
        if (intent == null) {
            Log.i("Unable to pre handle push notification, Intent is null.", new Object[0]);
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras;
        }
        Log.i("Unable to pre handle push notification, extras are null.", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requireMessageContent(final String str, final VariablesChangedCallback variablesChangedCallback) {
        Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback() { // from class: com.leanplum.LeanplumPushService.1
            @Override // com.leanplum.callbacks.VariablesChangedCallback
            public void variablesChanged() {
                try {
                    Map<String, Object> mapMessages = VarCache.messages();
                    String str2 = str;
                    if (str2 == null || (mapMessages != null && mapMessages.containsKey(str2))) {
                        variablesChangedCallback.variablesChanged();
                        return;
                    }
                    Request requestCreate = RequestBuilder.withGetVarsAction().andParam(Constants.Params.INCLUDE_DEFAULTS, "false").andParam(Constants.Params.INCLUDE_MESSAGE_ID, str).andType(Request.RequestType.IMMEDIATE).create();
                    requestCreate.onResponse(new Request.ResponseCallback() { // from class: com.leanplum.LeanplumPushService.1.1
                        @Override // com.leanplum.internal.Request.ResponseCallback
                        public void response(JSONObject jSONObject) {
                            try {
                                if (jSONObject == null) {
                                    Log.e("No response received from the server. Please contact us to investigate.", new Object[0]);
                                } else {
                                    Map mapMapFromJson = JsonConverter.mapFromJson(jSONObject.optJSONObject("vars"));
                                    Map mapMapFromJson2 = JsonConverter.mapFromJson(jSONObject.optJSONObject(Constants.Keys.MESSAGES));
                                    Map mapMapFromJson3 = JsonConverter.mapFromJson(jSONObject.optJSONObject("regions"));
                                    List listListFromJson = JsonConverter.listFromJson(jSONObject.optJSONArray(Constants.Keys.VARIANTS));
                                    List listListFromJson2 = JsonConverter.listFromJson(jSONObject.optJSONArray(Constants.Keys.LOCAL_CAPS));
                                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vars");
                                    VarCache.applyVariableDiffs(mapMapFromJson, mapMapFromJson2, mapMapFromJson3, listListFromJson, listListFromJson2, null, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null, jSONObject.optString(Constants.Keys.VARS_SIGNATURE));
                                }
                                variablesChangedCallback.variablesChanged();
                            } catch (Throwable th) {
                                Log.exception(th);
                            }
                        }
                    });
                    requestCreate.onError(new Request.ErrorCallback() { // from class: com.leanplum.LeanplumPushService.1.2
                        @Override // com.leanplum.internal.Request.ErrorCallback
                        public void error(Exception exc) {
                            variablesChangedCallback.variablesChanged();
                        }
                    });
                    RequestSender.getInstance().send(requestCreate);
                } catch (Throwable th) {
                    Log.exception(th);
                }
            }
        });
    }

    private static void resolveIntentActivity(Context context, Intent intent) {
        ActivityInfo activityInfo;
        String str;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            return;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && (str = activityInfo.packageName) != null && str.equals(context.getPackageName())) {
                intent.setPackage(resolveInfo.activityInfo.packageName);
                return;
            }
        }
    }

    public static void setCustomizer(LeanplumPushNotificationCustomizer leanplumPushNotificationCustomizer) {
        setCustomizer(leanplumPushNotificationCustomizer, false);
    }

    public static void setCustomizer(LeanplumPushNotificationCustomizer leanplumPushNotificationCustomizer, boolean z) {
        customizer = leanplumPushNotificationCustomizer;
        useNotificationBuilderCustomizer = z;
    }

    public static void setDeeplinkIntentCustomizer(DeeplinkIntentCustomizer deeplinkIntentCustomizer2) {
        deeplinkIntentCustomizer = deeplinkIntentCustomizer2;
    }

    public static void setDefaultCallbackClass(Class<? extends Activity> cls) {
        callbackClass = cls;
    }

    public static void setDefaultNotificationTag(String str) {
        defaultNotificationTag = str;
    }

    public static void setOnPushNotificationOpenedCallback(@NonNull LeanplumOnPushOpenedCallback leanplumOnPushOpenedCallback) {
        onPushOpenedCallback = leanplumOnPushOpenedCallback;
    }

    public static boolean shouldMuteNotification(@NonNull Bundle bundle) {
        if (LeanplumActivityHelper.getCurrentActivity() == null || LeanplumActivityHelper.isActivityPaused) {
            return false;
        }
        return bundle.containsKey(Constants.Keys.PUSH_MESSAGE_ID_MUTE_WITH_ACTION) || bundle.containsKey(Constants.Keys.PUSH_MESSAGE_ID_MUTE);
    }

    public static void showDeviceRegisteredPush(Context context, Context context2) {
        try {
            l1f defaultCompatNotificationBuilder = LeanplumNotificationHelper.getDefaultCompatNotificationBuilder(context, BuildUtil.isNotificationChannelSupported(context));
            if (defaultCompatNotificationBuilder != null) {
                defaultCompatNotificationBuilder.G.icon = R.drawable.star_on;
                defaultCompatNotificationBuilder.e = l1f.c("Leanplum");
                defaultCompatNotificationBuilder.e("Your device is registered.");
                defaultCompatNotificationBuilder.g = PendingIntent.getActivity(context2.getApplicationContext(), 0, new Intent(), BuildUtil.createIntentFlags(0));
                ((NotificationManager) context2.getSystemService("notification")).notify(0, defaultCompatNotificationBuilder.b());
            }
        } catch (Throwable unused) {
        }
    }

    @TargetApi(16)
    private static void showNotification(Context context, Bundle bundle) throws NumberFormatException {
        Bundle bundle2;
        Bitmap bitmap;
        Context context2;
        Notification.Builder notificationBuilder;
        l1f notificationCompatBuilder;
        int iHashCode;
        String string;
        if (context == null || bundle == null) {
            return;
        }
        int defaultPushNotificationIconResourceId = !LeanplumNotificationHelper.isApplicationIconValid(context) ? LeanplumNotificationHelper.getDefaultPushNotificationIconResourceId(context) : 0;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            PendingIntent pendingIntentCreateContentIntent = createContentIntent(context, bundle);
            String applicationName = Util.getApplicationName(context.getApplicationContext());
            if (bundle.getString("title") != null) {
                applicationName = bundle.getString("title");
            }
            String str = applicationName;
            String string2 = bundle.getString(Constants.Keys.PUSH_MESSAGE_TEXT);
            Bitmap bigPictureBitmap = LeanplumNotificationHelper.getBigPictureBitmap(context, bundle.getString(Constants.Keys.PUSH_MESSAGE_IMAGE_URL));
            Bitmap largeIconBitmap = LeanplumNotificationHelper.getLargeIconBitmap(context, bundle.getString(Constants.Keys.PUSH_MESSAGE_ICON_URL));
            LeanplumNotificationHelper.NotificationGroupInfo notificationGroupInfo = LeanplumNotificationHelper.getNotificationGroupInfo(bundle.getString(Constants.Keys.PUSH_NOTIFICATION_GROUP));
            if (LeanplumNotificationHelper.isGroupingSupported().booleanValue() && notificationGroupInfo == null && overrideDefaultGroupingBehavior) {
                notificationGroupInfo = new LeanplumNotificationHelper.NotificationGroupInfo(defaultNotificationGroupTag, NOTIFICATION_GROUP_ID, NOTIFICATION_GROUP_KEY, minNotificationsToGroup);
            }
            LeanplumNotificationHelper.NotificationGroupInfo notificationGroupInfo2 = notificationGroupInfo;
            if (customizer == null || useNotificationBuilderCustomizer) {
                bundle2 = bundle;
                bitmap = bigPictureBitmap;
                context2 = context;
                notificationBuilder = LeanplumNotificationHelper.getNotificationBuilder(context2, bundle2, pendingIntentCreateContentIntent, str, string2, largeIconBitmap, defaultPushNotificationIconResourceId, notificationGroupInfo2);
                notificationCompatBuilder = null;
            } else {
                bundle2 = bundle;
                context2 = context;
                notificationCompatBuilder = LeanplumNotificationHelper.getNotificationCompatBuilder(context2, bundle2, pendingIntentCreateContentIntent, str, string2, largeIconBitmap, bigPictureBitmap, defaultPushNotificationIconResourceId, notificationGroupInfo2);
                bitmap = bigPictureBitmap;
                notificationGroupInfo2 = notificationGroupInfo2;
                notificationBuilder = null;
            }
            if (notificationCompatBuilder == null && notificationBuilder == null) {
                return;
            }
            LeanplumPushNotificationCustomizer leanplumPushNotificationCustomizer = customizer;
            boolean z = leanplumPushNotificationCustomizer != null;
            boolean z2 = useNotificationBuilderCustomizer;
            if ((!z || !(!z2)) || notificationCompatBuilder != null) {
                if (leanplumPushNotificationCustomizer != null && z2 && notificationBuilder == null) {
                    return;
                }
                if (leanplumPushNotificationCustomizer == null && notificationBuilder == null) {
                    return;
                }
                if (leanplumPushNotificationCustomizer != null) {
                    try {
                        if (!z2) {
                            leanplumPushNotificationCustomizer.customize(notificationCompatBuilder, bundle2);
                        } else if (bitmap != null) {
                            Notification.BigPictureStyle bigPictureStyle = LeanplumNotificationHelper.getBigPictureStyle(bundle2, bitmap, str, string2);
                            customizer.customize(notificationBuilder, bundle2, bigPictureStyle);
                            LeanplumNotificationHelper.setModifiedBigPictureStyle(notificationBuilder, bigPictureStyle);
                        } else {
                            leanplumPushNotificationCustomizer.customize(notificationBuilder, bundle2, null);
                        }
                    } catch (Throwable th) {
                        Log.e("Unable to customize push notification: %s", Log.getStackTraceString(th));
                        return;
                    }
                } else if (bitmap != null) {
                    LeanplumNotificationHelper.setModifiedBigPictureStyle(notificationBuilder, LeanplumNotificationHelper.getBigPictureStyle(bundle2, bitmap, str, string2));
                }
                String string3 = bundle2.getString(Constants.Keys.PUSH_MESSAGE_NOTIFICATION_TAG, defaultNotificationTag);
                Object obj = bundle2.get(Constants.Keys.PUSH_MESSAGE_NOTIFICATION_ID);
                if (obj instanceof Number) {
                    iHashCode = ((Number) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iHashCode = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    iHashCode = (!bundle2.containsKey(Constants.Keys.PUSH_MESSAGE_ID) || (string = bundle2.getString(Constants.Keys.PUSH_MESSAGE_ID)) == null) ? 1 : string.hashCode();
                }
                try {
                    if (ActionContext.shouldForceContentUpdateForChainedMessage(JsonConverter.fromJson(bundle2.getString(Constants.Keys.PUSH_MESSAGE_ACTION)))) {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        Leanplum.forceContentUpdate(new VariablesChangedCallback() { // from class: com.leanplum.LeanplumPushService.2
                            @Override // com.leanplum.callbacks.VariablesChangedCallback
                            public void variablesChanged() {
                                countDownLatch.countDown();
                            }
                        });
                        countDownLatch.await(3L, TimeUnit.SECONDS);
                    }
                    if (notificationBuilder != null) {
                        notificationManager.notify(string3, iHashCode, notificationBuilder.build());
                        maybePostGroupSummary(context2, notificationManager, bundle2, notificationGroupInfo2);
                    } else {
                        notificationManager.notify(string3, iHashCode, notificationCompatBuilder.b());
                        maybePostGroupSummary(context2, notificationManager, bundle2, notificationGroupInfo2);
                    }
                } catch (NullPointerException e) {
                    Log.e("Unable to show push notification.", e);
                } catch (Throwable th2) {
                    Log.e("Unable to show push notification.", th2);
                    Log.exception(th2);
                }
            }
        }
    }

    public static void unregister() {
        try {
            Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
            Context context = Leanplum.getContext();
            intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), BuildUtil.createIntentFlags(0)));
            intent.setPackage("com.google.android.gms");
            context.startService(intent);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }
}
