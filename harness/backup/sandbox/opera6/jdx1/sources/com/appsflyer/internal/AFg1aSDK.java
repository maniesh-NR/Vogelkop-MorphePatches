package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1aSDK implements AFg1bSDK {
    private AFh1zSDK AFAdRevenueData;
    private AFh1wSDK getCurrencyIso4217Code;
    private AFg1fSDK getMediationNetwork;

    @NotNull
    private final AFc1dSDK getRevenue;

    public AFg1aSDK(@NotNull AFc1dSDK aFc1dSDK) {
        this.getRevenue = aFc1dSDK;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void AFAdRevenueData() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1wSDK aFh1wSDK = this.getCurrencyIso4217Code;
        if (aFh1wSDK == null) {
            aFh1wSDK = new AFh1wSDK(this.getRevenue);
            this.getCurrencyIso4217Code = aFh1wSDK;
        }
        aFLogger.registerClient(aFh1wSDK);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void component4() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        if (aFg1fSDK == null) {
            aFg1fSDK = new AFg1fSDK();
            this.getMediationNetwork = aFg1fSDK;
        }
        aFLogger.registerClient(aFg1fSDK);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getCurrencyIso4217Code() {
        AFh1zSDK aFh1zSDK = this.AFAdRevenueData;
        if (aFh1zSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1zSDK);
            this.AFAdRevenueData = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMediationNetwork() {
        AFh1wSDK aFh1wSDK = this.getCurrencyIso4217Code;
        if (aFh1wSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1wSDK);
            this.getCurrencyIso4217Code = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMonetizationNetwork() {
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        if (aFg1fSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1fSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK = this.AFAdRevenueData;
        if (aFh1zSDK == null) {
            aFh1zSDK = new AFh1zSDK(this.getRevenue);
            this.AFAdRevenueData = aFh1zSDK;
        }
        aFLogger.registerClient(aFh1zSDK);
    }
}
