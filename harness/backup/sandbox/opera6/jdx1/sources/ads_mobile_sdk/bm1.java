package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bm1 {
    public final String a;
    public final fe2 b;
    public final boolean c;
    public final long d;

    public bm1(String str, fe2 fe2Var, boolean z, long j) {
        this.a = str;
        this.b = fe2Var;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm1)) {
            return false;
        }
        bm1 bm1Var = (bm1) obj;
        return this.a.equals(bm1Var.a) && Intrinsics.a(this.b, bm1Var.b) && this.c == bm1Var.c && this.d == bm1Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Long.hashCode(this.d) + ((iHashCode + i) * 31);
    }

    public final String toString() {
        return "LoadedAd(ad=" + this.a + ", token=" + this.b + ", isFromPreviousSession=" + this.c + ", timeInCacheMs=" + this.d + ")";
    }
}
