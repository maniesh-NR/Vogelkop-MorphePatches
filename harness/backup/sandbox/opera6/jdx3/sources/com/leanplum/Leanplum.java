package com.leanplum;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.leanplum.ActionContext;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.MessageDisplayedCallback;
import com.leanplum.callbacks.RegisterDeviceCallback;
import com.leanplum.callbacks.RegisterDeviceFinishedCallback;
import com.leanplum.callbacks.StartCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.internal.APIConfig;
import com.leanplum.internal.ApiConfigLoader;
import com.leanplum.internal.Constants;
import com.leanplum.internal.CountAggregator;
import com.leanplum.internal.FeatureFlagManager;
import com.leanplum.internal.FileManager;
import com.leanplum.internal.FileTransferManager;
import com.leanplum.internal.JsonConverter;
import com.leanplum.internal.LeanplumEventDataManager;
import com.leanplum.internal.LeanplumInternal;
import com.leanplum.internal.Log;
import com.leanplum.internal.OperationQueue;
import com.leanplum.internal.Registration;
import com.leanplum.internal.Request;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.internal.RequestSender;
import com.leanplum.internal.RequestSenderTimer;
import com.leanplum.internal.RequestUtil;
import com.leanplum.internal.Util;
import com.leanplum.internal.VarCache;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.messagetemplates.MessageTemplates;
import com.leanplum.models.GeofenceEventType;
import com.leanplum.models.MessageArchiveData;
import com.leanplum.utils.BuildUtil;
import com.leanplum.utils.SharedPreferencesUtil;
import defpackage.pza;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Leanplum {
    public static final int ACTION_KIND_ACTION = 2;
    public static final int ACTION_KIND_MESSAGE = 1;
    private static final String LEANPLUM_NOTIFICATION_CHANNEL = "com.leanplum.LeanplumNotificationChannel";
    private static final String LEANPLUM_PUSH_SERVICE = "com.leanplum.LeanplumPushService";
    public static final String PURCHASE_EVENT_NAME = "Purchase";
    private static Context context;
    private static volatile String customCountryCode;
    private static String customDeviceId;
    private static RegisterDeviceFinishedCallback registerDeviceFinishedHandler;
    private static RegisterDeviceCallback registerDeviceHandler;
    private static boolean userSpecifiedDeviceId;
    private static final ArrayList<StartCallback> startHandlers = new ArrayList<>();
    private static final ArrayList<VariablesChangedCallback> variablesChangedHandlers = new ArrayList<>();
    private static final ArrayList<VariablesChangedCallback> noDownloadsHandlers = new ArrayList<>();
    private static final ArrayList<VariablesChangedCallback> onceNoDownloadsHandlers = new ArrayList<>();
    private static final ArrayList<MessageDisplayedCallback> messageDisplayedHandlers = new ArrayList<>();
    private static final Object heartbeatLock = new Object();
    private static LeanplumDeviceIdMode deviceIdMode = LeanplumDeviceIdMode.MD5_MAC_ADDRESS;
    private static String customAppVersion = null;
    private static boolean locationCollectionEnabled = true;
    private static volatile boolean pushDeliveryTrackingEnabled = true;
    private static Map<String, Object> customParams = new HashMap();
    private static CountAggregator countAggregator = new CountAggregator();
    private static FeatureFlagManager featureFlagManager = FeatureFlagManager.INSTANCE;

    /* renamed from: com.leanplum.Leanplum$20, reason: invalid class name */
    static /* synthetic */ class AnonymousClass20 {
        static final /* synthetic */ int[] $SwitchMap$com$leanplum$PushProviderType;

        static {
            int[] iArr = new int[PushProviderType.values().length];
            $SwitchMap$com$leanplum$PushProviderType = iArr;
            try {
                iArr[PushProviderType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$leanplum$PushProviderType[PushProviderType.MIPUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private Leanplum() {
    }

    public static void addMessageDisplayedHandler(MessageDisplayedCallback messageDisplayedCallback) {
        if (messageDisplayedCallback == null) {
            Log.e("addMessageDisplayedHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<MessageDisplayedCallback> arrayList = messageDisplayedHandlers;
        synchronized (arrayList) {
            arrayList.add(messageDisplayedCallback);
        }
    }

    public static void addOnceVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            Log.e("addOnceVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        if (VarCache.hasReceivedDiffs() && FileTransferManager.getInstance().numPendingDownloads() == 0) {
            variablesChangedCallback.variablesChanged();
            return;
        }
        ArrayList<VariablesChangedCallback> arrayList = onceNoDownloadsHandlers;
        synchronized (arrayList) {
            arrayList.add(variablesChangedCallback);
        }
    }

    public static void addStartResponseHandler(StartCallback startCallback) {
        if (startCallback == null) {
            Log.e("addStartResponseHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        if (LeanplumInternal.hasStarted()) {
            if (LeanplumInternal.isStartSuccessful()) {
                startCallback.setSuccess(true);
            }
            startCallback.run();
        } else {
            ArrayList<StartCallback> arrayList = startHandlers;
            synchronized (arrayList) {
                if (arrayList.indexOf(startCallback) == -1) {
                    arrayList.add(startCallback);
                }
            }
        }
    }

    public static void addVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            Log.e("addVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<VariablesChangedCallback> arrayList = noDownloadsHandlers;
        synchronized (arrayList) {
            arrayList.add(variablesChangedCallback);
        }
        if (VarCache.hasReceivedDiffs() && FileTransferManager.getInstance().numPendingDownloads() == 0) {
            variablesChangedCallback.variablesChanged();
        }
    }

    public static void addVariablesChangedHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            Log.e("addVariablesChangedHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<VariablesChangedCallback> arrayList = variablesChangedHandlers;
        synchronized (arrayList) {
            arrayList.add(variablesChangedCallback);
        }
        if (VarCache.hasReceivedDiffs()) {
            variablesChangedCallback.variablesChanged();
        }
    }

    public static void advanceTo(String str) {
        advanceTo(str, "", null);
    }

    public static void advanceTo(String str, String str2) {
        advanceTo(str, str2, null);
    }

    public static void advanceTo(final String str, String str2, Map<String, ?> map) {
        final Map mapValidateAttributes;
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call advanceTo before calling start", new Object[0]);
            return;
        }
        try {
            final HashMap map2 = new HashMap();
            map2.put(Constants.Params.INFO, str2);
            map2.put(Constants.Params.STATE, str);
            if (map != null) {
                mapValidateAttributes = LeanplumInternal.validateAttributes(map, Constants.Params.PARAMS, false);
                map2.put(Constants.Params.PARAMS, JsonConverter.toJson(mapValidateAttributes));
            } else {
                mapValidateAttributes = null;
            }
            if (LeanplumInternal.issuedStart()) {
                advanceToInternal(str, mapValidateAttributes, map2);
            } else {
                LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.14
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Leanplum.advanceToInternal(str, mapValidateAttributes, map2);
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void advanceTo(String str, Map<String, ?> map) {
        advanceTo(str, "", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void advanceToInternal(String str, Map<String, ?> map, Map<String, Object> map2) {
        RequestSender.getInstance().send(RequestBuilder.withAdvanceAction().andParams(map2).create());
        ActionContext.ContextualValues contextualValues = new ActionContext.ContextualValues();
        contextualValues.parameters = map;
        LeanplumInternal.maybePerformActions(Constants.Params.STATE, str, 3, (String) null, contextualValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyContentInResponse(JSONObject jSONObject) {
        Map mapMapFromJsonOrDefault = JsonConverter.mapFromJsonOrDefault(jSONObject.optJSONObject("vars"));
        Map mapMapFromJsonOrDefault2 = JsonConverter.mapFromJsonOrDefault(jSONObject.optJSONObject(Constants.Keys.MESSAGES));
        Map mapMapFromJsonOrDefault3 = JsonConverter.mapFromJsonOrDefault(jSONObject.optJSONObject("regions"));
        List listListFromJsonOrDefault = JsonConverter.listFromJsonOrDefault(jSONObject.optJSONArray(Constants.Keys.VARIANTS));
        List listListFromJsonOrDefault2 = JsonConverter.listFromJsonOrDefault(jSONObject.optJSONArray(Constants.Keys.LOCAL_CAPS));
        Map mapMapFromJsonOrDefault4 = JsonConverter.mapFromJsonOrDefault(jSONObject.optJSONObject(Constants.Keys.VARIANT_DEBUG_INFO));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vars");
        VarCache.applyVariableDiffs(mapMapFromJsonOrDefault, mapMapFromJsonOrDefault2, mapMapFromJsonOrDefault3, listListFromJsonOrDefault, listListFromJsonOrDefault2, mapMapFromJsonOrDefault4, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null, jSONObject.optString(Constants.Keys.VARS_SIGNATURE));
    }

    private static void checkAndStartNotificationsModules() {
        try {
            Log.d("Trying to start LeanplumPushService", new Object[0]);
            String str = LeanplumPushService.LEANPLUM_SENDER_ID;
            LeanplumPushService.class.getDeclaredMethod("onStart", null).invoke(null, null);
        } catch (Throwable unused) {
        }
    }

    public static void clearUserContent() {
        VarCache.clearUserContent();
    }

    public static CountAggregator countAggregator() {
        return countAggregator;
    }

    public static void defineAction(String str, int i, ActionArgs actionArgs) {
        defineAction(str, i, actionArgs, null, null);
    }

    public static void defineAction(String str, int i, ActionArgs actionArgs, ActionCallback actionCallback) {
        defineAction(str, i, actionArgs, null, actionCallback);
    }

    private static void defineAction(String str, int i, ActionArgs actionArgs, Map<String, Object> map, ActionCallback actionCallback) {
        if (TextUtils.isEmpty(str)) {
            Log.e("defineAction - Empty name parameter provided.", new Object[0]);
            return;
        }
        if (actionArgs == null) {
            Log.e("defineAction - Invalid args parameter provided.", new Object[0]);
            return;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                Log.exception(th);
                return;
            }
        }
        LeanplumInternal.getActionHandlers().remove(str);
        VarCache.registerActionDefinition(str, i, actionArgs.getValue(), map);
        if (actionCallback != null) {
            onAction(str, actionCallback);
        }
    }

    public static void disableLocationCollection() {
        locationCollectionEnabled = false;
    }

    public static void enableTestMode() {
        Constants.isTestMode = true;
    }

    @Deprecated
    public static void enableVerboseLoggingInDevelopmentMode() {
        setLogLevel(3);
    }

    public static FeatureFlagManager featureFlagManager() {
        return featureFlagManager;
    }

    private static Map<String, Object> fillCommonParameters(Map<String, Object> map) {
        String string = SharedPreferencesUtil.getString(context, Constants.Defaults.LEANPLUM_PUSH, Constants.Defaults.PROPERTY_FCM_TOKEN_ID);
        String string2 = SharedPreferencesUtil.getString(context, Constants.Defaults.LEANPLUM_PUSH, Constants.Defaults.PROPERTY_MIPUSH_TOKEN_ID);
        if (!TextUtils.isEmpty(string)) {
            map.put(Constants.Params.DEVICE_FCM_PUSH_TOKEN, string);
        }
        if (!TextUtils.isEmpty(string2)) {
            map.put(Constants.Params.DEVICE_MIPUSH_TOKEN, string2);
        }
        Object versionName = Util.getVersionName();
        Object obj = customAppVersion;
        if (obj != null) {
            versionName = obj;
        }
        if (versionName == null) {
            versionName = "";
        }
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getOffset(new Date().getTime()) / 1000;
        map.put(Constants.Params.INCLUDE_DEFAULTS, "false");
        map.put(Constants.Params.VERSION_NAME, versionName);
        map.put(Constants.Params.DEVICE_NAME, Util.getDeviceName());
        map.put(Constants.Params.DEVICE_MODEL, Util.getDeviceModel());
        map.put(Constants.Params.DEVICE_SYSTEM_NAME, Util.getSystemName());
        map.put(Constants.Params.DEVICE_SYSTEM_VERSION, Util.getSystemVersion());
        map.put(Constants.Keys.TIMEZONE, timeZone.getID());
        map.put(Constants.Keys.TIMEZONE_OFFSET_SECONDS, Integer.toString(offset));
        map.put(Constants.Keys.LOCALE, Util.getLocale());
        if (customCountryCode != null) {
            map.put(Constants.Keys.COUNTRY, customCountryCode);
        } else {
            map.put(Constants.Keys.COUNTRY, Constants.Values.DETECT);
        }
        map.put(Constants.Keys.REGION, Constants.Values.DETECT);
        map.put(Constants.Keys.CITY, Constants.Values.DETECT);
        map.put(Constants.Keys.LOCATION, Constants.Values.DETECT);
        if (Constants.isDevelopmentModeEnabled) {
            map.put(Constants.Params.DEV_MODE, "true");
        }
        Object daysSinceInstall = Util.getDaysSinceInstall();
        if (daysSinceInstall != null) {
            map.put(Constants.Params.DAYS_SINCE_INSTALL, daysSinceInstall);
        }
        if (!customParams.isEmpty()) {
            map.putAll(customParams);
        }
        map.put("newsfeedMessages", LeanplumInbox.getInstance().messagesIds());
        map.put(Constants.Params.INCLUDE_VARIANT_DEBUG_INFO, Boolean.valueOf(LeanplumInternal.getIsVariantDebugInfoEnabled()));
        return map;
    }

    public static void forceContentUpdate() {
        forceContentUpdate(null);
    }

    public static void forceContentUpdate(final VariablesChangedCallback variablesChangedCallback) {
        if (Constants.isNoop()) {
            OperationQueue.sharedInstance().addUiOperation(variablesChangedCallback);
            return;
        }
        try {
            Request requestCreate = RequestBuilder.withGetVarsAction().andParams(fillCommonParameters(new HashMap())).andType(Request.RequestType.IMMEDIATE).create();
            requestCreate.onResponse(new Request.ResponseCallback() { // from class: com.leanplum.Leanplum.17
                @Override // com.leanplum.internal.Request.ResponseCallback
                public void response(JSONObject jSONObject) {
                    try {
                        if (jSONObject == null) {
                            Log.e("No response received from the server. Please contact us to investigate.", new Object[0]);
                        } else {
                            Leanplum.applyContentInResponse(jSONObject);
                            if (jSONObject.optBoolean(Constants.Keys.SYNC_INBOX, false)) {
                                LeanplumInbox.getInstance().downloadMessages();
                            } else {
                                LeanplumInbox.getInstance().triggerInboxSyncedWithStatus(true);
                            }
                            if (jSONObject.optBoolean(Constants.Keys.LOGGING_ENABLED, false)) {
                                Constants.loggingEnabled = true;
                            }
                            Leanplum.parseVariantDebugInfo(jSONObject);
                            FileManager.setFilenameToURLs(Leanplum.parseFilenameToURLs(jSONObject));
                        }
                        OperationQueue.sharedInstance().addUiOperation(variablesChangedCallback);
                    } catch (Throwable th) {
                        Log.exception(th);
                    }
                }
            });
            requestCreate.onError(new Request.ErrorCallback() { // from class: com.leanplum.Leanplum.18
                @Override // com.leanplum.internal.Request.ErrorCallback
                public void error(Exception exc) {
                    OperationQueue.sharedInstance().addUiOperation(variablesChangedCallback);
                    LeanplumInbox.getInstance().triggerInboxSyncedWithStatus(false);
                }
            });
            RequestSender.getInstance().send(requestCreate);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static Context getContext() {
        if (context == null) {
            Log.e("Your application context is not set. You should call Leanplum.setApplicationContext(this) or LeanplumActivityHelper.enableLifecycleCallbacks(this) in your application's onCreate method, or have your application extend LeanplumApplication.", new Object[0]);
        }
        return context;
    }

    public static String getDeviceId() {
        if (LeanplumInternal.hasCalledStart()) {
            return APIConfig.getInstance().deviceId();
        }
        Log.i("Leanplum.start() must be called before calling getDeviceId.", new Object[0]);
        return null;
    }

    public static LeanplumInbox getInbox() {
        return LeanplumInbox.getInstance();
    }

    public static String getUserId() {
        if (hasStarted()) {
            return APIConfig.getInstance().userId();
        }
        Log.e("Leanplum.start() must be called before calling getUserId()", new Object[0]);
        return null;
    }

    public static Map<String, Object> getVariantDebugInfo() {
        return VarCache.getVariantDebugInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleStartResponse(JSONObject jSONObject) {
        RegisterDeviceCallback registerDeviceCallback;
        if (!RequestUtil.isResponseSuccess(jSONObject)) {
            try {
                LeanplumInternal.setHasStarted(true);
                LeanplumInternal.setStartSuccessful(false);
                VarCache.loadDiffs();
            } finally {
                try {
                    Log.exception(th);
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            LeanplumInternal.setHasStarted(true);
            LeanplumInternal.setStartSuccessful(true);
            if (jSONObject.optJSONObject("vars") == null) {
                Log.e("No variable values were received from the server. Please contact us to investigate.", new Object[0]);
            }
            if (jSONObject.optJSONObject(Constants.Keys.MESSAGES) == null) {
                Log.d("No messages received from the server.", new Object[0]);
            }
            if (jSONObject.optJSONObject("regions") == null) {
                Log.d("No regions received from the server.", new Object[0]);
            }
            if (jSONObject.optJSONArray(Constants.Keys.VARIANTS) == null) {
                Log.d("No variants received from the server.", new Object[0]);
            }
            FileManager.setFilenameToURLs(parseFilenameToURLs(jSONObject));
            if (BuildUtil.isNotificationChannelSupported(context)) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.Keys.NOTIFICATION_CHANNELS);
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(Constants.Keys.NOTIFICATION_GROUPS);
                String strOptString = jSONObject.optString(Constants.Keys.DEFAULT_NOTIFICATION_CHANNEL);
                try {
                    int i = LeanplumNotificationChannel.a;
                    LeanplumNotificationChannel.class.getDeclaredMethod("configureChannels", Context.class, JSONArray.class, JSONArray.class, String.class).invoke(new Object(), context, jSONArrayOptJSONArray2, jSONArrayOptJSONArray, strOptString);
                } catch (Throwable unused) {
                }
            }
            APIConfig.getInstance().setToken(jSONObject.optString("token", null));
            APIConfig.getInstance().saveToken();
            applyContentInResponse(jSONObject);
            VarCache.saveUserAttributes();
            if (jSONObject.optBoolean(Constants.Keys.SYNC_INBOX, false)) {
                LeanplumInbox.getInstance().downloadMessages();
            }
            if (jSONObject.optBoolean(Constants.Keys.LOGGING_ENABLED, false)) {
                Constants.loggingEnabled = true;
            }
            countAggregator.setEnabledCounters(parseSdkCounters(jSONObject));
            FeatureFlagManager.INSTANCE.setEnabledFeatureFlags(parseFeatureFlags(jSONObject));
            parseVariantDebugInfo(jSONObject);
            if (Constants.isDevelopmentModeEnabled) {
                final Context currentActivity = (LeanplumActivityHelper.getCurrentActivity() == context || LeanplumActivityHelper.getCurrentActivity() == null) ? context : LeanplumActivityHelper.getCurrentActivity();
                if (!jSONObject.optBoolean(Constants.Keys.IS_REGISTERED) && (registerDeviceCallback = registerDeviceHandler) != null) {
                    registerDeviceCallback.setResponseHandler(new RegisterDeviceCallback.EmailCallback() { // from class: com.leanplum.Leanplum.6
                        @Override // com.leanplum.callbacks.RegisterDeviceCallback.EmailCallback
                        public void onResponse(String str) {
                            if (str != null) {
                                try {
                                    Registration.registerDevice(str, new StartCallback() { // from class: com.leanplum.Leanplum.6.1
                                        @Override // com.leanplum.callbacks.StartCallback
                                        public void onResponse(boolean z) {
                                            if (Leanplum.registerDeviceFinishedHandler != null) {
                                                Leanplum.registerDeviceFinishedHandler.setSuccess(z);
                                                OperationQueue.sharedInstance().addUiOperation(Leanplum.registerDeviceFinishedHandler);
                                            }
                                            if (z) {
                                                try {
                                                    LeanplumInternal.onHasStartedAndRegisteredAsDeveloper();
                                                } catch (Throwable th) {
                                                    Log.exception(th);
                                                }
                                            }
                                        }
                                    });
                                } catch (Throwable th) {
                                    Log.exception(th);
                                }
                            }
                        }
                    });
                    OperationQueue.sharedInstance().addUiOperation(registerDeviceHandler);
                }
                if (jSONObject.optBoolean(Constants.Keys.IS_REGISTERED_FROM_OTHER_APP)) {
                    OperationQueue.sharedInstance().addUiOperation(new Runnable() { // from class: com.leanplum.Leanplum.7
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String str = LeanplumPushService.LEANPLUM_SENDER_ID;
                                LeanplumPushService.class.getDeclaredMethod("showDeviceRegistedPush", Context.class, Context.class).invoke(new Object(), Leanplum.context, currentActivity);
                            } catch (Throwable unused2) {
                            }
                        }
                    });
                }
                boolean zOptBoolean = jSONObject.optBoolean(Constants.Keys.IS_REGISTERED);
                String strOptString2 = jSONObject.optString(Constants.Keys.LATEST_VERSION);
                if (zOptBoolean && !TextUtils.isEmpty(strOptString2)) {
                    Log.i("Version %s of Leanplum SDK is available. Update your gradle dependencies to use it.", strOptString2);
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.Keys.VARS_FROM_CODE);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(Constants.Params.ACTION_DEFINITIONS);
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(Constants.Params.FILE_ATTRIBUTES);
                if (jSONObjectOptJSONObject3 == null) {
                    jSONObjectOptJSONObject3 = new JSONObject();
                }
                VarCache.setDevModeValuesFromServer(JsonConverter.mapFromJson(jSONObjectOptJSONObject), JsonConverter.mapFromJson(jSONObjectOptJSONObject3), JsonConverter.mapFromJson(jSONObjectOptJSONObject2));
                if (zOptBoolean) {
                    LeanplumInternal.onHasStartedAndRegisteredAsDeveloper();
                }
            }
            LeanplumInternal.moveToForeground();
            startRequestTimer();
        } finally {
            try {
            } finally {
            }
        }
    }

    public static boolean hasStarted() {
        return LeanplumInternal.hasStarted();
    }

    public static boolean hasStartedAndRegisteredAsDeveloper() {
        return LeanplumInternal.hasStartedAndRegisteredAsDeveloper();
    }

    public static boolean isLocationCollectionEnabled() {
        return locationCollectionEnabled;
    }

    public static boolean isPushDeliveryTrackingEnabled() {
        return pushDeliveryTrackingEnabled;
    }

    public static boolean isResourceSyncingEnabled() {
        return FileManager.isResourceSyncingEnabled();
    }

    public static boolean isScreenTrackingEnabled() {
        return LeanplumInternal.getIsScreenTrackingEnabled();
    }

    public static boolean isTestModeEnabled() {
        return Constants.isTestMode;
    }

    private static void loadApiConfigFromResources() {
        new ApiConfigLoader(getContext()).loadFromResources(new pza((byte) 28), new pza((byte) 29));
    }

    private static MessageArchiveData messageArchiveDataFromContext(ActionContext actionContext) {
        String strMessageBodyFromContext;
        String messageId = actionContext.getMessageId();
        try {
            strMessageBodyFromContext = messageBodyFromContext(actionContext);
        } catch (Throwable th) {
            Log.exception(th);
            strMessageBodyFromContext = "";
        }
        return new MessageArchiveData(messageId, strMessageBodyFromContext, getUserId(), new Date());
    }

    public static String messageBodyFromContext(ActionContext actionContext) {
        Object obj = actionContext.getArgs().get(MessageTemplateConstants.Args.MESSAGE);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        HashMap map = (HashMap) obj;
        if (map.get("Text") != null && (map.get("Text") instanceof String)) {
            return (String) map.get("Text");
        }
        if (map.get("Text value") == null || !(map.get("Text value") instanceof String)) {
            return null;
        }
        return (String) map.get("Text value");
    }

    public static Map<String, Object> messageMetadata() {
        Map<String, Object> mapMessages = VarCache.messages();
        return mapMessages == null ? new HashMap() : mapMessages;
    }

    public static Object objectForKeyPath(Object... objArr) {
        return objectForKeyPathComponents(objArr);
    }

    public static Object objectForKeyPathComponents(Object[] objArr) {
        try {
            return VarCache.getMergedValueFromComponentArray(objArr);
        } catch (Throwable th) {
            Log.exception(th);
            return null;
        }
    }

    public static void onAction(String str, ActionCallback actionCallback) {
        if (str == null) {
            Log.e("onAction - Invalid actionName parameter provided.", new Object[0]);
            return;
        }
        if (actionCallback == null) {
            Log.e("onAction - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        List<ActionCallback> arrayList = LeanplumInternal.getActionHandlers().get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            LeanplumInternal.getActionHandlers().put(str, arrayList);
        }
        arrayList.add(actionCallback);
    }

    public static Set<String> parseFeatureFlags(JSONObject jSONObject) {
        return toSet(jSONObject.optJSONArray(Constants.Keys.ENABLED_FEATURE_FLAGS));
    }

    public static Map<String, String> parseFilenameToURLs(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.Keys.FILES);
        if (jSONObjectOptJSONObject != null) {
            return JsonConverter.mapFromJson(jSONObjectOptJSONObject);
        }
        return null;
    }

    public static Set<String> parseSdkCounters(JSONObject jSONObject) {
        return toSet(jSONObject.optJSONArray(Constants.Keys.ENABLED_COUNTERS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parseVariantDebugInfo(JSONObject jSONObject) {
        Map mapMapFromJsonOrDefault = JsonConverter.mapFromJsonOrDefault(jSONObject.optJSONObject(Constants.Keys.VARIANT_DEBUG_INFO));
        if (mapMapFromJsonOrDefault.size() > 0) {
            VarCache.setVariantDebugInfo(mapMapFromJsonOrDefault);
        }
    }

    public static String pathForResource(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("pathForResource - Empty filename parameter provided.", new Object[0]);
            return null;
        }
        Var<String> varDefineFile = Var.defineFile(str, str);
        if (varDefineFile != null) {
            return varDefineFile.fileValue();
        }
        return null;
    }

    public static void pause() {
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call pause before calling start", new Object[0]);
        } else if (LeanplumInternal.issuedStart()) {
            pauseInternal();
        } else {
            LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Leanplum.pauseInternal();
                    } catch (Throwable th) {
                        Log.exception(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pauseInternal() {
        RequestSender.getInstance().send(RequestBuilder.withPauseSessionAction().andType(Request.RequestType.IMMEDIATE).create());
        stopRequestTimer();
        LeanplumInternal.setIsPaused(true);
    }

    public static void pauseState() {
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call pauseState before calling start", new Object[0]);
            return;
        }
        try {
            if (LeanplumInternal.issuedStart()) {
                pauseStateInternal();
            } else {
                LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.15
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Leanplum.pauseStateInternal();
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pauseStateInternal() {
        RequestSender.getInstance().send(RequestBuilder.withPauseStateAction().create());
    }

    public static void removeMessageDisplayedHandler(MessageDisplayedCallback messageDisplayedCallback) {
        if (messageDisplayedCallback == null) {
            Log.e("removeMessageDisplayedHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<MessageDisplayedCallback> arrayList = messageDisplayedHandlers;
        synchronized (arrayList) {
            arrayList.remove(messageDisplayedCallback);
        }
    }

    public static void removeOnceVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            Log.e("removeOnceVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<VariablesChangedCallback> arrayList = onceNoDownloadsHandlers;
        synchronized (arrayList) {
            arrayList.remove(variablesChangedCallback);
        }
    }

    public static void removeStartResponseHandler(StartCallback startCallback) {
        if (startCallback == null) {
            Log.e("removeStartResponseHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<StartCallback> arrayList = startHandlers;
        synchronized (arrayList) {
            arrayList.remove(startCallback);
        }
    }

    public static void removeVariablesChangedAndNoDownloadsPendingHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            Log.e("removeVariablesChangedAndNoDownloadsPendingHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<VariablesChangedCallback> arrayList = noDownloadsHandlers;
        synchronized (arrayList) {
            arrayList.remove(variablesChangedCallback);
        }
    }

    public static void removeVariablesChangedHandler(VariablesChangedCallback variablesChangedCallback) {
        if (variablesChangedCallback == null) {
            Log.e("removeVariablesChangedHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<VariablesChangedCallback> arrayList = variablesChangedHandlers;
        synchronized (arrayList) {
            arrayList.remove(variablesChangedCallback);
        }
    }

    public static void resume() {
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call resume before calling start", new Object[0]);
        } else if (LeanplumInternal.issuedStart()) {
            resumeInternal();
        } else {
            LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Leanplum.resumeInternal();
                    } catch (Throwable th) {
                        Log.exception(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resumeInternal() {
        RequestSender.getInstance().send(RequestBuilder.withResumeSessionAction().andType(Request.RequestType.IMMEDIATE).create());
        if (LeanplumInternal.hasStartedInBackground()) {
            LeanplumInternal.setStartedInBackground(false);
        } else {
            LeanplumInternal.maybePerformActions("resume", (String) null, 3, (String) null, (ActionContext.ContextualValues) null);
        }
        startRequestTimer();
        LeanplumInternal.setIsPaused(false);
    }

    public static void resumeState() {
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call resumeState before calling start", new Object[0]);
            return;
        }
        try {
            if (LeanplumInternal.issuedStart()) {
                resumeStateInternal();
            } else {
                LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.16
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Leanplum.resumeStateInternal();
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resumeStateInternal() {
        RequestSender.getInstance().send(RequestBuilder.withResumeStateAction().create());
    }

    @Nullable
    public static SecuredVars securedVars() {
        return VarCache.getSecuredVars();
    }

    public static void setApiConnectionSettings(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Log.i("setApiConnectionSettings - Empty hostname parameter provided.", new Object[0]);
        } else {
            if (TextUtils.isEmpty(str2)) {
                Log.i("setApiConnectionSettings - Empty servletName parameter provided.", new Object[0]);
                return;
            }
            Constants.API_HOST_NAME = str;
            Constants.API_SERVLET = str2;
            Constants.API_SSL = z;
        }
    }

    public static void setAppIdForDevelopmentMode(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.e("setAppIdForDevelopmentMode - Empty appId parameter provided.", new Object[0]);
        } else if (TextUtils.isEmpty(str2)) {
            Log.e("setAppIdForDevelopmentMode - Empty accessKey parameter provided.", new Object[0]);
        } else {
            Constants.isDevelopmentModeEnabled = true;
            APIConfig.getInstance().setAppId(str, str2);
        }
    }

    public static void setAppIdForProductionMode(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.e("setAppIdForProductionMode - Empty appId parameter provided.", new Object[0]);
        } else if (TextUtils.isEmpty(str2)) {
            Log.e("setAppIdForProductionMode - Empty accessKey parameter provided.", new Object[0]);
        } else {
            Constants.isDevelopmentModeEnabled = false;
            APIConfig.getInstance().setAppId(str, str2);
        }
    }

    public static void setAppVersion(String str) {
        customAppVersion = str;
    }

    public static void setApplicationContext(Context context2) {
        if (context2 == null) {
            Log.i("setApplicationContext - Null context parameter provided.", new Object[0]);
        }
        context = context2;
    }

    public static void setClient(String str, String str2, String str3) {
        Constants.CLIENT = str;
        Constants.LEANPLUM_VERSION = str2;
        Constants.defaultDeviceId = str3;
    }

    public static void setCountry(String str) {
        customCountryCode = str;
    }

    public static void setCustomParam(String str, Object obj) {
        customParams.put(str, obj);
    }

    public static void setDeviceId(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("setDeviceId - Empty deviceId parameter provided.", new Object[0]);
        }
        customDeviceId = str;
        userSpecifiedDeviceId = true;
    }

    public static void setDeviceIdMode(LeanplumDeviceIdMode leanplumDeviceIdMode) {
        if (leanplumDeviceIdMode == null) {
            Log.i("setDeviceIdMode - Invalid mode parameter provided.", new Object[0]);
        } else {
            deviceIdMode = leanplumDeviceIdMode;
            userSpecifiedDeviceId = true;
        }
    }

    public static void setDeviceLocation(Location location) {
        setDeviceLocation(location, LeanplumLocationAccuracyType.CELL);
    }

    public static void setDeviceLocation(Location location, LeanplumLocationAccuracyType leanplumLocationAccuracyType) {
        if (locationCollectionEnabled) {
            Log.i("Leanplum is automatically collecting device location, so there is no need to call setDeviceLocation. If you prefer to always set location manually, then call disableLocationCollection.", new Object[0]);
        }
        LeanplumInternal.setUserLocationAttribute(location, leanplumLocationAccuracyType, new LeanplumInternal.locationAttributeRequestsCallback() { // from class: com.leanplum.Leanplum.19
            @Override // com.leanplum.internal.LeanplumInternal.locationAttributeRequestsCallback
            public void response(boolean z) {
                if (z) {
                    Log.d("setUserAttributes with location is successfully called", new Object[0]);
                }
            }
        });
    }

    public static void setEnableMultipleInAppsWithPriorityZero(boolean z) {
        Constants.enableMultipleActionsWithPriorityZero = true;
    }

    public static void setEventsUploadInterval(EventsUploadInterval eventsUploadInterval) {
        if (eventsUploadInterval != null) {
            RequestSenderTimer.get().setTimerInterval(eventsUploadInterval);
        }
    }

    public static void setFileUploadingEnabledInDevelopmentMode(boolean z) {
        Constants.enableFileUploadingInDevelopmentMode = z;
    }

    public static void setIsTestModeEnabled(boolean z) {
        Constants.isTestMode = z;
    }

    public static void setLogLevel(int i) {
        Log.setLogLevel(i);
    }

    public static void setNetworkTimeout(int i, int i2) {
        if (i < 0) {
            Log.i("setNetworkTimeout - Invalid seconds parameter provided.", new Object[0]);
        } else if (i2 < 0) {
            Log.i("setNetworkTimeout - Invalid downloadSeconds parameter provided.", new Object[0]);
        } else {
            Constants.NETWORK_TIMEOUT_SECONDS = i;
            Constants.NETWORK_TIMEOUT_SECONDS_FOR_DOWNLOADS = i2;
        }
    }

    public static void setPushDeliveryTracking(boolean z) {
        pushDeliveryTrackingEnabled = z;
    }

    public static void setRegistrationId(PushProviderType pushProviderType, final String str) {
        final String str2;
        if (Constants.isNoop()) {
            return;
        }
        int i = AnonymousClass20.$SwitchMap$com$leanplum$PushProviderType[pushProviderType.ordinal()];
        if (i == 1) {
            str2 = Constants.Params.DEVICE_FCM_PUSH_TOKEN;
        } else if (i != 2) {
            return;
        } else {
            str2 = Constants.Params.DEVICE_MIPUSH_TOKEN;
        }
        LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.12
            @Override // java.lang.Runnable
            public void run() {
                if (Constants.isNoop()) {
                    return;
                }
                try {
                    RequestSender.getInstance().send(RequestBuilder.withSetDeviceAttributesAction().andParam(str2, str).andType(Request.RequestType.IMMEDIATE).create());
                } catch (Throwable th) {
                    Log.exception(th);
                }
            }
        });
    }

    public static void setSocketConnectionSettings(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            Log.i("setSocketConnectionSettings - Empty hostName parameter provided.", new Object[0]);
        } else if (i < 1 || i > 65535) {
            Log.i("setSocketConnectionSettings - Invalid port parameter provided.", new Object[0]);
        } else {
            Constants.SOCKET_HOST = str;
            Constants.SOCKET_PORT = i;
        }
    }

    public static void setTrafficSourceInfo(Map<String, String> map) {
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call setTrafficSourceInfo before calling start", new Object[0]);
            return;
        }
        if (map == null || map.isEmpty()) {
            Log.e("setTrafficSourceInfo - Invalid info parameter provided (null or empty).", new Object[0]);
            return;
        }
        try {
            final HashMap map2 = new HashMap();
            map2.put(Constants.Params.TRAFFIC_SOURCE, JsonConverter.toJson(LeanplumInternal.validateAttributes(map, Constants.Params.INFO, false)));
            if (LeanplumInternal.issuedStart()) {
                setTrafficSourceInfoInternal(map2);
            } else {
                LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.13
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Leanplum.setTrafficSourceInfoInternal(map2);
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTrafficSourceInfoInternal(HashMap<String, Object> map) {
        RequestSender.getInstance().send(RequestBuilder.withSetTrafficSourceInfoAction().andParams(map).create());
    }

    public static void setUserAttributes(final String str, Map<String, ?> map) {
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call setUserAttributes before calling start", new Object[0]);
            return;
        }
        try {
            final HashMap map2 = new HashMap();
            if (str != null) {
                map2.put(Constants.Params.NEW_USER_ID, str);
            }
            if (map != null) {
                Map<String, ?> mapValidateAttributes = LeanplumInternal.validateAttributes(map, Constants.Params.USER_ATTRIBUTES, true);
                map2.put(Constants.Params.USER_ATTRIBUTES, JsonConverter.toJson(mapValidateAttributes));
                LeanplumInternal.getUserAttributeChanges().add(mapValidateAttributes);
            }
            if (LeanplumInternal.issuedStart()) {
                setUserAttributesInternal(str, map2);
            } else {
                LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.11
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Leanplum.setUserAttributesInternal(str, map2);
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void setUserAttributes(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            Log.e("setUserAttributes - Invalid userAttributes parameter provided (null or empty).", new Object[0]);
        } else {
            setUserAttributes(null, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setUserAttributesInternal(String str, HashMap<String, Object> map) {
        RequestSender.getInstance().send(RequestBuilder.withSetUserAttributesAction().andParams(map).create());
        if (str != null && str.length() > 0) {
            APIConfig.getInstance().setUserId(str);
            if (LeanplumInternal.hasStarted()) {
                VarCache.saveDiffs();
            }
        }
        LeanplumInternal.recordAttributeChanges();
    }

    public static void setUserId(String str) {
        if (str == null) {
            Log.e("setUserId - Invalid userId parameter provided.", new Object[0]);
        } else {
            setUserAttributes(str, null);
        }
    }

    public static void setVariantDebugInfoEnabled(boolean z) {
        LeanplumInternal.setIsVariantDebugInfoEnabled(z);
    }

    public static void start(Context context2) {
        start(context2, null, null, null, null);
    }

    public static void start(Context context2, StartCallback startCallback) {
        start(context2, null, null, startCallback, null);
    }

    public static void start(Context context2, String str) {
        start(context2, str, null, null, null);
    }

    public static void start(Context context2, String str, StartCallback startCallback) {
        start(context2, str, null, startCallback, null);
    }

    public static void start(Context context2, String str, Map<String, ?> map) {
        start(context2, str, map, null, null);
    }

    public static synchronized void start(Context context2, String str, Map<String, ?> map, StartCallback startCallback) {
        start(context2, str, map, startCallback, null);
    }

    public static synchronized void start(Context context2, final String str, Map<String, ?> map, StartCallback startCallback, Boolean bool) {
        final boolean zBooleanValue;
        try {
            if (TextUtils.isEmpty(APIConfig.getInstance().appId())) {
                loadApiConfigFromResources();
            }
            LeanplumActivityHelper.setCurrentActivity(context2);
            zBooleanValue = bool == null ? LeanplumActivityHelper.getCurrentActivity() == null || LeanplumActivityHelper.isActivityPaused() : bool.booleanValue();
        } finally {
        }
        if (Constants.isNoop()) {
            LeanplumInternal.setHasStarted(true);
            LeanplumInternal.setStartSuccessful(true);
            triggerStartResponse(true);
            triggerVariablesChanged();
            triggerVariablesChangedAndNoDownloadsPending();
            VarCache.applyVariableDiffs(new HashMap(), new HashMap(), new HashMap(), new ArrayList(), new ArrayList(), new HashMap(), "", "");
            LeanplumInbox.getInstance().update(new HashMap(), 0, false);
            return;
        }
        if (startCallback != null) {
            addStartResponseHandler(startCallback);
        }
        if (context2 != null) {
            setApplicationContext(context2.getApplicationContext());
        }
        if (LeanplumInternal.hasCalledStart()) {
            if (!zBooleanValue && LeanplumInternal.hasStartedInBackground()) {
                LeanplumInternal.setStartedInBackground(false);
                LeanplumInternal.moveToForeground();
            }
            return;
        }
        MessageTemplates.register(getContext());
        LeanplumInternal.setStartedInBackground(zBooleanValue);
        final Map<String, ?> mapValidateAttributes = LeanplumInternal.validateAttributes(map, Constants.Params.USER_ATTRIBUTES, true);
        LeanplumInternal.setCalledStart(true);
        if (mapValidateAttributes != null) {
            LeanplumInternal.getUserAttributeChanges().add(mapValidateAttributes);
        }
        APIConfig.getInstance().loadToken();
        VarCache.setSilent(true);
        VarCache.loadDiffs();
        VarCache.setSilent(false);
        LeanplumInbox.getInstance().load();
        VarCache.onUpdate(new CacheUpdateBlock() { // from class: com.leanplum.Leanplum.1
            @Override // com.leanplum.CacheUpdateBlock
            public void updateCache() {
                Leanplum.triggerVariablesChanged();
                if (FileTransferManager.getInstance().numPendingDownloads() == 0) {
                    Leanplum.triggerVariablesChangedAndNoDownloadsPending();
                }
            }
        });
        FileTransferManager.getInstance().onNoPendingDownloads(new FileTransferManager.NoPendingDownloadsCallback() { // from class: com.leanplum.Leanplum.2
            @Override // com.leanplum.internal.FileTransferManager.NoPendingDownloadsCallback
            public void noPendingDownloads() {
                Leanplum.triggerVariablesChangedAndNoDownloadsPending();
            }
        });
        OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.Leanplum.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Leanplum.startHelper(str, mapValidateAttributes, zBooleanValue);
                } catch (Throwable th) {
                    Log.exception(th);
                }
            }
        });
        Util.initExceptionHandling(context2);
    }

    public static void start(Context context2, Map<String, ?> map) {
        start(context2, null, map, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startHelper(String str, Map<String, ?> map, boolean z) {
        String str2;
        LeanplumEventDataManager.sharedInstance();
        checkAndStartNotificationsModules();
        Boolean boolValueOf = null;
        if (APIConfig.getInstance().deviceId() == null) {
            if (!userSpecifiedDeviceId && Constants.defaultDeviceId != null) {
                Log.d("Using default deviceID", new Object[0]);
                str2 = Constants.defaultDeviceId;
            } else if (customDeviceId != null) {
                Log.d("Using custom deviceID", new Object[0]);
                str2 = customDeviceId;
            } else {
                Log.d("Using deviceID for mode: %s", deviceIdMode);
                Util.DeviceIdInfo deviceId = Util.getDeviceId(deviceIdMode);
                String str3 = deviceId.id;
                boolValueOf = Boolean.valueOf(deviceId.limitAdTracking);
                str2 = str3;
            }
            APIConfig.getInstance().setDeviceId(str2);
        }
        if (str == null && (str = APIConfig.getInstance().userId()) == null) {
            Log.d("setting deviceID as userID", new Object[0]);
            str = APIConfig.getInstance().deviceId();
        }
        APIConfig.getInstance().setUserId(str);
        HashMap map2 = new HashMap();
        if (z) {
            map2.put(Constants.Params.BACKGROUND, "true");
        }
        if (Boolean.TRUE.equals(boolValueOf)) {
            map2.put(Constants.Params.LIMIT_TRACKING, boolValueOf.toString());
        }
        if (map != null) {
            map2.put(Constants.Params.USER_ATTRIBUTES, JsonConverter.toJson(map));
        }
        fillCommonParameters(map2);
        Util.initializePreLeanplumInstall(map2);
        Request requestCreate = RequestBuilder.withStartAction().andParams(map2).andType(z ? Request.RequestType.DEFAULT : Request.RequestType.IMMEDIATE).create();
        requestCreate.onResponse(new Request.ResponseCallback() { // from class: com.leanplum.Leanplum.4
            @Override // com.leanplum.internal.Request.ResponseCallback
            public void response(JSONObject jSONObject) {
                Log.d("Received start response: %s", jSONObject);
                Leanplum.handleStartResponse(jSONObject);
            }
        });
        requestCreate.onError(new Request.ErrorCallback() { // from class: com.leanplum.Leanplum.5
            @Override // com.leanplum.internal.Request.ErrorCallback
            public void error(Exception exc) {
                Log.i("Failed to receive start response", new Object[0]);
                Leanplum.handleStartResponse(null);
            }
        });
        RequestSender.getInstance().send(requestCreate);
        LeanplumInternal.triggerStartIssued();
    }

    private static void startRequestTimer() {
        RequestSenderTimer.get().start();
    }

    public static void stop() {
        if (Constants.isNoop()) {
            return;
        }
        if (!LeanplumInternal.hasCalledStart()) {
            Log.e("You cannot call stop before calling start", new Object[0]);
        } else if (LeanplumInternal.issuedStart()) {
            stopInternal();
        } else {
            LeanplumInternal.addStartIssuedHandler(new Runnable() { // from class: com.leanplum.Leanplum.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Leanplum.stopInternal();
                    } catch (Throwable th) {
                        Log.exception(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stopInternal() {
        RequestSender.getInstance().send(RequestBuilder.withStopAction().andType(Request.RequestType.IMMEDIATE).create());
    }

    private static void stopRequestTimer() {
        RequestSenderTimer.get().stop();
    }

    public static void syncResources() {
        if (Constants.isNoop()) {
            return;
        }
        try {
            FileManager.enableResourceSyncing(null, null, false);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void syncResources(List<String> list, List<String> list2) {
        try {
            FileManager.enableResourceSyncing(list, list2, false);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void syncResourcesAsync() {
        if (Constants.isNoop()) {
            return;
        }
        try {
            FileManager.enableResourceSyncing(null, null, true);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void syncResourcesAsync(List<String> list, List<String> list2) {
        try {
            FileManager.enableResourceSyncing(list, list2, true);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    private static Set<String> toSet(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.optString(i));
            }
        }
        return hashSet;
    }

    public static void track(String str) {
        track(str, 0.0d, "", null);
    }

    public static void track(String str, double d) {
        track(str, d, "", null);
    }

    public static void track(String str, double d, String str2) {
        track(str, d, str2, null);
    }

    public static void track(String str, double d, String str2, Map<String, ?> map) {
        LeanplumInternal.track(str, d, str2, map, null);
    }

    public static void track(String str, double d, Map<String, ?> map) {
        track(str, d, "", map);
    }

    public static void track(String str, String str2) {
        track(str, 0.0d, str2, null);
    }

    public static void track(String str, Map<String, ?> map) {
        track(str, 0.0d, "", map);
    }

    public static void trackAllAppScreens() {
        LeanplumInternal.enableAutomaticScreenTracking();
    }

    public static void trackGeofence(GeofenceEventType geofenceEventType, String str) {
        if (featureFlagManager().isFeatureFlagEnabled("track_geofence").booleanValue()) {
            LeanplumInternal.trackGeofence(geofenceEventType, 0.0d, str, null, null);
        }
    }

    public static void trackGooglePlayPurchase(String str, long j, String str2, String str3, String str4) {
        trackGooglePlayPurchase(PURCHASE_EVENT_NAME, str, j, str2, str3, str4, null);
    }

    public static void trackGooglePlayPurchase(String str, long j, String str2, String str3, String str4, Map<String, ?> map) {
        trackGooglePlayPurchase(PURCHASE_EVENT_NAME, str, j, str2, str3, str4, map);
    }

    public static void trackGooglePlayPurchase(String str, String str2, long j, String str3, String str4, String str5, Map<String, ?> map) {
        if (TextUtils.isEmpty(str)) {
            Log.i("Failed to trackGooglePlayPurchase, event name is null", new Object[0]);
        }
        HashMap map2 = new HashMap();
        map2.put(Constants.Params.GOOGLE_PLAY_PURCHASE_DATA, str4);
        map2.put(Constants.Params.GOOGLE_PLAY_PURCHASE_DATA_SIGNATURE, str5);
        map2.put(Constants.Params.IAP_CURRENCY_CODE, str3);
        HashMap map3 = map == null ? new HashMap() : new HashMap(map);
        map3.put(Constants.Params.IAP_ITEM, str2);
        LeanplumInternal.track(str, j / 1000000.0d, null, map3, map2);
    }

    public static void trackLocal(String str) {
        trackLocal(str, null);
    }

    public static void trackLocal(String str, Map<String, ?> map) {
        LeanplumInternal.trackLocal(str, map);
    }

    public static void trackPurchase(String str, double d, String str2, Map<String, ?> map) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.i("Failed to trackPurchase, event name is null", new Object[0]);
            }
            HashMap map2 = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                map2.put(Constants.Params.IAP_CURRENCY_CODE, str2);
            }
            LeanplumInternal.track(str, d, null, map, map2);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void triggerMessageDisplayed(ActionContext actionContext) {
        ArrayList<MessageDisplayedCallback> arrayList = messageDisplayedHandlers;
        synchronized (arrayList) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                MessageDisplayedCallback messageDisplayedCallback = arrayList.get(i);
                i++;
                MessageDisplayedCallback messageDisplayedCallback2 = messageDisplayedCallback;
                messageDisplayedCallback2.setMessageArchiveData(messageArchiveDataFromContext(actionContext));
                OperationQueue.sharedInstance().addUiOperation(messageDisplayedCallback2);
            }
        }
    }

    private static void triggerStartResponse(boolean z) {
        ArrayList<StartCallback> arrayList = startHandlers;
        synchronized (arrayList) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                StartCallback startCallback = arrayList.get(i);
                i++;
                StartCallback startCallback2 = startCallback;
                startCallback2.setSuccess(z);
                OperationQueue.sharedInstance().addUiOperation(startCallback2);
            }
            startHandlers.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void triggerVariablesChanged() {
        ArrayList<VariablesChangedCallback> arrayList = variablesChangedHandlers;
        synchronized (arrayList) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                VariablesChangedCallback variablesChangedCallback = arrayList.get(i);
                i++;
                OperationQueue.sharedInstance().addUiOperation(variablesChangedCallback);
            }
        }
    }

    public static void triggerVariablesChangedAndNoDownloadsPending() {
        int i;
        ArrayList<VariablesChangedCallback> arrayList = noDownloadsHandlers;
        synchronized (arrayList) {
            int size = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                VariablesChangedCallback variablesChangedCallback = arrayList.get(i2);
                i2++;
                OperationQueue.sharedInstance().addUiOperation(variablesChangedCallback);
            }
        }
        ArrayList<VariablesChangedCallback> arrayList2 = onceNoDownloadsHandlers;
        synchronized (arrayList2) {
            int size2 = arrayList2.size();
            while (i < size2) {
                VariablesChangedCallback variablesChangedCallback2 = arrayList2.get(i);
                i++;
                OperationQueue.sharedInstance().addUiOperation(variablesChangedCallback2);
            }
            onceNoDownloadsHandlers.clear();
        }
    }

    public static List<Map<String, Object>> variants() {
        List<Map<String, Object>> listVariants = VarCache.variants();
        return listVariants == null ? new ArrayList() : listVariants;
    }
}
