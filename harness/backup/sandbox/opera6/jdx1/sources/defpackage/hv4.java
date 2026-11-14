package defpackage;

/* loaded from: classes.dex */
public final class hv4 {
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
    public final long k;
    public final long l;

    public hv4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
        this.k = j11;
        this.l = j12;
    }

    public static a2k a(bsl bslVar, ih5 ih5Var) {
        if (bslVar == bsl.b) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(1539262271);
            a2k a2kVarY = nb6.Y(jae.d, vt9Var);
            vt9Var.p(false);
            return a2kVarY;
        }
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.W(1539355581);
        a2k a2kVarY2 = nb6.Y(jae.c, vt9Var2);
        vt9Var2.p(false);
        return a2kVarY2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hv4)) {
            return false;
        }
        hv4 hv4Var = (hv4) obj;
        long j = hv4Var.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, hv4Var.b) && jgm.a(this.c, hv4Var.c) && jgm.a(this.d, hv4Var.d) && jgm.a(this.e, hv4Var.e) && jgm.a(this.f, hv4Var.f) && jgm.a(this.g, hv4Var.g) && jgm.a(this.h, hv4Var.h) && jgm.a(this.i, hv4Var.i) && jgm.a(this.j, hv4Var.j) && jgm.a(this.k, hv4Var.k) && jgm.a(this.l, hv4Var.l);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.l) + z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
