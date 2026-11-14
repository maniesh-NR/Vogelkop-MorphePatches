package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hcf extends alo {
    public final gcf l;
    public final ndc m;

    public hcf(ndc ndcVar, gcf gcfVar) {
        super((byte) 26);
        this.l = gcfVar;
        this.m = ndcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcf)) {
            return false;
        }
        hcf hcfVar = (hcf) obj;
        return Intrinsics.a(this.l, hcfVar.l) && Intrinsics.a(this.m, hcfVar.m);
    }

    public final int hashCode() {
        int iHashCode = this.l.hashCode() * 31;
        ndc ndcVar = this.m;
        return iHashCode + (ndcVar == null ? 0 : ndcVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.l + ", owner=" + this.m + ')';
    }
}
