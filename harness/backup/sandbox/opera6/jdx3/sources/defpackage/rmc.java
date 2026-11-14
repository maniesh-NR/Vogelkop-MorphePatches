package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rmc extends v0g {
    public final long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;

    public rmc(long j, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = l5;
        this.g = l6;
        this.h = l7;
        this.i = l8;
        this.j = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmc)) {
            return false;
        }
        rmc rmcVar = (rmc) obj;
        return this.a == rmcVar.a && Intrinsics.a(this.b, rmcVar.b) && Intrinsics.a(this.c, rmcVar.c) && Intrinsics.a(this.d, rmcVar.d) && Intrinsics.a(this.e, rmcVar.e) && Intrinsics.a(this.f, rmcVar.f) && Intrinsics.a(this.g, rmcVar.g) && Intrinsics.a(this.h, rmcVar.h) && Intrinsics.a(this.i, rmcVar.i) && Intrinsics.a(this.j, rmcVar.j);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.g;
        int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.h;
        int iHashCode8 = (iHashCode7 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.i;
        int iHashCode9 = (iHashCode8 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.j;
        return iHashCode9 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
