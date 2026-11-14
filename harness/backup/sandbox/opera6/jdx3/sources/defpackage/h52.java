package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h52 {
    public final String a;
    public final o29 b;
    public final ux1 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final z92 j;

    public h52(String str, o29 o29Var, ux1 ux1Var, boolean z, boolean z2, String str2, String str3, String str4, String str5, z92 z92Var) {
        this.a = str;
        this.b = o29Var;
        this.c = ux1Var;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z92Var;
    }

    public static h52 a(h52 h52Var, boolean z) {
        String str = h52Var.a;
        o29 o29Var = h52Var.b;
        ux1 ux1Var = h52Var.c;
        boolean z2 = h52Var.d;
        String str2 = h52Var.f;
        String str3 = h52Var.g;
        String str4 = h52Var.h;
        String str5 = h52Var.i;
        z92 z92Var = h52Var.j;
        h52Var.getClass();
        return new h52(str, o29Var, ux1Var, z2, z, str2, str3, str4, str5, z92Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h52)) {
            return false;
        }
        h52 h52Var = (h52) obj;
        return Intrinsics.a(this.a, h52Var.a) && this.b == h52Var.b && this.c == h52Var.c && this.d == h52Var.d && this.e == h52Var.e && Intrinsics.a(this.f, h52Var.f) && Intrinsics.a(this.g, h52Var.g) && Intrinsics.a(this.h, h52Var.h) && Intrinsics.a(this.i, h52Var.i) && Intrinsics.a(this.j, h52Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        o29 o29Var = this.b;
        int iF = z1m.f(z1m.f(z1m.f(fki.k(fki.k((this.c.hashCode() + ((iHashCode + (o29Var == null ? 0 : o29Var.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode2 = (iF + (str == null ? 0 : str.hashCode())) * 31;
        z92 z92Var = this.j;
        return iHashCode2 + (z92Var != null ? z92Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
