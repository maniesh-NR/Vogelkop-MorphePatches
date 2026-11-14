package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tmc extends v0g {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final umc g;

    public tmc(String str, String str2, String str3, String str4, boolean z, boolean z2, umc umcVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = umcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmc)) {
            return false;
        }
        tmc tmcVar = (tmc) obj;
        return Intrinsics.a(this.a, tmcVar.a) && Intrinsics.a(this.b, tmcVar.b) && this.c.equals(tmcVar.c) && Intrinsics.a(this.d, tmcVar.d) && this.e == tmcVar.e && this.f == tmcVar.f && this.g == tmcVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iF = z1m.f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        int iK = fki.k(fki.k((iF + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e), 31, this.f);
        umc umcVar = this.g;
        return iK + (umcVar != null ? umcVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
