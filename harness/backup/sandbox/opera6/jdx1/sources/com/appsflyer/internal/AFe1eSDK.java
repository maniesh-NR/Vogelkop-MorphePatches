package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1vSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import defpackage.l4c;
import defpackage.z1m;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u000b\u001a\u00020\u0016*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u000b\u0010\u0017J\u000f\u0010\u0014\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0014\u0010\u0019J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0013\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010 \u001a\u00020\u00188BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010)\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b%\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1sSDK;", "Lcom/appsflyer/internal/AFh1oSDK;", "Lcom/appsflyer/internal/AFc1dSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1dSDK;)V", "", "equals", "()Z", "", "AFAdRevenueData", "(I)Z", "Landroid/content/Context;", "getCurrencyIso4217Code", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;)Z", "getMediationNetwork", "getMonetizationNetwork", "", "", "(Lcom/appsflyer/internal/AFh1oSDK;Ljava/lang/String;)V", "", "()J", "Lcom/appsflyer/internal/AFe1rSDK;", "()Lcom/appsflyer/internal/AFe1rSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFc1iSDK;", "Lcom/appsflyer/internal/AFc1pSDK;", "component3", "Lcom/appsflyer/internal/AFc1pSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "component2", "Lcom/appsflyer/internal/AFc1kSDK;", "component1", "Lcom/appsflyer/internal/AFh1oSDK;", "component4", "Ll4c;", "getRevenue", "AFa1tSDK", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1eSDK extends AFe1sSDK<AFh1oSDK> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFc1iSDK getMediationNetwork;

    /* renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AFh1oSDK getMonetizationNetwork;

    /* renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AFc1kSDK component1;

    /* renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK AFAdRevenueData;

    /* renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final l4c component3;

    /* renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final l4c getRevenue;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends ozb implements Function0<Boolean> {
        public AnonymousClass3() {
            super(0);
        }

        @NotNull
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Boolean m10invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends ozb implements Function0<Long> {
        public AnonymousClass4() {
            super(0);
        }

        @NotNull
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Long m11invoke() {
            Long lK0;
            String currencyIso4217Code = AFe1eSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (lK0 = StringsKt.k0(currencyIso4217Code)) == null) ? 1000L : lK0.longValue());
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1eSDK$AFa1ySDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class AFa1ySDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1ySDK() {
            this(null, null, false, null, 15, null);
        }

        public AFa1ySDK(String str, Boolean bool, boolean z, @NotNull StringBuilder sb) {
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = sb;
        }

        public /* synthetic */ AFa1ySDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }

        public static /* synthetic */ AFa1ySDK copy$default(AFa1ySDK aFa1ySDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1ySDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1ySDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1ySDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1ySDK.gaidError;
            }
            return aFa1ySDK.copy(str, bool, z, sb);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1ySDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            return new AFa1ySDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) other;
            return Intrinsics.a(this.advertisingId, aFa1ySDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1ySDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1ySDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1ySDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.gaidError.hashCode() + ((iHashCode2 + i) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ AFa1ySDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1zSDK(AFa1ySDK aFa1ySDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1ySDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            AFg1gSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, sko.j("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    public AFe1eSDK(@NotNull AFc1dSDK aFc1dSDK) {
        super(AFe1mSDK.FETCH_ADVERTISING_ID, new AFe1mSDK[0], "FetchAdvertisingIdTask");
        this.getMediationNetwork = aFc1dSDK.AFInAppEventType();
        this.AFAdRevenueData = aFc1dSDK.getRevenue();
        this.component1 = aFc1dSDK.afInfoLog();
        this.getMonetizationNetwork = new AFh1oSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component3 = z4c.b(new AnonymousClass4());
        this.getRevenue = z4c.b(new AnonymousClass3());
    }

    private static void AFAdRevenueData(AFh1oSDK aFh1oSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1oSDK.getMediationNetwork;
        if (str2 != null) {
            str = sko.k(str2, " | ", str);
        }
        aFh1oSDK.getMediationNetwork = str;
    }

    private final boolean AFAdRevenueData(int p0) {
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
        int currencyIso4217Code = getCurrencyIso4217Code(this.getMediationNetwork.getMonetizationNetwork);
        if (!getCurrencyIso4217Code(this.getMediationNetwork.getMonetizationNetwork, aFa1ySDK)) {
            boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true) && AFAdRevenueData(this.getMediationNetwork.getMonetizationNetwork, aFa1ySDK);
            String string = aFa1ySDK.getGaidError().toString();
            if (!StringsKt.N(string)) {
                string = currencyIso4217Code + ": " + StringsKt.l0(string).toString();
            }
            AFAdRevenueData(this.getMonetizationNetwork, string);
            if (!z) {
                return false;
            }
        }
        AFh1oSDK aFh1oSDK = this.getMonetizationNetwork;
        aFh1oSDK.getRevenue = aFa1ySDK.getAdvertisingId();
        aFh1oSDK.component3 = aFa1ySDK.isLimitAdTrackingEnabled();
        aFh1oSDK.getMonetizationNetwork = aFa1ySDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r0.booleanValue()) : null;
        aFh1oSDK.getCurrencyIso4217Code = Boolean.valueOf(aFa1ySDK.getAdvertisingIdWithGps());
        aFh1oSDK.AFAdRevenueData = Boolean.FALSE;
        aFh1oSDK.component4 = Boolean.valueOf(p0 != 2);
        return true;
    }

    private final boolean AFAdRevenueData(Context p0, AFa1ySDK p1) {
        try {
            AFb1vSDK.AFa1vSDK aFa1vSDKAFAdRevenueData = AFb1vSDK.AFAdRevenueData(p0);
            p1.setAdvertisingId(aFa1vSDKAFAdRevenueData.AFAdRevenueData);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1vSDKAFAdRevenueData.getCurrencyIso4217Code()));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p1.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.a != null) {
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, sko.j("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean component1() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    private static boolean component3() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : sko.j("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean equals() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r3 = r2
        L5:
            if (r1 <= 0) goto L48
            boolean r3 = r0.component1()
            r4 = 1
            if (r3 == 0) goto L22
            boolean r3 = r0.getMediationNetwork(r1)
            if (r3 == 0) goto L22
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using Samsung Cloud dev SDK"
            r8 = 0
            com.appsflyer.internal.AFg1gSDK.v$default(r5, r6, r7, r8, r9, r10)
        L20:
            r3 = r4
            goto L43
        L22:
            boolean r3 = r0.AFAdRevenueData(r1)
            if (r3 == 0) goto L35
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using GMS"
            r8 = 0
            com.appsflyer.internal.AFg1gSDK.v$default(r5, r6, r7, r8, r9, r10)
            goto L20
        L35:
            com.appsflyer.AFLogger r11 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r12 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r15 = 4
            r16 = 0
            java.lang.String r13 = "Failed to fetch GAID"
            r14 = 0
            com.appsflyer.internal.AFg1gSDK.v$default(r11, r12, r13, r14, r15, r16)
            r3 = r2
        L43:
            if (r3 != 0) goto L48
            int r1 = r1 + (-1)
            goto L5
        L48:
            com.appsflyer.internal.AFc1kSDK r1 = r0.component1
            com.appsflyer.internal.AFh1oSDK r0 = r0.getMonetizationNetwork
            r1.component3 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1eSDK.equals():boolean");
    }

    private static int getCurrencyIso4217Code(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getCurrencyIso4217Code(Context p0, AFa1ySDK p1) {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.getId());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFg1cSDK, sko.j("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private final boolean getMediationNetwork(int p0) {
        return getMonetizationNetwork(p0);
    }

    private final boolean getMonetizationNetwork(int p0) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (!component3() || !CloudDevSdk.INSTANCE.isCloudEnvironment(this.getMediationNetwork.getMonetizationNetwork)) {
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
            return false;
        }
        AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            CloudDevSdk.INSTANCE.request(this.getMediationNetwork.getMonetizationNetwork, Collections.singletonList("gaid"), new AFa1zSDK(aFa1ySDK, countDownLatch));
            countDownLatch.await(((Number) this.component3.getValue()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                } else if (th instanceof ClassNotFoundException) {
                    str = "CloudDevSdk not found";
                } else {
                    str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                }
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                StringBuilder gaidError = aFa1ySDK.getGaidError();
                gaidError.append(th.getClass().getSimpleName());
                gaidError.append(" |");
            } finally {
                if (aFa1ySDK.getGaidError().length() > 0) {
                    AFAdRevenueData(this.getMonetizationNetwork, aFa1ySDK.getGaidError().toString());
                }
            }
        }
        if (aFa1ySDK.getGaidError().length() > 0) {
        }
        String advertisingId = aFa1ySDK.getAdvertisingId();
        if (advertisingId == null || advertisingId.length() == 0) {
            return false;
        }
        AFh1oSDK aFh1oSDK = this.getMonetizationNetwork;
        aFh1oSDK.getRevenue = aFa1ySDK.getAdvertisingId();
        Boolean bool = Boolean.FALSE;
        aFh1oSDK.component3 = bool;
        Boolean bool2 = Boolean.TRUE;
        aFh1oSDK.getMonetizationNetwork = bool2;
        aFh1oSDK.getCurrencyIso4217Code = bool;
        aFh1oSDK.AFAdRevenueData = bool2;
        aFh1oSDK.component4 = Boolean.valueOf(p0 != 2);
        return true;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NotNull
    public final AFe1rSDK getCurrencyIso4217Code() {
        if (this.component1.getMonetizationNetwork()) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1rSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(equals());
        Boolean bool = Boolean.FALSE;
        AFe1rSDK aFe1rSDK = Arrays.asList(boolValueOf, bool, bool).contains(Boolean.TRUE) ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
        AFc1kSDK aFc1kSDK = this.component1;
        AFd1hSDK aFd1hSDK = new AFd1hSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, z1m.j(aFd1hSDK.getRevenue, "QUEUE: FetchAdvertisingIdTask: took ", "ms"), false, 4, null);
        aFc1kSDK.getRevenue(aFd1hSDK);
        return aFe1rSDK;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return ((Number) this.component3.getValue()).longValue();
    }
}
