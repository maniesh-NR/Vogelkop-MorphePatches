package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1wSDK extends AFg1gSDK {

    @NotNull
    private final AFc1dSDK getMonetizationNetwork;
    private final boolean getRevenue = true;

    public AFh1wSDK(@NotNull AFc1dSDK aFc1dSDK) {
        this.getMonetizationNetwork = aFc1dSDK;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("D", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("E", getRevenue(str, aFg1cSDK));
            this.getMonetizationNetwork.copy().getMonetizationNetwork(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        this.getMonetizationNetwork.copy().getMonetizationNetwork("F", getRevenue(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean getShouldExtendMsg() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("I", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("V", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        if (z) {
            this.getMonetizationNetwork.copy().getMonetizationNetwork("W", getRevenue(str, aFg1cSDK));
        }
    }
}
