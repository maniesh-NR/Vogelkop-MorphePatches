package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dm4 implements em4 {
    public final String a;
    public final l01 b;
    public final String c;
    public final String d;
    public final String e;

    public dm4(String str, l01 l01Var, String str2, String str3, String str4) {
        this.a = str;
        this.b = l01Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm4)) {
            return false;
        }
        dm4 dm4Var = (dm4) obj;
        return Intrinsics.a(this.a, dm4Var.a) && this.b == dm4Var.b && this.c.equals(dm4Var.c) && Intrinsics.a(this.d, dm4Var.d) && Intrinsics.a(this.e, dm4Var.e);
    }

    public final int hashCode() {
        int iF = z1m.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        z1m.t(sb, this.c, ", miniPayAppName=", this.d, ", miniPayAppLink=");
        return z1m.l(sb, this.e, ")");
    }
}
