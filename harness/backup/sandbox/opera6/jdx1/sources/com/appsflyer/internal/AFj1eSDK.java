package com.appsflyer.internal;

import defpackage.do5;
import defpackage.ubb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFj1eSDK {
    private static final Object AFAdRevenueData(Object obj) {
        if (obj instanceof JSONArray) {
            return getCurrencyIso4217Code((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getCurrencyIso4217Code((JSONObject) obj);
        }
        if (Intrinsics.a(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> getCurrencyIso4217Code(JSONArray jSONArray) {
        IntRange intRangeJ = djh.j(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(k95.o(intRangeJ, 10));
        Iterator it = intRangeJ.iterator();
        while (it.hasNext()) {
            arrayList.add(AFAdRevenueData(jSONArray.get(((ubb) it).nextInt())));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> getCurrencyIso4217Code(@NotNull JSONObject jSONObject) {
        do5 do5VarB = v1j.b(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = do5VarB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, AFAdRevenueData(jSONObject.get((String) next)));
        }
        return linkedHashMap;
    }
}
