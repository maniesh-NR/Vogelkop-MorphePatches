package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import defpackage.l4c;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u0011\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000b\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0011\u0010\b\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFe1zSDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFc1qSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1qSDK;)V", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFc1pSDK;", "AFAdRevenueData", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFc1qSDK;", "component4", "", "areAllFieldsValid", "Ll4c;", "getRevenue", "", "()Z", "()Ljava/lang/String;", "component3", "getMediationNetwork", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1zSDK {
    private static AFe1vSDK component3;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK AFAdRevenueData;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFc1qSDK component4;

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String getMediationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String getRevenue = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> component1 = Arrays.asList("googleplay", "playstore", "googleplaystore");

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final l4c getRevenue = z4c.b(new AnonymousClass5());

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final l4c getMonetizationNetwork = z4c.b(new AnonymousClass4());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1zSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends ozb implements Function0<String> {
        public AnonymousClass4() {
            super(0);
        }

        @NotNull
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFe1zSDK.getMonetizationNetwork(AFe1zSDK.this.AFAdRevenueData.getRevenue.getMonetizationNetwork.getPackageName(), AFe1zSDK.getCurrencyIso4217Code(AFe1zSDK.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AFAdRevenueData", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1zSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends ozb implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String monetizationNetwork = AFa1tSDK.getMonetizationNetwork(AFe1zSDK.this.component4, AFe1zSDK.this.AFAdRevenueData.component2());
            if (monetizationNetwork != null && !StringsKt.N(monetizationNetwork)) {
                String string = StringsKt.l0(monetizationNetwork).toString();
                if (Companion.getRevenue().contains(string.toLowerCase(Locale.getDefault()))) {
                    AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1)));
                    monetizationNetwork = "";
                } else {
                    monetizationNetwork = "-".concat(string);
                }
            }
            return StringsKt.l0(monetizationNetwork != null ? monetizationNetwork : "").toString();
        }
    }

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1wSDK.values().length];
            try {
                iArr[AFe1wSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1wSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1wSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u000b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1zSDK$AFa1ySDK;", "", "<init>", "()V", "", "", "component1", "Ljava/util/List;", "getRevenue", "()Ljava/util/List;", "AFAdRevenueData", "getMediationNetwork", "Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1vSDK;", "component3", "Lcom/appsflyer/internal/AFe1vSDK;", "(Lcom/appsflyer/internal/AFe1vSDK;)V", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1zSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void getMediationNetwork(AFe1vSDK aFe1vSDK) {
            AFe1zSDK.component3 = aFe1vSDK;
        }

        @NotNull
        public static List<String> getRevenue() {
            return AFe1zSDK.component1;
        }
    }

    public AFe1zSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1qSDK aFc1qSDK) {
        this.AFAdRevenueData = aFc1pSDK;
        this.component4 = aFc1qSDK;
    }

    public static boolean AFAdRevenueData() {
        return component3 == null;
    }

    public static final /* synthetic */ String getCurrencyIso4217Code(AFe1zSDK aFe1zSDK) {
        return (String) aFe1zSDK.getRevenue.getValue();
    }

    public static final void getMediationNetwork(AFe1vSDK aFe1vSDK) {
        Companion.getMediationNetwork(aFe1vSDK);
    }

    public static final /* synthetic */ String getMonetizationNetwork(String str, String str2) {
        return new Regex("[^\\w]+").replace(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(sko.u(str, str2).getBytes(Charsets.UTF_8)), 2).toLowerCase(Locale.ROOT), "").substring(0, 6).concat(".");
    }

    @NotNull
    public final String getCurrencyIso4217Code() {
        int i = AFa1uSDK.getCurrencyIso4217Code[(AFAdRevenueData() ? AFe1wSDK.DEFAULT : AFe1wSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.getMonetizationNetwork.getValue();
        }
        if (i == 2) {
            AFe1vSDK aFe1vSDK = component3;
            String str = aFe1vSDK != null ? aFe1vSDK.AFAdRevenueData : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        h9o.p();
        return null;
    }

    @NotNull
    public final String getMediationNetwork() {
        int i = AFa1uSDK.getCurrencyIso4217Code[(AFAdRevenueData() ? AFe1wSDK.DEFAULT : AFe1wSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFe1vSDK aFe1vSDK = component3;
            String str = aFe1vSDK != null ? aFe1vSDK.getMediationNetwork : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        h9o.p();
        return null;
    }
}
