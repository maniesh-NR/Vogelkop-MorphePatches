package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nu4 {
    public final long a;
    public final long b;
    public final lu4 c;
    public final String d;
    public final long e;
    public final ArrayList f;
    public final String g;
    public final String h;

    public nu4(long j, long j2, lu4 lu4Var, String str, long j3, ArrayList arrayList, String str2, String str3) {
        this.a = j;
        this.b = j2;
        this.c = lu4Var;
        this.d = str;
        this.e = j3;
        this.f = arrayList;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu4)) {
            return false;
        }
        nu4 nu4Var = (nu4) obj;
        return this.a == nu4Var.a && this.b == nu4Var.b && this.c == nu4Var.c && Intrinsics.a(this.d, nu4Var.d) && this.e == nu4Var.e && this.f.equals(nu4Var.f) && Intrinsics.a(this.g, nu4Var.g) && Intrinsics.a(this.h, nu4Var.h);
    }

    public final int hashCode() {
        int iG = z1m.g(this.f, z1m.e(z1m.f((this.c.hashCode() + z1m.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31);
        String str = this.g;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
