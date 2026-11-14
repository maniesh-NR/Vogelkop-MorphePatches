package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010\u001c"}, d2 = {"Lcom/appsflyer/internal/AFh1oSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFAdRevenueData", "Ljava/lang/String;", "getRevenue", "areAllFieldsValid", "getMediationNetwork", "getMonetizationNetwork", "Ljava/lang/Boolean;", "getCurrencyIso4217Code", "component3", "component1", "Ljava/util/Map;", "component2", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFh1oSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public String getRevenue;

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    public String getMediationNetwork;

    @NotNull
    public Map<String, Object> component1;

    /* renamed from: component2, reason: from kotlin metadata */
    public Boolean component4;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public Boolean AFAdRevenueData;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public Boolean getCurrencyIso4217Code;
    public Boolean getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public Boolean component3;

    public AFh1oSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private AFh1oSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, @NotNull Map<String, Object> map) {
        this.getRevenue = str;
        this.component3 = bool;
        this.getMonetizationNetwork = bool2;
        this.getCurrencyIso4217Code = bool3;
        this.AFAdRevenueData = bool4;
        this.getMediationNetwork = str2;
        this.component4 = bool5;
        this.component1 = map;
    }

    public /* synthetic */ AFh1oSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? new HashMap() : map);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFh1oSDK)) {
            return false;
        }
        AFh1oSDK aFh1oSDK = (AFh1oSDK) p0;
        return Intrinsics.a(this.getRevenue, aFh1oSDK.getRevenue) && Intrinsics.a(this.component3, aFh1oSDK.component3) && Intrinsics.a(this.getMonetizationNetwork, aFh1oSDK.getMonetizationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFh1oSDK.getCurrencyIso4217Code) && Intrinsics.a(this.AFAdRevenueData, aFh1oSDK.AFAdRevenueData) && Intrinsics.a(this.getMediationNetwork, aFh1oSDK.getMediationNetwork) && Intrinsics.a(this.component4, aFh1oSDK.component4) && Intrinsics.a(this.component1, aFh1oSDK.component1);
    }

    public final int hashCode() {
        String str = this.getRevenue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component3;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getMonetizationNetwork;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getCurrencyIso4217Code;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.AFAdRevenueData;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getMediationNetwork;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component4;
        return this.component1.hashCode() + ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getRevenue;
        Boolean bool = this.component3;
        Boolean bool2 = this.getMonetizationNetwork;
        Boolean bool3 = this.getCurrencyIso4217Code;
        Boolean bool4 = this.AFAdRevenueData;
        String str2 = this.getMediationNetwork;
        Boolean bool5 = this.component4;
        Map<String, Object> map = this.component1;
        StringBuilder sb = new StringBuilder("AdvertisingIdData(advertisingId=");
        sb.append(str);
        sb.append(", isLimited=");
        sb.append(bool);
        sb.append(", isEnabled=");
        j.e(sb, bool2, ", isGaidWithGps=", bool3, ", isGaidWithSamsungCloudDev=");
        sb.append(bool4);
        sb.append(", gaidError=");
        sb.append(str2);
        sb.append(", retry=");
        sb.append(bool5);
        sb.append(", metadata=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
