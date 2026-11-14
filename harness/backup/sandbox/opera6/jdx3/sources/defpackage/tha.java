package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tha {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final wha e;

    public tha(String str, String str2, String str3, String str4, wha whaVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = whaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tha)) {
            return false;
        }
        tha thaVar = (tha) obj;
        return Intrinsics.a(this.a, thaVar.a) && Intrinsics.a(this.b, thaVar.b) && Intrinsics.a(this.c, thaVar.c) && Intrinsics.a(this.d, thaVar.d) && this.e.equals(thaVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("ActionsV1GetCrashIdData(id=", this.a, ", installationId=", this.b, ", countryCode=");
        z1m.t(sbN, this.c, ", locale=", this.d, ", host=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
