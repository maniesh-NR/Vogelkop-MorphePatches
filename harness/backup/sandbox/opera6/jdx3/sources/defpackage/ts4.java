package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ts4 {
    public final sj3 a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final boolean f;

    public ts4(sj3 sj3Var, String str, String str2, int i, long j, boolean z) {
        this.a = sj3Var;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts4)) {
            return false;
        }
        ts4 ts4Var = (ts4) obj;
        return this.a == ts4Var.a && Intrinsics.a(this.b, ts4Var.b) && Intrinsics.a(this.c, ts4Var.c) && this.d == ts4Var.d && pn7.e(this.e, ts4Var.e) && this.f == ts4Var.f;
    }

    public final int hashCode() {
        int iC = rfp.c(this.d, z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        on7 on7Var = pn7.b;
        return Boolean.hashCode(this.f) + z1m.e(iC, 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
