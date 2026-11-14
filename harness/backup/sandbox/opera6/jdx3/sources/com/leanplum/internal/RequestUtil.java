package com.leanplum.internal;

import com.leanplum.internal.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RequestUtil {
    public static String getReadableErrorMessage(String str) {
        if (str == null || str.length() == 0) {
            return "API error";
        }
        if (str.startsWith("App not found")) {
            Constants.isInPermanentFailureState = true;
            return "No app matching the provided app ID was found.";
        }
        if (str.startsWith("Invalid access key")) {
            Constants.isInPermanentFailureState = true;
            return "The access key you provided is not valid for this app.";
        }
        if (!str.startsWith("Development mode requested but not permitted")) {
            return "API error: ".concat(str);
        }
        Constants.isInPermanentFailureState = true;
        return "A call to Leanplum.setAppIdForDevelopmentMode with your production key was made, which is not permitted.";
    }

    public static String getResponseError(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("error");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            return jSONObjectOptJSONObject.getString(Constants.Params.MESSAGE);
        } catch (JSONException e) {
            Log.e("Could not parse JSON response.", e);
            return null;
        }
    }

    public static JSONObject getResponseForId(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.Params.RESPONSE);
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null && str.equalsIgnoreCase(jSONObject2.getString(Constants.Params.REQUEST_ID))) {
                        return jSONObject2;
                    }
                }
            }
            return null;
        } catch (JSONException e) {
            Log.e("Could not get response for id: " + str, e);
            return null;
        }
    }

    public static boolean isResponseSuccess(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.getBoolean("success");
        } catch (JSONException e) {
            Log.e("Could not parse JSON response.", e);
            return false;
        }
    }
}
