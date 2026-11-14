package defpackage;

/* loaded from: classes.dex */
public final class otd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public otd(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof otd)) {
            return false;
        }
        otd otdVar = (otd) obj;
        long j = otdVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, otdVar.b) && jgm.a(this.c, otdVar.c) && jgm.a(this.d, otdVar.d) && jgm.a(this.e, otdVar.e) && jgm.a(this.f, otdVar.f);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.f) + z1m.e(z1m.e(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
