package defpackage;

import com.leanplum.internal.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v3g {
    public final String A;
    public final boolean B;
    public final byte[] C;
    public Map D;
    public List E;
    public final String F;
    public final String G;
    public final String H;
    public final long I;
    public final boolean J;
    public final boolean K;
    public Long a;
    public final x3g b;
    public String c;
    public String d;
    public String e;
    public final String f;
    public String g;
    public String h;
    public final String i;
    public final String j;
    public String k;
    public final byte[] l;
    public final String m;
    public String n;
    public final byte[] o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final boolean t;
    public y3g u;
    public final int v;
    public final byte[] w;
    public final jv9 x;
    public final String y;
    public final String z;

    public v3g(Long l, x3g x3gVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, byte[] bArr, String str10, String str11, byte[] bArr2, long j, long j2, long j3, long j4, boolean z, y3g y3gVar, int i, byte[] bArr3, jv9 jv9Var, String str12, String str13, String str14, boolean z2, byte[] bArr4, Map map, List list, String str15, String str16, String str17, long j5, boolean z3, boolean z4) {
        this.a = l;
        this.b = x3gVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = bArr;
        this.m = str10;
        this.n = str11;
        this.o = bArr2;
        this.p = j;
        this.q = j2;
        this.r = j3;
        this.s = j4;
        this.t = z;
        this.u = y3gVar;
        this.v = i;
        this.w = bArr3;
        this.x = jv9Var;
        this.y = str12;
        this.z = str13;
        this.A = str14;
        this.B = z2;
        this.C = bArr4;
        this.D = map;
        this.E = list;
        this.F = str15;
        this.G = str16;
        this.H = str17;
        this.I = j5;
        this.J = z3;
        this.K = z4;
    }

    public v3g(Long l, x3g x3gVar, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, String str7, byte[] bArr2, long j, long j2, long j3, long j4, boolean z, y3g y3gVar, int i, byte[] bArr3, jv9 jv9Var, String str8, String str9, String str10, boolean z2, byte[] bArr4, String str11, String str12, String str13, long j5, boolean z3, boolean z4, int i2, int i3) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? x3g.a : x3gVar, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, "", "", "", (i2 & Constants.Crypt.KEY_LENGTH) != 0 ? "" : str4, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? "" : str6, (i2 & 2048) != 0 ? null : bArr, (i2 & 4096) != 0 ? "" : str7, "", (i2 & 16384) != 0 ? null : bArr2, (32768 & i2) != 0 ? 0L : j, (65536 & i2) != 0 ? 0L : j2, (131072 & i2) != 0 ? 0L : j3, (262144 & i2) != 0 ? 0L : j4, (524288 & i2) != 0 ? false : z, (1048576 & i2) != 0 ? y3g.a : y3gVar, (2097152 & i2) != 0 ? 0 : i, (4194304 & i2) != 0 ? null : bArr3, (8388608 & i2) != 0 ? jv9.a : jv9Var, (16777216 & i2) != 0 ? "" : str8, (33554432 & i2) != 0 ? "" : str9, (67108864 & i2) != 0 ? "" : str10, (134217728 & i2) != 0 ? false : z2, (268435456 & i2) != 0 ? null : bArr4, n08.a, l08.a, (i2 & Integer.MIN_VALUE) != 0 ? "" : str11, (i3 & 1) != 0 ? "" : str12, (i3 & 2) != 0 ? "" : str13, (i3 & 4) != 0 ? 0L : j5, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? false : z4);
    }

    public static v3g a(v3g v3gVar, Long l, int i) {
        return new v3g((i & 1) != 0 ? v3gVar.a : l, v3gVar.b, v3gVar.c, v3gVar.d, v3gVar.e, v3gVar.f, v3gVar.g, v3gVar.h, v3gVar.i, v3gVar.j, v3gVar.k, v3gVar.l, v3gVar.m, v3gVar.n, v3gVar.o, v3gVar.p, v3gVar.q, v3gVar.r, v3gVar.s, v3gVar.t, v3gVar.u, v3gVar.v, v3gVar.w, v3gVar.x, v3gVar.y, v3gVar.z, v3gVar.A, v3gVar.B, v3gVar.C, v3gVar.D, v3gVar.E, v3gVar.F, v3gVar.G, v3gVar.H, v3gVar.I, v3gVar.J, v3gVar.K);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v3g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v3g v3gVar = (v3g) obj;
        if (!Intrinsics.a(this.a, v3gVar.a) || this.b != v3gVar.b || !Intrinsics.a(this.c, v3gVar.c) || !Intrinsics.a(this.d, v3gVar.d) || !Intrinsics.a(this.e, v3gVar.e) || !Intrinsics.a(this.f, v3gVar.f) || !Intrinsics.a(this.g, v3gVar.g) || !Intrinsics.a(this.h, v3gVar.h) || !Intrinsics.a(this.i, v3gVar.i) || !Intrinsics.a(this.j, v3gVar.j) || !Intrinsics.a(this.k, v3gVar.k)) {
            return false;
        }
        byte[] bArr = this.l;
        if (bArr != null) {
            byte[] bArr2 = v3gVar.l;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (v3gVar.l != null) {
            return false;
        }
        if (!Intrinsics.a(this.m, v3gVar.m) || !Intrinsics.a(this.n, v3gVar.n)) {
            return false;
        }
        byte[] bArr3 = this.o;
        if (bArr3 != null) {
            byte[] bArr4 = v3gVar.o;
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (v3gVar.o != null) {
            return false;
        }
        if (this.p != v3gVar.p || this.q != v3gVar.q || this.r != v3gVar.r || this.s != v3gVar.s || this.t != v3gVar.t || this.u != v3gVar.u || this.v != v3gVar.v) {
            return false;
        }
        byte[] bArr5 = this.w;
        if (bArr5 != null) {
            byte[] bArr6 = v3gVar.w;
            if (bArr6 == null || !Arrays.equals(bArr5, bArr6)) {
                return false;
            }
        } else if (v3gVar.w != null) {
            return false;
        }
        if (this.x != v3gVar.x || !Intrinsics.a(this.y, v3gVar.y) || !Intrinsics.a(this.z, v3gVar.z) || !Intrinsics.a(this.A, v3gVar.A) || this.B != v3gVar.B) {
            return false;
        }
        byte[] bArr7 = this.C;
        if (bArr7 != null) {
            byte[] bArr8 = v3gVar.C;
            if (bArr8 == null || !Arrays.equals(bArr7, bArr8)) {
                return false;
            }
        } else if (v3gVar.C != null) {
            return false;
        }
        return Intrinsics.a(this.D, v3gVar.D) && Intrinsics.a(this.E, v3gVar.E) && Intrinsics.a(this.F, v3gVar.F) && Intrinsics.a(this.G, v3gVar.G) && Intrinsics.a(this.H, v3gVar.H) && this.I == v3gVar.I && this.J == v3gVar.J && this.K == v3gVar.K;
    }

    public final int hashCode() {
        Long l = this.a;
        int iF = z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f((this.b.hashCode() + ((l != null ? Long.hashCode(l.longValue()) : 0) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        byte[] bArr = this.l;
        int iF2 = z1m.f(z1m.f((iF + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31, 31, this.m), 31, this.n);
        byte[] bArr2 = this.o;
        int iHashCode = (((this.u.hashCode() + fki.k(z1m.e(z1m.e(z1m.e(z1m.e((iF2 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t)) * 31) + this.v) * 31;
        byte[] bArr3 = this.w;
        int iK = fki.k(z1m.f(z1m.f(z1m.f((this.x.hashCode() + ((iHashCode + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31)) * 31, 31, this.y), 31, this.z), 31, this.A), 31, this.B);
        byte[] bArr4 = this.C;
        return Boolean.hashCode(this.K) + fki.k(z1m.e(z1m.f(z1m.f(z1m.f(rfp.f(z1m.h(this.D, (iK + (bArr4 != null ? Arrays.hashCode(bArr4) : 0)) * 31, 31), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J);
    }

    public final String toString() {
        return "";
    }
}
