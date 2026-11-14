package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1sSDK extends AFf1rSDK {

    @NotNull
    private final AFh1lSDK hashCode;

    public AFf1sSDK(@NotNull AFh1lSDK aFh1lSDK, @NotNull AFc1dSDK aFc1dSDK) {
        super(aFh1lSDK, aFc1dSDK);
        this.hashCode = aFh1lSDK;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(@NotNull AFh1rSDK aFh1rSDK) {
        super.AFAdRevenueData(aFh1rSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.hashCode.equals;
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.hashCode.copy;
        if (map != null && !map.isEmpty()) {
            List listAsList = Arrays.asList(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, AdRevenueScheme.COUNTRY, AdRevenueScheme.PLACEMENT);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listAsList.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        aFh1rSDK.AFAdRevenueData.put("ad_network", linkedHashMap3);
    }
}
