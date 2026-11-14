package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zv0 {
    public final nv0 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final fw0 j;

    public zv0(nv0 nv0Var, String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, fw0 fw0Var) {
        this.a = nv0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z2;
        this.i = z3;
        this.j = fw0Var;
    }

    public static zv0 a(zv0 zv0Var, int i) {
        nv0 nv0Var = zv0Var.a;
        String str = (i & 2) != 0 ? zv0Var.b : null;
        String str2 = (i & 4) != 0 ? zv0Var.c : null;
        boolean z = zv0Var.d;
        String str3 = zv0Var.e;
        zv0Var.getClass();
        String str4 = zv0Var.f;
        String str5 = zv0Var.g;
        boolean z2 = zv0Var.h;
        boolean z3 = (i & 512) != 0 ? zv0Var.i : false;
        fw0 fw0Var = zv0Var.j;
        zv0Var.getClass();
        return new zv0(nv0Var, str, str2, z, str3, str4, str5, z2, z3, fw0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0)) {
            return false;
        }
        zv0 zv0Var = (zv0) obj;
        return this.a == zv0Var.a && Intrinsics.a(this.b, zv0Var.b) && Intrinsics.a(this.c, zv0Var.c) && this.d == zv0Var.d && Intrinsics.a(this.e, zv0Var.e) && Intrinsics.a(this.f, zv0Var.f) && Intrinsics.a(this.g, zv0Var.g) && this.h == zv0Var.h && this.i == zv0Var.i && Intrinsics.a(this.j, zv0Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iK = fki.k((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (iK + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iK2 = fki.k(fki.k((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.h), 31, this.i);
        fw0 fw0Var = this.j;
        return iK2 + (fw0Var != null ? fw0Var.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
