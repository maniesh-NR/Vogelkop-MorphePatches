package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hla {
    public final String a;
    public final String b;
    public final jla c;
    public final lla d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final Boolean h;

    public hla(String str, String str2, jla jlaVar, lla llaVar, String str3, Boolean bool, String str4, Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = jlaVar;
        this.d = llaVar;
        this.e = str3;
        this.f = bool;
        this.g = str4;
        this.h = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hla)) {
            return false;
        }
        hla hlaVar = (hla) obj;
        return Intrinsics.a(this.a, hlaVar.a) && Intrinsics.a(this.b, hlaVar.b) && this.c == hlaVar.c && this.d == hlaVar.d && Intrinsics.a(this.e, hlaVar.e) && this.f.equals(hlaVar.f) && Intrinsics.a(this.g, hlaVar.g) && this.h.equals(hlaVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        lla llaVar = this.d;
        int iHashCode3 = (iHashCode2 + (llaVar == null ? 0 : llaVar.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.g;
        return this.h.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("HostStateHostData(country=", this.a, ", currentCountry=", this.b, ", product=");
        sbN.append(this.c);
        sbN.append(", track=");
        sbN.append(this.d);
        sbN.append(", deviceId=");
        sbN.append(this.e);
        sbN.append(", esimSupported=");
        sbN.append(this.f);
        sbN.append(", huid=");
        sbN.append(this.g);
        sbN.append(", hasSeenOnboarding=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
