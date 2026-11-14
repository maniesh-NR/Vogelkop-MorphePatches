package com.leanplum.internal;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JsonConverter {
    public static Map<String, Object> fromJson(String str) {
        if (str == null) {
            return null;
        }
        try {
            return mapFromJson(new JSONObject(str));
        } catch (JSONException e) {
            Log.e("Error converting " + str + " from JSON", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.util.List<T> listFromJson(org.json.JSONArray r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.length()
            r1.<init>(r2)
            r2 = 0
        Le:
            int r3 = r6.length()
            if (r2 >= r3) goto L41
            java.lang.Object r3 = r6.opt(r2)
            if (r3 == 0) goto L3a
            java.lang.Object r4 = org.json.JSONObject.NULL
            if (r3 == r4) goto L3a
            boolean r5 = r3 instanceof org.json.JSONObject
            if (r5 == 0) goto L29
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.Map r3 = mapFromJson(r3)
            goto L3b
        L29:
            boolean r5 = r3 instanceof org.json.JSONArray
            if (r5 == 0) goto L34
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.List r3 = listFromJson(r3)
            goto L3b
        L34:
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L3b
        L3a:
            r3 = r0
        L3b:
            r1.add(r3)
            int r2 = r2 + 1
            goto Le
        L41:
            java.lang.Object r6 = com.leanplum.internal.CollectionUtil.uncheckedCast(r1)
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.internal.JsonConverter.listFromJson(org.json.JSONArray):java.util.List");
    }

    public static <T> List<T> listFromJsonOrDefault(JSONArray jSONArray) {
        return jSONArray == null ? new ArrayList() : listFromJson(jSONArray);
    }

    public static JSONArray listToJsonArray(Iterable<?> iterable) throws JSONException {
        if (iterable == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objListToJsonArray : iterable) {
            if (objListToJsonArray instanceof Map) {
                objListToJsonArray = mapToJsonObject((Map) CollectionUtil.uncheckedCast(objListToJsonArray));
            } else if (objListToJsonArray instanceof Iterable) {
                objListToJsonArray = listToJsonArray((Iterable) objListToJsonArray);
            } else if (objListToJsonArray == null) {
                objListToJsonArray = JSONObject.NULL;
            }
            jSONArray.put(objListToJsonArray);
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.util.Map<java.lang.String, T> mapFromJson(org.json.JSONObject r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r7.keys()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.opt(r3)
            if (r4 == 0) goto L3f
            java.lang.Object r5 = org.json.JSONObject.NULL
            if (r4 == r5) goto L3f
            boolean r6 = r4 instanceof org.json.JSONObject
            if (r6 == 0) goto L2e
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.Map r4 = mapFromJson(r4)
            goto L40
        L2e:
            boolean r6 = r4 instanceof org.json.JSONArray
            if (r6 == 0) goto L39
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.util.List r4 = listFromJson(r4)
            goto L40
        L39:
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L40
        L3f:
            r4 = r0
        L40:
            java.lang.Object r4 = com.leanplum.internal.CollectionUtil.uncheckedCast(r4)
            r1.put(r3, r4)
            goto Ld
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.internal.JsonConverter.mapFromJson(org.json.JSONObject):java.util.Map");
    }

    public static <T> Map<String, T> mapFromJsonOrDefault(JSONObject jSONObject) {
        return jSONObject == null ? new HashMap() : mapFromJson(jSONObject);
    }

    public static JSONObject mapToJsonObject(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = mapToJsonObject((Map) CollectionUtil.uncheckedCast(value));
            } else if (value instanceof Iterable) {
                value = listToJsonArray((Iterable) value);
            } else if (value instanceof Editable) {
                value = value.toString();
            } else if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static String toJson(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        try {
            return mapToJsonObject(map).toString();
        } catch (JSONException e) {
            Log.e("Error converting " + map + " to JSON", e);
            return null;
        }
    }
}
