package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {

    @NotNull
    private final AFf1gSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1kSDK getMediationNetwork;

    @NotNull
    private final AFc1iSDK getMonetizationNetwork;

    public AFb1cSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFf1gSDK aFf1gSDK) {
        this.getMediationNetwork = aFc1kSDK;
        this.getMonetizationNetwork = aFc1iSDK;
        this.getCurrencyIso4217Code = aFf1gSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        aFb1cSDK.getMediationNetwork.toString = new AFb1gSDK(appSetIdInfo.getScope(), appSetIdInfo.getId());
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean getCurrencyIso4217Code() {
        return !this.getCurrencyIso4217Code.AFAdRevenueData() && !this.getMediationNetwork.AFAdRevenueData() && AFj1iSDK.AFAdRevenueData(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1iSDK.getCurrencyIso4217Code(this.getMonetizationNetwork.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMediationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new b(this));
            } catch (Throwable th) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
            }
        }
    }
}
