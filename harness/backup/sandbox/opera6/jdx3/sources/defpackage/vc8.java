package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vc8 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final double f;
    public final int g;
    public final String h;
    public final int i;

    public vc8(String str, String str2, String str3, long j, String str4, double d, int i, String str5, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = d;
        this.g = i;
        this.h = str5;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc8)) {
            return false;
        }
        vc8 vc8Var = (vc8) obj;
        return Intrinsics.a(this.a, vc8Var.a) && Intrinsics.a(this.b, vc8Var.b) && Intrinsics.a(this.c, vc8Var.c) && this.d == vc8Var.d && Intrinsics.a(this.e, vc8Var.e) && Double.compare(this.f, vc8Var.f) == 0 && this.g == vc8Var.g && Intrinsics.a(this.h, vc8Var.h) && this.i == vc8Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iC = rfp.c(this.g, (Double.hashCode(this.f) + z1m.f(z1m.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31);
        String str3 = this.h;
        return Integer.hashCode(this.i) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
