package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AFe1gSDK extends AFe1dSDK<String> {

    @NotNull
    private final AFe1mSDK component2;

    @NotNull
    private final AFc1pSDK copy;

    @NotNull
    private final AFc1qSDK copydefault;

    @NotNull
    private final Map<String, Object> equals;

    @NotNull
    private final AFg1qSDK hashCode;

    @NotNull
    private final AFf1dSDK toString;

    public AFe1gSDK(@NotNull AFe1mSDK aFe1mSDK, @NotNull AFe1mSDK[] aFe1mSDKArr, @NotNull AFc1dSDK aFc1dSDK, String str, @NotNull Map<String, ? extends Object> map) {
        super(aFe1mSDK, aFe1mSDKArr, aFc1dSDK, null);
        this.component2 = aFe1mSDK;
        this.equals = map;
        this.copy = aFc1dSDK.getRevenue();
        this.copydefault = aFc1dSDK.component2();
        this.hashCode = aFc1dSDK.component3();
        this.toString = aFc1dSDK.afErrorLog();
    }

    public abstract AFd1nSDK<String> AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull String str, String str2);

    public String AFAdRevenueData(@NotNull Map<String, Object> map) {
        return null;
    }

    public boolean component1() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AppsFlyerRequestListener component3() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean copydefault() {
        return true;
    }

    public void getMediationNetwork(@NotNull Map<String, Object> map, String str) {
        map.put("app_id", this.copy.getRevenue.getMonetizationNetwork.getPackageName());
        String currencyIso4217Code = AFc1pSDK.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            map.put("cuid", currencyIso4217Code);
        }
        Context context = this.copy.getRevenue.getMonetizationNetwork;
        map.put("app_version_name", AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
        if (component1()) {
            map.put("event_timestamp", Long.valueOf(this.hashCode.AFAdRevenueData()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    public String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFd1nSDK<String> getRevenue(@NotNull String str) throws JSONException {
        AFd1cSDK aFd1cSDK;
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(this.equals);
        String strAFAdRevenueData = AFAdRevenueData(linkedHashMap);
        String monetizationNetwork = getMonetizationNetwork(linkedHashMap);
        Map<String, Object> linkedHashMap2 = new LinkedHashMap<>(linkedHashMap);
        getMediationNetwork(linkedHashMap2, strAFAdRevenueData);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String strAFAdRevenueData2 = this.copy.AFAdRevenueData();
        if (strAFAdRevenueData2 != null && !StringsKt.N(strAFAdRevenueData2)) {
            linkedHashMap3.put("advertising_id", strAFAdRevenueData2);
        }
        AFb1mSDK mediationNetwork = AFb1jSDK.getMediationNetwork(this.copy.getRevenue.getMonetizationNetwork);
        String str2 = null;
        String str3 = mediationNetwork != null ? mediationNetwork.getMonetizationNetwork : null;
        if (str3 != null && !StringsKt.N(str3)) {
            linkedHashMap3.put("oaid", str3);
        }
        AFb1mSDK aFb1mSDKK_ = AFb1jSDK.k_(this.copy.getRevenue.getMonetizationNetwork.getContentResolver());
        String str4 = aFb1mSDKK_ != null ? aFb1mSDKK_.getMonetizationNetwork : null;
        if (str4 != null && !StringsKt.N(str4)) {
            linkedHashMap3.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            linkedHashMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            AFf1gSDK aFf1gSDK = ((AFe1dSDK) this).component3;
            String str5 = (String) AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK, this.copydefault}, -1198101809, 1198101809, System.identityHashCode(aFf1gSDK));
            if (str5 != null && !StringsKt.N(str5)) {
                linkedHashMap3.put("imei", str5);
            }
        }
        String revenue = AFb1iSDK.getRevenue(this.copy.getMonetizationNetwork);
        if (revenue == null) {
            revenue = "";
        }
        linkedHashMap3.put("appsflyer_id", revenue);
        linkedHashMap3.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap3.put("sdk_version", "6.17.0");
        if (monetizationNetwork != null && !StringsKt.N(monetizationNetwork)) {
            linkedHashMap3.put("sdk_connector_version", monetizationNetwork);
        }
        linkedHashMap2.put("device_data", linkedHashMap3);
        this.toString.AFAdRevenueData(linkedHashMap2, this.component2);
        AFd1nSDK<String> aFd1nSDKAFAdRevenueData = AFAdRevenueData(linkedHashMap2, str, strAFAdRevenueData);
        if (aFd1nSDKAFAdRevenueData != null && (aFd1cSDK = aFd1nSDKAFAdRevenueData.getRevenue) != null) {
            str2 = aFd1cSDK.getMonetizationNetwork;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(linkedHashMap2);
            AFh1ySDK.getCurrencyIso4217Code(toString() + ": preparing data: ", jSONObject);
            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(str2, jSONObject.toString());
        }
        return aFd1nSDKAFAdRevenueData;
    }
}
