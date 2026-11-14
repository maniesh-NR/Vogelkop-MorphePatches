package com.appsflyer.internal;

import defpackage.p3p;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1hSDK {
    public final long AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1hSDK(long j, long j2, String str, String str2) {
        this.AFAdRevenueData = j;
        this.getRevenue = j2;
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1hSDK)) {
            return false;
        }
        AFi1hSDK aFi1hSDK = (AFi1hSDK) obj;
        return this.AFAdRevenueData == aFi1hSDK.AFAdRevenueData && this.getRevenue == aFi1hSDK.getRevenue && Intrinsics.a(this.getCurrencyIso4217Code, aFi1hSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFi1hSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        int iE = z1m.e(Long.hashCode(this.AFAdRevenueData) * 31, 31, this.getRevenue);
        String str = this.getCurrencyIso4217Code;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMonetizationNetwork;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        long j = this.AFAdRevenueData;
        long j2 = this.getRevenue;
        String str = this.getCurrencyIso4217Code;
        String str2 = this.getMonetizationNetwork;
        StringBuilder sbQ = p3p.q(j, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        sbQ.append(j2);
        sbQ.append(", piaToken=");
        sbQ.append(str);
        return p3p.n(sbQ, ", errorCode=", str2, ")");
    }
}
