package com.leanplum.internal;

import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.internal.Constants;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Socket {
    public static void handleTriggerEvent(JSONArray jSONArray) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            JSONObject jSONObject2 = jSONObject.getJSONObject("action");
            if (jSONObject2 != null) {
                String string = jSONObject.getString(Constants.Params.MESSAGE_ID);
                boolean z = jSONObject.getBoolean("isRooted");
                String string2 = jSONObject2.getString(Constants.Values.ACTION_ARG);
                Map map = (Map) CollectionUtil.uncheckedCast(VarCache.actionDefinitions().get(string2));
                ActionContext actionContext = new ActionContext(string2, (Map) CollectionUtil.uncheckedCast(VarCache.mergeHelper(map != null ? (Map) CollectionUtil.uncheckedCast(map.get("values")) : null, JsonConverter.mapFromJson(jSONObject2))), string);
                actionContext.preventRealtimeUpdating();
                actionContext.setIsRooted(z);
                actionContext.setIsPreview(true);
                actionContext.update();
                LeanplumInternal.triggerAction(actionContext);
                ActionManager.getInstance().recordMessageImpression(actionContext.getMessageId());
                Leanplum.triggerMessageDisplayed(actionContext);
            }
        } catch (JSONException e) {
            Log.e("Error getting action info", e);
        }
    }
}
