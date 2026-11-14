package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class qwo {

    @NotNull
    public static final pwo Companion = new pwo();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    public qwo(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        String str7;
        if (64 != (i & 64)) {
            x7d.I(i, 64, owo.b);
            throw null;
        }
        this.a = (i & 1) == 0 ? "Opera" : str;
        if ((i & 2) == 0) {
            this.b = rxo.k;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            if (fcp.c != null) {
                kn[] knVarArr = kn.a;
                str7 = "admob";
            } else {
                str7 = null;
            }
            this.c = str7;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            c30 c30Var = fcp.c;
            this.d = c30Var != null ? c30Var.b : null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = fcp.c != null ? "2.14.0.0" : null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        this.g = num;
        if (this.f != null) {
            wjo wjoVar = wjo.REGULAR;
        }
    }

    public qwo(String str, Integer num) {
        String str2;
        String str3 = rxo.k;
        if (fcp.c != null) {
            kn[] knVarArr = kn.a;
            str2 = "admob";
        } else {
            str2 = null;
        }
        c30 c30Var = fcp.c;
        String str4 = c30Var != null ? c30Var.b : null;
        String str5 = fcp.c != null ? "2.14.0.0" : null;
        this.a = "Opera";
        this.b = str3;
        this.c = str2;
        this.d = str4;
        this.e = str5;
        this.f = str;
        this.g = num;
        if (str != null) {
            wjo wjoVar = wjo.REGULAR;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwo)) {
            return false;
        }
        qwo qwoVar = (qwo) obj;
        return Intrinsics.a(this.a, qwoVar.a) && Intrinsics.a(this.b, qwoVar.b) && Intrinsics.a(this.c, qwoVar.c) && Intrinsics.a(this.d, qwoVar.d) && Intrinsics.a(this.e, qwoVar.e) && Intrinsics.a(this.f, qwoVar.f) && Intrinsics.a(this.g, qwoVar.g);
    }

    public final int hashCode() {
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SourceExt(omidpn=" + this.a + ", omidpv=" + this.b + ", mediationId=" + this.c + ", mediationSdkVersion=" + this.d + ", mediationAdapterSdkVersion=" + this.e + ", bidTokenMediationId=" + this.f + ", auctionType=" + this.g + ')';
    }
}
