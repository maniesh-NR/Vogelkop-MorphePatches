package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class on4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public on4(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on4)) {
            return false;
        }
        on4 on4Var = (on4) obj;
        return Intrinsics.a(this.a, on4Var.a) && Intrinsics.a(this.b, on4Var.b) && Intrinsics.a(this.c, on4Var.c) && Intrinsics.a(this.d, on4Var.d) && Intrinsics.a(this.e, on4Var.e);
    }

    public final int hashCode() {
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("Cash_out_config(currency=", this.a, ", min_amount_value=", this.b, ", unit_value_in_usd=");
        z1m.t(sbN, this.c, ", minipay_app_name=", this.d, ", minipay_app_link=");
        return z1m.l(sbN, this.e, ")");
    }
}
