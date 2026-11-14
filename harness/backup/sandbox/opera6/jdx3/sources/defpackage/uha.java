package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uha {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final xha e;

    public uha(String str, String str2, String str3, String str4, xha xhaVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = xhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uha)) {
            return false;
        }
        uha uhaVar = (uha) obj;
        return Intrinsics.a(this.a, uhaVar.a) && Intrinsics.a(this.b, uhaVar.b) && Intrinsics.a(this.c, uhaVar.c) && Intrinsics.a(this.d, uhaVar.d) && this.e.equals(uhaVar.e);
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
