package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Lsr;", "", "", "a", "Ljava/lang/String;", "adapterVersion", "b", "sdkVersion", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class sr {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("adapter_version")
    public final String adapterVersion;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("sdk_version")
    public final String sdkVersion;

    public sr(String str, String str2) {
        this.adapterVersion = str;
        this.sdkVersion = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        sr srVar = (sr) obj;
        return Intrinsics.a(this.adapterVersion, srVar.adapterVersion) && Intrinsics.a(this.sdkVersion, srVar.sdkVersion);
    }

    public final int hashCode() {
        String str = this.adapterVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkVersion;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return sko.l("AdapterVersionData(adapterVersion=", this.adapterVersion, ", sdkVersion=", this.sdkVersion, ")");
    }
}
