package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ruc {
    public final long a;
    public final oi9 b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public final Long o;
    public final Long p;
    public final Long q;
    public final Long r;
    public final Long s;
    public final Long t;
    public final Long u;
    public final Long v;
    public final Long w;

    public ruc(long j, oi9 oi9Var, String str, String str2, int i, int i2, String str3, String str4, int i3, int i4, String str5, String str6, String str7, long j2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9) {
        this.a = j;
        this.b = oi9Var;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
        this.g = str3;
        this.h = str4;
        this.i = i3;
        this.j = i4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = j2;
        this.o = l;
        this.p = l2;
        this.q = l3;
        this.r = l4;
        this.s = l5;
        this.t = l6;
        this.u = l7;
        this.v = l8;
        this.w = l9;
    }

    public static ruc a(ruc rucVar, oi9 oi9Var, String str, long j, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, int i) {
        long j2;
        long j3;
        long j4 = rucVar.a;
        String str2 = rucVar.c;
        String str3 = rucVar.d;
        int i2 = rucVar.e;
        int i3 = rucVar.f;
        String str4 = rucVar.g;
        String str5 = rucVar.h;
        int i4 = rucVar.i;
        int i5 = rucVar.j;
        String str6 = rucVar.k;
        String str7 = (i & 2048) != 0 ? rucVar.l : str;
        String str8 = rucVar.m;
        if ((i & 8192) != 0) {
            j2 = j4;
            j3 = rucVar.n;
        } else {
            j2 = j4;
            j3 = j;
        }
        return new ruc(j2, oi9Var, str2, str3, i2, i3, str4, str5, i4, i5, str6, str7, str8, j3, (i & 16384) != 0 ? rucVar.o : l, (32768 & i) != 0 ? rucVar.p : l2, (65536 & i) != 0 ? rucVar.q : l3, (131072 & i) != 0 ? rucVar.r : l4, (262144 & i) != 0 ? rucVar.s : l5, (524288 & i) != 0 ? rucVar.t : l6, (1048576 & i) != 0 ? rucVar.u : l7, (2097152 & i) != 0 ? rucVar.v : l8, (i & 4194304) != 0 ? rucVar.w : l9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruc)) {
            return false;
        }
        ruc rucVar = (ruc) obj;
        return this.a == rucVar.a && this.b == rucVar.b && Intrinsics.a(this.c, rucVar.c) && Intrinsics.a(this.d, rucVar.d) && this.e == rucVar.e && this.f == rucVar.f && Intrinsics.a(this.g, rucVar.g) && Intrinsics.a(this.h, rucVar.h) && this.i == rucVar.i && this.j == rucVar.j && Intrinsics.a(this.k, rucVar.k) && Intrinsics.a(this.l, rucVar.l) && Intrinsics.a(this.m, rucVar.m) && this.n == rucVar.n && Intrinsics.a(this.o, rucVar.o) && Intrinsics.a(this.p, rucVar.p) && Intrinsics.a(this.q, rucVar.q) && Intrinsics.a(this.r, rucVar.r) && Intrinsics.a(this.s, rucVar.s) && Intrinsics.a(this.t, rucVar.t) && Intrinsics.a(this.u, rucVar.u) && Intrinsics.a(this.v, rucVar.v) && Intrinsics.a(this.w, rucVar.w);
    }

    public final int hashCode() {
        int iF = z1m.f(rfp.c(this.j, rfp.c(this.i, z1m.f(z1m.f(rfp.c(this.f, rfp.c(this.e, z1m.f(z1m.f((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h), 31), 31), 31, this.k);
        String str = this.l;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iE = z1m.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.n);
        Long l = this.o;
        int iHashCode2 = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.p;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.q;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.r;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.s;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.t;
        int iHashCode7 = (iHashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.u;
        int iHashCode8 = (iHashCode7 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.v;
        int iHashCode9 = (iHashCode8 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.w;
        return iHashCode9 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
