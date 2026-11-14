package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yea {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final h1b l;
    public final h1b m;
    public final csh n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public yea(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        z4o.w(uri == null ? uri2 != null : uri2 == null);
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = h1b.s(arrayList2);
        this.m = h1b.s(arrayList3);
        this.n = h1b.A(new c9((byte) 19), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yea)) {
            return false;
        }
        yea yeaVar = (yea) obj;
        return this.d == yeaVar.d && this.e == yeaVar.e && this.f == yeaVar.f && this.g == yeaVar.g && this.i == yeaVar.i && this.j == yeaVar.j && this.k == yeaVar.k && this.o == yeaVar.o && this.r == yeaVar.r && this.s == yeaVar.s && this.a.equals(yeaVar.a) && Objects.equals(this.b, yeaVar.b) && Objects.equals(this.c, yeaVar.c) && this.h.equals(yeaVar.h) && Objects.equals(this.l, yeaVar.l) && Objects.equals(this.m, yeaVar.m) && Objects.equals(this.n, yeaVar.n) && Objects.equals(this.p, yeaVar.p) && Objects.equals(this.q, yeaVar.q) && Objects.equals(this.t, yeaVar.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
