package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class AFe1iSDK extends AFe1gSDK {
    private final PurchaseHandler.PurchaseValidationCallback component2;

    public AFe1iSDK(@NotNull AFe1mSDK aFe1mSDK, @NotNull AFe1mSDK[] aFe1mSDKArr, @NotNull AFc1dSDK aFc1dSDK, @NotNull Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1mSDK, aFe1mSDKArr, aFc1dSDK, null, map);
        this.component2 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    public final String AFAdRevenueData(@NotNull Map<String, Object> map) {
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    public final boolean component1() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public boolean getMediationNetwork() {
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.getMediationNetwork();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    public final String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getRevenue();
        Throwable thComponent4 = component4();
        if (thComponent4 != null && (purchaseValidationCallback2 = this.component2) != null) {
            purchaseValidationCallback2.onFailure(thComponent4);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1dSDK) this).component1;
        if (responseNetwork == null || (purchaseValidationCallback = this.component2) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }
}
