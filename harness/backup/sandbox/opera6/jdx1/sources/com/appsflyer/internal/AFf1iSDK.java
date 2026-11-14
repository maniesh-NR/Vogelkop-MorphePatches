package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import defpackage.l4c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFf1iSDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFf1lSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFf1lSDK;)V", "", "AFAdRevenueData", "()J", "", "getMediationNetwork", "()Z", "Lcom/appsflyer/internal/AFc1pSDK;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFf1lSDK;", "getRevenue", "Ll4c;", "getCurrencyIso4217Code", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1iSDK {
    private static final long getMonetizationNetwork = 86400;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final AFf1lSDK getMediationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK getMonetizationNetwork;

    @NotNull
    private final l4c getRevenue = z4c.b(new AnonymousClass4());

    @NotNull
    private final l4c getCurrencyIso4217Code = z4c.b(new AnonymousClass5());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1iSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends ozb implements Function0<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @NotNull
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1iSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMonetizationNetwork", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1iSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends ozb implements Function0<Boolean> {
        public AnonymousClass5() {
            super(0);
        }

        @NotNull
        /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1iSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
        }
    }

    public AFf1iSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFf1lSDK aFf1lSDK) {
        this.getMonetizationNetwork = aFc1pSDK;
        this.getMediationNetwork = aFf1lSDK;
    }

    public final long AFAdRevenueData() {
        Long q0iVar;
        String currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        try {
            p0i p0iVar = t0i.b;
            q0iVar = Long.valueOf(Long.parseLong(currencyIso4217Code));
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        Throwable thD = t0i.d(q0iVar);
        if (thD != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thD.getMessage(), thD);
            q0iVar = Long.valueOf(getMonetizationNetwork);
        }
        return q0iVar.longValue();
    }

    public final boolean getMediationNetwork() {
        AFi1xSDK aFi1xSDK;
        AFi1wSDK aFi1wSDK = this.getMediationNetwork.getCurrencyIso4217Code;
        if (aFi1wSDK == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
        boolean currencyIso4217Code = (aFh1cSDK == null || (aFi1xSDK = aFh1cSDK.AFAdRevenueData) == null) ? false : aFi1xSDK.getCurrencyIso4217Code();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFf1lSDK aFf1lSDK = this.getMediationNetwork;
        return currencyIso4217Code || jCurrentTimeMillis - aFf1lSDK.getMediationNetwork > TimeUnit.SECONDS.toMillis(aFf1lSDK.getRevenue);
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    public final boolean getRevenue() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }
}
