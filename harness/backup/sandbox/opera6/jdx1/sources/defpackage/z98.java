package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z98 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public z98(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z98)) {
            return false;
        }
        z98 z98Var = (z98) obj;
        return Intrinsics.a(this.a, z98Var.a) && Intrinsics.a(this.b, z98Var.b);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.a;
        int iHashCode = (linkedHashMap == null ? 0 : linkedHashMap.hashCode()) * 31;
        LinkedHashMap linkedHashMap2 = this.b;
        return iHashCode + (linkedHashMap2 != null ? linkedHashMap2.hashCode() : 0);
    }

    public final String toString() {
        return "EsimStatePlansData(active=" + this.a + ", all=" + this.b + ")";
    }
}
