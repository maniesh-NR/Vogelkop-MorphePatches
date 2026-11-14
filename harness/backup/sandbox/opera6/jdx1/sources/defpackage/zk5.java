package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lzk5;", "", "", "a", "Ljava/lang/String;", "appId", "b", "adUnitId", "", "c", "Z", "isCalledFromInit", "d", "packageName", "", "e", "Ljava/lang/Integer;", "versionCode", "f", "afmaVersion", "g", "experimentIds", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class zk5 {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("app_id")
    public final String appId;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("ad_unit_id")
    public final String adUnitId;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("is_init")
    public final boolean isCalledFromInit;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    @t2j("pn")
    public final String packageName;

    /* renamed from: e, reason: from kotlin metadata */
    @t2j("version")
    public final Integer versionCode;

    /* renamed from: f, reason: from kotlin metadata */
    @NotNull
    @t2j("js")
    public final String afmaVersion;

    /* renamed from: g, reason: from kotlin metadata */
    @NotNull
    @t2j("experiment_ids")
    public final String experimentIds;

    public zk5(String str, String str2, boolean z, String str3, Integer num, String str4, String str5) {
        this.appId = str;
        this.adUnitId = str2;
        this.isCalledFromInit = z;
        this.packageName = str3;
        this.versionCode = num;
        this.afmaVersion = str4;
        this.experimentIds = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk5)) {
            return false;
        }
        zk5 zk5Var = (zk5) obj;
        return Intrinsics.a(this.appId, zk5Var.appId) && Intrinsics.a(this.adUnitId, zk5Var.adUnitId) && this.isCalledFromInit == zk5Var.isCalledFromInit && Intrinsics.a(this.packageName, zk5Var.packageName) && Intrinsics.a(this.versionCode, zk5Var.versionCode) && Intrinsics.a(this.afmaVersion, zk5Var.afmaVersion) && Intrinsics.a(this.experimentIds, zk5Var.experimentIds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.appId.hashCode() * 31;
        String str = this.adUnitId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isCalledFromInit;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iA = dgh.a(this.packageName, (iHashCode2 + i) * 31);
        Integer num = this.versionCode;
        return this.experimentIds.hashCode() + dgh.a(this.afmaVersion, (iA + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.appId;
        String str2 = this.adUnitId;
        boolean z = this.isCalledFromInit;
        String str3 = this.packageName;
        Integer num = this.versionCode;
        String str4 = this.afmaVersion;
        String str5 = this.experimentIds;
        StringBuilder sbN = z1m.n("ConfigLoaderRequest(appId=", str, ", adUnitId=", str2, ", isCalledFromInit=");
        z1m.u(sbN, z, ", packageName=", str3, ", versionCode=");
        sbN.append(num);
        sbN.append(", afmaVersion=");
        sbN.append(str4);
        sbN.append(", experimentIds=");
        return z1m.l(sbN, str5, ")");
    }
}
