package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0016\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001f"}, d2 = {"Lcom/appsflyer/internal/AFi1xSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getCurrencyIso4217Code", "()Z", "AFAdRevenueData", "Ljava/lang/String;", "getRevenue", "getMonetizationNetwork", "I", "F", "getMediationNetwork", "component2", "Ljava/util/List;", "J", "component1"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFi1xSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final String getRevenue;

    /* renamed from: component2, reason: from kotlin metadata */
    @NotNull
    public final String AFAdRevenueData;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public List<String> component2;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public long component1;
    public final int getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public final float getMediationNetwork;

    public AFi1xSDK(long j, float f, @NotNull List<String> list, int i, @NotNull String str, @NotNull String str2) {
        this.component1 = j;
        this.getMediationNetwork = f;
        this.component2 = list;
        this.getMonetizationNetwork = i;
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!AFi1xSDK.class.equals(p0 != null ? p0.getClass() : null)) {
            return false;
        }
        AFi1xSDK aFi1xSDK = (AFi1xSDK) p0;
        return this.component1 == aFi1xSDK.component1 && this.getMediationNetwork == aFi1xSDK.getMediationNetwork && Intrinsics.a(this.component2, aFi1xSDK.component2) && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.a(this.getRevenue, aFi1xSDK.getRevenue) && Intrinsics.a(this.AFAdRevenueData, aFi1xSDK.AFAdRevenueData);
    }

    public final boolean getCurrencyIso4217Code() {
        return TimeUnit.SECONDS.toMillis(this.component1) > ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData().component3().AFAdRevenueData();
    }

    public final int hashCode() {
        return this.AFAdRevenueData.hashCode() + ((this.getRevenue.hashCode() + ((rfp.f(sko.d(this.getMediationNetwork, Long.hashCode(this.component1) * 31, 31), 31, this.component2) + this.getMonetizationNetwork) * 31)) * 31);
    }
}
