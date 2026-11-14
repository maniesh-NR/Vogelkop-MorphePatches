package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xa8 implements fb8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xa8(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa8)) {
            return false;
        }
        xa8 xa8Var = (xa8) obj;
        return this.a.equals(xa8Var.a) && Intrinsics.a(this.b, xa8Var.b) && Intrinsics.a(this.c, xa8Var.c) && Intrinsics.a(this.d, xa8Var.d);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + 1231) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return sko.n(z1m.n("DeepLink(url=", this.a, ", valid=true, campaign=", this.b, ", source="), this.c, ", target=", this.d, ")");
    }
}
