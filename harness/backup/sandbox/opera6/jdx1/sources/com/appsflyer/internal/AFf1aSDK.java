package com.appsflyer.internal;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1aSDK {
    public final long AFAdRevenueData;
    public final boolean getMediationNetwork;

    @NotNull
    public final String getRevenue;

    public AFf1aSDK(@NotNull String str, long j, boolean z) {
        this.getRevenue = str;
        this.AFAdRevenueData = j;
        this.getMediationNetwork = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.a(this.getRevenue, aFf1aSDK.getRevenue) && this.AFAdRevenueData == aFf1aSDK.AFAdRevenueData && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = z1m.e(this.getRevenue.hashCode() * 31, 31, this.AFAdRevenueData);
        boolean z = this.getMediationNetwork;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iE + i;
    }

    @NotNull
    public final String toString() {
        return "AFUninstallToken(token=" + this.getRevenue + ", receivedTime=" + this.AFAdRevenueData + ", isQueued=" + this.getMediationNetwork + ")";
    }
}
