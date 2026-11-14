package ads_mobile_sdk;

import defpackage.z1m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lads_mobile_sdk/dy2;", "", "", "a", "Ljava/lang/String;", "adapterClassName", "b", "adapterVersion", "c", "sdkVersion", "d", "signals", "e", "signalErrorMessage", "", "f", "Ljava/lang/Integer;", "signalErrorCode", "", "g", "Ljava/lang/Long;", "latency", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class dy2 {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("name")
    public final String adapterClassName;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("adapter_version")
    public final String adapterVersion;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("sdk_version")
    public final String sdkVersion;

    /* renamed from: d, reason: from kotlin metadata */
    @t2j("signals")
    public String signals;

    /* renamed from: e, reason: from kotlin metadata */
    @t2j("signal_error")
    public String signalErrorMessage;

    /* renamed from: f, reason: from kotlin metadata */
    @t2j("signal_error_code")
    public Integer signalErrorCode;

    /* renamed from: g, reason: from kotlin metadata */
    @t2j("latency")
    public Long latency;

    public dy2() {
        this(null, null, null, null, null, 127);
    }

    public dy2(String str, String str2, String str3, String str4, Integer num, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        num = (i & 32) != 0 ? null : num;
        this.adapterClassName = str;
        this.adapterVersion = str2;
        this.sdkVersion = str3;
        this.signals = null;
        this.signalErrorMessage = str4;
        this.signalErrorCode = num;
        this.latency = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy2)) {
            return false;
        }
        dy2 dy2Var = (dy2) obj;
        return Intrinsics.a(this.adapterClassName, dy2Var.adapterClassName) && Intrinsics.a(this.adapterVersion, dy2Var.adapterVersion) && Intrinsics.a(this.sdkVersion, dy2Var.sdkVersion) && Intrinsics.a(this.signals, dy2Var.signals) && Intrinsics.a(this.signalErrorMessage, dy2Var.signalErrorMessage) && Intrinsics.a(this.signalErrorCode, dy2Var.signalErrorCode) && Intrinsics.a(this.latency, dy2Var.latency);
    }

    public final int hashCode() {
        String str = this.adapterClassName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adapterVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.signals;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.signalErrorMessage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.signalErrorCode;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.latency;
        return iHashCode6 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        String str = this.adapterClassName;
        String str2 = this.adapterVersion;
        String str3 = this.sdkVersion;
        String str4 = this.signals;
        String str5 = this.signalErrorMessage;
        Integer num = this.signalErrorCode;
        Long l = this.latency;
        StringBuilder sbN = z1m.n("RtbAdapterData(adapterClassName=", str, ", adapterVersion=", str2, ", sdkVersion=");
        z1m.t(sbN, str3, ", signals=", str4, ", signalErrorMessage=");
        sbN.append(str5);
        sbN.append(", signalErrorCode=");
        sbN.append(num);
        sbN.append(", latency=");
        sbN.append(l);
        sbN.append(")");
        return sbN.toString();
    }
}
