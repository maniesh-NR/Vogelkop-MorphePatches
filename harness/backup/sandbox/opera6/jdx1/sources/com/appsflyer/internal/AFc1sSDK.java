package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1sSDK {

    @NotNull
    final List<AFc1uSDK> AFAdRevenueData;

    public AFc1sSDK(@NotNull List<AFc1uSDK> list) {
        this.AFAdRevenueData = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.a(this.AFAdRevenueData, ((AFc1sSDK) obj).AFAdRevenueData);
    }

    public final int hashCode() {
        return this.AFAdRevenueData.hashCode();
    }

    @NotNull
    public final String toString() {
        return sko.m("StorageConfig(typeEntries=", ")", this.AFAdRevenueData);
    }
}
