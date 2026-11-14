package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ir {
    public final bm1 a;
    public final de2 b;

    public ir(bm1 bm1Var, de2 de2Var) {
        this.a = bm1Var;
        this.b = de2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir)) {
            return false;
        }
        ir irVar = (ir) obj;
        return Intrinsics.a(this.a, irVar.a) && this.b == irVar.b;
    }

    public final int hashCode() {
        bm1 bm1Var = this.a;
        int iHashCode = (bm1Var == null ? 0 : bm1Var.hashCode()) * 31;
        de2 de2Var = this.b;
        return iHashCode + (de2Var != null ? de2Var.hashCode() : 0);
    }

    public final String toString() {
        return "CacheLoadResult(loadedAd=" + this.a + ", missReason=" + this.b + ")";
    }
}
