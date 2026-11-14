package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class s3f {

    @NotNull
    public static final r3f Companion = new r3f();
    public static final l4c[] y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final swh k;
    public final long l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final Boolean t;
    public final Integer u;
    public final List v;
    public final Boolean w;
    public final Long x;

    static {
        f7c f7cVar = f7c.b;
        y = new l4c[]{null, null, null, null, null, null, null, null, null, null, z4c.a(f7cVar, new vme((byte) 14)), null, null, null, null, null, null, null, null, null, null, z4c.a(f7cVar, new vme((byte) 15)), null, null};
    }

    public /* synthetic */ s3f(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, swh swhVar, long j, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, Integer num, List list, Boolean bool2, Long l) {
        if (48958 != (i & 48958)) {
            x7d.I(i, 48958, q3f.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        this.i = str9;
        this.j = str10;
        this.k = swhVar;
        this.l = j;
        this.m = str11;
        this.n = str12;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str13;
        }
        this.p = str14;
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str15;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str16;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str17;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = bool;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = num;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = list;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = bool2;
        }
        if ((i & 8388608) == 0) {
            this.x = null;
        } else {
            this.x = l;
        }
    }

    public s3f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, swh swhVar, long j, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, Long l) {
        this.a = null;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = swhVar;
        this.l = j;
        this.m = "opera_combined";
        this.n = str10;
        this.o = str11;
        this.p = str12;
        this.q = str13;
        this.r = str14;
        this.s = str15;
        this.t = null;
        this.u = num;
        this.v = null;
        this.w = null;
        this.x = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3f)) {
            return false;
        }
        s3f s3fVar = (s3f) obj;
        return Intrinsics.a(this.a, s3fVar.a) && Intrinsics.a(this.b, s3fVar.b) && Intrinsics.a(this.c, s3fVar.c) && Intrinsics.a(this.d, s3fVar.d) && Intrinsics.a(this.e, s3fVar.e) && Intrinsics.a(this.f, s3fVar.f) && Intrinsics.a(this.g, s3fVar.g) && Intrinsics.a(this.h, s3fVar.h) && Intrinsics.a(this.i, s3fVar.i) && Intrinsics.a(this.j, s3fVar.j) && this.k == s3fVar.k && this.l == s3fVar.l && Intrinsics.a(this.m, s3fVar.m) && Intrinsics.a(this.n, s3fVar.n) && Intrinsics.a(this.o, s3fVar.o) && Intrinsics.a(this.p, s3fVar.p) && Intrinsics.a(this.q, s3fVar.q) && Intrinsics.a(this.r, s3fVar.r) && Intrinsics.a(this.s, s3fVar.s) && Intrinsics.a(this.t, s3fVar.t) && Intrinsics.a(this.u, s3fVar.u) && Intrinsics.a(this.v, s3fVar.v) && Intrinsics.a(this.w, s3fVar.w) && Intrinsics.a(this.x, s3fVar.x);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = z1m.f(z1m.f(z1m.f(z1m.f(z1m.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iF2 = z1m.f(z1m.f(z1m.e((this.k.hashCode() + z1m.f(z1m.f((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n);
        String str4 = this.o;
        int iF3 = z1m.f((iF2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.p);
        String str5 = this.q;
        int iHashCode2 = (iF3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.r;
        int iHashCode3 = (iHashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.s;
        int iHashCode4 = (iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.t;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.u;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.v;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.w;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.x;
        return iHashCode8 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
