package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsoe;", "", "", "a", "Ljava/lang/Integer;", "activeNetworkState", "", "b", "Ljava/lang/Boolean;", "isActiveNetworkMetered", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class soe {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("active_network_state")
    public Integer activeNetworkState;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("active_network_metered")
    public Boolean isActiveNetworkMetered;

    public soe() {
        this(0);
    }

    public soe(int i) {
        this.activeNetworkState = null;
        this.isActiveNetworkMetered = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soe)) {
            return false;
        }
        soe soeVar = (soe) obj;
        return Intrinsics.a(this.activeNetworkState, soeVar.activeNetworkState) && Intrinsics.a(this.isActiveNetworkMetered, soeVar.isActiveNetworkMetered);
    }

    public final int hashCode() {
        Integer num = this.activeNetworkState;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.isActiveNetworkMetered;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSignals(activeNetworkState=" + this.activeNetworkState + ", isActiveNetworkMetered=" + this.isActiveNetworkMetered + ")";
    }
}
