package com.appsflyer.internal;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1zSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1zSDK(int i, int i2, int i3, int i4, @NotNull String str) {
        this.getMonetizationNetwork = i;
        this.getCurrencyIso4217Code = i2;
        this.getRevenue = i3;
        this.AFAdRevenueData = i4;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1zSDK)) {
            return false;
        }
        AFg1zSDK aFg1zSDK = (AFg1zSDK) obj;
        return this.getMonetizationNetwork == aFg1zSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFg1zSDK.getCurrencyIso4217Code && this.getRevenue == aFg1zSDK.getRevenue && this.AFAdRevenueData == aFg1zSDK.AFAdRevenueData && Intrinsics.a(this.getMediationNetwork, aFg1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + rfp.c(this.AFAdRevenueData, rfp.c(this.getRevenue, rfp.c(this.getCurrencyIso4217Code, Integer.hashCode(this.getMonetizationNetwork) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i = this.getMonetizationNetwork;
        int i2 = this.getCurrencyIso4217Code;
        int i3 = this.getRevenue;
        int i4 = this.AFAdRevenueData;
        String str = this.getMediationNetwork;
        StringBuilder sbO = sko.o(i, i2, "CmpTcfData(policyVersion=", ", gdprApplies=", ", cmpSdkId=");
        sko.r(i3, i4, ", cmpSdkVersion=", ", tcString=", sbO);
        return z1m.l(sbO, str, ")");
    }
}
