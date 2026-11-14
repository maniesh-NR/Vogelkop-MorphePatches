package com.appsflyer.internal;

import defpackage.p3p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1uSDK {
    final int AFAdRevenueData;

    @NotNull
    final String getCurrencyIso4217Code;

    @NotNull
    final List<AFe1mSDK> getRevenue;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1uSDK(@NotNull String str, @NotNull List<? extends AFe1mSDK> list, int i) {
        this.getCurrencyIso4217Code = str;
        this.getRevenue = list;
        this.AFAdRevenueData = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1uSDK)) {
            return false;
        }
        AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getRevenue, aFc1uSDK.getRevenue) && this.AFAdRevenueData == aFc1uSDK.AFAdRevenueData;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AFAdRevenueData) + rfp.f(this.getCurrencyIso4217Code.hashCode() * 31, 31, this.getRevenue);
    }

    @NotNull
    public final String toString() {
        String str = this.getCurrencyIso4217Code;
        List<AFe1mSDK> list = this.getRevenue;
        int i = this.AFAdRevenueData;
        StringBuilder sb = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb.append(str);
        sb.append(", eventTypes=");
        sb.append(list);
        sb.append(", maxCapacity=");
        return p3p.k(i, ")", sb);
    }
}
