package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dj3 {
    public final String a;
    public final sj3 b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;

    public dj3(String str, sj3 sj3Var, String str2, long j, long j2, int i, boolean z) {
        this.a = str;
        this.b = sj3Var;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj3)) {
            return false;
        }
        dj3 dj3Var = (dj3) obj;
        return Intrinsics.a(this.a, dj3Var.a) && this.b == dj3Var.b && Intrinsics.a(this.c, dj3Var.c) && this.d == dj3Var.d && this.e == dj3Var.e && this.f == dj3Var.f && this.g == dj3Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + rfp.c(this.f, z1m.e(z1m.e(z1m.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        return "";
    }
}
