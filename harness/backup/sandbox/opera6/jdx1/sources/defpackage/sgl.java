package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sgl {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final akl k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final long y;
    public final long z;

    public sgl(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, akl aklVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = aklVar;
        this.l = j11;
        this.m = j12;
        this.n = j13;
        this.o = j14;
        this.p = j15;
        this.q = j16;
        this.r = j17;
        this.s = j18;
        this.t = j19;
        this.u = j20;
        this.v = j21;
        this.w = j22;
        this.x = j23;
        this.y = j24;
        this.z = j25;
        this.A = j26;
        this.B = j27;
        this.C = j28;
        this.D = j29;
        this.E = j30;
        this.F = j31;
        this.G = j32;
        this.H = j33;
        this.I = j34;
        this.J = j35;
        this.K = j36;
        this.L = j37;
        this.M = j38;
        this.N = j39;
        this.O = j40;
        this.P = j41;
        this.Q = j42;
    }

    public final sgl a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, akl aklVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        long j43;
        long j44;
        long j45 = j != 16 ? j : this.a;
        long j46 = j2 != 16 ? j2 : this.b;
        long j47 = j3 != 16 ? j3 : this.c;
        long j48 = j4 != 16 ? j4 : this.d;
        long j49 = j5 != 16 ? j5 : this.e;
        long j50 = j6 != 16 ? j6 : this.f;
        if (j7 != 16) {
            j43 = 16;
            j44 = j7;
        } else {
            j43 = 16;
            j44 = this.g;
        }
        long j51 = j43;
        return new sgl(j45, j46, j47, j48, j49, j50, j44, j8 != j43 ? j8 : this.h, j9 != j43 ? j9 : this.i, j10 != j43 ? j10 : this.j, aklVar == null ? this.k : aklVar, j11 != j51 ? j11 : this.l, j12 != j51 ? j12 : this.m, j13 != j51 ? j13 : this.n, j14 != j51 ? j14 : this.o, j15 != j51 ? j15 : this.p, j16 != j51 ? j16 : this.q, j17 != j51 ? j17 : this.r, j18 != j51 ? j18 : this.s, j19 != j51 ? j19 : this.t, j20 != j51 ? j20 : this.u, j21 != j51 ? j21 : this.v, j22 != j51 ? j22 : this.w, j23 != j51 ? j23 : this.x, j24 != j51 ? j24 : this.y, j25 != j51 ? j25 : this.z, j26 != j51 ? j26 : this.A, j27 != j51 ? j27 : this.B, j28 != j51 ? j28 : this.C, j29 != j51 ? j29 : this.D, j30 != j51 ? j30 : this.E, j31 != j51 ? j31 : this.F, j32 != j51 ? j32 : this.G, j33 != j51 ? j33 : this.H, j34 != j51 ? j34 : this.I, j35 != j51 ? j35 : this.J, j36 != j51 ? j36 : this.K, j37 != j51 ? j37 : this.L, j38 != j51 ? j38 : this.M, j39 != j51 ? j39 : this.N, j40 != j51 ? j40 : this.O, j41 != j51 ? j41 : this.P, j42 != j51 ? j42 : this.Q);
    }

    public final long c(boolean z, boolean z2, boolean z3) {
        return !z ? this.n : z2 ? this.o : z3 ? this.l : this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sgl)) {
            return false;
        }
        sgl sglVar = (sgl) obj;
        long j = sglVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, sglVar.b) && jgm.a(this.c, sglVar.c) && jgm.a(this.d, sglVar.d) && jgm.a(this.e, sglVar.e) && jgm.a(this.f, sglVar.f) && jgm.a(this.g, sglVar.g) && jgm.a(this.h, sglVar.h) && jgm.a(this.i, sglVar.i) && jgm.a(this.j, sglVar.j) && Intrinsics.a(this.k, sglVar.k) && jgm.a(this.l, sglVar.l) && jgm.a(this.m, sglVar.m) && jgm.a(this.n, sglVar.n) && jgm.a(this.o, sglVar.o) && jgm.a(this.p, sglVar.p) && jgm.a(this.q, sglVar.q) && jgm.a(this.r, sglVar.r) && jgm.a(this.s, sglVar.s) && jgm.a(this.t, sglVar.t) && jgm.a(this.u, sglVar.u) && jgm.a(this.v, sglVar.v) && jgm.a(this.w, sglVar.w) && jgm.a(this.x, sglVar.x) && jgm.a(this.y, sglVar.y) && jgm.a(this.z, sglVar.z) && jgm.a(this.A, sglVar.A) && jgm.a(this.B, sglVar.B) && jgm.a(this.C, sglVar.C) && jgm.a(this.D, sglVar.D) && jgm.a(this.E, sglVar.E) && jgm.a(this.F, sglVar.F) && jgm.a(this.G, sglVar.G) && jgm.a(this.H, sglVar.H) && jgm.a(this.I, sglVar.I) && jgm.a(this.J, sglVar.J) && jgm.a(this.K, sglVar.K) && jgm.a(this.L, sglVar.L) && jgm.a(this.M, sglVar.M) && jgm.a(this.N, sglVar.N) && jgm.a(this.O, sglVar.O) && jgm.a(this.P, sglVar.P) && jgm.a(this.Q, sglVar.Q);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.Q) + z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e((this.k.hashCode() + z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K), 31, this.L), 31, this.M), 31, this.N), 31, this.O), 31, this.P);
    }
}
