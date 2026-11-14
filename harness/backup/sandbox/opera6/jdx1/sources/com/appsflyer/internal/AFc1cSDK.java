package com.appsflyer.internal;

import android.util.Base64;
import defpackage.z1m;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getRevenue", "()Lorg/json/JSONObject;", "AFAdRevenueData", "()Ljava/lang/String;", "toString", "getMediationNetwork", "I", "getMonetizationNetwork", "Ljava/lang/String;", "getCurrencyIso4217Code", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFc1cSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public String AFAdRevenueData;
    int getMediationNetwork;

    @NotNull
    final String getMonetizationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public String getCurrencyIso4217Code;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK$AFa1ySDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getMediationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1cSDK;", "getRevenue", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1cSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1cSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean getMediationNetwork(Integer p0, String... p1) {
            boolean z = p0 == null;
            int length = p1.length;
            for (int i = 0; i < 3; i++) {
                String str = p1[i];
                z = z || str == null || str.length() == 0;
            }
            return z;
        }

        public static AFc1cSDK getRevenue(@NotNull String p0) {
            List<String> listY = StringsKt.Y(p0, new String[]{"\n"}, 0, 6);
            if (listY.size() == 4) {
                String revenue = null;
                String revenue2 = null;
                String revenue3 = null;
                Integer numValueOf = null;
                for (String str : listY) {
                    if (kotlin.text.c.q(str, "label=", false)) {
                        revenue = getRevenue(str, "label=");
                    } else if (kotlin.text.c.q(str, "hashName=", false)) {
                        revenue2 = getRevenue(str, "hashName=");
                    } else if (!kotlin.text.c.q(str, "stackTrace=", false)) {
                        if (!kotlin.text.c.q(str, "c=", false)) {
                            break;
                        }
                        numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.l0(str.substring(2)).toString()));
                    } else {
                        revenue3 = getRevenue(str, "stackTrace=");
                    }
                }
                if (!getMediationNetwork(numValueOf, revenue, revenue2, revenue3)) {
                    return new AFc1cSDK(revenue, revenue2, revenue3, numValueOf.intValue());
                }
            }
            return null;
        }

        private static String getRevenue(String str, String str2) {
            String string = StringsKt.l0(str.substring(str2.length())).toString();
            Charset charset = Charsets.UTF_8;
            return new String(Base64.decode(string.getBytes(charset), 2), charset);
        }
    }

    public AFc1cSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = str3;
        this.getMediationNetwork = i;
    }

    public /* synthetic */ AFc1cSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }

    @NotNull
    public final String AFAdRevenueData() {
        String str = this.getCurrencyIso4217Code;
        Charset charset = Charsets.UTF_8;
        String strEncodeToString = Base64.encodeToString(str.getBytes(charset), 2);
        String strEncodeToString2 = Base64.encodeToString(this.getMonetizationNetwork.getBytes(charset), 2);
        String strEncodeToString3 = Base64.encodeToString(this.AFAdRevenueData.getBytes(charset), 2);
        int i = this.getMediationNetwork;
        StringBuilder sbN = z1m.n("label=", strEncodeToString, "\nhashName=", strEncodeToString2, "\nstackTrace=");
        sbN.append(strEncodeToString3);
        sbN.append("\nc=");
        sbN.append(i);
        return sbN.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFc1cSDK)) {
            return false;
        }
        AFc1cSDK aFc1cSDK = (AFc1cSDK) p0;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFc1cSDK.getCurrencyIso4217Code) && Intrinsics.a(this.getMonetizationNetwork, aFc1cSDK.getMonetizationNetwork) && Intrinsics.a(this.AFAdRevenueData, aFc1cSDK.AFAdRevenueData) && this.getMediationNetwork == aFc1cSDK.getMediationNetwork;
    }

    @NotNull
    public final JSONObject getRevenue() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getCurrencyIso4217Code);
        jSONObject.put("hash_name", this.getMonetizationNetwork);
        jSONObject.put("st", this.AFAdRevenueData);
        jSONObject.put("c", String.valueOf(this.getMediationNetwork));
        return jSONObject;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMediationNetwork) + ((this.AFAdRevenueData.hashCode() + ((this.getMonetizationNetwork.hashCode() + (this.getCurrencyIso4217Code.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getCurrencyIso4217Code;
        String str2 = this.getMonetizationNetwork;
        String str3 = this.AFAdRevenueData;
        int i = this.getMediationNetwork;
        StringBuilder sbN = z1m.n("ExceptionInfo(label=", str, ", hashName=", str2, ", stackTrace=");
        sbN.append(str3);
        sbN.append(", counter=");
        sbN.append(i);
        sbN.append(")");
        return sbN.toString();
    }
}
