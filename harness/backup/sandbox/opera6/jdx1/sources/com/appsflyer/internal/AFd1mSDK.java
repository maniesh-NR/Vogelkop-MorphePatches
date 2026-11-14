package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00168\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0017\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u001a"}, d2 = {"Lcom/appsflyer/internal/AFd1mSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;[BLjava/util/Map;I)V", "getCurrencyIso4217Code", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1gSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFd1gSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1gSDK;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFc1pSDK;", "", "getMediationNetwork", "Z", "()Z", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1mSDK extends AFd1zSDK {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFd1gSDK AFAdRevenueData;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final boolean getCurrencyIso4217Code;

    @NotNull
    public AFc1pSDK getRevenue;

    public AFd1mSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull byte[] bArr) {
        this(aFc1pSDK, bArr, null, 0, 12, null);
    }

    private AFd1mSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        this.getRevenue = aFc1pSDK;
        this.AFAdRevenueData = AFd1gSDK.OCTET_STREAM;
    }

    public /* synthetic */ AFd1mSDK(AFc1pSDK aFc1pSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1pSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NotNull
    public final String getCurrencyIso4217Code() {
        AFj1fSDK aFj1fSDK = new AFj1fSDK(this.getRevenue, null, 2, null);
        return aFj1fSDK.getCurrencyIso4217Code(aFj1fSDK.getMonetizationNetwork.AFAdRevenueData(AFj1fSDK.component4));
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NotNull
    public final String getCurrencyIso4217Code(@NotNull String str) {
        return sko.j("[RD]: ", str);
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    /* renamed from: getMediationNetwork, reason: from getter */
    public final boolean getGetCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NotNull
    /* renamed from: getRevenue, reason: from getter */
    public final AFd1gSDK getAFAdRevenueData() {
        return this.AFAdRevenueData;
    }
}
