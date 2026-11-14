package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a2g {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;

    public a2g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2g)) {
            return false;
        }
        a2g a2gVar = (a2g) obj;
        return Intrinsics.a(this.a, a2gVar.a) && Intrinsics.a(this.b, a2gVar.b) && Intrinsics.a(this.c, a2gVar.c) && this.d.equals(a2gVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PartialRecordFeatureFlags(onboarding=" + this.a + ", backButtonAction=" + this.b + ", minipayPayment=" + this.c + ", freeEsimAvailable=" + this.d + ")";
    }
}
