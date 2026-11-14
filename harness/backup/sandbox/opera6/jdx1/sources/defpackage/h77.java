package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lh77;", "", "", "a", "Ljava/lang/Integer;", "advertisedMemoryTier", "b", "availableMemoryTier", "c", "availableProcessorsTier", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class h77 {

    /* renamed from: a, reason: from kotlin metadata */
    @t2j("ad_mem_tier")
    public Integer advertisedMemoryTier;

    /* renamed from: b, reason: from kotlin metadata */
    @t2j("avai_mem_tier")
    public Integer availableMemoryTier;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("avai_proc_tier")
    public Integer availableProcessorsTier;

    public h77() {
        this(0);
    }

    public h77(int i) {
        this.advertisedMemoryTier = null;
        this.availableMemoryTier = null;
        this.availableProcessorsTier = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h77)) {
            return false;
        }
        h77 h77Var = (h77) obj;
        return Intrinsics.a(this.advertisedMemoryTier, h77Var.advertisedMemoryTier) && Intrinsics.a(this.availableMemoryTier, h77Var.availableMemoryTier) && Intrinsics.a(this.availableProcessorsTier, h77Var.availableProcessorsTier);
    }

    public final int hashCode() {
        Integer num = this.advertisedMemoryTier;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.availableMemoryTier;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.availableProcessorsTier;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceTierSignals(advertisedMemoryTier=" + this.advertisedMemoryTier + ", availableMemoryTier=" + this.availableMemoryTier + ", availableProcessorsTier=" + this.availableProcessorsTier + ")";
    }
}
