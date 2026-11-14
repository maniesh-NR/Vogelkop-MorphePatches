package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lo45;", "", "Ljjj;", "a", "Ljjj;", "signals", "", "b", "Ljava/lang/String;", "url", "c", "postBody", "d", "error", "", "e", "Ljava/lang/Boolean;", "cookiesInclude", "f", "requestId", "g", "params", "h", "cParams", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class o45 {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("signals")
    public jjj signals;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("url")
    public String url;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("post_body")
    public String postBody;

    /* renamed from: d, reason: from kotlin metadata */
    @t2j("error")
    public String error;

    /* renamed from: e, reason: from kotlin metadata */
    @t2j("cookies_include")
    public Boolean cookiesInclude;

    /* renamed from: f, reason: from kotlin metadata */
    @t2j("request_id")
    public String requestId;

    /* renamed from: g, reason: from kotlin metadata */
    @t2j("params")
    public String params;

    /* renamed from: h, reason: from kotlin metadata */
    @t2j("c_params")
    public String cParams;

    public o45() {
        this(255, null, null, null, null, null, null);
    }

    public o45(int i, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        bool = (i & 16) != 0 ? null : bool;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? null : str5;
        this.signals = null;
        this.url = str;
        this.postBody = str2;
        this.error = str3;
        this.cookiesInclude = bool;
        this.requestId = str4;
        this.params = null;
        this.cParams = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o45)) {
            return false;
        }
        o45 o45Var = (o45) obj;
        return Intrinsics.a(this.signals, o45Var.signals) && Intrinsics.a(this.url, o45Var.url) && Intrinsics.a(this.postBody, o45Var.postBody) && Intrinsics.a(this.error, o45Var.error) && Intrinsics.a(this.cookiesInclude, o45Var.cookiesInclude) && Intrinsics.a(this.requestId, o45Var.requestId) && Intrinsics.a(this.params, o45Var.params) && Intrinsics.a(this.cParams, o45Var.cParams);
    }

    public final int hashCode() {
        jjj jjjVar = this.signals;
        int iHashCode = (jjjVar == null ? 0 : jjjVar.hashCode()) * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postBody;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.cookiesInclude;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.requestId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.params;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cParams;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        jjj jjjVar = this.signals;
        String str = this.url;
        String str2 = this.postBody;
        String str3 = this.error;
        Boolean bool = this.cookiesInclude;
        String str4 = this.requestId;
        String str5 = this.params;
        String str6 = this.cParams;
        StringBuilder sb = new StringBuilder("ClientRequestBuildingData(signals=");
        sb.append(jjjVar);
        sb.append(", url=");
        sb.append(str);
        sb.append(", postBody=");
        z1m.t(sb, str2, ", error=", str3, ", cookiesInclude=");
        sb.append(bool);
        sb.append(", requestId=");
        sb.append(str4);
        sb.append(", params=");
        return sko.n(sb, str5, ", cParams=", str6, ")");
    }
}
