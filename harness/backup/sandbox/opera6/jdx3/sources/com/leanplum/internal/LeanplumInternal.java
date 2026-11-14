package com.leanplum.internal;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.annotation.NonNull;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.LeanplumException;
import com.leanplum.LeanplumLocationAccuracyType;
import com.leanplum.LeanplumMessageDisplayControllers;
import com.leanplum.MessageDisplayController;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.StartCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.internal.ActionManager;
import com.leanplum.internal.Constants;
import com.leanplum.internal.FileManager;
import com.leanplum.internal.Request;
import com.leanplum.models.GeofenceEventType;
import defpackage.sko;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LeanplumInternal {
    private static final String ACTION = "action";
    private static boolean calledStart;
    private static boolean hasStarted;
    private static boolean hasStartedAndRegisteredAsDeveloper;
    private static boolean inForeground;
    private static boolean isPaused;
    private static boolean issuedStart;
    private static boolean startSuccessful;
    private static boolean startedInBackground;
    private static final Map<String, List<ActionCallback>> actionHandlers = new HashMap();
    private static final Object inForegroundLock = new Object();
    private static final Queue<Map<String, ?>> userAttributeChanges = new ConcurrentLinkedQueue();
    private static final ArrayList<Runnable> startIssuedHandlers = new ArrayList<>();
    private static boolean isScreenTrackingEnabled = false;
    private static boolean isVariantDebugInfoEnabled = false;

    /* renamed from: com.leanplum.internal.LeanplumInternal$8, reason: invalid class name */
    class AnonymousClass8 extends StartCallback {
        final /* synthetic */ locationAttributeRequestsCallback val$callback;
        final /* synthetic */ Location val$location;
        final /* synthetic */ LeanplumLocationAccuracyType val$locationAccuracyType;

        public AnonymousClass8(Location location, LeanplumLocationAccuracyType leanplumLocationAccuracyType, locationAttributeRequestsCallback locationattributerequestscallback) {
            this.val$location = location;
            this.val$locationAccuracyType = leanplumLocationAccuracyType;
            this.val$callback = locationattributerequestscallback;
        }

        @Override // com.leanplum.callbacks.StartCallback
        public void onResponse(final boolean z) {
            OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.internal.LeanplumInternal.8.1
                @Override // java.lang.Runnable
                public void run() {
                    if (z) {
                        Location location = AnonymousClass8.this.val$location;
                        if (location == null) {
                            Log.e("Location can't be null in setUserLocationAttribute.", new Object[0]);
                            return;
                        }
                        Locale locale = Locale.US;
                        String str = String.format(locale, "%.6f,%.6f", Double.valueOf(location.getLatitude()), Double.valueOf(AnonymousClass8.this.val$location.getLongitude()));
                        HashMap map = new HashMap();
                        map.put(Constants.Keys.LOCATION, str);
                        map.put(Constants.Keys.LOCATION_ACCURACY_TYPE, AnonymousClass8.this.val$locationAccuracyType.name().toLowerCase());
                        if (Leanplum.getContext() != null && locale != null) {
                            try {
                                List<Address> fromLocation = new Geocoder(Leanplum.getContext(), locale).getFromLocation(AnonymousClass8.this.val$location.getLatitude(), AnonymousClass8.this.val$location.getLongitude(), 1);
                                if (fromLocation != null && fromLocation.size() > 0) {
                                    Address address = fromLocation.get(0);
                                    map.put(Constants.Keys.CITY, address.getLocality());
                                    map.put(Constants.Keys.REGION, address.getAdminArea());
                                    map.put(Constants.Keys.COUNTRY, address.getCountryCode());
                                }
                            } catch (IOException e) {
                                Log.e("Failed to connect to Geocoder: " + e, new Object[0]);
                            } catch (IllegalArgumentException e2) {
                                Log.e("Invalid latitude or longitude values: " + e2, new Object[0]);
                            } catch (Throwable unused) {
                            }
                        }
                        Request requestCreate = RequestBuilder.withSetUserAttributesAction().andParams(map).create();
                        requestCreate.onResponse(new Request.ResponseCallback() { // from class: com.leanplum.internal.LeanplumInternal.8.1.1
                            @Override // com.leanplum.internal.Request.ResponseCallback
                            public void response(JSONObject jSONObject) {
                                AnonymousClass8.this.val$callback.response(true);
                            }
                        });
                        requestCreate.onError(new Request.ErrorCallback() { // from class: com.leanplum.internal.LeanplumInternal.8.1.2
                            @Override // com.leanplum.internal.Request.ErrorCallback
                            public void error(Exception exc) {
                                AnonymousClass8.this.val$callback.response(false);
                                Log.e("setUserAttributes failed when specifying location with error: " + exc.getMessage(), new Object[0]);
                            }
                        });
                        RequestSender.getInstance().send(requestCreate);
                    }
                }
            });
        }
    }

    public interface locationAttributeRequestsCallback {
        void response(boolean z);
    }

    public static void addStartIssuedHandler(Runnable runnable) {
        if (runnable == null) {
            Log.e("addStartIssuedHandler - Invalid handler parameter provided.", new Object[0]);
            return;
        }
        ArrayList<Runnable> arrayList = startIssuedHandlers;
        synchronized (arrayList) {
            if (issuedStart) {
                runnable.run();
            } else {
                arrayList.add(runnable);
            }
        }
    }

    public static void enableAutomaticScreenTracking() {
        isScreenTrackingEnabled = true;
    }

    private static int fetchCountDown(ActionContext actionContext, Map<String, Object> map) {
        if (actionContext != null && map != null) {
            if (actionContext.isPreview()) {
                return 5;
            }
            String originalMessageId = actionContext.getOriginalMessageId();
            if (originalMessageId == null) {
                return 0;
            }
            Object obj = ((Map) CollectionUtil.uncheckedCast(map.get(originalMessageId))).get("countdown");
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
        }
        return 0;
    }

    public static Map<String, List<ActionCallback>> getActionHandlers() {
        return actionHandlers;
    }

    public static boolean getIsScreenTrackingEnabled() {
        return isScreenTrackingEnabled;
    }

    public static boolean getIsVariantDebugInfoEnabled() {
        return isVariantDebugInfoEnabled;
    }

    public static Queue<Map<String, ?>> getUserAttributeChanges() {
        return userAttributeChanges;
    }

    public static boolean hasCalledStart() {
        return calledStart;
    }

    public static boolean hasStarted() {
        return hasStarted;
    }

    public static boolean hasStartedAndRegisteredAsDeveloper() {
        return hasStartedAndRegisteredAsDeveloper;
    }

    public static boolean hasStartedInBackground() {
        return startedInBackground;
    }

    public static boolean isPaused() {
        return isPaused;
    }

    public static boolean isStartSuccessful() {
        return startSuccessful;
    }

    private static boolean isValidScalarValue(Object obj, String str) {
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            return true;
        }
        maybeThrowException(new LeanplumException(sko.u(str, " values must be of type String, Number, or Boolean.")));
        return false;
    }

    public static boolean issuedStart() {
        return issuedStart;
    }

    private static Map<String, Object> makeTrackArgs(String str, double d, String str2, Map<String, ?> map, Map<String, String> map2) {
        HashMap map3 = new HashMap();
        if (map2 != null) {
            map3.putAll(map2);
        }
        map3.put(Constants.Params.VALUE, Double.toString(d));
        map3.put(Constants.Params.INFO, str2);
        if (str != null) {
            map3.put(Constants.Params.EVENT, str);
        }
        if (map != null) {
            map3.put(Constants.Params.PARAMS, JsonConverter.toJson(validateAttributes(map, Constants.Params.PARAMS, false)));
        }
        if (inForeground && !LeanplumActivityHelper.isActivityPaused()) {
            return map3;
        }
        map3.put("allowOffline", "true");
        return map3;
    }

    public static void maybePerformActions(String str, String str2, int i, String str3, ActionContext.ContextualValues contextualValues) {
        maybePerformActions(new String[]{str}, str2, i, str3, contextualValues);
    }

    public static void maybePerformActions(String[] strArr, String str, int i, String str2, ActionContext.ContextualValues contextualValues) {
        Map<String, Object> mapMessages = VarCache.messages();
        if (mapMessages != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = mapMessages.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final String next = it.next();
                if (next == null || !next.equals(str2)) {
                    Map<String, Object> map = (Map) CollectionUtil.uncheckedCast(mapMessages.get(next));
                    String str3 = (String) map.get("action");
                    if (str3 != null) {
                        String strJ = str3.equals(ActionManager.HELD_BACK_ACTION_NAME) ? sko.j(Constants.HELD_BACK_MESSAGE_PREFIX, next) : next;
                        if (str3.equals(ActionManager.PUSH_NOTIFICATION_ACTION_NAME) || (i & 1) != 0) {
                            ActionManager.MessageMatchResult messageMatchResult = new ActionManager.MessageMatchResult();
                            for (String str4 : strArr) {
                                ActionManager.MessageMatchResult messageMatchResultShouldShowMessage = ActionManager.getInstance().shouldShowMessage(strJ, map, str4, str, contextualValues);
                                messageMatchResult.matchedTrigger |= messageMatchResultShouldShowMessage.matchedTrigger;
                                messageMatchResult.matchedUnlessTrigger |= messageMatchResultShouldShowMessage.matchedUnlessTrigger;
                                messageMatchResult.matchedLimit |= messageMatchResultShouldShowMessage.matchedLimit;
                                messageMatchResult.matchedActivePeriod |= messageMatchResultShouldShowMessage.matchedActivePeriod;
                            }
                            if (messageMatchResult.matchedUnlessTrigger) {
                                triggerAction(new ActionContext("__Cancel" + map.get("action"), new HashMap(), next), new VariablesChangedCallback() { // from class: com.leanplum.internal.LeanplumInternal.3
                                    @Override // com.leanplum.callbacks.VariablesChangedCallback
                                    public void variablesChanged() {
                                        try {
                                            HashMap map2 = new HashMap();
                                            map2.put(Constants.Params.MESSAGE_ID, next);
                                            LeanplumInternal.track("Cancel", 0.0d, null, null, map2);
                                        } catch (Throwable th) {
                                            Log.exception(th);
                                        }
                                    }
                                });
                            }
                            if (messageMatchResult.matchedActivePeriod && messageMatchResult.matchedTrigger) {
                                ActionManager.getInstance().recordMessageTrigger(strJ);
                                if (messageMatchResult.matchedLimit) {
                                    ActionContext actionContext = new ActionContext(map.get("action").toString(), (Map) CollectionUtil.uncheckedCast(map.get("vars")), strJ, next, map.containsKey("priority") ? ((Integer) map.get("priority")).intValue() : 1000);
                                    actionContext.setContextualValues(contextualValues);
                                    arrayList.add(actionContext);
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Collections.sort(arrayList, new Comparator<ActionContext>() { // from class: com.leanplum.internal.LeanplumInternal.4
                @Override // java.util.Comparator
                public int compare(ActionContext actionContext2, ActionContext actionContext3) {
                    return actionContext2.getPriority() - actionContext3.getPriority();
                }
            });
            if (Constants.enableMultipleActionsWithPriorityZero) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ActionContext actionContext2 = (ActionContext) it2.next();
                    if (actionContext2.getPriority() != 0) {
                        break;
                    }
                    if (actionContext2.actionName().equals(ActionManager.HELD_BACK_ACTION_NAME)) {
                        ActionManager.getInstance().recordHeldBackImpression(actionContext2.getMessageId(), actionContext2.getOriginalMessageId());
                    } else {
                        arrayList2.add(actionContext2);
                    }
                    it2.remove();
                }
                for (ActionContext actionContext3 : maybeReorderZeroPriorityActions(arrayList2)) {
                    if (shouldSuppressMessage(actionContext3)) {
                        Log.d("Suppressing messageId=" + actionContext3.getMessageId(), new Object[0]);
                    } else {
                        scheduleAction(actionContext3);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            }
            int priority = ((ActionContext) arrayList.get(0)).getPriority();
            int iFetchCountDown = fetchCountDown((ActionContext) arrayList.get(0), mapMessages);
            int size = arrayList.size();
            boolean z = false;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ActionContext actionContext4 = (ActionContext) obj;
                if (actionContext4.getPriority() > priority) {
                    return;
                }
                if (z && fetchCountDown(actionContext4, mapMessages) == iFetchCountDown) {
                    return;
                }
                if (actionContext4.actionName().equals(ActionManager.HELD_BACK_ACTION_NAME)) {
                    ActionManager.getInstance().recordHeldBackImpression(actionContext4.getMessageId(), actionContext4.getOriginalMessageId());
                } else if (shouldSuppressMessage(actionContext4)) {
                    Log.d("Suppressing messageId=" + actionContext4.getMessageId(), new Object[0]);
                } else {
                    scheduleAction(actionContext4);
                }
                z = true;
            }
        }
    }

    private static List<ActionContext> maybeReorderZeroPriorityActions(List<ActionContext> list) {
        MessageDisplayController messageDisplayController = LeanplumMessageDisplayControllers.getMessageDisplayController();
        return messageDisplayController == null ? list : messageDisplayController.reorderPriorityZeroMessages(list);
    }

    public static void maybeThrowException(RuntimeException runtimeException) {
        if (Constants.isDevelopmentModeEnabled) {
            throw runtimeException;
        }
        Log.e(runtimeException.getMessage() + " This error is only thrown in development mode.", runtimeException);
    }

    public static void moveToForeground() {
        synchronized (inForegroundLock) {
            if (inForeground) {
                return;
            }
            inForeground = true;
            Leanplum.addStartResponseHandler(new StartCallback() { // from class: com.leanplum.internal.LeanplumInternal.9
                @Override // com.leanplum.callbacks.StartCallback
                public void onResponse(boolean z) {
                    if (z) {
                        LeanplumInternal.maybePerformActions(new String[]{RequestBuilder.ACTION_START, "resume"}, (String) null, 3, (String) null, (ActionContext.ContextualValues) null);
                        LeanplumInternal.recordAttributeChanges();
                    }
                }
            });
        }
    }

    public static void onHasStartedAndRegisteredAsDeveloper() {
        synchronized (FileManager.initializingLock) {
            if (FileManager.initializing()) {
                FileManager.setResourceSyncFinishBlock(new FileManager.ResourceUpdateCallback() { // from class: com.leanplum.internal.LeanplumInternal.1
                    @Override // com.leanplum.internal.FileManager.ResourceUpdateCallback
                    public void onResourceSyncFinish() {
                        try {
                            LeanplumInternal.onHasStartedAndRegisteredAsDeveloperAndFinishedSyncing();
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
            } else {
                onHasStartedAndRegisteredAsDeveloperAndFinishedSyncing();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onHasStartedAndRegisteredAsDeveloperAndFinishedSyncing() {
        if (hasStartedAndRegisteredAsDeveloper) {
            return;
        }
        hasStartedAndRegisteredAsDeveloper = true;
    }

    public static void performTrackedAction(String str, String str2) {
        Map map;
        Map<String, Object> mapMessages = VarCache.messages();
        if (mapMessages == null || (map = (Map) CollectionUtil.uncheckedCast(mapMessages.get(str2))) == null) {
            return;
        }
        new ActionContext(map.get("action").toString(), (Map) CollectionUtil.uncheckedCast(map.get("vars")), str2).runTrackedActionNamed(str);
    }

    public static void recordAttributeChanges() {
        boolean z = false;
        for (Map<String, ?> map : userAttributeChanges) {
            Map mapUserAttributes = VarCache.userAttributes();
            if (mapUserAttributes == null) {
                mapUserAttributes = new HashMap();
            }
            for (String str : map.keySet()) {
                Object obj = mapUserAttributes.get(str);
                Object obj2 = map.get(str);
                if (obj == null) {
                    if (obj2 != null) {
                        ActionContext.ContextualValues contextualValues = new ActionContext.ContextualValues();
                        contextualValues.previousAttributeValue = obj;
                        contextualValues.attributeValue = obj2;
                        mapUserAttributes.put(str, obj2);
                        maybePerformActions("userAttribute", str, 3, (String) null, contextualValues);
                        z = true;
                    }
                } else if (!obj.equals(obj2)) {
                    ActionContext.ContextualValues contextualValues2 = new ActionContext.ContextualValues();
                    contextualValues2.previousAttributeValue = obj;
                    contextualValues2.attributeValue = obj2;
                    mapUserAttributes.put(str, obj2);
                    maybePerformActions("userAttribute", str, 3, (String) null, contextualValues2);
                    z = true;
                }
            }
        }
        userAttributeChanges.clear();
        if (z) {
            VarCache.saveUserAttributes();
        }
    }

    private static void scheduleAction(@NonNull final ActionContext actionContext) {
        triggerAction(actionContext, new VariablesChangedCallback() { // from class: com.leanplum.internal.LeanplumInternal.5
            @Override // com.leanplum.callbacks.VariablesChangedCallback
            public void variablesChanged() {
                try {
                    if (ActionManager.PUSH_NOTIFICATION_ACTION_NAME.equals(actionContext.actionName())) {
                        ActionManager.getInstance().recordLocalPushImpression(actionContext.getMessageId());
                    } else {
                        ActionManager.getInstance().recordMessageImpression(actionContext.getMessageId());
                    }
                    Leanplum.triggerMessageDisplayed(actionContext);
                } catch (Throwable th) {
                    Log.exception(th);
                }
            }
        });
    }

    public static void setCalledStart(boolean z) {
        calledStart = z;
    }

    public static void setHasStarted(boolean z) {
        hasStarted = z;
    }

    public static void setIsPaused(boolean z) {
        isPaused = z;
    }

    public static void setIsVariantDebugInfoEnabled(boolean z) {
        isVariantDebugInfoEnabled = z;
    }

    private static void setIssuedStart(boolean z) {
        issuedStart = z;
    }

    public static void setStartSuccessful(boolean z) {
        startSuccessful = z;
    }

    public static void setStartedInBackground(boolean z) {
        startedInBackground = z;
    }

    public static void setUserLocationAttribute(Location location, LeanplumLocationAccuracyType leanplumLocationAccuracyType, locationAttributeRequestsCallback locationattributerequestscallback) {
        Leanplum.addStartResponseHandler(new AnonymousClass8(location, leanplumLocationAccuracyType, locationattributerequestscallback));
    }

    private static boolean shouldDisplayAction(ActionContext actionContext) {
        MessageDisplayController messageDisplayController = LeanplumMessageDisplayControllers.getMessageDisplayController();
        if (messageDisplayController == null) {
            return true;
        }
        return messageDisplayController.shouldDisplayMessage(actionContext);
    }

    private static boolean shouldSuppressMessage(@NonNull ActionContext actionContext) {
        if (ActionManager.PUSH_NOTIFICATION_ACTION_NAME.equals(actionContext.actionName())) {
            return false;
        }
        if (shouldDisplayAction(actionContext)) {
            return ActionManager.getInstance().shouldSuppressMessages();
        }
        return true;
    }

    public static void track(String str, double d, String str2, Map<String, ?> map, Map<String, String> map2) {
        if (Constants.isNoop()) {
            return;
        }
        try {
            trackInternalWhenStarted(str, map, makeTrackArgs(str, d, str2, map, map2));
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static void trackGeofence(GeofenceEventType geofenceEventType, double d, String str, Map<String, ?> map, Map<String, String> map2) {
        if (Constants.isNoop()) {
            return;
        }
        try {
            RequestSender.getInstance().send(RequestBuilder.withTrackGeofenceAction().andParams(makeTrackArgs(geofenceEventType.getName(), d, str, map, map2)).andType(Request.RequestType.IMMEDIATE).create());
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trackInternal(String str, Map<String, ?> map, Map<String, Object> map2) {
        String string;
        RequestSender.getInstance().send(RequestBuilder.withTrackAction().andParams(map2).create());
        if (map2.get(Constants.Params.MESSAGE_ID) != null) {
            string = map2.get(Constants.Params.MESSAGE_ID).toString();
            String strJ = sko.j(".m", string);
            str = (str == null || str.length() <= 0) ? strJ : sko.k(strJ, " ", str);
        } else {
            string = null;
        }
        ActionContext.ContextualValues contextualValues = new ActionContext.ContextualValues();
        contextualValues.parameters = map;
        contextualValues.arguments = map2;
        if (map2.containsKey(Constants.Params.PARAMS)) {
            try {
                contextualValues.arguments.put(Constants.Params.PARAMS, new JSONObject(contextualValues.arguments.get(Constants.Params.PARAMS).toString()));
            } catch (JSONException unused) {
            }
        }
        maybePerformActions(Constants.Params.EVENT, str, 3, string, contextualValues);
    }

    private static void trackInternalWhenStarted(final String str, final Map<String, ?> map, final Map<String, Object> map2) {
        if (issuedStart) {
            trackInternal(str, map, map2);
        } else {
            addStartIssuedHandler(new Runnable() { // from class: com.leanplum.internal.LeanplumInternal.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LeanplumInternal.trackInternal(str, map, map2);
                    } catch (Throwable th) {
                        Log.exception(th);
                    }
                }
            });
        }
    }

    public static void trackLocal(final String str, final Map<String, ?> map) {
        if (Constants.isNoop()) {
            return;
        }
        if (issuedStart) {
            trackLocalInternal(str, map);
        } else {
            addStartIssuedHandler(new Runnable() { // from class: com.leanplum.internal.LeanplumInternal.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LeanplumInternal.trackLocalInternal(str, map);
                    } catch (Throwable th) {
                        Log.exception(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trackLocalInternal(String str, Map<String, ?> map) {
        ActionContext.ContextualValues contextualValues = new ActionContext.ContextualValues();
        contextualValues.parameters = map;
        maybePerformActions(Constants.Params.EVENT, str, 3, (String) null, contextualValues);
    }

    public static void triggerAction(ActionContext actionContext) {
        triggerAction(actionContext, null);
    }

    public static void triggerAction(final ActionContext actionContext, final VariablesChangedCallback variablesChangedCallback) {
        Map<String, List<ActionCallback>> map = actionHandlers;
        synchronized (map) {
            List<ActionCallback> list = map.get(actionContext.actionName());
            if (list == null) {
                if (variablesChangedCallback != null) {
                    variablesChangedCallback.variablesChanged();
                }
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            int i = 0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                final ActionCallback actionCallback = (ActionCallback) obj;
                OperationQueue.sharedInstance().addUiOperation(new Runnable() { // from class: com.leanplum.internal.LeanplumInternal.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!actionCallback.onResponse(actionContext) || variablesChangedCallback == null || atomicBoolean.getAndSet(true)) {
                            return;
                        }
                        variablesChangedCallback.variablesChanged();
                    }
                });
            }
        }
    }

    public static void triggerStartIssued() {
        ArrayList<Runnable> arrayList = startIssuedHandlers;
        synchronized (arrayList) {
            setIssuedStart(true);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Runnable runnable = arrayList.get(i);
                i++;
                OperationQueue.sharedInstance().addUiOperation(runnable);
            }
            startIssuedHandlers.clear();
        }
    }

    public static <T> Map<String, T> validateAttributes(Map<String, T> map, String str, boolean z) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        try {
            for (Map.Entry<String, T> entry : map.entrySet()) {
                T value = entry.getValue();
                if (z && (value instanceof Iterable)) {
                    Iterator<T> it = ((Iterable) CollectionUtil.uncheckedCast(value)).iterator();
                    while (it.hasNext()) {
                        if (!isValidScalarValue(it.next(), str)) {
                            break;
                        }
                    }
                    map2.put(entry.getKey(), value);
                } else {
                    if (value instanceof Date) {
                        value = (T) CollectionUtil.uncheckedCast(Long.valueOf(((Date) CollectionUtil.uncheckedCast(value)).getTime()));
                    }
                    if (value == null || isValidScalarValue(value, str)) {
                        map2.put(entry.getKey(), value);
                    }
                }
            }
            return map2;
        } catch (ConcurrentModificationException unused) {
            maybeThrowException(new LeanplumException("ConcurrentModificationException: You cannot modify Map<String, ?> attributes/parameters. Will override with an empty map"));
            return new HashMap();
        }
    }
}
