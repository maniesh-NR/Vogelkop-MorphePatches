package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1cSDK {
    public AFi1xSDK AFAdRevenueData;
    public final AFh1bSDK getCurrencyIso4217Code;
    public final AFh1dSDK getRevenue;

    public AFh1cSDK(@NotNull JSONObject jSONObject) {
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getRevenue = getRevenue(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }

    private static AFi1xSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        AFi1xSDK q0iVar;
        ArrayList arrayList;
        try {
            p0i p0iVar = t0i.b;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j = jSONObjectAFAdRevenueData.getLong("ttl");
                int i = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(jSONArrayOptJSONArray.getString(i2));
                    }
                } else {
                    arrayList = l08.a;
                }
                q0iVar = new AFi1xSDK(j, fOptDouble, arrayList, i, strOptString, strOptString2);
            } else {
                q0iVar = null;
            }
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        p0i p0iVar3 = t0i.b;
        return q0iVar instanceof q0i ? null : q0iVar;
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        AFh1bSDK q0iVar;
        try {
            p0i p0iVar = t0i.b;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            q0iVar = jSONObjectAFAdRevenueData != null ? new AFh1bSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        return q0iVar instanceof q0i ? null : q0iVar;
    }

    private static AFh1dSDK getRevenue(JSONObject jSONObject) {
        AFh1dSDK q0iVar;
        try {
            p0i p0iVar = t0i.b;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            q0iVar = jSONObjectAFAdRevenueData != null ? new AFh1dSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        return q0iVar instanceof q0i ? null : q0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1cSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        return Intrinsics.a(this.getRevenue, aFh1cSDK.getRevenue) && Intrinsics.a(this.getCurrencyIso4217Code, aFh1cSDK.getCurrencyIso4217Code) && Intrinsics.a(this.AFAdRevenueData, aFh1cSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        AFh1dSDK aFh1dSDK = this.getRevenue;
        int iHashCode = (aFh1dSDK != null ? aFh1dSDK.hashCode() : 0) * 31;
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int iHashCode2 = (iHashCode + (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.AFAdRevenueData;
        return iHashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }
}
