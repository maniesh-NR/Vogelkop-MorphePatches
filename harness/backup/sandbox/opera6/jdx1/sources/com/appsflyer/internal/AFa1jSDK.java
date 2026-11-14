package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1gSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1gSDK;)V", "", "getCurrencyIso4217Code", "(Ljava/lang/String;)Z", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "getMediationNetwork", "Ljava/util/Map;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFa1gSDK;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1jSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    final Map<String, Object> getMonetizationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    final AFa1gSDK getMediationNetwork;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1jSDK$AFa1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1rSDK;", "p0", "Lcom/appsflyer/internal/AFa1jSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1rSDK;)Lcom/appsflyer/internal/AFa1jSDK;", "Lcom/appsflyer/internal/AFa1gSDK;", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFa1gSDK;)Lcom/appsflyer/internal/AFa1jSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFa1jSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static AFa1jSDK AFAdRevenueData(@NotNull AFh1rSDK p0) {
            AFa1gSDK aFa1gSDK = null;
            return new AFa1jSDK(p0.AFAdRevenueData, aFa1gSDK, 2, aFa1gSDK);
        }

        @NotNull
        public static AFa1jSDK getMonetizationNetwork(@NotNull AFa1gSDK p0) {
            return new AFa1jSDK(new LinkedHashMap(), p0, null);
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1gSDK aFa1gSDK) {
        this.getMonetizationNetwork = map;
        this.getMediationNetwork = aFa1gSDK;
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFa1gSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1gSDK);
    }

    @NotNull
    public static final AFa1jSDK AFAdRevenueData(@NotNull AFh1rSDK aFh1rSDK) {
        return Companion.AFAdRevenueData(aFh1rSDK);
    }

    @NotNull
    public static final AFa1jSDK getCurrencyIso4217Code(@NotNull AFa1gSDK aFa1gSDK) {
        return Companion.getMonetizationNetwork(aFa1gSDK);
    }

    public final void getCurrencyIso4217Code(@NotNull String p0, Object p1) {
        this.getMonetizationNetwork.put(p0, p1);
        AFa1gSDK aFa1gSDK = this.getMediationNetwork;
        if (aFa1gSDK != null) {
            aFa1gSDK.getMediationNetwork(this.getMonetizationNetwork);
        }
    }

    public final boolean getCurrencyIso4217Code(@NotNull String p0) {
        return this.getMonetizationNetwork.containsKey(p0);
    }
}
