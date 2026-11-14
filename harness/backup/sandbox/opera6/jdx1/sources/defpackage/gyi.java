package defpackage;

/* loaded from: classes.dex */
public final class gyi {
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
    public final long m;

    public gyi(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
        this.m = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gyi)) {
            return false;
        }
        gyi gyiVar = (gyi) obj;
        long j = gyiVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, gyiVar.b) && jgm.a(this.c, gyiVar.c) && jgm.a(this.d, gyiVar.d) && jgm.a(this.e, gyiVar.e) && jgm.a(this.f, gyiVar.f) && jgm.a(this.g, gyiVar.g) && jgm.a(this.h, gyiVar.h) && jgm.a(this.i, gyiVar.i) && jgm.a(this.j, gyiVar.j) && jgm.a(this.k, gyiVar.k) && jgm.a(this.l, gyiVar.l) && jgm.a(this.m, gyiVar.m);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.m) + z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
