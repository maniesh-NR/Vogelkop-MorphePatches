package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 \t2\u00020\u0001:\u0004\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "getMediationNetwork", "Ljava/lang/String;", "AFAdRevenueData", "AFa1zSDK", "AFa1tSDK", "AFa1vSDK", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFe1tSDK {

    /* renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> getRevenue = Arrays.asList(AFInAppEventType.ACHIEVEMENT_UNLOCKED, AFInAppEventType.AD_CLICK, AFInAppEventType.AD_VIEW, AFInAppEventType.ADD_PAYMENT_INFO, AFInAppEventType.ADD_TO_CART, AFInAppEventType.ADD_TO_WISH_LIST, AFInAppEventType.COMPLETE_REGISTRATION, AFInAppEventType.CONTENT_VIEW, AFInAppEventType.INITIATED_CHECKOUT, AFInAppEventType.INVITE, AFInAppEventType.LEVEL_ACHIEVED, AFInAppEventType.LIST_VIEW, AFInAppEventType.LOGIN, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.PURCHASE, AFInAppEventType.RATE, AFInAppEventType.RE_ENGAGE, AFInAppEventType.SEARCH, AFInAppEventType.SHARE, AFInAppEventType.SPENT_CREDIT, AFInAppEventType.START_TRIAL, AFInAppEventType.SUBSCRIBE, AFInAppEventType.TRAVEL_BOOKING, AFInAppEventType.TUTORIAL_COMPLETION, AFInAppEventType.UPDATE);

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public final String AFAdRevenueData;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK$AFa1tSDK;", "Lcom/appsflyer/internal/AFe1tSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1tSDK extends AFe1tSDK {

        @NotNull
        public static final AFa1tSDK INSTANCE = new AFa1tSDK();

        private AFa1tSDK() {
            super("install");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK$AFa1uSDK;", "Lcom/appsflyer/internal/AFe1tSDK;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1uSDK extends AFe1tSDK {

        @NotNull
        public static final AFa1uSDK INSTANCE = new AFa1uSDK();

        private AFa1uSDK() {
            super("af_sandbox_revenue");
        }
    }

    public static final class AFa1vSDK extends AFe1tSDK {
        public final Integer getCurrencyIso4217Code;

        @NotNull
        private final String getMonetizationNetwork;
        public final Float getRevenue;

        public AFa1vSDK(@NotNull String str, Float f, Integer num) {
            super(str);
            this.getMonetizationNetwork = str;
            this.getRevenue = f;
            this.getCurrencyIso4217Code = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Intrinsics.a(this.getMonetizationNetwork, aFa1vSDK.getMonetizationNetwork) && Intrinsics.a(this.getRevenue, aFa1vSDK.getRevenue) && Intrinsics.a(this.getCurrencyIso4217Code, aFa1vSDK.getCurrencyIso4217Code);
        }

        public final int hashCode() {
            int iHashCode = this.getMonetizationNetwork.hashCode() * 31;
            Float f = this.getRevenue;
            int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.getCurrencyIso4217Code;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "PredefinedInAppEvent(name=" + this.getMonetizationNetwork + ", eventRevenue=" + this.getRevenue + ", eventCounter=" + this.getCurrencyIso4217Code + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFe1tSDK$AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1rSDK;", "p0", "Lcom/appsflyer/internal/AFe1tSDK;", "getRevenue", "(Lcom/appsflyer/internal/AFh1rSDK;)Lcom/appsflyer/internal/AFe1tSDK;", "", "", "Ljava/util/List;", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1tSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.appsflyer.internal.AFe1tSDK getRevenue(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFh1rSDK r4) {
            /*
                com.appsflyer.internal.AFe1mSDK r0 = r4.getCurrencyIso4217Code()
                com.appsflyer.internal.AFe1mSDK r1 = com.appsflyer.internal.AFe1mSDK.CONVERSION
                if (r0 != r1) goto Lb
                com.appsflyer.internal.AFe1tSDK$AFa1tSDK r4 = com.appsflyer.internal.AFe1tSDK.AFa1tSDK.INSTANCE
                return r4
            Lb:
                com.appsflyer.internal.AFe1mSDK r0 = r4.getCurrencyIso4217Code()
                com.appsflyer.internal.AFe1mSDK r1 = com.appsflyer.internal.AFe1mSDK.INAPP
                r2 = 0
                if (r0 != r1) goto L5e
                java.util.List r0 = com.appsflyer.internal.AFe1tSDK.getCurrencyIso4217Code()
                java.lang.String r1 = r4.areAllFieldsValid
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L5e
                java.util.Map<java.lang.String, java.lang.Object> r0 = r4.getMonetizationNetwork
                if (r0 == 0) goto L41
                java.lang.String r1 = "af_revenue"
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L41
                java.lang.String r0 = r0.toString()
                if (r0 == 0) goto L41
                boolean r1 = kotlin.text.b.e(r0)     // Catch: java.lang.NumberFormatException -> L41
                if (r1 == 0) goto L41
                float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L41
                java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L41
                goto L42
            L41:
                r0 = r2
            L42:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r4.AFAdRevenueData
                java.lang.String r3 = "iaecounter"
                java.lang.Object r1 = r1.get(r3)
                if (r1 == 0) goto L56
                java.lang.String r1 = r1.toString()
                if (r1 == 0) goto L56
                java.lang.Integer r2 = kotlin.text.StringsKt.toIntOrNull(r1)
            L56:
                com.appsflyer.internal.AFe1tSDK$AFa1vSDK r1 = new com.appsflyer.internal.AFe1tSDK$AFa1vSDK
                java.lang.String r4 = r4.areAllFieldsValid
                r1.<init>(r4, r0, r2)
                return r1
            L5e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1tSDK.Companion.getRevenue(com.appsflyer.internal.AFh1rSDK):com.appsflyer.internal.AFe1tSDK");
        }
    }

    public AFe1tSDK(@NotNull String str) {
        this.AFAdRevenueData = str;
    }
}
