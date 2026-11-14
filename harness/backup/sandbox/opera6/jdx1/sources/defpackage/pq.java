package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpq;", "", "", "a", "Ljava/lang/Integer;", "priorClickCount", "", "b", "Ljava/lang/Long;", "loadDuration", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class pq {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("pcc")
    public final Integer priorClickCount;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("dload")
    public final Long loadDuration;

    public pq(Integer num, Long l) {
        this.priorClickCount = num;
        this.loadDuration = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        return Intrinsics.a(this.priorClickCount, pqVar.priorClickCount) && Intrinsics.a(this.loadDuration, pqVar.loadDuration);
    }

    public final int hashCode() {
        Integer num = this.priorClickCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.loadDuration;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "AdUnitQualitySignals(priorClickCount=" + this.priorClickCount + ", loadDuration=" + this.loadDuration + ")";
    }
}
