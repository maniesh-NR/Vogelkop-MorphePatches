package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hu1 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;

    public hu1(String str, String str2, Long l, String str3, Long l2, String str4, String str5, Long l3, String str6) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = l2;
        this.f = str4;
        this.g = str5;
        this.h = l3;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu1)) {
            return false;
        }
        hu1 hu1Var = (hu1) obj;
        return Intrinsics.a(this.a, hu1Var.a) && Intrinsics.a(this.b, hu1Var.b) && Intrinsics.a(this.c, hu1Var.c) && Intrinsics.a(this.d, hu1Var.d) && Intrinsics.a(this.e, hu1Var.e) && Intrinsics.a(this.f, hu1Var.f) && Intrinsics.a(this.g, hu1Var.g) && Intrinsics.a(this.h, hu1Var.h) && Intrinsics.a(this.i, hu1Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.i;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("App_data(pending_fcm_token=", this.a, ", registered_fcm_token=", this.b, ", registered_fcm_token_at=");
        sbN.append(this.c);
        sbN.append(", reported_client_version=");
        sbN.append(this.d);
        sbN.append(", time_offset=");
        sbN.append(this.e);
        sbN.append(", test_page_url=");
        sbN.append(this.f);
        sbN.append(", country_code_override=");
        sbN.append(this.g);
        sbN.append(", default_browser_override=");
        sbN.append(this.h);
        sbN.append(", uploaded_client_state=");
        return z1m.l(sbN, this.i, ")");
    }
}
