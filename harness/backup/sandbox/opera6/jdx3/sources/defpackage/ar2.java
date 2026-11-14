package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ar2 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;

    public ar2(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar2)) {
            return false;
        }
        ar2 ar2Var = (ar2) obj;
        return this.a == ar2Var.a && Intrinsics.a(this.b, ar2Var.b) && Intrinsics.a(this.c, ar2Var.c) && Intrinsics.a(this.d, ar2Var.d) && Intrinsics.a(this.e, ar2Var.e) && this.f == ar2Var.f && Intrinsics.a(this.g, ar2Var.g) && Intrinsics.a(this.h, ar2Var.h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iF = z1m.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iK = fki.k((iF + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        int iHashCode3 = (iK + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
