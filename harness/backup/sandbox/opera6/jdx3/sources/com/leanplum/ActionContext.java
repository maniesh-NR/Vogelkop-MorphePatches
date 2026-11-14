package com.leanplum;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.internal.ActionManager;
import com.leanplum.internal.BaseActionContext;
import com.leanplum.internal.CollectionUtil;
import com.leanplum.internal.Constants;
import com.leanplum.internal.FileManager;
import com.leanplum.internal.JsonConverter;
import com.leanplum.internal.LeanplumInternal;
import com.leanplum.internal.Log;
import com.leanplum.internal.VarCache;
import defpackage.sko;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ActionContext extends BaseActionContext implements Comparable<ActionContext> {
    private ActionCallback actionNamedHandler;
    private final int contentVersion;
    private ContextualValues contextualValues;
    private String key;
    private final String name;
    private ActionContext parentContext;
    private boolean preventRealtimeUpdating;

    public static class ContextualValues {
        public Map<String, Object> arguments;
        public Object attributeValue;
        public Map<String, ?> parameters;
        public Object previousAttributeValue;
    }

    public ActionContext(String str, Map<String, Object> map, String str2) {
        this(str, map, str2, null, 1000);
    }

    public ActionContext(String str, Map<String, Object> map, String str2, String str3, int i) {
        super(str2, str3);
        this.preventRealtimeUpdating = false;
        this.name = str;
        this.args = map;
        this.contentVersion = VarCache.contentVersion();
        this.priority = i;
    }

    private static boolean convertToBoolean(String str) {
        return "1".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str) || "true".equalsIgnoreCase(str) || "on".equalsIgnoreCase(str);
    }

    private boolean createActionContextForMessageId(String str, Map<String, Object> map, final String str2, String str3, Boolean bool) {
        try {
            final ActionContext actionContext = new ActionContext(str, map, str2);
            actionContext.contextualValues = this.contextualValues;
            actionContext.preventRealtimeUpdating = this.preventRealtimeUpdating;
            actionContext.isRooted = this.isRooted;
            actionContext.key = str3;
            if (bool.booleanValue()) {
                LeanplumInternal.triggerAction(actionContext, new VariablesChangedCallback() { // from class: com.leanplum.ActionContext.1
                    @Override // com.leanplum.callbacks.VariablesChangedCallback
                    public void variablesChanged() {
                        try {
                            if (VarCache.getActionDefinitionType(actionContext.name) == 2) {
                                ActionManager.getInstance().recordChainedActionImpression(str2);
                            } else {
                                ActionManager.getInstance().recordMessageImpression(str2);
                            }
                            Leanplum.triggerMessageDisplayed(actionContext);
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
                return true;
            }
            actionContext.parentContext = this;
            LeanplumInternal.triggerAction(actionContext);
            return true;
        } catch (Throwable th) {
            Log.exception(th);
            return false;
        }
    }

    private Map<String, Object> defaultValues() {
        Map<String, Object> map = (Map) CollectionUtil.uncheckedCast(getDefinition().get("values"));
        return map == null ? new HashMap() : map;
    }

    private String eventWithParentEventNames(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        while (this.parentContext != null) {
            arrayList.add(this);
            this = this.parentContext;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < -1) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            String str2 = size > -1 ? ((ActionContext) arrayList.get(size)).key : str;
            if (str2 == null) {
                sb = new StringBuilder("");
                break;
            }
            sb.append(str2.replace(" action", ""));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean executeChainedMessage(String str, Map<String, Object> map, String str2) {
        Map map2;
        if (map != null && (map2 = (Map) CollectionUtil.uncheckedCast(map.get(str))) != null) {
            Map<String, Object> map3 = (Map) CollectionUtil.uncheckedCast(map2.get("vars"));
            Object obj = map2.get("action");
            if (obj != null && createActionContextForMessageId(obj.toString(), map3, str, str2, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public static String filePath(String str) {
        return FileManager.fileValue(str);
    }

    public static String getChainedMessageId(Map<String, Object> map) {
        if (map == null || !Constants.Values.CHAIN_MESSAGE_ACTION_NAME.equals(map.get(Constants.Values.ACTION_ARG))) {
            return null;
        }
        return (String) map.get(Constants.Values.CHAIN_MESSAGE_ARG);
    }

    private Map<String, Object> getChildArgs(String str) {
        Object objObjectNamed = objectNamed(str);
        if (!(objObjectNamed instanceof Map)) {
            return null;
        }
        Map map = (Map) CollectionUtil.uncheckedCast(objObjectNamed);
        return (Map) CollectionUtil.uncheckedCast(VarCache.mergeHelper((Map) CollectionUtil.uncheckedCast(getDefinition((String) map.get(Constants.Values.ACTION_ARG)).get("values")), map));
    }

    private String getDefaultValue(String str) {
        String[] strArrSplit = str.split("\\.");
        Map<String, Object> mapDefaultValues = defaultValues();
        for (int i = 0; i < strArrSplit.length && mapDefaultValues != null; i++) {
            if (i == strArrSplit.length - 1) {
                Object obj = mapDefaultValues.get(strArrSplit[i]);
                if (obj == null) {
                    return null;
                }
                return obj.toString();
            }
            mapDefaultValues = (Map) CollectionUtil.uncheckedCast(mapDefaultValues.get(strArrSplit[i]));
        }
        return null;
    }

    private Map<String, Object> getDefinition() {
        return getDefinition(this.name);
    }

    private static Map<String, Object> getDefinition(String str) {
        Map<String, Object> map = (Map) CollectionUtil.uncheckedCast(VarCache.actionDefinitions().get(str));
        return map == null ? new HashMap() : map;
    }

    private boolean isChainToExistingMessageStarted(Map<String, Object> map, final String str) {
        if (map == null) {
            return false;
        }
        final String chainedMessageId = getChainedMessageId(map);
        if (!shouldForceContentUpdateForChainedMessage(map)) {
            return executeChainedMessage(chainedMessageId, VarCache.messages(), str);
        }
        Leanplum.forceContentUpdate(new VariablesChangedCallback() { // from class: com.leanplum.ActionContext.2
            @Override // com.leanplum.callbacks.VariablesChangedCallback
            public void variablesChanged() {
                ActionContext.this.executeChainedMessage(chainedMessageId, VarCache.messages(), str);
            }
        });
        return false;
    }

    private Map<String, String> kinds() {
        Map<String, String> map = (Map) CollectionUtil.uncheckedCast(getDefinition().get(Constants.Params.KINDS));
        return map == null ? new HashMap() : map;
    }

    public static <T> Map<String, T> mapFromJson(JSONObject jSONObject) {
        return JsonConverter.mapFromJson(jSONObject);
    }

    public static JSONObject mapToJsonObject(Map<String, ?> map) {
        return JsonConverter.mapToJsonObject(map);
    }

    public static boolean shouldForceContentUpdateForChainedMessage(Map<String, Object> map) {
        String chainedMessageId;
        return (map == null || (chainedMessageId = getChainedMessageId(map)) == null || (VarCache.messages() != null && VarCache.messages().containsKey(chainedMessageId))) ? false : true;
    }

    private void triggerActionNamedHandler(String str, Map<String, Object> map) {
        if (this.actionNamedHandler != null) {
            ActionContext actionContext = new ActionContext(str, map, this.messageId);
            actionContext.parentContext = this;
            this.actionNamedHandler.onResponse(actionContext);
        }
    }

    private void updateArgs(Map<String, Object> map, String str, Map<String, Object> map2) {
        Map<String, String> mapKinds = kinds();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2 != null ? map2.get(key) : null;
            String str2 = mapKinds.get(str + key);
            if ((str2 == null || !str2.equals("action")) && (value instanceof Map)) {
                Map<String, Object> map3 = (Map) value;
                if (!map3.containsKey(Constants.Values.ACTION_ARG)) {
                    updateArgs(map3, sko.v(str, key, "."), obj instanceof Map ? (Map) obj : null);
                }
            }
            if ((str2 != null && str2.equals("file")) || key.contains("__file__")) {
                FileManager.maybeDownloadFile(false, value.toString(), obj != null ? obj.toString() : null, null, null);
            } else if (str2 == null || str2.equals("action")) {
                Object objObjectNamed = objectNamed(str + key);
                if (objObjectNamed instanceof Map) {
                    Map map4 = (Map) objObjectNamed;
                    new ActionContext((String) map4.get(Constants.Values.ACTION_ARG), map4, this.messageId).update();
                }
            }
        }
    }

    public String actionName() {
        return this.name;
    }

    public boolean booleanNamed(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("booleanNamed - Invalid name parameter provided.", new Object[0]);
            return false;
        }
        Object objObjectNamed = objectNamed(str);
        if (objObjectNamed == null) {
            return false;
        }
        try {
            return objObjectNamed instanceof Boolean ? ((Boolean) objObjectNamed).booleanValue() : convertToBoolean(objObjectNamed.toString());
        } catch (Throwable th) {
            Log.exception(th);
            return false;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull ActionContext actionContext) {
        return this.priority - actionContext.getPriority();
    }

    public String fillTemplate(String str) {
        if (this.contextualValues != null && str != null && str.contains("##")) {
            Map<String, ?> map = this.contextualValues.parameters;
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    str = str.replace(z1m.l(new StringBuilder("##Parameter "), entry.getKey(), "##"), String.valueOf(entry.getValue()));
                }
            }
            Object obj = this.contextualValues.previousAttributeValue;
            if (obj != null) {
                str = str.replace("##Previous Value##", obj.toString());
            }
            Object obj2 = this.contextualValues.attributeValue;
            if (obj2 != null) {
                return str.replace("##Value##", obj2.toString());
            }
        }
        return str;
    }

    public ContextualValues getContextualValues() {
        return this.contextualValues;
    }

    public ActionContext getParentContext() {
        return this.parentContext;
    }

    public boolean hasParentContext() {
        return this.parentContext != null;
    }

    public void muteFutureMessagesOfSameKind() {
        try {
            ActionManager.getInstance().muteFutureMessagesOfKind(this.messageId);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public Number numberNamed(String str) {
        Double dValueOf = Double.valueOf(0.0d);
        if (TextUtils.isEmpty(str)) {
            Log.e("numberNamed - Invalid name parameter provided.", new Object[0]);
            return null;
        }
        Object objObjectNamed = objectNamed(str);
        if (objObjectNamed != null) {
            try {
                if (!TextUtils.isEmpty(objObjectNamed.toString())) {
                    return objObjectNamed instanceof Number ? (Number) objObjectNamed : Double.valueOf(objObjectNamed.toString());
                }
            } catch (Throwable th) {
                Log.exception(th);
            }
        }
        return dValueOf;
    }

    public <T> T objectNamed(String str) {
        Map map;
        if (TextUtils.isEmpty(str)) {
            Log.e("objectNamed - Invalid name parameter provided.", new Object[0]);
            return null;
        }
        try {
            if (!this.preventRealtimeUpdating && VarCache.contentVersion() > this.contentVersion) {
                ActionContext actionContext = this.parentContext;
                if (actionContext != null) {
                    this.args = actionContext.getChildArgs(this.key);
                } else if (this.messageId != null && (map = (Map) CollectionUtil.uncheckedCast(VarCache.messages().get(this.messageId))) != null) {
                    this.args = (Map) CollectionUtil.uncheckedCast(map.get("vars"));
                }
            }
            return (T) VarCache.getMergedValueFromComponentArray(VarCache.getNameComponents(str), this.args);
        } catch (Throwable th) {
            Log.exception(th);
            return null;
        }
    }

    public void preventRealtimeUpdating() {
        this.preventRealtimeUpdating = true;
    }

    public void runActionNamed(String str) {
        Object obj;
        if (TextUtils.isEmpty(str)) {
            Log.e("runActionNamed - Invalid name parameter provided.", new Object[0]);
            return;
        }
        Map<String, Object> childArgs = getChildArgs(str);
        triggerActionNamedHandler(str, childArgs);
        if (childArgs == null || isChainToExistingMessageStarted(childArgs, str) || (obj = childArgs.get(Constants.Values.ACTION_ARG)) == null) {
            return;
        }
        createActionContextForMessageId(obj.toString(), childArgs, this.messageId, str, Boolean.FALSE);
    }

    public void runTrackedActionNamed(String str) {
        ActionContext actionContext;
        String str2;
        try {
            if (Constants.isNoop() || this.messageId == null || !this.isRooted) {
                actionContext = this;
                str2 = str;
            } else if (TextUtils.isEmpty(str)) {
                Log.e("runTrackedActionNamed - Invalid name parameter provided.", new Object[0]);
                return;
            } else {
                actionContext = this;
                str2 = str;
                actionContext.trackMessageEvent(str2, 0.0d, null, null);
            }
            actionContext.runActionNamed(str2);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void setActionNamedHandler(ActionCallback actionCallback) {
        this.actionNamedHandler = actionCallback;
    }

    public void setContextualValues(ContextualValues contextualValues) {
        this.contextualValues = contextualValues;
    }

    public InputStream streamNamed(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.e("streamNamed - Invalid name parameter provided.", new Object[0]);
                return null;
            }
            String strStringNamed = stringNamed(str);
            String defaultValue = getDefaultValue(str);
            if ((strStringNamed == null || strStringNamed.length() == 0) && (defaultValue == null || defaultValue.length() == 0)) {
                return null;
            }
            InputStream inputStreamStream = FileManager.stream(false, null, null, FileManager.fileValue(strStringNamed, defaultValue, null), defaultValue, null);
            if (inputStreamStream == null) {
                Log.e("Could not open stream named " + str, new Object[0]);
            }
            return inputStreamStream;
        } catch (Throwable th) {
            Log.exception(th);
            return null;
        }
    }

    public String stringNamed(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("stringNamed - Invalid name parameter provided.", new Object[0]);
            return null;
        }
        Object objObjectNamed = objectNamed(str);
        if (objObjectNamed == null) {
            return null;
        }
        try {
            return fillTemplate(objObjectNamed.toString());
        } catch (Throwable th) {
            Log.exception(th);
            return objObjectNamed.toString();
        }
    }

    public void track(String str, double d, Map<String, Object> map) {
        try {
            if (Constants.isNoop() || this.messageId == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                Log.e("track - Invalid event parameter provided.", new Object[0]);
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(Constants.Params.MESSAGE_ID, this.messageId);
            LeanplumInternal.track(str, d, null, map, map2);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void trackMessageEvent(String str, double d, String str2, Map<String, Object> map) {
        try {
            if (Constants.isNoop() || this.messageId == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                Log.e("trackMessageEvent - Invalid event parameter provided.", new Object[0]);
                return;
            }
            String strEventWithParentEventNames = eventWithParentEventNames(str);
            if (TextUtils.isEmpty(strEventWithParentEventNames)) {
                Log.e("trackMessageEvent - Failed to generate parent action names.", new Object[0]);
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(Constants.Params.MESSAGE_ID, this.messageId);
            LeanplumInternal.track(strEventWithParentEventNames, d, str2, map, map2);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void update() {
        updateArgs(this.args, "", defaultValues());
    }
}
