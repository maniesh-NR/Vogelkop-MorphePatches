package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k2h {
    public final String a;
    public final String b;

    public k2h(String str, String str2) {
        qla qlaVar = qla.OFA;
        rla rlaVar = rla.BETA;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2h)) {
            return false;
        }
        k2h k2hVar = (k2h) obj;
        if (!Intrinsics.a(this.a, k2hVar.a)) {
            return false;
        }
        qla qlaVar = qla.OFA;
        if (!Intrinsics.a(this.b, k2hVar.b)) {
            return false;
        }
        rla rlaVar = rla.BETA;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (qla.OFA.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.b;
        return rla.BETA.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ProductInfo(displayName=" + this.a + ", name=" + qla.OFA + ", version=" + this.b + ", track=" + rla.BETA + ")";
    }
}
