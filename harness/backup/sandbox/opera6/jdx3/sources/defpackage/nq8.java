package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nq8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public nq8(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return f8a.h.a(this.a + this.b + this.c + this.d + this.e + false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq8)) {
            return false;
        }
        nq8 nq8Var = (nq8) obj;
        return this.a.equals(nq8Var.a) && Intrinsics.a(this.b, nq8Var.b) && this.c.equals(nq8Var.c) && Intrinsics.a(this.d, nq8Var.d) && Intrinsics.a(this.e, nq8Var.e);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return ((iF + (str == null ? 0 : str.hashCode())) * 31) + 1237;
    }

    public final String toString() {
        return "";
    }
}
